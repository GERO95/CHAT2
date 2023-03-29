package com.example.chat2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);

        tv2 = (TextView) findViewById(R.id.tv2);
        String dato2 = getIntent().getStringExtra("dato2");
        tv2.setText("Usuario 2 Dijo: " + dato2);



    }

    public void Enviar(View view) {
        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("dato", et1.getText().toString());
        startActivity(i);


    }
}