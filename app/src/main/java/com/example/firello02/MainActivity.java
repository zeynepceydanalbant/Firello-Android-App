package com.example.firello02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView error;
    EditText username;
    EditText password;
    Button login;
    Button singup;
    Intent goToHome;
    Intent goToSingUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        error=findViewById(R.id.message);    //Giristeki hata mesaji icin textview tanimlama
        username=findViewById(R.id.Username); //kayitli kullanıci girisindeki kullanici adi
        password=findViewById(R.id.Password); //kayitli kullanıci girisindeki parola
        login=findViewById(R.id.Login);       //Anasayfaya gecis butonu
        singup=findViewById(R.id.singUp);     //KAyit ekranına geçiş butonu
        goToSingUp= new Intent(MainActivity.this,SingUp.class);
        goToHome=new Intent(MainActivity.this, Home.class);


        singup.setOnClickListener(new View.OnClickListener() { //Kayıt sayfasına geçiş butonu
                  @Override
                  public void onClick(View view) {
                    startActivity(goToSingUp); //geçiş intentini başlatmaa
                  }
                  }); //Kayıt sayfasına geçiş

    }





    public void changeActivty(View view) { //Kullanıcı anasayfaya geçiş kontrolü

            //Burada parola ve kullanıcı adı kontrolü yapılır. Bu durumu butonun onclick metodunda tanımlayıp butona basılınca çalıştırıyoruz.

            if(username.getText().toString().matches("") || password.getText().toString().matches("")) {              //Eğer kullanıcı adı veya parola girilmemişse hata mesajı verir
                       error.setText("Lütfen bilgilerinizi giriniz.");                                                             //hata mesajı
             }

            else if (username.getText().toString().matches("admin") && password.getText().toString().matches("1234")){ //kullanıcı adı ve parola geçerli ise
                       startActivity(goToHome);                                                                                     //anasayfaya geçilir
                       Toast.makeText(getApplicationContext(),"Hoşgeldiniz",Toast.LENGTH_LONG).show();                         // Bir mesaj verilir
            }

            else error.setText("Yanlış kullanıcı adı veya şifre");                                                                   //Diğer durumlarda hata mesajı verilir
    }//Kullanıcı anasayfaya geçiş kontrolü





}// login bitis
