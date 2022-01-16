package com.example.caarron;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Aaronctivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aaronctivity);

        Bundle b = getIntent().getExtras();
        User user = (User) b.getSerializable("user");

        ImageView photo = findViewById(R.id.photo_id);
        TextView brand = findViewById(R.id.brand_id);
        TextView model = findViewById(R.id.model_id);
        TextView year = findViewById(R.id.year_id);
        TextView price = findViewById(R.id.price_id);

        photo.setImageResource(user.getPhoto_id());
        brand.setText(user.getBrand());
        model.setText(user.getModel());
        year.setText(user.getYear());
        price.setText(user.getPrice());

    }
}