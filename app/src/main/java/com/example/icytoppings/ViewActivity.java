package com.example.icytoppings;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ViewActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<Upload> s = new ArrayList<>();
    ArrayAdapter<Upload> ad;
    FirebaseDatabase database;
    DatabaseReference myRef;
    ArrayList<String> k =new ArrayList<>();
    String mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        lv = findViewById(R.id.lv);
        database = FirebaseDatabase.getInstance();

        Intent intt = getIntent();
        mail = intt.getStringExtra("mailwa");
        getSupportActionBar().setTitle("Order History of "+mail);
        myRef = database.getReference(mail);

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                s.clear();

                for(DataSnapshot d : dataSnapshot.getChildren())
                {
                    Upload data = d.getValue(Upload.class);
                    s.add(data);
                    k.add(d.getKey()); ///
                }
                ad = new ArrayAdapter<>(ViewActivity.this, android.R.layout.simple_list_item_1,s);

                lv.setAdapter(ad);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });



    }
}
