package com.example.orderanjustningsi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText Nama;
    private Button button_login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nama = (EditText) findViewById(R.id.Nama);
        button_login= (Button) findViewById(R.id.button_login);


        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new
                        Intent(MainActivity.this,menu.class);
                i.putExtra("Orderan", Nama.getText().toString());
                startActivity(i);
            }
        });
    }
}

