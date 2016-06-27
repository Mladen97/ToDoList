package com.gosho.android.todolist;

import android.app.ListActivity;
import android.os.Bundle;

public class UserListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userList);
    }
}
