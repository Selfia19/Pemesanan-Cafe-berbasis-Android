package com.example.orderanjustningsi;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    Button kembali;
    int quantity4=0;
    int quantity5=0, quantity6;



    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.makanan);

        kembali=(Button) findViewById(R.id.kembaliT);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new
                        Intent(MainActivity3.this,menu.class);

                startActivity(i);

            }
        });
    }

    public void increment(View view){//perintah tombol tambah
        if(quantity4==100){
            Toast.makeText(this,"pesanan maximal 100",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity4 = quantity4+1 ;
        display4(quantity4);
    }
    public void decrement(View view){//perintah tombol tambah
        if (quantity4==1){
            Toast.makeText(this,"pesanan minimal 1",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity4 = quantity4 -1;


        display4(quantity4);
    }

    public void increment2(View view){//perintah tombol tambah
        if(quantity5==100){
            Toast.makeText(this,"pesanan maximal 100",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity5 = quantity5+1 ;
        display5(quantity5);
    }
    public void decrement2(View view){//perintah tombol tambah
        if (quantity5==1){
            Toast.makeText(this,"pesanan minimal 1",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity5 = quantity5 -1;


        display5(quantity5);
    }


    public void increment3(View view){//perintah tombol tambah
        if(quantity6==100){
            Toast.makeText(this,"pesanan maximal 100",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity6 = quantity6+1 ;
        display6(quantity6);
    }
    public void decrement3(View view){//perintah tombol tambah
        if (quantity6==1){
            Toast.makeText(this,"pesanan minimal 1",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity6 = quantity6 -1;


        display6(quantity6);
    }
    public void Submitorder(View view) {
        EditText nameEditText=(EditText)findViewById(R.id.edt_name);
        String name=nameEditText.getText().toString();
        Log.v("MainActivity","Nama:");

       /*/ CheckBox whippedcreamChekBox= (CheckBox) findViewById(R.id.WhippedCream_checkbox);
        boolean haswhippedcream=whippedcreamChekBox.isChecked();//mengidentifikasi check
        Log.v("MainActivity","has whippedcream:"+haswhippedcream);

        CheckBox chocolateChekBox= (CheckBox) findViewById(R.id.Chocolate_checkbox);
        boolean haschocolate=chocolateChekBox.isChecked();//mengidentifikasi check
        Log.v("MainActivity","has whippedcream:"+haschocolate); /*/
        int price=calculateprice();
//memanggil method jumlah harga
        //String pricemessage=createOrderSummary(price,name,haswhippedcream,haschocolate);
        //int pricemessage=createOrderSummary(price)
        String pricemessage=createOrderSummary(price,name);
        displayMessage(pricemessage);

    }
    private int calculateprice(){//jumlah pesanan * harga
        int harga_nasigoreng=15000, harga_mienyemek=12000, harga_pudding=8000;


        return (quantity4 * harga_nasigoreng) + (quantity5 * harga_mienyemek) + (quantity6 * harga_pudding)  ;
    }
    private String createOrderSummary(int price, String name) {//hasil pemesanan
        String pricemessage=" Nama ="+name;
        pricemessage+="\n Jumlah    "+quantity4;
        pricemessage+="\n Total     Rp  "+price;
        pricemessage+="\n Terima Kasih";
        return  pricemessage;
    }

    //method ini untuk mencetak hasil perintah yang di tampilkan dengan inisial quantity_textview di textview 0
    private void displayMessage(String message) { //TOTAL
        TextView priceTextView2 = (TextView) findViewById(R.id.price);
        priceTextView2.setText(message);

    }
    private void display4(int number) {  //Baris 2
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_nasigoreng);
        quantityTextView.setText("" + number);
//        TextView quantityTextView2 = (TextView) findViewById(R.id.quantity_minum);
        //      quantityTextView2.setText("" + number);
    }

    private void display5(int number) {  //Baris 2
        TextView quantityTextView2 = (TextView) findViewById(R.id.quantity_mienyemek);
        quantityTextView2.setText("" + number);
    }

    private void display6(int number) {  //Baris 2
        TextView quantityTextView3 = (TextView) findViewById(R.id.quantity_pudding);
        quantityTextView3.setText("" + number);
    }


   /*     kembalilogin.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
            Intent i = new
                    Intent(MainActivity2.this,MainActivity.class);

            startActivity(i);

        }
        }); /*/
/*   kembali.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new
                    Intent(MainActivity2.this,MainActivity.class);
            i.putExtra("Total",MainActivity.getText().toString());
            startActivity(i);
        }
    }); /*/

}
