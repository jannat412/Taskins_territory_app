package demo.restaurant.ingeniumbd.demorestaurant.ADAPTER;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import demo.restaurant.ingeniumbd.demorestaurant.MODEL.ListItem;

import java.util.List;

/**
 * Created by Jibunnisa on 12/4/2016.
 */

public class Menu_Adapter extends RecyclerView.Adapter<Menu_Adapter.DerpHolder> {

    List<ListItem> data ;
    LayoutInflater inflater;
    ClickedListener clickedListener;
    Context context;

    public Menu_Adapter(List<ListItem> data, Context context){

        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.data = data;


    }
    public void setClickedListener(ClickedListener clickedListener){
        this.clickedListener = clickedListener;
    }

    @Override
    public DerpHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(demo.restaurant.ingeniumbd.demorestaurant.R.layout.list_item,parent,false);

        return new DerpHolder(view);
    }

    @Override
    public void onBindViewHolder(DerpHolder holder, int position) {

        ListItem item = data.get(position);
        holder.title.setText(item.getTitle());
        holder.icon.setImageResource(item.getIcon());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class DerpHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView title;
        ImageView icon;

        View view;

        public DerpHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.textview_title);
            icon = (ImageView) itemView.findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.imageview_icon);
            view = itemView.findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.count_item_root);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {

            if(clickedListener!=null){
                clickedListener.itemclick(v,getPosition());
            }
        }
    }
    public interface ClickedListener{
        public void itemclick(View view,int position);
    }
}
