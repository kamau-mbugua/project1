package com.technerd.project1.logins.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.technerd.project1.R;
import com.technerd.project1.mapactivities.CustomerMapActivity;
import com.technerd.project1.register.RegisterActivity;

public class CustomerLoginActivity extends AppCompatActivity {

    EditText mEmailCustomer, mPasswordCustomer;
    TextView mCustomerRegister, mForgetPassword;
    Button btnCustomerLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_login);

        mEmailCustomer = findViewById(R.id.etEmail);
        mPasswordCustomer = findViewById(R.id.etPassword);

        mCustomerRegister = findViewById(R.id.tvCustomerRegister);
        mForgetPassword = findViewById(R.id.tvForgetPassword);

        btnCustomerLogin = findViewById(R.id.btnLogin);

        mForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnCustomerLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent customerLogin = new Intent(CustomerLoginActivity.this, CustomerMapActivity.class);
                startActivity(customerLogin);
                finish();
                return;

            }
        });

        mCustomerRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent customerLogin = new Intent(CustomerLoginActivity.this, RegisterActivity.class);
                startActivity(customerLogin);
                finish();
                return;

            }
        });
    }
}
