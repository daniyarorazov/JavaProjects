package com.example.anketa_20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    TextView textView3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);

        textView.setText(Person.Person.getLastname());
        textView2.setText(Person.Person.getFirstname());
        textView3.setText(Person.Person.getFathername());
    }

    public void nextPage(View view) {
        Intent intent = new Intent(this, Edit_Activity.class);
        startActivity(intent);
    }


}
