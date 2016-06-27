package com.gosho.android.todolist;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by Violeta on 6/27/2016.
 */
public class UserHomePageActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home_page);
        android.support.v7.app.ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayShowHomeEnabled(true);
        actionbar.setLogo(R.drawable.ic_check_circle_black_24dp);
        actionbar.setDisplayUseLogoEnabled(true);
    }
}
