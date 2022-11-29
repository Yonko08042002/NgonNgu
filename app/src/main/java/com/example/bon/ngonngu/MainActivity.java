package com.example.bon.ngonngu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout Anh,Nga,Italy,Moco,Han,Trung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //anh xa
        Anh =findViewById(R.id.cAnh);
        Nga =findViewById(R.id.cNga);
        Italy=findViewById(R.id.nIta);
        Moco=findViewById(R.id.cMoco);
        Han=findViewById(R.id.cHan);
        Trung=findViewById(R.id.cTrung);

        Anh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Anh.class);
                startActivity(i);
            }
        });
        Nga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Nga.class);
                startActivity(i);
            }
        });
        Italy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Italy.class);
                startActivity(i);
            }
        });
    }

}