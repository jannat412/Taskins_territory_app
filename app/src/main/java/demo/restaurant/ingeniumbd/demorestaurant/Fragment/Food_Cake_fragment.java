package demo.restaurant.ingeniumbd.demorestaurant.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import demo.restaurant.ingeniumbd.demorestaurant.ADAPTER.Food_Adapter;
import demo.restaurant.ingeniumbd.demorestaurant.MODEL.FoodData;
import demo.restaurant.ingeniumbd.demorestaurant.UI.FoodDescription_Activity;

/**
 * A simple {@link Fragment} subclass.
 */
public class Food_Cake_fragment extends Fragment implements Food_Adapter.ClickListenerFood {


    Food_Adapter food_adapter;
    RecyclerView recyclerView;
    public Food_Cake_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(demo.restaurant.ingeniumbd.demorestaurant.R.layout.fragment_food__cake_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyclerView = (RecyclerView)getActivity().findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.rec_list_Cake);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));

        food_adapter = new Food_Adapter(FoodData.getFoodListData(),getActivity().getApplicationContext(),"Cake");

        food_adapter.setClickListenerFood(this);
        recyclerView.setAdapter(food_adapter);
    }

    @Override
    public void itemclickfood(View v, int position) {

        Intent i = new Intent(getActivity().getApplicationContext(),FoodDescription_Activity.class);
        i.putExtra("Position",position);
        i.putExtra("Food","Cake");
        getActivity().startActivity(i);
    }
}
