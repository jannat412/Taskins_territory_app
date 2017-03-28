package demo.restaurant.ingeniumbd.demorestaurant.MODEL;

import demo.restaurant.ingeniumbd.demorestaurant.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jibunnisa on 12/4/2016.
 */

public class FoodData {

    private static final String [] Burgertitles = {"Mexican Burger","Chicken Cheese Burger","Beef Burger","Special Burger"};
    private static final String [] Pizzatitles = {"Mexican Pizza","Chicken Cheese Pizza","Beef Pizza","Special Pizza"};
    private static final String [] HotDogtitles = {"Mexican Hot Dog","Chicken Cheese Hot Dog","Beef Hot Dog","Special Hot Dog"};
    private static final String [] Sandwichtitles = {"Mexican Sandwich","Chicken Cheese Sandwich","Beef Sandwich","Special Sandwich"};
    private static final String [] Rolltitles = {"Mexican Roll","Chicken Cheese Roll","Beef Roll","Special Roll"};
    private static final String [] Caketitles = {"Mexican Cake","Cocolate Cake","White Cake","Special Cake"};

    private static final String [] BurgerPrice  =   {"$34","$64","$22","$65"};
    private static final String [] PizzaPrice  =    {"$34","$64","$22","$65"};
    private static final String [] HotDogPrice  =   {"$34","$64","$22","$65"};
    private static final String [] SandwichPrice  = {"$34","$64","$22","$65"};
    private static final String [] RollPrice  =     {"$34","$64","$22","$65"};
    private static final String [] CakePrice  =     {"$34","$64","$22","$65"};

    private static final String [] BurgerDescription  =   {"this is not an ordinary burger you always eat it is a special burger.",
            "this is not an ordinary burger you always eat it is a special burger.",
            "this is not an ordinary burger you always eat it is a special burger.",
            "this is not an ordinary burger you always eat it is a special burger."};
    private static final String [] PizzaDescription  =   {"this is not an ordinary burger you always eat it is a special burger.",
            "this is not an ordinary burger you always eat it is a special burger.",
            "this is not an ordinary burger you always eat it is a special burger.",
            "this is not an ordinary burger you always eat it is a special burger."};
    private static final String [] HotDogDescription  =   {"this is not an ordinary burger you always eat it is a special burger.",
            "this is not an ordinary burger you always eat it is a special burger.",
            "this is not an ordinary burger you always eat it is a special burger.",
            "this is not an ordinary burger you always eat it is a special burger."};
    private static final String [] SandwichDescription  =   {"this is not an ordinary burger you always eat it is a special burger.",
            "this is not an ordinary burger you always eat it is a special burger.",
            "this is not an ordinary burger you always eat it is a special burger.",
            "this is not an ordinary burger you always eat it is a special burger."};
    private static final String [] RollDescription  =   {"this is not an ordinary burger you always eat it is a special burger.",
            "this is not an ordinary burger you always eat it is a special burger.",
            "this is not an ordinary burger you always eat it is a special burger.",
            "this is not an ordinary burger you always eat it is a special burger."};
    private static final String [] CakeDescription  =   {"this is not an ordinary burger you always eat it is a special burger.",
            "this is not an ordinary burger you always eat it is a special burger.",
            "this is not an ordinary burger you always eat it is a special burger.",
            "this is not an ordinary burger you always eat it is a special burger."};


    private static final int [] Burgericon = {R.drawable.burger_item_1, R.drawable.burger_item_3,
            R.drawable.burger_item_2,R.drawable.burger_item_4};
    private static final int [] Pizzaicon = {R.drawable.pizza_item_1, R.drawable.pizza_item_1,
            R.drawable.pizza_item_1,R.drawable.pizza_item_1};
    private static final int [] HotDogicon = {R.drawable.hotdog_item_1, R.drawable.hotdog_item_1,
            R.drawable.hotdog_item_1,R.drawable.hotdog_item_1};
    private static final int [] Sandwichicon = {R.drawable.sandwich_item_2, R.drawable.sandwich_item_2,
            R.drawable.sandwich_item_2,R.drawable.sandwich_item_2};
    private static final int [] Rollicon = {R.drawable.roll_item_1, R.drawable.roll_item_1,
            R.drawable.roll_item_1,R.drawable.roll_item_1};
    private static final int [] Cakeicon = {R.drawable.cake_item_2, R.drawable.cake_item_2,
            R.drawable.cake_item_2,R.drawable.cake_item_3};


    public static List<FoodItem> getFoodListData(){

        List <FoodItem> data = new ArrayList<>();



        for(int i = 0; i<Burgertitles.length && i<Burgericon.length;i++){

            FoodItem item = new FoodItem();
            item.setBurger_title(Burgertitles[i]);
            item.setBurger_description(BurgerDescription[i]);
            item.setBurger_price(BurgerPrice[i]);
            item.setBurger_icon(Burgericon[i]);
            item.setSandwich_title(Sandwichtitles[i]);
            item.setSandwich_description(SandwichDescription[i]);
            item.setSandwich_price(SandwichPrice[i]);
            item.setSandwich_icon(Sandwichicon[i]);
            item.setPizza_title(Pizzatitles[i]);
            item.setPizza_description(PizzaDescription[i]);
            item.setPizza_price(PizzaPrice[i]);
            item.setPizza_icon(Pizzaicon[i]);
            item.setHotDog_title(HotDogtitles[i]);
            item.setHotDog_description(HotDogDescription[i]);
            item.setHotDog_price(HotDogPrice[i]);
            item.setHotDog_icon(HotDogicon[i]);
            item.setRoll_title(Rolltitles[i]);
            item.setRoll_description(RollDescription[i]);
            item.setRoll_price(RollPrice[i]);
            item.setRoll_icon(Rollicon[i]);
            item.setCake_title(Caketitles[i]);
            item.setCake_description(CakeDescription[i]);
            item.setCake_price(CakePrice[i]);
            item.setCake_icon(Cakeicon[i]);


            data.add(item);

        }


        return data;
    }
}
