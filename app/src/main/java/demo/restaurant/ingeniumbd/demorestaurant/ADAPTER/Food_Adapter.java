package demo.restaurant.ingeniumbd.demorestaurant.ADAPTER;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import demo.restaurant.ingeniumbd.demorestaurant.MODEL.FoodItem;

import java.util.List;

/**
 * Created by Jibunnisa on 12/4/2016.
 */

public class Food_Adapter extends RecyclerView.Adapter <Food_Adapter.DerpHolderFood>{

    List<FoodItem> data ;
    LayoutInflater inflater;
    String foodtype;
    Context context;

    ClickListenerFood clickListenerFood;

    public Food_Adapter(List<FoodItem> data, Context context,String foodtype){

        this.inflater = LayoutInflater.from(context);
        this.data = data;
        this.foodtype = foodtype;
        this.context = context;


    }
    public void setClickListenerFood(ClickListenerFood clickListenerFood){

        this.clickListenerFood = clickListenerFood;
    }

    @Override
    public DerpHolderFood onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(demo.restaurant.ingeniumbd.demorestaurant.R.layout.list_specific_food,parent,false);

        return new Food_Adapter.DerpHolderFood(view);
    }

    @Override
    public void onBindViewHolder(DerpHolderFood holder, int position) {

        FoodItem item = data.get(position);
        if(foodtype.equals("Burger")){
            holder.title.setText(item.getBurger_title());
            holder.price.append(" "+item.getBurger_price());
            holder.icon.setImageResource(item.getBurger_icon());
        }else if(foodtype.equals("Pizza")){
            holder.title.setText(item.getPizza_title());
            holder.price.append(" "+item.getPizza_price());
            holder.icon.setImageResource(item.getPizza_icon());
        }
        else if(foodtype.equals("HotDog")){
            holder.title.setText(item.getHotDog_title());
            holder.price.append(" "+item.getHotDog_price());
            holder.icon.setImageResource(item.getHotDog_icon());
        }
        else if(foodtype.equals("Sandwich")){
            holder.title.setText(item.getSandwich_title());
            holder.price.append(" "+item.getSandwich_price());
            holder.icon.setImageResource(item.getSandwich_icon());
        }
        else if(foodtype.equals("Cake")){
            holder.title.setText(item.getCake_title());
            holder.price.append(" "+item.getCake_price());
            holder.icon.setImageResource(item.getCake_icon());
        }
        else if(foodtype.equals("Roll")){
            holder.title.setText(item.getRoll_title());
            holder.price.append(" "+item.getRoll_price());
            holder.icon.setImageResource(item.getRoll_icon());
        }

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class DerpHolderFood extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView title;
        TextView price;
        ImageView icon;

        View view;

        public DerpHolderFood(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.Specific_Food_Title);
            icon = (ImageView) itemView.findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.Specific_Food_Image);
            price = (TextView) itemView.findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.Specific_Food_Price);
            view = itemView.findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.count_item_root_food);

            itemView.setOnClickListener(this);



        }

        @Override
        public void onClick(View v) {

            clickListenerFood.itemclickfood(v,getPosition());
        }
    }
    public interface ClickListenerFood{
        public void itemclickfood(View v,int position);
    }
}
