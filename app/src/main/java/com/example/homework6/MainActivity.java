package com.example.homework6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView vhod = findViewById(R.id.tv_vhod);
        TextView welcome = findViewById(R.id.tv_welcome);
        TextView text = findViewById(R.id.tv_desk);
        EditText email = findViewById(R.id.et_name);
        EditText password = findViewById(R.id.et_password);
        MaterialButton button = findViewById(R.id.btn_vhod);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    email.setVisibility(View.GONE);
                    password.setVisibility(View.GONE);
                    text.setVisibility(View.GONE);
                    vhod.setVisibility(View.GONE);
                    button.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Вы успешно зарегестрировались", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Неправильно введен логин или пароль ", Toast.LENGTH_SHORT).show();
                }
            }
        });

        email.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {}

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (email.getText().toString().isEmpty()){
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey));
                }else{
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }
            }
        });

        password.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {}

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (password.getText().toString().isEmpty()){
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey));
                }else{
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }
            }
        });


    }
}