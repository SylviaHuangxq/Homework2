package com.example.homework2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private ArrayList<FoodItem> foodItemsToAdapt;

    public void setData(ArrayList<FoodItem> foodItemsToAdapt) {
        this.foodItemsToAdapt = foodItemsToAdapt;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food, parent, false);

        FoodViewHolder foodViewHolder = new FoodViewHolder(view);
        return foodViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, final int position) {
        final FoodItem foodItemAtPosition = foodItemsToAdapt.get(position);

        holder.food_nameTextView.setText(foodItemAtPosition.getFood_name());
        holder.food_pic.setImageResource(foodItemAtPosition.getImageDrawableId());

        String final_price = String.valueOf(foodItemAtPosition.getPrice());
        holder.food_price.setText(final_price);


        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, FoodDetailActivity.class);
                intent.putExtra("food_id", foodItemAtPosition.getFood_id());
                context.startActivity(intent);
            }
        });
        }





    @Override
    public int getItemCount() {
        return foodItemsToAdapt.size();
    }





    public static class FoodViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public TextView food_nameTextView;
        public ImageView food_pic;
        public TextView food_price;

        public FoodViewHolder(View v){
            super(v);
            view = v;
            food_nameTextView = v.findViewById(R.id.food_name);
            food_pic = v.findViewById(R.id.food_pic);
            food_price = v.findViewById(R.id.price);
        }
}


}
