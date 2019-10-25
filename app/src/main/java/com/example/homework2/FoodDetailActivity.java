package com.example.homework2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class FoodDetailActivity extends AppCompatActivity {


    public static final String EXTRA_TEXT = "com.example.application.homework2.EXTRA_TEXT";
    public static final String EXTRA_NUMBER = "com.example.application.homework2.EXTRA_NUMBER";
    public static final String EXTRA_TEXT1 = "com.example.application.homework2.EXTRA_TEXT1";

    private ImageView imageView;
    private TextView food_nameTextView;
    private TextView priceTextView;
    private TextView descriptionTextView;
    private TextView quantityTextView;
    private Button addButton;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_detail);

        Intent intent = getIntent();

        int food_id = intent.getIntExtra("food_id", 0);

        FoodItem foodItem = FoodItemDatabase.getFoodById(food_id);

        imageView = findViewById(R.id.food_pic);
        food_nameTextView = findViewById(R.id.food_name);
        priceTextView = findViewById(R.id.price);
        descriptionTextView = findViewById(R.id.description);

        imageView.setImageResource(foodItem.getImageDrawableId());
        food_nameTextView.setText(foodItem.getFood_name());

        String finalPrice = String.valueOf(foodItem.getPrice());
        priceTextView.setText(finalPrice);

        descriptionTextView.setText(foodItem.getDescription());


        Button button = findViewById(R.id.back);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Button addButton = findViewById(R.id.addCart);
        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                open();
            }
        });


    }




        public void open(){
            Intent intent = new Intent(getBaseContext(), OrderPage.class);

            TextView textName = findViewById(R.id.food_name);
            String name = textName.getText().toString();

            EditText textQuantity = findViewById(R.id.quantity);
            String quantity = textQuantity.getText().toString();

            TextView numberPrice = findViewById(R.id.price);
            String price = numberPrice.getText().toString();
            //double price = Double.parseDouble(numberPrice.getText().toString());

            intent.putExtra(EXTRA_TEXT,name);
            intent.putExtra(EXTRA_TEXT1, quantity);
            intent.putExtra(EXTRA_NUMBER, price);
            startActivity(intent);
        }


}
