package demo.restaurant.ingeniumbd.demorestaurant.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.TextView;

import demo.restaurant.ingeniumbd.demorestaurant.MODEL.FoodData;
import demo.restaurant.ingeniumbd.demorestaurant.MODEL.FoodItem;

import java.util.List;

public class FoodDescription_Activity extends AppCompatActivity {

    ImageView foodimage;
    TextView FoodTitle,FoodDescription,FoodPrice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(demo.restaurant.ingeniumbd.demorestaurant.R.layout.activity_food_description_);

       foodimage = (ImageView) findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.foodimage);
        FoodTitle= (TextView) findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.foodtitle);
        FoodDescription = (TextView) findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.fooddescription);
        FoodPrice = (TextView) findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.foodprice);


        DisplayMetrics displayMetrics = new DisplayMetrics();

        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        int width = displayMetrics.widthPixels;
        int hight = displayMetrics.heightPixels;

        getWindow().setLayout((int) (width * 0.9), (int) (hight * 0.650));



        Intent i = getIntent();
        int tabToOpen = i.getIntExtra("Position", -1);
        String foodtype = i.getStringExtra("Food");

        if (tabToOpen!=-1){

            if(foodtype.equals("Burger")){


                List<FoodItem> foodItems = FoodData.getFoodListData();

                FoodItem item = foodItems.get(tabToOpen);

                FoodTitle.setText(item.getBurger_title());
                FoodDescription.setText(item.getBurger_description());
                FoodPrice.setText(item.getBurger_price());
                foodimage.setImageResource(item.getBurger_icon());


            }
            else if(foodtype.equals("Sandwich")){

                List<FoodItem> foodItems = FoodData.getFoodListData();

                FoodItem item = foodItems.get(tabToOpen);

                FoodTitle.setText(item.getSandwich_title());
                FoodDescription.setText(item.getSandwich_description());
                FoodPrice.setText(item.getSandwich_price());
                foodimage.setImageResource(item.getSandwich_icon());
            }
            else if(foodtype.equals("Pizza")){

                List<FoodItem> foodItems = FoodData.getFoodListData();

                FoodItem item = foodItems.get(tabToOpen);

                FoodTitle.setText(item.getPizza_title());
                FoodDescription.setText(item.getPizza_description());
                FoodPrice.setText(item.getPizza_price());
                foodimage.setImageResource(item.getPizza_icon());
            }
           else if(foodtype.equals("HotDog")){

                List<FoodItem> foodItems = FoodData.getFoodListData();

                FoodItem item = foodItems.get(tabToOpen);

                FoodTitle.setText(item.getHotDog_title());
                FoodDescription.setText(item.getHotDog_description());
                FoodPrice.setText(item.getHotDog_price());
                foodimage.setImageResource(item.getHotDog_icon());
            }
           else if(foodtype.equals("Roll")){

                List<FoodItem> foodItems = FoodData.getFoodListData();

                FoodItem item = foodItems.get(tabToOpen);

                FoodTitle.setText(item.getRoll_title());
                FoodDescription.setText(item.getRoll_description());
                FoodPrice.setText(item.getRoll_price());
                foodimage.setImageResource(item.getRoll_icon());
            }
          else if(foodtype.equals("Cake")){

                List<FoodItem> foodItems = FoodData.getFoodListData();

                FoodItem item = foodItems.get(tabToOpen);

                FoodTitle.setText(item.getCake_title());
                FoodDescription.setText(item.getCake_description());
                FoodPrice.setText(item.getCake_price());
                foodimage.setImageResource(item.getCake_icon());
            }

        }
    }
}
