package com.example.javier_dev.pruebainicio;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"onCreate",Toast.LENGTH_LONG).show();
    }

    public  void miMetodo(View v){
        int a = 4;
        Toast.makeText(MainActivity.this,"hola",Toast.LENGTH_SHORT).show();

    }


}
