package com.example.logicmindsquiz;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ReviewViewHolder> {

    Context context;
    //ArrayList<TopicModel> arrayList;
    ArrayList<QuestionsModel> arrayList;
    HashMap<Integer,String> ansHashmap= new HashMap<>();

    public ReviewAdapter(Context context, ArrayList<QuestionsModel> arrayList, HashMap<Integer,String> ansHashmap) {
        this.context = context;
        this.arrayList = arrayList;
        this.ansHashmap= ansHashmap;
    }

    @NonNull
    @Override
    public ReviewAdapter.ReviewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.ques_list_bg, parent, false);
        return new ReviewViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ReviewAdapter.ReviewViewHolder holder, int position) {
        QuestionsModel model= arrayList.get(position);
        holder.qno.setText("Q"+model.getQuesNo());
        holder.question.setText(String.valueOf(model.getQues()));
        holder.option1.setText(String.valueOf(model.getOption1()));
        holder.option2.setText(String.valueOf(model.getOption2()));
        holder.option3.setText(String.valueOf(model.getOption3()));
        holder.option4.setText(String.valueOf(model.getOption4()));

        String correctAnswer = model.getAns();
        String userAnswer = ansHashmap.get(model.getQuesNo());

        if(model.getOption1().equals(userAnswer)){
            if(!userAnswer.equals(correctAnswer)){
                holder.option1.setBackgroundResource(R.drawable.wrong_option_bg);
                holder.option1.setTextColor(context.getResources().getColor(R.color.red));
                Drawable rightDrawable = ContextCompat.getDrawable(context, R.drawable.wrong);
                holder.option1.setCompoundDrawablesWithIntrinsicBounds(null, null, rightDrawable, null);
            }
        }
        else if(model.getOption2().equals(userAnswer)){
            if(!userAnswer.equals(correctAnswer)){
                holder.option2.setBackgroundResource(R.drawable.wrong_option_bg);
                holder.option2.setTextColor(context.getResources().getColor(R.color.red));
                Drawable rightDrawable = ContextCompat.getDrawable(context, R.drawable.wrong);
                holder.option2.setCompoundDrawablesWithIntrinsicBounds(null, null, rightDrawable, null);
            }
        }
        else if(model.getOption3().equals(userAnswer)){
            if(!userAnswer.equals(correctAnswer)){
                holder.option3.setBackgroundResource(R.drawable.wrong_option_bg);
                holder.option3.setTextColor(context.getResources().getColor(R.color.red));
                Drawable rightDrawable = ContextCompat.getDrawable(context, R.drawable.wrong);
                holder.option3.setCompoundDrawablesWithIntrinsicBounds(null, null, rightDrawable, null);
            }
        }
        else if(model.getOption4().equals(userAnswer)){
            if(!userAnswer.equals(correctAnswer)){
                holder.option4.setBackgroundResource(R.drawable.wrong_option_bg);
                holder.option4.setTextColor(context.getResources().getColor(R.color.red));
                Drawable rightDrawable = ContextCompat.getDrawable(context, R.drawable.wrong);
                holder.option4.setCompoundDrawablesWithIntrinsicBounds(null, null, rightDrawable, null);
            }
        }
        if(model.getOption1().equals(correctAnswer)){
            holder.option1.setBackgroundResource(R.drawable.correct_option_bg);
            holder.option1.setTextColor(context.getResources().getColor(R.color.green));
            Drawable rightDrawable = ContextCompat.getDrawable(context, R.drawable.correct);
            holder.option1.setCompoundDrawablesWithIntrinsicBounds(null, null, rightDrawable, null);
        }
        else if(model.getOption2().equals(correctAnswer)){
            holder.option2.setBackgroundResource(R.drawable.correct_option_bg);
            holder.option2.setTextColor(context.getResources().getColor(R.color.green));
            Drawable rightDrawable = ContextCompat.getDrawable(context, R.drawable.correct);
            holder.option2.setCompoundDrawablesWithIntrinsicBounds(null, null, rightDrawable, null);
        }
        else if(model.getOption3().equals(correctAnswer)){
            holder.option3.setBackgroundResource(R.drawable.correct_option_bg);
            holder.option3.setTextColor(context.getResources().getColor(R.color.green));
            Drawable rightDrawable = ContextCompat.getDrawable(context, R.drawable.correct);
            holder.option3.setCompoundDrawablesWithIntrinsicBounds(null, null, rightDrawable, null);
        }
        else{
            holder.option4.setBackgroundResource(R.drawable.correct_option_bg);
            holder.option4.setTextColor(context.getResources().getColor(R.color.green));
            Drawable rightDrawable = ContextCompat.getDrawable(context, R.drawable.correct);
            holder.option4.setCompoundDrawablesWithIntrinsicBounds(null, null, rightDrawable, null);
        }


        //int paddingPx = 0; // Specify your desired padding in pixels
        //holder.option1.setCompoundDrawablePadding(paddingPx);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ReviewViewHolder extends RecyclerView.ViewHolder{
        TextView question, option1, option2, option3, option4, qno;
        public ReviewViewHolder(@NonNull View itemView) {
            super(itemView);
            qno= itemView.findViewById(R.id.qno);
            question= itemView.findViewById(R.id.question);
            option1= itemView.findViewById(R.id.option1);
            option2= itemView.findViewById(R.id.option2);
            option3= itemView.findViewById(R.id.option3);
            option4= itemView.findViewById(R.id.option4);
        }
    }
}
