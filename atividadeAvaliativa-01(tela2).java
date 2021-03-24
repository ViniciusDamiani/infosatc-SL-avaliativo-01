package com.example.viniciusdamianip1n2;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class segundaTela extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

    }
    public void voltarTela(View view){
        Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent2);

    }

}