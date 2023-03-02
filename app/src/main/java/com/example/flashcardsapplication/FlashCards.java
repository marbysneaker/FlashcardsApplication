package com.example.flashcardsapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import androidx.cardview.widget.CardView;

public class FlashCards extends AppCompatActivity {
    CardView question_one ;
    CardView question_two ;
    CardView question_three ;
    CardView question_four ;
    CardView question_five ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_cards);
        findViews();
        question_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent answersActivityIntent = new Intent(FlashCards.this, AnswerActivity.class );
                Bundle bundle = new Bundle();
                String answer = "7";
                bundle.putString("answer",answer);
                answersActivityIntent.putExtras(bundle);
                startActivity(answersActivityIntent);
            }
        });
        question_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent answersActivityIntent = new Intent(FlashCards.this, AnswerActivity.class );
                Bundle bundle = new Bundle();
                String answer = "6";
                bundle.putString("answer",answer);
                answersActivityIntent.putExtras(bundle);
                startActivity(answersActivityIntent);
            }
        });
        question_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent answersActivityIntent = new Intent(FlashCards.this, AnswerActivity.class );
                Bundle bundle = new Bundle();
                String answer = "9";
                bundle.putString("answer",answer);
                answersActivityIntent.putExtras(bundle);
                startActivity(answersActivityIntent);
            }
        });
        question_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent answersActivityIntent = new Intent(FlashCards.this, AnswerActivity.class );
                Bundle bundle = new Bundle();
                String answer = "3";
                bundle.putString("answer",answer);
                answersActivityIntent.putExtras(bundle);
                startActivity(answersActivityIntent);
            }
        });
        question_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent answersActivityIntent = new Intent(FlashCards.this, AnswerActivity.class );
                Bundle bundle = new Bundle();
                String answer = "10";
                bundle.putString("answer",answer);
                answersActivityIntent.putExtras(bundle);
                startActivity(answersActivityIntent);
            }
        });
    }

    private void findViews() {
        question_one = findViewById(R.id.card_view_question1);
        question_two = findViewById(R.id.card_view_question2);
        question_three = findViewById(R.id.card_view_question3);
        question_four = findViewById(R.id.card_view_question4);
        question_five = findViewById(R.id.card_view_question5);

    }


}