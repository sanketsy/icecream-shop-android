package com.example.icytoppings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    TextView tvAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setTitle("About");

        tvAbout = findViewById(R.id.tvAbout);

        String abt = "Project Members:-\n\n1. Sanket S. Yelkar\n2. Chinmay Patil\n3. Pushpa Parannavar";
        tvAbout.setText(abt);

    }
}
