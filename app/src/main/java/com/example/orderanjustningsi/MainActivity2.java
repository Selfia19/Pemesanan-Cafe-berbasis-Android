package com.example.orderanjustningsi;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2  extends AppCompatActivity{
    Button save;
    Button kembali;
    TextView total, price;
    int quantity=0;
    int quantity1=0, quantity3=0, quantity4=0, quantity5=0,quantity6=0, quantity7=0, quantity8 =0,
            quantity9=0,quantity10=0, quantity11=0,quantity12=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        kembali=(Button) findViewById(R.id.kembaliT);
        save=(Button) findViewById(R.id.save) ;
        total=(TextView) findViewById(R.id.total);
        price=(TextView) findViewById(R.id.price);
        kembali.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new
                        Intent(MainActivity2.this,menu.class);

                startActivity(i);

            }
        });

        save.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new
                        Intent(MainActivity2.this,Total.class);
                i.putExtra("Total",price.getText().toString());
//                i.putExtra("Total",Total.getText().toString());
                startActivity(i);

            }
        });
    }

    public void increment(View view){//perintah tombol tambah
        if(quantity==100){
            Toast.makeText(this,"pesanan maximal 100",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity+1 ;
        display(quantity);
    }
    public void decrement(View view){//perintah tombol tambah
        if (quantity==1){
            Toast.makeText(this,"pesanan minimal 1",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity -1;


        display(quantity);
    }

    public void increment2(View view){//perintah tombol tambah
        if(quantity1==100){
            Toast.makeText(this,"pesanan maximal 100",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity1 = quantity1+1 ;
        display1(quantity1);
    }
    public void decrement2(View view){//perintah tombol tambah
        if (quantity1==1){
            Toast.makeText(this,"pesanan minimal 1",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity1 = quantity1 -1;
        display1(quantity1); }
    public void increment3(View view){//perintah tombol tambah
        if(quantity3==100){
            Toast.makeText(this,"pesanan maximal 100",Toast.LENGTH_SHORT).show();
            return; }
        quantity3 = quantity3+1 ;
        display3(quantity3);
    }
    public void decrement3(View view){//perintah tombol tambah
        if (quantity3==1){
            Toast.makeText(this,"pesanan minimal 1",Toast.LENGTH_SHORT).show();
            return; }
        quantity3 = quantity3 -1;
        display3(quantity3); }

    public void increment4(View view){//perintah tombol tambah
        if(quantity4==100){
            Toast.makeText(this,"pesanan maximal 100",Toast.LENGTH_SHORT).show();
            return; }
        quantity4 = quantity4+1 ;
        display4(quantity4); }
    public void decrement4(View view){//perintah tombol tambah
        if (quantity4==1){
            Toast.makeText(this,"pesanan minimal 1",Toast.LENGTH_SHORT).show();
            return; }
        quantity4 = quantity4-1;
        display4(quantity4); }

    public void increment5(View view){//perintah tombol tambah
        if(quantity5==100){
            Toast.makeText(this,"pesanan maximal 100",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity5 = quantity5+1 ;
        display5(quantity5);
    }
    public void decrement5(View view){//perintah tombol tambah
        if (quantity5==1){
            Toast.makeText(this,"pesanan minimal 1",Toast.LENGTH_SHORT).show();
            return; }
        quantity5 = quantity5 -1;
        display5(quantity5); }
    public void increment6(View view){//perintah tombol tambah
        if(quantity5==100){
            Toast.makeText(this,"pesanan maximal 100",Toast.LENGTH_SHORT).show();
            return; }
        quantity6 = quantity6+1 ;
        display6(quantity6); }

    public void decrement6(View view){//perintah tombol tambah
        if (quantity6==1){
            Toast.makeText(this,"pesanan minimal 1",Toast.LENGTH_SHORT).show();
            return; }
        quantity6 = quantity6 -1;
        display6(quantity6); }
    public void increment7(View view){//perintah tombol tambah
        if(quantity7==100){
            Toast.makeText(this,"pesanan maximal 100",Toast.LENGTH_SHORT).show();
            return; }
        quantity7 = quantity7+1 ;
        display7(quantity7); }
    public void decrement7(View view){//perintah tombol tambah
        if (quantity7==1){
            Toast.makeText(this,"pesanan minimal 1",Toast.LENGTH_SHORT).show();
            return; }
        quantity7= quantity7 -1;
        display7(quantity7); }

    public void increment8(View view){//perintah tombol tambah
        if(quantity8==100){
            Toast.makeText(this,"pesanan maximal 100",Toast.LENGTH_SHORT).show();
            return; }
        quantity8 = quantity8+1 ;
        display8(quantity8); }
    public void decrement8(View view){//perintah tombol tambah
        if (quantity8==1){
            Toast.makeText(this,"pesanan minimal 1",Toast.LENGTH_SHORT).show();
            return; }
        quantity8 = quantity8 -1;
        display(quantity8); }

    public void increment9(View view){//perintah tombol tambah
        if(quantity9==100){
            Toast.makeText(this,"pesanan maximal 100",Toast.LENGTH_SHORT).show();
            return; }
        quantity9 = quantity9+1 ;
        display9(quantity9);
    }
    public void decrement9(View view){//perintah tombol tambah
        if (quantity9==1){
            Toast.makeText(this,"pesanan minimal 1",Toast.LENGTH_SHORT).show();
            return; }
        quantity9 = quantity9 -1;
        display9(quantity9); }
    public void increment10(View view){//perintah tombol tambah
        if(quantity10==100){
            Toast.makeText(this,"pesanan maximal 100",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity10 = quantity10+1 ;
        display10(quantity10);
    }
    public void decrement10(View view){//perintah tombol tambah
        if (quantity10==1){
            Toast.makeText(this,"pesanan minimal 1",Toast.LENGTH_SHORT).show();
            return; }
        quantity10= quantity10 -1;
        display10(quantity10); }
    public void increment11(View view){//perintah tombol tambah
        if(quantity11==100){
            Toast.makeText(this,"pesanan maximal 100",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity11 = quantity11+1 ;
        display11(quantity11); }
    public void decrement11(View view){//perintah tombol tambah
        if (quantity11==1){
            Toast.makeText(this,"pesanan minimal 1",Toast.LENGTH_SHORT).show();
            return; }
        quantity11= quantity11 -1;
        display11(quantity11); }
    public void increment12(View view){//perintah tombol tambah
        if(quantity12==100){
            Toast.makeText(this,"pesanan maximal 100",Toast.LENGTH_SHORT).show();
            return; }
        quantity12 = quantity12+1 ;
        display12(quantity12); }
    public void decrement12(View view){//perintah tombol tambah
        if (quantity12==1){
            Toast.makeText(this,"pesanan minimal 1",Toast.LENGTH_SHORT).show();
            return; }
        quantity12= quantity12 -1;
        display12(quantity12); }


    public void Submitorder(View view) {
        EditText nameEditText=(EditText)findViewById(R.id.edt_name);
        String name=nameEditText.getText().toString();
        Log.v("MainActivity","Nama:");

        int price=calculateprice();
//memanggil method jumlah harga
        String pricemessage=createOrderSummary(price,name);
        displayMessage(pricemessage);

    }

    private int calculateprice(){//jumlah pesanan * harga
        int harga_milo=5000, harga_taro=10000, harga_redvelvet=10000, harga_teh=4000,
               harga_tiramisu=10000, harga_cappucino=8000, harga_ginseng=7000, harga_tehtelur=10000,
        harga_chocolatos=8000, harga_americano = 10000, harga_vanilalate=9000, harga_vanilacoffe=9000;


        return (quantity * harga_milo) + (quantity1 * harga_taro) + (quantity3 * harga_redvelvet)
                + (quantity4 * harga_teh) +  (quantity5 *harga_tiramisu ) + (quantity6 *harga_cappucino)
                + (quantity7 *harga_ginseng) + (quantity8 * harga_tehtelur) + (quantity9 * harga_chocolatos)
                + (quantity10 * harga_americano)+ (quantity11 * harga_vanilalate) + (quantity12 * harga_vanilacoffe);

        }




/*


    private void SaveData {
        String edt_name = name.getText().toString().trim();

        if (edt_name!null)
        {User Model = new User();
            Model.setNama(edt_name);


            DatabaseClass.getDatabase(getApplicationContext()).getDao().insertAllData();
            Toast.makeText(this,"", Toast.LENGTH_SHORT).show();
    }

*/

    private String createOrderSummary(int price2, String name) {//hasil pemesanan
        String pricemessage=" Nama ="+name;
//        pricemessage+="\n Jumlah    "+quantity;
        pricemessage+="\n Total     Rp  "+price2;
       // pricemessage+="\n Terima Kasih";
        price.setText("Total Rp" +String.valueOf(pricemessage));
      //  total.setText("Total Rp" + String.valueOf(price2));

        return  pricemessage;

    }

    //method ini untuk mencetak hasil perintah yang di tampilkan dengan inisial quantity_textview di textview 0
    private void displayMessage(String message) { //TOTAL

        TextView priceTextView2 = (TextView) findViewById(R.id.price);
        priceTextView2.setText(message);

    }
    private void display(int number) {  //Baris 2
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_milo);
        quantityTextView.setText("" + number);    }

    private void display1(int number) {  //Baris 2
        TextView quantityTextView2 = (TextView) findViewById(R.id.quantity_taro);
        quantityTextView2.setText("" + number);
    }

    private void display3(int number) {  //Baris 2
        TextView quantityTextView3 = (TextView) findViewById(R.id.quantity_redvelvet);
        quantityTextView3.setText("" + number);
    }

    private void display4(int number) {  //Baris 2
        TextView quantityTextView4 = (TextView) findViewById(R.id.quantity_teh);
        quantityTextView4.setText("" + number);
    }
    private void display5(int number) {  //Baris 2
        TextView quantityTextView5 = (TextView) findViewById(R.id.quantity_tiramisu);
        quantityTextView5.setText("" + number);
    }

    private void display6(int number) {  //Baris 2
        TextView quantityTextView6 = (TextView) findViewById(R.id.quantity_cappucino);
        quantityTextView6.setText("" + number);
    }
    private void display7(int number) {  //Baris 2
        TextView quantityTextView7 = (TextView) findViewById(R.id.quantity_ginseng);
        quantityTextView7.setText("" + number);    }

    private void display8(int number) {  //Baris 2
        TextView quantityTextView8 = (TextView) findViewById(R.id.quantity_tehtelur);
        quantityTextView8.setText("" + number);    }

    private void display9(int number) {  //Baris 2
        TextView quantityTextView9 = (TextView) findViewById(R.id.quantity_chocolatos);
        quantityTextView9.setText("" + number);    }
    private void display10(int number) {  //Baris 2
        TextView quantityTextView10 = (TextView) findViewById(R.id.quantity_americano);
        quantityTextView10.setText("" + number);    }
    private void display11(int number) {  //Baris 2
        TextView quantityTextView11 = (TextView) findViewById(R.id.quantity_vanilalate);
        quantityTextView11.setText("" + number);    }
    private void display12(int number) {  //Baris 2
        TextView quantityTextView12 = (TextView) findViewById(R.id.quantity_vanilacoffe);
        quantityTextView12.setText("" + number);    }


}


