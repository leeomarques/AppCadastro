package com.example.leonardo.cadastro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
    }

    public void onDisplay(View v){

        findViewById(R.id.btop1);
        Toast.makeText(MainActivity.this, "Utilize a Outra Opção", Toast.LENGTH_LONG).show();
    }

    public void onButton(View v){

        findViewById(R.id.btop1);
        Toast.makeText(MainActivity.this, "Seja Bem Vindo(a)!", Toast.LENGTH_LONG).show();
    }

}
