package com.example.android.inclass313;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Question> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new QuestionsAdapter(questions,this));
    }

    private void initialData(){
        questions = new ArrayList<>();
        questions.add(new Question(R.string.australia,R.string.question_australia,R.mipmap.australia,true));
        questions.add(new Question(R.string.africa,R.string.question_africa,R.mipmap.africa,false));
        questions.add(new Question(R.string.asia,R.string.asia,R.mipmap.asia,true));
        questions.add(new Question(R.string.middle_east,R.string.question_mideast,R.mipmap.mideast,false));
        questions.add(new Question(R.string.oceans,R.string.question_oceans,R.mipmap.oceans,true));
        questions.add(new Question(R.string.americas,R.string.question_americas,R.mipmap.americas,true));
    }
}
