package com.example.aseanlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class VietnamActivity extends AppCompatActivity {
    Button btnPilGan;
    private DatabaseReference mDatabase;
    TextView TvParagraf1, TvParagraf2, TvParagraf3, TvParagraf4, TvParagraf5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vietnam);

        TvParagraf1 = findViewById(R.id.text);
        TvParagraf2 = findViewById(R.id.text2);
        TvParagraf3 = findViewById(R.id.text3);
        TvParagraf4 = findViewById(R.id.text4);
        TvParagraf5 = findViewById(R.id.text5);

        btnPilGan = findViewById(R.id.PilGan5);

        btnPilGan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(VietnamActivity.this, KuisPilihanGanda5.class);
                startActivity(i);
            }
        });
        // Inisialisasi FirebaseApp
        FirebaseApp.initializeApp(this);

        // Inisialisasi DatabaseReference
        mDatabase = FirebaseDatabase.getInstance().getReference();

        // Mengambil data dari Firebase
        mDatabase.child("materi5").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Data berhasil diambil
                String par1 = dataSnapshot.child("par1").getValue(String.class);
                String par2 = dataSnapshot.child("par2").getValue(String.class);
                String par3 = dataSnapshot.child("par3").getValue(String.class);
                String par4 = dataSnapshot.child("par4").getValue(String.class);
                String par5 = dataSnapshot.child("par5").getValue(String.class);

                TvParagraf1.setText(par1);
                TvParagraf2.setText(par2);
                TvParagraf3.setText(par3);
                TvParagraf4.setText(par4);
                TvParagraf5.setText(par5);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                finish();
            }
        });
    }
}