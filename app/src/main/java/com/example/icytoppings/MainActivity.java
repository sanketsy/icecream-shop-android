package com.example.icytoppings;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    EditText etMail, etPass;
    Button btnLogin;
    TextView tvSignIn, tvForgot;
    FirebaseAuth firebaseAuth;
    FirebaseUser user;
    SharedPreferences sp;
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        etMail = findViewById(R.id.etMail);
        etPass = findViewById(R.id.etPass);
        btnLogin = findViewById(R.id.btnLogin);
        tvSignIn = findViewById(R.id.tvSignIn);
        tvForgot = findViewById(R.id.tvForgot);
        firebaseAuth = FirebaseAuth.getInstance();

        sp = getSharedPreferences("f1",MODE_PRIVATE);
        username = sp.getString("username","");

        user = firebaseAuth.getCurrentUser();
        if(user != null) {
            Intent a = new Intent(MainActivity.this, WelcomeActivity.class);
            startActivity(a);
            finish();
        }

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String un = etMail.getText().toString();
                String pw = etPass.getText().toString();
                if(un.length()==0){
                    etMail.setError("It is Empty");
                    etMail.requestFocus();
                    return;
                }
                if(pw.length()==0) {
                    etPass.setError("It is Empty");
                    etPass.requestFocus();
                    return;
                }

                firebaseAuth.signInWithEmailAndPassword(un, pw).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            SharedPreferences.Editor editor = sp.edit();
                            editor.putString("username",username);
                            editor.apply();
                            Intent i = new Intent(MainActivity.this,WelcomeActivity.class);
                            startActivity(i);
                            finish();
                        }
                        else
                            Toast.makeText(MainActivity.this, "failure "+task.getException(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        tvSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SignActivity.class);
                startActivity(i);
            }
        });

        tvForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ForgotActivity.class);
                startActivity(i);
            }
        });
    }
}
