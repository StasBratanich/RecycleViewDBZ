package com.example.recicleviewdbz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;

    private ArrayList<DataModel> dataSet;

    private CustomeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.res);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        dataSet = new ArrayList<>();

        for (int i = 0; i < MyData.drawableArray.length; i++) {
            dataSet.add(new DataModel(
                    MyData.nameArray[i],
                    MyData.versionArray[i],
                    MyData.id_[i],
                    MyData.drawableArray[i]
            ));
        }

        adapter = new CustomeAdapter(dataSet);
        recyclerView.setAdapter(adapter);
    }
}