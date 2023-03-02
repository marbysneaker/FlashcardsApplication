package com.example.flashcardsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        Bundle bundle = getIntent().getExtras();
        String answer = bundle.getString("answer");
        TextView textAnswer = findViewById(R.id.textview_answer);
        textAnswer.setText(answer);


    }


}