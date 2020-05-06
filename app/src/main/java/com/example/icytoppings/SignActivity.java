package com.example.icytoppings;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignActivity extends AppCompatActivity {

    EditText etName,etMailSign,etPhoneSign,etAddSign,etPassSign;
    Button btnSign;
    FirebaseAuth firebaseAuth;
    SharedPreferences sp;
    String uname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        getSupportActionBar().hide();

        etName = findViewById(R.id.etName);
        etMailSign = findViewById(R.id.etMailSign);
        etPhoneSign = findViewById(R.id.etPhoneSign);
        etAddSign = findViewById(R.id.etAddSign);
        etPassSign = findViewById(R.id.etPassSign);
        btnSign = findViewById(R.id.btnSign);
        firebaseAuth = FirebaseAuth.getInstance();
        sp = getSharedPreferences("f1",MODE_PRIVATE);

        btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String un = etMailSign.getText().toString();
                String pw = etPassSign.getText().toString();


                if(etName.getText().toString().length()==0){
                    etName.setError("It is Empty");
                    etName.requestFocus();
                    return;
                }else if(!etName.getText().toString().trim().matches("[a-zA-Z ]*")){
                    etName.setError("Invalid Name");
                    etName.setText("");
                    etName.requestFocus();
                    return;
                }
                if(un.length()==0){
                    etMailSign.setError("It is Empty");
                    etMailSign.requestFocus();
                    return;
                }
                if(etPhoneSign.getText().toString().length() == 0){
                    etPhoneSign.setError("It is Empty");
                    etPhoneSign.requestFocus();
                    return;
                }else if(etPhoneSign.getText().toString().length() < 10 || etPhoneSign.getText().toString().length() > 10){
                    etPhoneSign.setError("Invalid Number");
                    etPhoneSign.setText("");
                    etPhoneSign.requestFocus();
                    return;
                }
                if(etAddSign.getText().toString().trim().length() == 0){
                    etAddSign.setError("It is Empty");
                    etAddSign.requestFocus();
                    return;
                }
                if(pw.length()==0){
                    etPassSign.setError("It is Empty");
                    etPassSign.requestFocus();
                    return;
                }else if(pw.length() < 8){
                    etPassSign.setError("Too short");
                    etPassSign.setText("");
                    etPassSign.requestFocus();
                    return;
                }


                firebaseAuth.createUserWithEmailAndPassword(un, pw).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            SharedPreferences.Editor editor = sp.edit();
                            uname = un;
                            editor.putString("username",uname);
                            editor.apply();
                            Toast.makeText(SignActivity.this, "Account Created", Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(SignActivity.this,MainActivity.class);
                            startActivity(i);
                            finish();
                        }
                        else
                            Toast.makeText(SignActivity.this, "Account creation issue", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

    }
}
