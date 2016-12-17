package com.example.baher.ask_a_fellow.ViewAndAnswerQuestion;

import android.content.Context;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.baher.ask_a_fellow.Common.APIEndPointInterface;
import com.example.baher.ask_a_fellow.R;
import com.mikepenz.iconics.context.IconicsContextWrapper;
import com.mikepenz.iconics.context.IconicsLayoutInflater;

import java.util.ArrayList;
import java.util.Arrays;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class ViewAnswersAcitivity extends AppCompatActivity {

    private RecyclerView answersRecyclerView;
    private LinearLayoutManager linearLayoutManager;
    private AnswersAdapter answersAdapter;
    public static final String BASE_URL = "http://172.16.0.72/ask-a-fellow-laravel/public/api/v1/";
    public APIEndPointInterface apiService;
    public  ArrayList<Answer> answersArrayList;

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

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiService = retrofit.create(APIEndPointInterface.class);
        Call<AnswerPOJO> call = apiService.getAnswer("1");
        call.enqueue(new Callback<AnswerPOJO>() {
            @Override
            public void onResponse(Response<AnswerPOJO> response, Retrofit retrofit) {
                answersArrayList = new ArrayList<>();

                for(AnswerData ans : response.body().getData()){
                    answersArrayList.add(new Answer(ans.getAnswer()));
                }
                answersAdapter = new AnswersAdapter(answersArrayList);
                answersRecyclerView.setAdapter(answersAdapter);
                answersRecyclerView.getAdapter().notifyDataSetChanged();
            }

            @Override
            public void onFailure(Throwable t) {
                Log.d("HelloWorld",t.getMessage());
            }
        });
    }

}
