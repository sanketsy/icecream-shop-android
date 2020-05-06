package com.example.icytoppings;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgotActivity extends AppCompatActivity {

    EditText etMailForgot;
    Button btnReset;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
        getSupportActionBar().hide();

        etMailForgot = findViewById(R.id.etMailForgot);
        btnReset = findViewById(R.id.btnReset);
        firebaseAuth = FirebaseAuth.getInstance();

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String un = etMailForgot.getText().toString();

                if(un.length()==0){
                    etMailForgot.setError("It is Empty");
                    etMailForgot.requestFocus();
                    return;
                }

                firebaseAuth.sendPasswordResetEmail(un).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(ForgotActivity.this, "Check Email for link", Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(ForgotActivity.this,MainActivity.class);
                            startActivity(i);
                            finish();
                        }
                        else
                        {
                            Toast.makeText(ForgotActivity.this, "issue is "+task.getException(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

    }
}
