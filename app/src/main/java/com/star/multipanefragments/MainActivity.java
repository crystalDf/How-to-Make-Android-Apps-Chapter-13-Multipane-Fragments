package com.star.multipanefragments;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Configuration configuration = getResources().getConfiguration();

        if (configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
            hideSidePanel();
        }
    }

    private void hideSidePanel() {
        View sidePanel = findViewById(R.id.side_panel_fragment);

        if (sidePanel.getVisibility() == View.VISIBLE) {
            sidePanel.setVisibility(View.GONE);
        }
    }

}
