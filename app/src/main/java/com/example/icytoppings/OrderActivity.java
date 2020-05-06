package com.example.icytoppings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class OrderActivity extends AppCompatActivity {

    TextView tvConfirm, tvIcecream;
    Button btnPlace, btnHistory;
    FirebaseDatabase database;
    DatabaseReference myRef;
    FirebaseAuth firebaseAuth;
    FirebaseUser user;
    SharedPreferences sp;
    String email, answer, cost,send_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        getSupportActionBar().setTitle("Order Menu");

        tvConfirm = findViewById(R.id.tvConfirm);
        tvIcecream = findViewById(R.id.tvIcecream);
        btnPlace = findViewById(R.id.btnPlace);
        btnHistory = findViewById(R.id.btnHistory);
        firebaseAuth = FirebaseAuth.getInstance();

        email = firebaseAuth.getCurrentUser().getEmail();
        send_email=email;
        email = email.substring(0,email.length()-10);
        email = email.replace(".","");
        //Toast.makeText(this, ""+email, Toast.LENGTH_SHORT).show();

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference(email);

        Intent i = getIntent();
        answer = i.getStringExtra("answer");
        cost = i.getStringExtra("cost");
        tvIcecream.setText(answer+"\n"+cost);

        btnPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Upload u;
                if(tvIcecream.getText().length()!=0){
                u = new Upload(answer, cost);
                myRef.push().setValue(u);
                Toast.makeText(OrderActivity.this, "Record Added", Toast.LENGTH_SHORT).show();
                tvConfirm.setTextColor(getColor(R.color.green));
                //tvConfirm.setTypeface(null, Typeface.BOLD);
                tvConfirm.setText("Order is successfully placed!");
                tvIcecream.setText("");
                Toast.makeText(OrderActivity.this, "It will be delivered shortly!", Toast.LENGTH_LONG).show();

                /*
                String msg = "Hi there! Thanks for choosing Icy Toppings.\nYour order for "+answer+" is on the way.\nTotal Cost of order will be only Rs."+cost+".\nEnjoy! And keeping eating Rich Icecream from yours truly Icy Toppings.";
                Intent z = new Intent(Intent.ACTION_SENDTO);
                z.setData(Uri.parse("mailto:"+send_email));
                z.putExtra(Intent.EXTRA_SUBJECT,"Order is Successfully Placed ");
                z.putExtra(Intent.EXTRA_TEXT,msg);
                startActivity(z);*/

                }
                else
                    Toast.makeText(OrderActivity.this, "Go back and select Icecream first.", Toast.LENGTH_LONG).show();
            }
        });

        btnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nt = new Intent(OrderActivity.this, ViewActivity.class);
                nt.putExtra("mailwa",email);
                startActivity(nt);
            }
        });

    }
}
