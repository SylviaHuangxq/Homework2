package com.example.homework2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class OrderFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View RootView = inflater.inflate(R.layout.fragment_view_order, container, false);

        Intent intent = getActivity().getIntent();
        String name = intent.getStringExtra(FoodDetailActivity.EXTRA_TEXT);
        String quantity = intent.getStringExtra(FoodDetailActivity.EXTRA_TEXT1);
        Double price = intent.getDoubleExtra(FoodDetailActivity.EXTRA_NUMBER,0);


        TextView textViewName = RootView.findViewById(R.id.food_title);
        TextView textViewQuantity = RootView.findViewById(R.id.quantity);
        TextView textViewPrice = RootView.findViewById(R.id.price);

        textViewName.setText(name);

       // String quantity1 = Double.toString(quantity);
        textViewQuantity.setText(quantity);

        String price1 = Double.toString(price);
        textViewPrice.setText(price1);


     /*   TextView totalPrice = RootView.findViewById(R.id.total);

        double priceCal = price * quantity;
        String pricecLast = Double.toString(priceCal);
        totalPrice.setText(pricecLast);

      */
        return RootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        //MainActivity parent = (MainActivity) getActivity();

    }
}
