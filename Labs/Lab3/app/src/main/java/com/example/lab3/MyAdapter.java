package com.example.lab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    List<Dish> listDishes;
    Context context;

    MyAdapter(List<Dish> list, Context context) {
        this.listDishes = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.item_layout, parent, false);

        ViewHolder viewHolder = new ViewHolder(view, context);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {

        holder.image.setImageResource(listDishes.get(position).getDish_image());
        holder.name.setText(listDishes.get(position).getDish_name());
        holder.rating.setRating(listDishes.get(position).getDish_rating());
    }

    @Override
    public int getItemCount() {
        return listDishes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView image;
        TextView name;
        RatingBar rating;
        Context context;

        public ViewHolder(@NonNull View itemView, Context context) {
            super(itemView);

            image = itemView.findViewById(R.id.dishImage);
            name = itemView.findViewById(R.id.dishName);
            rating = itemView.findViewById(R.id.dishRating);

            image.setOnClickListener(this);

            this.context = context;
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            String name = this.name.getText().toString() + ": " + this.rating.getRating();

            Toast.makeText(context, name, Toast.LENGTH_LONG).show();
        }
    }
}
