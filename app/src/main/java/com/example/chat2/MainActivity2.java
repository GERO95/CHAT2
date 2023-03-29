package com.example.chat2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv1;
    private EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et2 = (EditText) findViewById(R.id.et2);
        tv1 = (TextView) findViewById(R.id.tv1);

        String dato = getIntent().getStringExtra("dato");
        tv1.setText("Usuario 1 Dijo: " + dato);


    }

    public void Regresar(View view) {
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("dato2", et2.getText().toString());
        startActivity(i);
    }
}