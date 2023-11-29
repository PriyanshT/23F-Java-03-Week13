package com.georgiancollege.week13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitButton_onClick(View view) {
        Log.d("Check", "We are in the submitButton function");

        // go to next activity on button click
        Intent intent = new Intent(this, SecondActivity.class);

        // store the data from the form in a variable
        EditText editText = findViewById(R.id.userText);
        String editTextData = editText.getText().toString();

        // pass editText data along with intent
        intent.putExtra("nameData", editTextData);
        startActivity(intent);
    }
}