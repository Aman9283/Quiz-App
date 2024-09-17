package com.example.logicmindsquiz;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.TopicViewHolder> {

    Context context;
    //ArrayList<TopicModel> arrayList;
    ArrayList<String> arrayList;
    String title;

    public TopicAdapter(Context context, ArrayList<String> arrayList, String title) {
        this.context = context;
        this.arrayList = arrayList;
        this.title= title;
    }

    @NonNull
    @Override
    public TopicAdapter.TopicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.list_bg, parent, false);
        return new TopicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopicAdapter.TopicViewHolder holder, int position) {
        //TopicModel model= arrayList.get(position);
        holder.topicN.setText(arrayList.get(position));
        //holder.topicN.setText(model.getTopicName());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class TopicViewHolder extends RecyclerView.ViewHolder {
        TextView topicN;

        public TopicViewHolder(@NonNull View itemView) {
            super(itemView);
            topicN = itemView.findViewById(R.id.topicTxt);

            // Set click listener to the root view (itemView)
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        String topicName = arrayList.get(position);
                        Intent intent = new Intent(context, SetsActivity.class);
                        intent.putExtra("title", title);
                        intent.putExtra("topicName", topicName);
                        context.startActivity(intent);
                    }
                }
            });
        }
    }

}
