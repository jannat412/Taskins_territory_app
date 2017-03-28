package demo.restaurant.ingeniumbd.demorestaurant.MODEL;
;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jibunnisa on 12/4/2016.
 */

public class MenuData {
    private static final String [] titles = {"BURGAR","PIZZA","SANDWITCH","HOTDOG","CAKE","ROLL"};


    private static final int [] icon = {demo.restaurant.ingeniumbd.demorestaurant.R.drawable.burger, demo.restaurant.ingeniumbd.demorestaurant.R.drawable.pizza, demo.restaurant.ingeniumbd.demorestaurant.R.drawable.sandwich, demo.restaurant.ingeniumbd.demorestaurant.R.drawable.hotdog,
            demo.restaurant.ingeniumbd.demorestaurant.R.drawable.cake, demo.restaurant.ingeniumbd.demorestaurant.R.drawable.roll};

    public static List<ListItem> getMenuListData(){

        List <ListItem> data = new ArrayList<>();



            for(int i = 0; i<titles.length && i<icon.length;i++){

                ListItem item = new ListItem();
                item.setTitle(titles[i]);
                item.setIcon(icon[i]);


                //  Log.e("error",item.getTitle());
                data.add(item);

            }


        return data;
    }
}
