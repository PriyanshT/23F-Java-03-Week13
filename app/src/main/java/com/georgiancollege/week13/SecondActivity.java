package com.georgiancollege.week13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // check for function execution
        Log.d("Check", "We are in the Initialize method (onCreate) in second activity");

        // capture data coming from first activity
        Intent intent = getIntent();
        String receivedData = intent.getStringExtra("nameData");
        Log.d("Data", "Received data in second activity: " + receivedData);

        // display the received data in the label (TextView)
        TextView textView = findViewById(R.id.textView);
        textView.setText("Hello, " + receivedData);
    }

    public void goBackButton_onClick(View view) {
        // go back to first activity on button click
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}