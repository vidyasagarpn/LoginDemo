package com.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_email,btn_sign_up;
    EditText edt_name,edt_pwd;
    TextView txt_print;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_name= findViewById(R.id.edt_email);
        edt_pwd = findViewById(R.id.edt_pwd);
        txt_print=findViewById(R.id.txt_print);

        btn_email=findViewById(R.id.btn_login);
        btn_sign_up=findViewById(R.id.btn_signup);

        btn_email.setOnClickListener(this);
        btn_sign_up.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        switch (view.getId())
        {

            case R.id.btn_login:
                movescreenactivity();

                //String email=edt_name.getText().toString();
                //txt_print.setText(email);

                //Toast.makeText(getApplicationContext(),email,Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_signup:
                Toast.makeText(getApplicationContext(),"Signup",Toast.LENGTH_LONG).show();
               break;
        }
        }


    private void movescreenactivity() {

        String email=edt_name.getText().toString();
        txt_print.setText(email);

        Toast.makeText(getApplicationContext(),email,Toast.LENGTH_LONG).show();


        Intent in=new Intent(getApplicationContext(),SignupScreen.class);
        startActivity(in);
        finish();
    }
    }

