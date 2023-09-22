package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Taketest extends AppCompatActivity {
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taketest);

        button2 =(Button) findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });







        button =(Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTestMenu();
            }
        });
    }
    public void openMainActivity(){
        Intent intent1 = new Intent(this,MainActivity.class);
        startActivity(intent1);

    }
    public void openTestMenu(){
        Intent intent = new Intent(this, TestMenu.class);
        startActivity(intent);
    }
}
