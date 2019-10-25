package com.example.homework2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FoodItemDatabase {

    public static FoodItem getFoodById(int food_id){
        return foodItems.get(food_id);
    }

    public static ArrayList<FoodItem> getAllFoods() {
        return new ArrayList<FoodItem>((List) Arrays.asList(foodItems.values().toArray()));
    }

    private static final HashMap<Integer, FoodItem> foodItems = new HashMap<>();

    static {
        foodItems.put(1,new FoodItem(
                1,
                "Fried Chicken",
                10.00,
                "6 Pcs\n" +
                        "\n" +
                        "korean style fried chicken with mayonnaise, aioli, ketchup and source cream.",
                R.drawable.fried_chicken
        ));

        foodItems.put(2, new FoodItem(
                2,
                "Potato Fries",
                6.00,
                "Served with salt and ketchup.",
                R.drawable.fries
        ));

        foodItems.put(3, new FoodItem(
                3,
                "Chicken Wings",
                12.50,
                "6 Pcs\n" +
                        "\n" +
                        "Served with spicy BBQ source.",
                R.drawable.chicken_wings
        ));

        foodItems.put(4, new FoodItem(
                4,
                "Mushroom Balls",
                6.50,
                "5 Pcs\n" +
                        "\n" +
                        "Served with ketchup or Aoili.",
                R.drawable.musroom_balls
        ));

        foodItems.put(5, new FoodItem(
                5,
                "Caesar Salad",
                10.5,
                "a green salad of romaine lettuce and croutons dressed with lemon juice (or lime juice), olive oil, egg, Worcestershire sauce, anchovies, garlic, Dijon mustard, Parmesan cheese, and black pepper.",
                R.drawable.caesar_salad
        ));

        foodItems.put(6, new FoodItem(
                6,
                "Meat Deluxe Pizza",
                25,
                "Smoke ham, pepperoni, house cooked chicken and ground beef, Italian sausage and bacon on a BBQ base.",
                R.drawable.chicken_pizza
        ));

        foodItems.put(7, new FoodItem(
                7,
                "Prosciutto Blanco",
                17,
                "Prosciutto & wild mushroom medley with parmesan & garlic blanco cream sauce, serve with shaved parmesan & fresh herbs.",
                R.drawable.blanco
        ));

        foodItems.put(8, new FoodItem(
                8,
                "Herb and garlic squares",
                10.5,
                "Garlic squares topped with fresh herbs.",
                R.drawable.garlic_squares
        ));

        foodItems.put(9, new FoodItem(
                9,
                "Bourbon Pork Ribs",
                16.5,
                "Succulent, sticky pork ribs marinated in our signature bourbon BBQ source, served on a bed of rocket.",
                R.drawable.ribs
        ));

        foodItems.put(10, new FoodItem(
                10,
                "Garlic Sourdough",
                8.5,
                "Sourdough loaf with herb and garlic butter topped with polenta.",
                R.drawable.herb_and_garlic
        ));

        foodItems.put(11, new FoodItem(
                11,
                "Garden Salad Bowl",
                10.5,
                "Mixed leaves, spanish onions, cherry tomatoes and cucumber tossed with EVOO lemon and dressed with balsamic.",
                R.drawable.garden_salad
        ));

        foodItems.put(12, new FoodItem(
                12,
                "Belgian Waffle",
                14.00,
                "Dusted with icing sugar & served with your choice of drizzle sause..",
                R.drawable.waffle
        ));

        foodItems.put(13, new FoodItem(
                13,
                "Chocolate Mousse",
                5.00,
                "Chocolate Mousse.",
                R.drawable.chocolate
        ));

        foodItems.put(14, new FoodItem(
                14,
                "Chicken Fillet Pitta",
                12.00,
                "Two grilled fillets, lettuce, peri peri, and mayonnaise.",
                R.drawable.pitta
        ));

        foodItems.put(15, new FoodItem(
                15,
                "Bacon and Cheese",
                14.00,
                "Wood smoked bacon, shredded mozzarella, chips, BBQ sauce, and chilli sauce.",
                R.drawable.loaded_bacon
        ));

    }

}
