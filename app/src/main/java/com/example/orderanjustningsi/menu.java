package com.example.orderanjustningsi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class menu extends AppCompatActivity {

    Button buttonmakan, buttonminum ;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        buttonmakan= (Button) findViewById(R.id.buttonmakan);
        buttonminum= (Button) findViewById(R.id.buttonminum);

        buttonmakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new
                        Intent(menu.this,MainActivity3.class);

                startActivity(i);

            }
        });
        buttonminum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new
                        Intent(menu.this,MainActivity2.class);

                startActivity(i);

            }
        });



    }}
