package com.example.leonardo.cadastro;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botao3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao3 = (Button) findViewById(R.id.btop3);

        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this, StudentActivity.class);
                startActivity(intent);
            }
        });

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
