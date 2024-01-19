package com.example.mynewapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String[] names = {"Deepak", "Amit", "Deepesh", "Rahul", "Sara", "John", "Priya", "Alex", "Emily", "Ravi", "Sophia", "Ankit", "Jessica", "Ryan", "Shreya"};
    int[] images = {R.drawable.cube, R.drawable.cylinder, R.drawable.prism, R.drawable.sphere,
            R.drawable.cube, R.drawable.cylinder, R.drawable.prism, R.drawable.sphere,
            R.drawable.cube, R.drawable.cylinder, R.drawable.prism, R.drawable.sphere,
            R.drawable.cube, R.drawable.cylinder};

    RecyclerView recyclerView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        MyAdaptor myAdaptor = new MyAdaptor(MainActivity.this,images,names);

//
// For list type appearence
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdaptor);

//        //for horizontal list type appearence
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(myAdaptor);

    }
}