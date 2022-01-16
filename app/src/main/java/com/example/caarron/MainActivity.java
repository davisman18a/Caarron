package com.example.caarron;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    UserAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<User> users = new ArrayList<User>();
        users.add(new User(R.drawable.hyundaiaccent, "Hyundai", "Accent", "2021", "$17,500"));
        users.add(new User(R.drawable.hyundaielentra, "Hyundai", "Elentra", "2021", "$21,655"));
        users.add(new User(R.drawable.kiafortefe, "Kia", "Forte Fe", "2021","$19,785"));
        users.add(new User(R.drawable.kiariolx, "Kia", "Rio LX", "2021","$17,045"));
        users.add(new User(R.drawable.mitsumirage, "Mitsubishi", "Mirage", "2021","$17,590"));
        users.add(new User(R.drawable.nissansentra, "Nissan", "Sentra", "2021","$20,410"));
        users.add(new User(R.drawable.nissanversa, "Nissan", "Versa", "2021","$17,600"));
        users.add(new User(R.drawable.chevysparkls, "Chevrolet", "Spark", "2021","$15,695"));
        RecyclerView recyclerView = findViewById(R.id.recycler_id);
        recyclerView.setHasFixedSize(false);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(mLayoutManager);



        adapter = new UserAdapter(users);
        recyclerView.setAdapter(adapter);
        ItemTouchHelper helper = new ItemTouchHelper(new SwipeToDeleteCallback(adapter));
        helper.attachToRecyclerView(recyclerView);


        FloatingActionButton btn = findViewById(R.id.fbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(), AddCarActivity.class);
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation((Activity) view.getContext(), btn,"bg");
                startActivityForResult(i, 1, options.toBundle());
            }
        });


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode,data);
        if(resultCode ==1){
            Bundle b = data.getExtras();
            User user = (User) b.getSerializable("user");
            adapter.AddContact(user);

        }

    }

}