package com.example.icytoppings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class CreamActivity extends AppCompatActivity {

    Button btnStraw, btnCaramel, btnHazel, btnChocoDip, btnMango, btnCoffee, btnBlack, btnStrawScotch, btnDark, btnMint;
    ImageView l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cream);
        //getSupportActionBar().hide();

        btnStraw = findViewById(R.id.btnStraw);
        btnCaramel = findViewById(R.id.btnCaramel);
        btnHazel = findViewById(R.id.btnHazel);
        btnChocoDip = findViewById(R.id.btnChocoDip);
        btnMango = findViewById(R.id.btnMango);
        btnCoffee = findViewById(R.id.btnCoffee);
        btnBlack = findViewById(R.id.btnBlack);
        btnStrawScotch = findViewById(R.id.btnStrawScotch);
        btnDark = findViewById(R.id.btnDark);
        btnMint = findViewById(R.id.btnMint);
        l1 = findViewById(R.id.l1);
        l2 = findViewById(R.id.l2);
        l3 = findViewById(R.id.l3);
        l4 = findViewById(R.id.l4);
        l5 = findViewById(R.id.l5);
        l6 = findViewById(R.id.l6);
        l7 = findViewById(R.id.l7);
        l8 = findViewById(R.id.l8);
        l9 = findViewById(R.id.l9);
        l10 = findViewById(R.id.l10);

        btnStraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fd = new Intent();
                String t = "Strawberry Cream";
                fd.putExtra("crem",t);
                fd.putExtra("crem_cost",""+30);
                setResult(RESULT_OK, fd);
                finish();
            }
        });

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fd = new Intent();
                String t = "Strawberry Cream";
                fd.putExtra("crem",t);
                fd.putExtra("crem_cost",""+30);
                setResult(RESULT_OK, fd);
                finish();
            }
        });

        btnCaramel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fd = new Intent();
                String t = "Caramel Vanilla Cream";
                fd.putExtra("crem_cost",""+25);
                fd.putExtra("crem",t);
                setResult(RESULT_OK, fd);
                finish();
            }
        });

        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fd = new Intent();
                String t = "Caramel Vanilla Cream";
                fd.putExtra("crem_cost",""+25);
                fd.putExtra("crem",t);
                setResult(RESULT_OK, fd);
                finish();
            }
        });

        btnHazel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fd = new Intent();
                String t = "Hazelnut Cream";
                fd.putExtra("crem_cost",""+35);
                fd.putExtra("crem",t);
                setResult(RESULT_OK, fd);
                finish();
            }
        });

        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fd = new Intent();
                String t = "Hazelnut Cream";
                fd.putExtra("crem_cost",""+35);
                fd.putExtra("crem",t);
                setResult(RESULT_OK, fd);
                finish();
            }
        });

        btnChocoDip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fd = new Intent();
                String t = "Chocolate Dipping Cream";
                fd.putExtra("crem_cost",""+30);
                fd.putExtra("crem",t);
                setResult(RESULT_OK, fd);
                finish();
            }
        });

        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fd = new Intent();
                String t = "Chocolate Dipping Cream";
                fd.putExtra("crem_cost",""+30);
                fd.putExtra("crem",t);
                setResult(RESULT_OK, fd);
                finish();
            }
        });

        btnMango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fd = new Intent();
                String t = "Mango Flavoured Cream";
                fd.putExtra("crem_cost",""+25);
                fd.putExtra("crem",t);
                setResult(RESULT_OK, fd);
                finish();
            }
        });

        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fd = new Intent();
                String t = "Mango Flavoured Cream";
                fd.putExtra("crem",t);
                fd.putExtra("crem_cost",""+25);
                setResult(RESULT_OK, fd);
                finish();
            }
        });

        btnCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fd = new Intent();
                String t = "Cappuccino Latte Cream";
                fd.putExtra("crem_cost",""+30);
                fd.putExtra("crem",t);
                setResult(RESULT_OK, fd);
                finish();
            }
        });

        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fd = new Intent();
                String t = "Cappuccino Latte Cream";
                fd.putExtra("crem_cost",""+30);
                fd.putExtra("crem",t);
                setResult(RESULT_OK, fd);
                finish();
            }
        });

        btnBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fd = new Intent();
                String t = "Blackbura Cream";
                fd.putExtra("crem",t);
                fd.putExtra("crem_cost",""+40);
                setResult(RESULT_OK, fd);
                finish();
            }
        });

        l7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fd = new Intent();
                String t = "Blackbura Cream";
                fd.putExtra("crem",t);
                fd.putExtra("crem_cost",""+40);
                setResult(RESULT_OK, fd);
                finish();
            }
        });

        btnStrawScotch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fd = new Intent();
                String t = "Strawberry Scotch Cream";
                fd.putExtra("crem",t);
                fd.putExtra("crem_cost",""+35);
                setResult(RESULT_OK, fd);
                finish();
            }
        });

        l8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fd = new Intent();
                String t = "Strawberry Scotch Cream";
                fd.putExtra("crem_cost",""+35);
                fd.putExtra("crem",t);
                setResult(RESULT_OK, fd);
                finish();
            }
        });

        btnDark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fd = new Intent();
                String t = "Dark Chocolate Cream";
                fd.putExtra("crem",t);
                fd.putExtra("crem_cost",""+35);
                setResult(RESULT_OK, fd);
                finish();
            }
        });

        l9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fd = new Intent();
                String t = "Dark Chocolate Cream";
                fd.putExtra("crem",t);
                fd.putExtra("crem_cost",""+35);
                setResult(RESULT_OK, fd);
                finish();
            }
        });

        btnMint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fd = new Intent();
                String t = "Mint Cream";
                fd.putExtra("crem_cost",""+20);
                fd.putExtra("crem",t);
                setResult(RESULT_OK, fd);
                finish();
            }
        });

        l10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fd = new Intent();
                String t = "Mint Cream";
                fd.putExtra("crem_cost",""+20);
                fd.putExtra("crem",t);
                setResult(RESULT_OK, fd);
                finish();
            }
        });


    }
}
