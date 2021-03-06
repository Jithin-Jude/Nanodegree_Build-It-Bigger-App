package com.udacity.gradle.builditbigger;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.ldoublem.loadingviewlib.view.LVWifi;


public class MainActivity extends AppCompatActivity {

    static LVWifi mLVWifi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLVWifi = findViewById(R.id.lv_wifi);
        mLVWifi.setViewColor(Color.rgb(255, 0, 0));

        android.support.v7.app.ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor(getString(R.string.top_gradient))));
    }

    public void tellJoke(View view) {
        mLVWifi.startAnim();
        Toast.makeText(getApplicationContext(),this.getString(com.udacity.gradle.builditbigger.R.string.please_wait), Toast.LENGTH_LONG).show();
        new EndpointAsyncTask().execute(this);
    }


}
