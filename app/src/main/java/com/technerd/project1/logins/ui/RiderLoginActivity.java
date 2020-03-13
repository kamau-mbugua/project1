package com.technerd.project1.logins.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.technerd.project1.R;
import com.technerd.project1.mapactivities.RiderMapActivity;
import com.technerd.project1.register.RegisterActivity;

public class RiderLoginActivity extends AppCompatActivity {
    EditText mEmailRider, mPasswordRider;
    TextView mRiderRegister, mForgetPassword;
    Button btnRiderLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rider_login);

        mEmailRider = findViewById(R.id.etEmailRider);
        mPasswordRider = findViewById(R.id.etPasswordRider);

        mRiderRegister = findViewById(R.id.tvRiderRegister);
        mForgetPassword = findViewById(R.id.tvForgetPassword);

        btnRiderLogin = findViewById(R.id.btnLoginRider);

        mForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnRiderLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent customerLogin = new Intent(RiderLoginActivity.this, RiderMapActivity.class);
                startActivity(customerLogin);
                finish();
                return;
            }
        });
        mRiderRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent customerLogin = new Intent(RiderLoginActivity.this, RegisterActivity.class);
                startActivity(customerLogin);
                finish();
                return;

            }
        });
    }
}
