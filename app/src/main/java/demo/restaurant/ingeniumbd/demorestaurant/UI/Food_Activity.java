package demo.restaurant.ingeniumbd.demorestaurant.UI;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import demo.restaurant.ingeniumbd.demorestaurant.ADAPTER.ViewPagerAdapter;
import demo.restaurant.ingeniumbd.demorestaurant.Fragment.Food_Burger_fragment;
import demo.restaurant.ingeniumbd.demorestaurant.Fragment.Food_Cake_fragment;
import demo.restaurant.ingeniumbd.demorestaurant.Fragment.Food_HotDog_fragment;
import demo.restaurant.ingeniumbd.demorestaurant.Fragment.Food_Pizza_fragment;
import demo.restaurant.ingeniumbd.demorestaurant.Fragment.Food_Roll_fragment;
import demo.restaurant.ingeniumbd.demorestaurant.Fragment.Food_Sandwich_fragment;
import demo.restaurant.ingeniumbd.demorestaurant.MapsActivity;

public class Food_Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    ViewPager viewPager;
    TabLayout tabLayout;
    ViewPagerAdapter viewPagerAdapter;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(demo.restaurant.ingeniumbd.demorestaurant.R.layout.activity_food);

        viewPager = (ViewPager)findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.viewpager);

        tabLayout = (TabLayout) findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.tablayout);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.getFragments(new Food_Burger_fragment(),"Burger");
        viewPagerAdapter.getFragments(new Food_Pizza_fragment(),"Pizza");
        viewPagerAdapter.getFragments(new Food_Sandwich_fragment(),"Sandwich");
        viewPagerAdapter.getFragments(new Food_HotDog_fragment(),"Hot Dog");
        viewPagerAdapter.getFragments(new Food_Cake_fragment(),"Cake");
        viewPagerAdapter.getFragments(new Food_Roll_fragment(),"Roll");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


        toolbar = (Toolbar) findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.app_toolbar);

        setSupportActionBar(toolbar);

        Intent i = getIntent();
        int tabToOpen = i.getIntExtra("Position", -1);

        if (tabToOpen!=-1) {

            viewPager.setCurrentItem(tabToOpen);
        }

        NavigationView navigationView = (NavigationView) findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.nav_view_food);



      DrawerLayout drawerLayout = (DrawerLayout) findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.drawer_layout_food);

        navigationView.setNavigationItemSelectedListener(this);

       ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar, demo.restaurant.ingeniumbd.demorestaurant.R.string.open, demo.restaurant.ingeniumbd.demorestaurant.R.string.close);
       drawerLayout.addDrawerListener(toggle);
       toggle.syncState();
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()== demo.restaurant.ingeniumbd.demorestaurant.R.id.FoodMenu){
            Intent i = new Intent(this,MainActivity.class);
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
        DrawerLayout d = (DrawerLayout) findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.drawer_layout_food);
        d.closeDrawer(GravityCompat.START);
        return false;

    }

    @Override
    public void onBackPressed() {

        Intent i = new Intent(Food_Activity.this,MainActivity.class);
        startActivity(i);
        super.onBackPressed();


    }


}
