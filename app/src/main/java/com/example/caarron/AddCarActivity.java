package com.example.caarron;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddCarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car);

        Button btn =findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText brand = findViewById(R.id.brand_id);
                EditText model = findViewById(R.id.model_id);
                EditText year = findViewById(R.id.year_id);
                EditText price = findViewById(R.id.price_id);

                User user = new User(R.drawable.lambo, brand.getText().toString(), model.getText().toString(), year.getText().toString(), price.getText().toString());
                Intent result = new Intent();
                result.putExtra("user", user);
                setResult(1,result);
                finish();
            }
        });



    }



}