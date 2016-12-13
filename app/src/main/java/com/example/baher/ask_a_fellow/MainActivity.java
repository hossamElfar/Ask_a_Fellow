package com.example.baher.ask_a_fellow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.baher.ask_a_fellow.ViewAndAnswerQuestion.ViewAnswersAcitivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, ViewAnswersAcitivity.class);
        startActivity(intent);
    }
}
