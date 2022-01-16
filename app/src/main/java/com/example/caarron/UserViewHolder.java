package com.example.caarron;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    public CardView Card;
    public ImageView Photo_car;
    public TextView Brand;
    public TextView Model;
    public TextView Year;
    public TextView Price;

    public UserViewHolder(@NonNull View itemView){
        super(itemView);
        Card = itemView.findViewById(R.id.card_id);
        Photo_car = itemView.findViewById(R.id.photo_id);
        Brand = itemView.findViewById(R.id.brand_id);
        Model = itemView.findViewById(R.id.model_id);
        Year = itemView.findViewById(R.id.year_id);
        Price= itemView.findViewById(R.id.price_id);


    }
}
