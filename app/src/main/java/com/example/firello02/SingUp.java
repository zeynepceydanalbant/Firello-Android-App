package com.example.firello02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SingUp extends AppCompatActivity {

    EditText userName;
    EditText userSurname;
    EditText password;
    EditText passwordTry;
    EditText phoneNumber;
    EditText date;
    Button add;
    FirebaseDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        db= FirebaseDatabase.getInstance();       //Database bağlantısı
        userName=findViewById(R.id.name);         //Yeni kullanıcının adı
        userSurname=findViewById(R.id.surname);   //Yeni kullanıcının soyadı
        password=findViewById(R.id.userPassword); //Yeni kullanıcının parolası
        //passwordTry=findViewById(R.id);
        phoneNumber=findViewById(R.id.Phone);     //Yeni kullanıcının numarası Uniq id'si
        date=findViewById(R.id.dateOfBorn);       //Doğum tarihi
        add=findViewById(R.id.Add);               //Kayıt butonu
    }

    public void saveUser(View view){  //Kullanıcıyı kayıt etme

        DatabaseReference myRef = db.getReference("message");

        myRef.setValue("Hello, World!");

    }//Kullanıcıyı kayıt etme



}
