package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestMenu extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testmenu);
        //button 1 definition and function calling

        button1 = (Button) findViewById(R.id.button5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTestAnxiety();
            }
        }
        );
        //button 2 definition and function calling
        button2 = (Button) findViewById(R.id.button6);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSchizophrenia();
            }
        });
        button3 = (Button) findViewById(R.id.button7);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDepression();
            }
        });



    }
    //button 1 function
    public void openTestAnxiety(){
        Intent intent1 = new Intent(this, TestAnxiety.class);
        startActivity(intent1);

    }
    //button 2 function
    public void openSchizophrenia(){
        Intent intent2 = new Intent(this, Schizophrenia.class);
        startActivity(intent2);

    }
    // button 3 function
    public void openDepression(){
        Intent intent3 = new Intent(this, MainActivity2.class);
        startActivity(intent3);

    }

}
