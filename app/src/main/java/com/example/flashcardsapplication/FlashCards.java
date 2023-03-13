package com.example.flashcardsapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

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

        RecyclerView list = findViewById(R.id.recycle_views_cards);

        Project[] projects = {

                new Project("Getting Started app","my project description",R.drawable.security,R.id.question_one),
                new Project("Bmi Calculator","my project description",R.drawable.servers,R.id.question_two),
                new Project("Inches converter","my project description",R.drawable.coding,R.id.question_three),
                new Project("Name getter app","my project description",R.drawable.migration,R.id.question_four),
                new Project("Developer Restaurant","my project description",R.drawable.ai,R.id.question_five)
        };
        ProjectsAdapter projectAdapter = new ProjectsAdapter(projects);

        list.setAdapter(projectAdapter);

        findviews();


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

    private void findviews() {
        question_one = findViewById(R.id.question_one);
        question_two = findViewById(R.id.question_two);
        question_three = findViewById(R.id.question_three);
        question_four = findViewById(R.id.question_four);
        question_five = findViewById(R.id.question_five);
    }


}