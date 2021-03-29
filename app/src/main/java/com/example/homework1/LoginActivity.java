package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button btn;
    EditText login;
    EditText parol;
    private TextWatcher textWatcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn = findViewById(R.id.btn);
        login = findViewById(R.id.login);
        parol = findViewById(R.id.password);
        parol.setTransformationMethod(new PasswordTransformationMethod());
        parol.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
btn.setEnabled(true);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if ((login.getText().toString().length() ==0) && (parol.getText().toString().length() ==0)) {
                            btn.setEnabled(false);
                        }else {
                            Toast.makeText(LoginActivity.this,"Welcome",Toast.LENGTH_SHORT).show();
                            Intent intent= new Intent(LoginActivity.this,Calculator.class);
                            startActivity(intent);
                        }
                    }
                });
            }
        });
    }
}




//
//        if (login.getText().toString().isEmpty() && parol.getText().toString().isEmpty()) {
//            btn.setEnabled(false);
//
//
//
//        }
//
//        login.addTextChangedListener(textWatcher);
//        parol.addTextChangedListener(textWatcher);
//
//
//        textWatcher=new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                String loginInput=login.getText().toString().trim();
//                String parolInput= parol.getText().toString().trim();
//btn.setEnabled(!loginInput.isEmpty() && !parolInput.isEmpty());
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        };
//



//    private void initClickers() {
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                checkFields();
//                Toast.makeText(LoginActivity.this, "Добро пожаловать", Toast.LENGTH_SHORT).show();
//                Intent intent= new Intent(LoginActivity.this,Calculator.class);
//                startActivity(intent);
//            }
//        });
//    }

//    private void checkFields() {
//        if ((login.getText().toString().length() ==0) && (parol.getText().toString().length() ==0)) {
//            btn.setEnabled(false);
//        } else {
//            btn.setEnabled(true);
//        }
//    }
