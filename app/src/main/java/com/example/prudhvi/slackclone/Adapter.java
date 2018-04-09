package com.example.prudhvi.slackclone;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

List<Model> list;
Context context;

public Adapter(List<Model> list,Context context)
{
    this.list=list;
    this.context=context;
}
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    Model model=list.get(position);
    String text=model.getText();
    String name=model.getName();
    int image= model.getImageView();

    holder.imageView.setImageResource(image);
    holder.heading.setText(name);
    holder.textView.setText(text);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

    TextView textView,heading,mesage;
    ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
    imageView=itemView.findViewById(R.id.home_card_img);
    textView=itemView.findViewById(R.id.textView);
    heading=itemView.findViewById(R.id.home_card_heading);
    mesage=itemView.findViewById(R.id.home_card_timestamp);
        }
    }
}
