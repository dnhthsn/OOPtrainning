package com.example.testdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    List<User> userList;
    RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rec1);

        userList = new ArrayList<>();

        for(int i = 0; i<5 ; i++){
            userList.add(new User(R.color.teal_200, "A", "0931342313"));
            userList.add(new User(R.drawable.ic_launcher_background, "A", "0931342313"));
            userList.add(new User(R.drawable.ic_launcher_background, "A", "0931342313"));
            userList.add(new User(R.drawable.ic_launcher_background, "A", "0931342313"));
            userList.add(new User(R.drawable.ic_launcher_background, "A", "0931342313"));
        }


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerAdapter = new RecyclerAdapter(this, userList);
        recyclerView.setAdapter(recyclerAdapter);
    }
}