package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OrderPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_page);

        Intent intent = getIntent();
        String name = intent.getStringExtra(FoodDetailActivity.EXTRA_TEXT);
        String quantity = intent.getStringExtra(FoodDetailActivity.EXTRA_TEXT1);
        String price = intent.getStringExtra(FoodDetailActivity.EXTRA_NUMBER);


        TextView textViewName = findViewById(R.id.food_title);
        TextView textViewQuantity = findViewById(R.id.quantity);
        TextView textViewPrice = findViewById(R.id.price);

        textViewName.setText(name);

        textViewQuantity.setText(quantity);

        textViewPrice.setText(price);


        TextView totalPrice = findViewById(R.id.total);

        double quantity1 = Double.valueOf(quantity);
        double price1 = Double.valueOf(price);
        double priceCal = price1 * quantity1;
        String pricecLast = Double.toString(priceCal);
       totalPrice.setText(pricecLast);
    }

}
