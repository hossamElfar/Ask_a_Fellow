package com.example.baher.ask_a_fellow.ViewAndAnswerQuestion;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.baher.ask_a_fellow.R;
import com.mikepenz.iconics.typeface.GenericFont;
import com.mikepenz.iconics.view.IconicsButton;

import java.util.ArrayList;

/**
 * Created by mohamedelzarei on 12/13/16.
 */

public class AnswersAdapter extends RecyclerView.Adapter<AnswersAdapter.AnswerViewHolder> {

    private ArrayList<Answer> answers;

    public AnswersAdapter(ArrayList<Answer> answers) {
        this.answers = answers;
    }

    @Override
    public AnswerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.answers_recycler_view_item_row, parent, false);
        return new AnswerViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(AnswerViewHolder holder, int position) {
         holder.bindData(answers.get(position));
    }

    @Override
    public int getItemCount() {
        return answers.size();
    }

    public static class AnswerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView mItemDescription;
        private Answer answer;
        private IconicsButton vote_up;

        public AnswerViewHolder(View v) {
            super(v);
            mItemDescription = (TextView) v.findViewById(R.id.person_age);
            vote_up = (IconicsButton) v.findViewById(R.id.vote_up);
            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Log.d("RecyclerView", "CLICK!");
        }

        private void bindData(Answer answer) {
            this.answer = answer;
            mItemDescription.setText(answer.getAnswerContent());
        }
    }

}


