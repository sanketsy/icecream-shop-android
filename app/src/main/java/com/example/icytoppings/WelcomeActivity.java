package com.example.icytoppings;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.TooltipCompat;

import android.app.ActionBar;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class WelcomeActivity extends AppCompatActivity {

    FirebaseAuth firebaseAuth;
    Button order;
    ImageButton cream, waffle;
    TextView tv,tvv;
    String crem="", waff="",ans1="",ans2="",crem_cost,waff_cost;
    int tot_cost;
    String back,back2,here="",here2="";
    String c1="",c2="",b="",b2="",h="",h2="",aandu="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        getSupportActionBar().setTitle("Menu");
        getSupportActionBar().setSubtitle("Choose your Cream and Cones");

        firebaseAuth = FirebaseAuth.getInstance();
        aandu = firebaseAuth.getCurrentUser().getEmail();
        aandu = aandu.substring(0,aandu.length()-10);
        aandu = aandu.replace(".","");

        cream = findViewById(R.id.cream);
        waffle = findViewById(R.id.waffle);
        order = findViewById(R.id.order);
        tv = findViewById(R.id.tv);
        tvv = findViewById(R.id.tvv);


        cream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gh = new Intent(WelcomeActivity.this, CreamActivity.class);
                startActivityForResult(gh,1);
            }
        });

        waffle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gh = new Intent(WelcomeActivity.this, WaffleActivity.class);
                startActivityForResult(gh,1);
            }
        });

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans1.length()!=0 && ans2.length()!=0){
                    tot_cost = Integer.parseInt(c1) + Integer.parseInt(c2);
                    Intent r = new Intent(WelcomeActivity.this,OrderActivity.class);
                    r.putExtra("answer",ans1+" with "+ans2);
                    r.putExtra("cost","Cost = Rs."+tot_cost);
                    startActivity(r);
                }
                else
                    Toast.makeText(WelcomeActivity.this, "Kindly select Your Choice first!!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1) {
            if (resultCode == RESULT_OK) {
                back = here;
                b = h;
                back2 = here2;
                b2 = h2;
                crem = data.getStringExtra("crem");
                crem_cost = data.getStringExtra("crem_cost");
                waff = data.getStringExtra("waff");
                waff_cost = data.getStringExtra("waff_cost");

                if(crem==null)
                    crem="";
                if(waff==null)
                    waff="";
                here = crem;
                h = crem_cost;
                here2 = waff;
                h2 = waff_cost;

                if(crem.length()!=0)
                {   ans1=crem;c1=crem_cost;}
                else if(back.length()!=0)
                {ans1=back;c1=b;}

                if(waff.length()!=0)
                {ans2=waff;c2=waff_cost;}
                else if(back2.length()!=0)
                {ans2=back2;c2=b2;}

                tv.setText(ans1);
                tvv.setText(ans2);
                //Toast.makeText(this, c1+" | "+c2, Toast.LENGTH_SHORT).show();
                //Toast.makeText(this, ans1+" | "+ans2, Toast.LENGTH_SHORT).show(); //to check ans1 and ans2 answer are correct or not
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.m1,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.logout)
        {
            firebaseAuth.signOut();
            Intent i = new Intent(WelcomeActivity.this,MainActivity.class);
            startActivity(i);
            finish();
        }

        if(item.getItemId() == R.id.refresh)
        {
            Intent ghj = new Intent(WelcomeActivity.this, ViewActivity.class);
            ghj.putExtra("mailwa",aandu);
            startActivity(ghj);
        }

        if(item.getItemId() == R.id.about)
        {
            Intent rt = new Intent(WelcomeActivity.this,AboutActivity.class);
            startActivity(rt);
        }
        return super.onOptionsItemSelected(item);
    }
}
