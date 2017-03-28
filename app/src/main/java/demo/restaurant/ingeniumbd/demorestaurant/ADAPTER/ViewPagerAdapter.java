package demo.restaurant.ingeniumbd.demorestaurant.ADAPTER;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;


/**
 * Created by Jibunnisa on 12/4/2016.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments = new ArrayList<Fragment>();
    ArrayList<String> titles = new ArrayList<String>();


    public void getFragments(Fragment fragment, String title) {

        this.fragments.add(fragment);
        this.titles.add(title);

    }

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
