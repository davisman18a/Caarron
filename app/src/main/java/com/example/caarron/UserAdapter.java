package com.example.caarron;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityOptionsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {

    private List<User> Users;





    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cars, parent, false);
        UserViewHolder viewHolder = new UserViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position){
        User user = Users.get(position);
        holder.Photo_car.setImageResource(user.getPhoto_id());
        holder.Brand.setText(user.getBrand());
        holder.Model.setText(user.getModel());
        holder.Year.setText(user.getYear());
        holder.Price.setText(user.getPrice());
        holder.Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),Aaronctivity.class);
                i.putExtra("user", user);
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation((Activity) view.getContext(), holder.Photo_car,"AvatarTransition");

                view.getContext().startActivity(i, options.toBundle());
            }
        });

    }
    @Override
    public int getItemCount(){

        return Users.size();
    }

    public UserAdapter(List<User> users){
        this.Users = users;
    }

    public void AddContact(User user){
        Users.add(user);
        notifyDataSetChanged();

    }

    public void DeleteUser(int position){
        Users.remove(position);
        notifyDataSetChanged();
    }

}
