package com.example.icytoppings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class WaffleActivity extends AppCompatActivity {

    Button btnCake, btnPretzel, btnSugar, btnWaffle, btnWaffleBowl, btnChocoDipped, btnKid, btnTwin, btnJack;
    ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waffle);

        btnCake = findViewById(R.id.btnCake);
        btnPretzel = findViewById(R.id.btnPretzel);
        btnSugar = findViewById(R.id.btnSugar);
        btnWaffle = findViewById(R.id.btnWaffle);
        btnWaffleBowl = findViewById(R.id.btnWaffleBowl);
        btnChocoDipped = findViewById(R.id.btnChocoDipped);
        btnKid = findViewById(R.id.btnKid);
        btnTwin = findViewById(R.id.btnTwin);
        btnJack = findViewById(R.id.btnJack);
        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);
        iv4 = findViewById(R.id.iv4);
        iv5 = findViewById(R.id.iv5);
        iv6 = findViewById(R.id.iv6);
        iv7 = findViewById(R.id.iv7);
        iv8 = findViewById(R.id.iv8);
        iv9 = findViewById(R.id.iv9);

        btnCake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent();
                String t = "Cake Cone";
                p.putExtra("waff",t);
                p.putExtra("waff_cost",""+8);
                setResult(RESULT_OK, p);
                finish();
            }
        });

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent();
                String t = "Cake Cone";
                p.putExtra("waff_cost",""+8);
                p.putExtra("waff",t);
                setResult(RESULT_OK, p);
                finish();
            }
        });

        btnPretzel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent();
                String t = "Pretzel Cone";
                p.putExtra("waff_cost",""+12);
                p.putExtra("waff",t);
                setResult(RESULT_OK, p);
                finish();
            }
        });

        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent();
                String t = "Pretzel Cone";
                p.putExtra("waff",t);
                p.putExtra("waff_cost",""+12);
                setResult(RESULT_OK, p);
                finish();
            }
        });

        btnSugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent();
                String t = "Sugar Cone";
                p.putExtra("waff",t);
                p.putExtra("waff_cost",""+5);
                setResult(RESULT_OK, p);
                finish();
            }
        });

        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent();
                String t = "Sugar Cone";
                p.putExtra("waff",t);
                p.putExtra("waff_cost",""+5);
                setResult(RESULT_OK, p);
                finish();
            }
        });

        btnWaffle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent();
                String t = "Waffle Cone";
                p.putExtra("waff_cost",""+5);
                p.putExtra("waff",t);
                setResult(RESULT_OK, p);
                finish();
            }
        });

        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent();
                String t = "Waffle Cone";
                p.putExtra("waff",t);
                setResult(RESULT_OK, p);
                p.putExtra("waff_cost",""+5);
                finish();
            }
        });

        btnWaffleBowl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent();
                String t = "Waffle Bowl";
                p.putExtra("waff",t);
                p.putExtra("waff_cost",""+15);
                setResult(RESULT_OK, p);
                finish();
            }
        });

        iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent();
                String t = "Waffle Bowl";
                p.putExtra("waff",t);
                p.putExtra("waff_cost",""+15);
                setResult(RESULT_OK, p);
                finish();
            }
        });

        btnChocoDipped.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent();
                String t = "Chocolate Dippped Cone";
                p.putExtra("waff",t);
                p.putExtra("waff_cost",""+15);
                setResult(RESULT_OK, p);
                finish();
            }
        });

        iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent();
                String t = "Chocolate Dippped Cone";
                p.putExtra("waff",t);
                p.putExtra("waff_cost",""+15);
                setResult(RESULT_OK, p);
                finish();
            }
        });

        btnKid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent();
                String t = "Kid Cone";
                p.putExtra("waff",t);
                p.putExtra("waff_cost",""+5);
                setResult(RESULT_OK, p);
                finish();
            }
        });

        iv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent();
                String t = "Kid Cone";
                p.putExtra("waff",t);
                setResult(RESULT_OK, p);
                p.putExtra("waff_cost",""+5);
                finish();
            }
        });

        btnTwin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent();
                String t = "Twin Cone";
                p.putExtra("waff",t);
                p.putExtra("waff_cost",""+20);
                setResult(RESULT_OK, p);
                finish();
            }
        });

        iv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent();
                String t = "Twin Cone";
                p.putExtra("waff_cost",""+20);
                p.putExtra("waff",t);
                setResult(RESULT_OK, p);
                finish();
            }
        });

        btnJack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent();
                String t = "Jacketed Cone";
                p.putExtra("waff",t);
                p.putExtra("waff_cost",""+10);
                setResult(RESULT_OK, p);
                finish();
            }
        });

        iv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent();
                String t = "Jacketed Cone";
                p.putExtra("waff",t);
                setResult(RESULT_OK, p);
                p.putExtra("waff_cost",""+10);
                finish();
            }
        });


    }
}
