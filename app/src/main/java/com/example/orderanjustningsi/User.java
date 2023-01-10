package com.example.orderanjustningsi;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "User_table")
public class User {

    @PrimaryKey(autoGenerate = true)
    private int key;
//    @NonNull
    @ColumnInfo(name = "nama")
    private String nama;

    @ColumnInfo(name = "harga")
    private String harga;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
    //    public User(@NonNull String word) {
  //      this.mWord = word;
   // }


    //@NonNull
    //public String getWord() {
      //  return this.mWord;
    //}
}
