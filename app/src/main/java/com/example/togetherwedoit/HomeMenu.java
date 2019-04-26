package com.example.togetherwedoit;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_menu);

        Button maps_button = findViewById(R.id.maps_button);
        maps_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomeMenu.this,MapsActivity.class);
                startActivity(intent);
                    // Code here executes on main thread after user presses button
            }
        });
        Button events_button = findViewById(R.id.events_button);
        events_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomeMenu.this,Events.class);
                startActivity(intent);
                // Code here executes on main thread after user presses button
            }
        });
        ImageButton profile_button = findViewById(R.id.profile_imagebutton);
        profile_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomeMenu.this,Profile.class);
                startActivity(intent);
                // Code here executes on main thread after user presses button
            }
        });
        Button seasonal_button = findViewById(R.id.seasonal_button);
        seasonal_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomeMenu.this,SeasonalFood.class);
                startActivity(intent);
                // Code here executes on main thread after user presses button
            }
        });
        ImageButton settings_button = findViewById(R.id.settings_button);
        settings_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomeMenu.this,Settings.class);
                startActivity(intent);
                // Code here executes on main thread after user presses button
            }
        });

    }


}



