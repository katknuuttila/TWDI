package com.example.togetherwedoit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        ImageButton profile_button = findViewById(R.id.profile_button);
        profile_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Events.this,Profile.class);
                startActivity(intent);
                // Code here executes on main thread after user presses button
            }
        });
        ImageButton settings_button = findViewById(R.id.settings_button);
        settings_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Events.this,Settings.class);
                startActivity(intent);
                // Code here executes on main thread after user presses button
            }
        });
    }
}
