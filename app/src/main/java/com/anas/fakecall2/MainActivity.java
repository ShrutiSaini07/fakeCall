package com.anas.fakecall2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText eDelay;
    Button btnContact;

    String delay = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eDelay = findViewById(R.id.eDelay);
        btnContact = findViewById(R.id.btnContact);




        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (eDelay.getText().toString().trim().equals("")) {
                } else {
                    delay = eDelay.getText().toString();
                }
//                Toast.makeText(MainActivity.this, delay, Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, ContactList.class);
                i.putExtra("Delay1", delay);
                startActivity(i);
            }
        });
    }
}