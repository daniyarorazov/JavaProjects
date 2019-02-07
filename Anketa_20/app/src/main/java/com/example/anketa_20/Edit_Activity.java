package com.example.anketa_20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Edit_Activity extends AppCompatActivity {

    EditText edit;
    EditText edit2;
    EditText edit3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        edit = findViewById(R.id.editText);
        edit2 = findViewById(R.id.editText2);
        edit3 = findViewById(R.id.editText3);

        edit.setText(Person.Person.getLastname());
        edit2.setText(Person.Person.getFirstname());
        edit3.setText(Person.Person.getFathername());
    }

    public void backPage(View view) {
        Person.Person.setLastname(edit.getText().toString());
        Person.Person.setFirstname(edit2.getText().toString());
        Person.Person.setFathername(edit3.getText().toString());

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
