package com.example.logicmindsquiz;

import android.app.Dialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SetsAdapter extends RecyclerView.Adapter<SetsAdapter.SetsViewHolder> {

    Context context;
    ArrayList<Integer> arrayList;
    String toolbarTitle;

    public SetsAdapter(Context context, ArrayList<Integer> arrayList, String toolbarTitle) {
        this.context = context;
        this.arrayList = arrayList;
        this.toolbarTitle= toolbarTitle;
    }

    @NonNull
    @Override
    public SetsAdapter.SetsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.set_bg, parent, false);
        return new SetsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SetsAdapter.SetsViewHolder holder, int position) {
        //holder.setNo.setText(arrayList.get(position));
        holder.setNo.setText(String.valueOf(arrayList.get(position)));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class SetsViewHolder extends RecyclerView.ViewHolder{
        TextView setNo;
        public SetsViewHolder(@NonNull View itemView) {
            super(itemView);
            setNo= itemView.findViewById(R.id.setNo);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position= getAdapterPosition();
                    if(position != RecyclerView.NO_POSITION){
                        showDialog(position);
                    }
                }
            });
        }
    }

    private void showDialog(int position) {
        Dialog dialog= new Dialog(context);
        dialog.setContentView(R.layout.dialog_layout);

        Button startBtn= dialog.findViewById(R.id.startQuizBtn);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setNo= arrayList.get(position);
                Intent intent= new Intent(context, QuizActivity.class);
                intent.putExtra("Set No", setNo);
                intent.putExtra("topic", toolbarTitle);
                context.startActivity(intent);
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}
