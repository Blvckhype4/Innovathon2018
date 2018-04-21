package com.example.mati.innovathon2018;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<User> userList = new ArrayList<>();
    private RecyclerView recyclerView;
    private UsersAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new UsersAdapter(userList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareUserData();
    }

    private void prepareUserData() {
        User user = new User("Jan", "Kowalski", "2015");
        userList.add(user);
        User userr = new User("Jan", "Kowalski", "2015");
        userList.add(userr);
        User userrr = new User("Jan", "Kowalski", "2015");
        userList.add(userrr);


        mAdapter.notifyDataSetChanged();
    }
}