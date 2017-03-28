package demo.restaurant.ingeniumbd.demorestaurant.UI;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class Gallery_Activity extends AppCompatActivity {
    Gallery gallery;
    GalleryImageAdapter GalleryAdapter;
    ImageView selectedImageView,leftArrowImageView,rightArrowImageView;
    public int selectedImagePosition = 0;

   public int[] images = {demo.restaurant.ingeniumbd.demorestaurant.R.drawable.burger, demo.restaurant.ingeniumbd.demorestaurant.R.drawable.sandwich, demo.restaurant.ingeniumbd.demorestaurant.R.drawable.roll,
            demo.restaurant.ingeniumbd.demorestaurant.R.drawable.pizza, demo.restaurant.ingeniumbd.demorestaurant.R.drawable.mainpageimage, demo.restaurant.ingeniumbd.demorestaurant.R.drawable.cake,
           demo.restaurant.ingeniumbd.demorestaurant.R.drawable.sandwich_item_1, demo.restaurant.ingeniumbd.demorestaurant.R.drawable.roll_item_1, demo.restaurant.ingeniumbd.demorestaurant.R.drawable.burger_item_1,
            demo.restaurant.ingeniumbd.demorestaurant.R.drawable.pizza_item_1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(demo.restaurant.ingeniumbd.demorestaurant.R.layout.activity_gallery_);
        Toolbar toolbar = (Toolbar) findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.app_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setupUI();
    }
    private void setupUI() {
        leftArrowImageView = (ImageView) findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.left_arrow_imageview);
        rightArrowImageView = (ImageView) findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.right_arrow_imageview);
        gallery = (Gallery) findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.gallery);
        selectedImageView = (ImageView) findViewById(demo.restaurant.ingeniumbd.demorestaurant.R.id.selected_imageview); // get the reference of ImageView
        leftArrowImageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (selectedImagePosition > 0) {
                    --selectedImagePosition;

                }

                gallery.setSelection(selectedImagePosition, false);
            }
        });

        rightArrowImageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (selectedImagePosition < images.length - 1) {
                    ++selectedImagePosition;

                }

                gallery.setSelection(selectedImagePosition, false);

            }
        });

        gallery.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                selectedImageView.setImageResource(images[pos]);
                selectedImagePosition = pos;

                if (selectedImagePosition > 0 && selectedImagePosition < images.length - 1) {

                    rightArrowImageView.setImageDrawable(getResources().getDrawable(demo.restaurant.ingeniumbd.demorestaurant.R.drawable.arrow_right_enabled));

                } else if (selectedImagePosition == 0) {

                    leftArrowImageView.setImageDrawable(getResources().getDrawable(demo.restaurant.ingeniumbd.demorestaurant.R.drawable.arrow_left_disabled));

                }

                changeBorderForSelectedImage(selectedImagePosition);
                setSelectedImage();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }

        });

        GalleryAdapter = new GalleryImageAdapter(getApplicationContext(), images); // initialize the adapter
        gallery.setAdapter(GalleryAdapter); // set the adapter
        gallery.setSpacing(10);

        if (images.length > 0) {

            gallery.setSelection(selectedImagePosition, false);

        }

    }

    private void changeBorderForSelectedImage(int selectedItemPos) {

        int count = gallery.getChildCount();

        for (int i = 0; i < count; i++) {

            ImageView imageView = (ImageView) gallery.getChildAt(i);
            imageView.setBackgroundDrawable(getResources().getDrawable(demo.restaurant.ingeniumbd.demorestaurant.R.drawable.image_border));
            imageView.setPadding(3, 3, 3, 3);

        }

        ImageView imageView = (ImageView) gallery.getSelectedView();
        imageView.setBackgroundDrawable(getResources().getDrawable(demo.restaurant.ingeniumbd.demorestaurant.R.drawable.selected_image_border));
        imageView.setPadding(3, 3, 3, 3);
    }
    private void setSelectedImage() {

        selectedImageView.setScaleType(ImageView.ScaleType.FIT_XY);

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
