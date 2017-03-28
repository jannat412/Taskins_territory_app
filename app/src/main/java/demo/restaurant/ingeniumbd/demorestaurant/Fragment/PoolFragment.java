package demo.restaurant.ingeniumbd.demorestaurant.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class PoolFragment extends Fragment {


    public PoolFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(demo.restaurant.ingeniumbd.demorestaurant.R.layout.fragment_pool, container, false);
    }

}
