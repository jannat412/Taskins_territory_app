package demo.restaurant.ingeniumbd.demorestaurant.UI;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import demo.restaurant.ingeniumbd.demorestaurant.ADAPTER.Menu_Adapter;
import demo.restaurant.ingeniumbd.demorestaurant.MODEL.MenuData;
import demo.restaurant.ingeniumbd.demorestaurant.MapsActivity;


public class MainActivity extends AppCompatActivity implements Toolbar.OnMenuItemClickListener,
        NavigationView.OnNavigationItemSelectedListener,Menu_Adapter.ClickedListener{

    Toolbar toolbar;
    Menu_Adapter menu_adapter;
    DrawerLayout drawerLayout;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(demo.restaurant.ingeniumbd.demorestaurant.R.layout.activity_main);
        toolbar = (Toolbar) findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.app_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(demo.restaurant.ingeniumbd.demorestaurant.R.string.app_name);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        toolbar.setOnMenuItemClickListener(this);

        recyclerView = (RecyclerView)findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.rec_list);

        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,2));

        menu_adapter = new Menu_Adapter(MenuData.getMenuListData(),this);

        recyclerView.setAdapter(menu_adapter);

        menu_adapter.setClickedListener(this);

        drawerLayout = (DrawerLayout) findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.drawer_layout_main);

        NavigationView navigationView = (NavigationView) findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);




        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar, demo.restaurant.ingeniumbd.demorestaurant.R.string.open, demo.restaurant.ingeniumbd.demorestaurant.R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


    }


    @Override
    public boolean onMenuItemClick(MenuItem item) {

        if(item.getItemId()== demo.restaurant.ingeniumbd.demorestaurant.R.id.fragment1){

            Intent i = new Intent(this,Food_Activity.class);
            startActivity(i);
        }
        if(item.getItemId()== demo.restaurant.ingeniumbd.demorestaurant.R.id.fragment2){

            Intent i = new Intent(this,Pool_Activity.class);
            startActivity(i);
        }
        if(item.getItemId()== demo.restaurant.ingeniumbd.demorestaurant.R.id.fragment3){

            Intent i = new Intent(this,Gallery_Activity.class);
            startActivity(i);
        }
        if(item.getItemId()== demo.restaurant.ingeniumbd.demorestaurant.R.id.fragment4){

            Intent i = new Intent(this,Contact_Us.class);
            startActivity(i);
        }
        if(item.getItemId()== demo.restaurant.ingeniumbd.demorestaurant.R.id.exit){
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setTitle("Exit Application?");
            alertDialogBuilder
                    .setMessage("Click yes to exit!")
                    .setCancelable(false)
                    .setPositiveButton("Yes",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    moveTaskToBack(true);
                                    android.os.Process.killProcess(android.os.Process.myPid());
                                    System.exit(1);
                                }
                            })

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                            dialog.cancel();
                        }
                    });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();

        }

        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(demo.restaurant.ingeniumbd.demorestaurant.R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()== demo.restaurant.ingeniumbd.demorestaurant.R.id.FoodMenu){
            Intent i = new Intent(this,Food_Activity.class);
            startActivity(i);
        }
        if(item.getItemId()== demo.restaurant.ingeniumbd.demorestaurant.R.id.Location){
            Intent i = new Intent(this,MapsActivity.class);
            startActivity(i);
        }
        if(item.getItemId()== demo.restaurant.ingeniumbd.demorestaurant.R.id.PhotoGallery){
            Intent i = new Intent(this,Gallery_Activity.class);
            startActivity(i);
        }
        if(item.getItemId()== demo.restaurant.ingeniumbd.demorestaurant.R.id.PoolMenu){
           Intent i = new Intent(this,Pool_Activity.class);
           startActivity(i);
        }
        if(item.getItemId()== demo.restaurant.ingeniumbd.demorestaurant.R.id.ContactUs){
            Intent i = new Intent(this,Contact_Us.class);
            startActivity(i);
        }
        if(item.getItemId()== demo.restaurant.ingeniumbd.demorestaurant.R.id.DeveloperInfo){
            Intent i = new Intent(this,Developer.class);
            startActivity(i);
        }
        DrawerLayout d = (DrawerLayout) findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.drawer_layout_main);
        d.closeDrawer(GravityCompat.START);
        return false;
    }

    @Override
    public void itemclick(View view, int position) {

        Integer d=position;
        Log.e("rir",d.toString());
        Intent i = new Intent(this, Food_Activity.class);
        i.putExtra("Position", position);
        startActivity(i);
    }
    @Override
    public void onBackPressed() {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Exit Application?");
        alertDialogBuilder
                .setMessage("Click yes to exit!")
                .setCancelable(false)
                .setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                moveTaskToBack(true);
                                android.os.Process.killProcess(android.os.Process.myPid());
                                System.exit(1);
                            }
                        })

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();


    }
}
