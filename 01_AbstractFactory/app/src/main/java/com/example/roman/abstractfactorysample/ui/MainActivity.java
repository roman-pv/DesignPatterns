package com.example.roman.abstractfactorysample.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.roman.abstractfactorysample.R;
import com.example.roman.abstractfactorysample.factories.AbstractFactory;
import com.example.roman.abstractfactorysample.factories.FactoryGenerator;
import com.example.roman.abstractfactorysample.models.Chocolate;
import com.example.roman.abstractfactorysample.models.Filling;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView titleTextView = findViewById(R.id.text_view_title);
        TextView subtitleTextView = findViewById(R.id.text_view_subtitle);

        AbstractFactory fillingFactory = FactoryGenerator.getFactory("FILL");
        Filling filling = fillingFactory.getFilling("STRAW");
        String fillingString = filling.name()+" : " + filling.calories();
        Log.d(TAG, fillingString);
        subtitleTextView.setText(fillingString);


        AbstractFactory chocFactory = FactoryGenerator.getFactory("CHOC");
        Chocolate chocolate = chocFactory.getChocolate("DARK");
        String chocolateString = chocolate.name()+" : " + chocolate.calories();
        Log.d(TAG, chocolateString);
        titleTextView.setText(chocolateString);
    }
}
