package com.technerd.project1.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.technerd.project1.MainActivity;
import com.technerd.project1.R;

public class RegisterActivity extends AppCompatActivity {

    EditText etFname, lName, rMail, rPassword, rCPassword, rDoB, rPhone;

    Button btnRegister;

    TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etFname = findViewById(R.id.etNameRegister) ;
        lName = findViewById(R.id.etName2Register);
        rMail = findViewById(R.id.etEmailRegister);
        rPassword = findViewById(R.id.etPasswordRegister);
        rCPassword = findViewById(R.id.etConfirmPasswordRegister);
        rDoB = findViewById(R.id.etDOBRegister);
        rPhone = findViewById(R.id.etPhoneRegister);
        btnRegister = findViewById(R.id.btnRegister);
        tvLogin = findViewById(R.id.tvAlreadyRegisterd);

        rDoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerActivity = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(registerActivity);
                finish();
                return;

            }
        });

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerActivity = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(registerActivity);
                finish();
                return;

            }
        });

    }
}
