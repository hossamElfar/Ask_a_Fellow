package com.example.baher.ask_a_fellow.ViewAndAnswerQuestion;

import android.content.Context;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.baher.ask_a_fellow.R;
import com.mikepenz.iconics.context.IconicsContextWrapper;
import com.mikepenz.iconics.context.IconicsLayoutInflater;

import java.util.ArrayList;

public class ViewAnswersAcitivity extends AppCompatActivity {

    private RecyclerView answersRecyclerView;
    private LinearLayoutManager linearLayoutManager;
    private AnswersAdapter answersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LayoutInflaterCompat.setFactory(getLayoutInflater(), new IconicsLayoutInflater(getDelegate()));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_answers_acitivity);
        answersRecyclerView = (RecyclerView)findViewById(R.id.answersRecyclerView);
        linearLayoutManager = new LinearLayoutManager(this);

        ArrayList<Answer> a = new ArrayList<>();
        a.add(new Answer("!Hello!"));
        a.add(new Answer("!Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n" +
                "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n" +
                "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n" +
                "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n" +
                "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n" +
                "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.!"));

        answersAdapter = new AnswersAdapter(a);

        answersRecyclerView.setAdapter(answersAdapter);
        answersRecyclerView.setLayoutManager(linearLayoutManager);
    }

}
