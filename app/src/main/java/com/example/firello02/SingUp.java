package com.example.firello02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SingUp extends AppCompatActivity {

    EditText userName;
    EditText userSurname;
    EditText password;
    EditText passwordTry;
    EditText phoneNumber;
    EditText date;
    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        userName=findViewById(R.id.name);         //Yeni kullanıcının adı
        userSurname=findViewById(R.id.surname);   //Yeni kullanıcının soyadı
        password=findViewById(R.id.userPassword); //Yeni kullanıcının parolası
        //passwordTry=findViewById(R.id);
        phoneNumber=findViewById(R.id.Phone);     //Yeni kullanıcının numarası Uniq id'si
        date=findViewById(R.id.dateOfBorn);       //Doğum tarihi
        add=findViewById(R.id.Add);               //Kayıt butonu
    }
}
