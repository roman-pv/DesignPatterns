package com.example.roman.abstractfactorysample.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.roman.abstractfactorysample.R;
import com.example.roman.abstractfactorysample.factories.AbstractFactory;
import com.example.roman.abstractfactorysample.factories.FactoryGenerator;
import com.example.roman.abstractfactorysample.models.Chocolate;
import com.example.roman.abstractfactorysample.models.Filling;

public class MainActivity extends AppCompatActivity {

    private final static String DEBUG_TAG = "Debug_tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView titleTextView = findViewById(R.id.text_view_title);
        TextView subtitleTextView = findViewById(R.id.text_view_subtitle);

        TextView cardTitleTextView = findViewById(R.id.card_title_text_view);
        TextView cardDescriptionTextView = findViewById(R.id.description_text_view);
        TextView caloriesTextView = findViewById(R.id.calories_text_view);
        ImageView cardImageView = findViewById(R.id.image_view);

        AbstractFactory fillingFactory = FactoryGenerator.getFactory("FILL");
        Filling filling = fillingFactory.getFilling("STRAW");
        String fillingString = filling.name()+" : " + filling.calories();
        Log.d(DEBUG_TAG, fillingString);
        subtitleTextView.setText(fillingString);


        AbstractFactory chocFactory = FactoryGenerator.getFactory("CHOC");
        Chocolate chocolate = chocFactory.getChocolate("DARK");
        String chocolateString = chocolate.name()+" : " + chocolate.calories();
        Log.d(DEBUG_TAG, chocolateString);
        titleTextView.setText(chocolateString);

        Chocolate whiteChocolate = chocFactory.getChocolate("WHITE");
        Log.d(DEBUG_TAG, whiteChocolate.name());
        cardTitleTextView.setText(whiteChocolate.name());
        caloriesTextView.setText(whiteChocolate.calories());
        cardDescriptionTextView.setText(whiteChocolate.description());
        cardImageView.setImageDrawable(getResources().getDrawable(whiteChocolate.image()));


    }
}
