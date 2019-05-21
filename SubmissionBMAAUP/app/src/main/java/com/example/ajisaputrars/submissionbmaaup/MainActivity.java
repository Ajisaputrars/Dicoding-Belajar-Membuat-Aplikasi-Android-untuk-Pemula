package com.example.ajisaputrars.submissionbmaaup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCategory;
    private ArrayList<Hokage> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Daftar Hokage");

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(HokageData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListHokageAdapter listPresidentAdapter = new ListHokageAdapter(this);
        listPresidentAdapter.setListHokage(list);
        rvCategory.setAdapter(listPresidentAdapter);
    }

    private void showSelectedPresident(Hokage hokage){
        Toast.makeText(this, "Kamu memilih "+hokage.getName(), Toast.LENGTH_SHORT).show();
    }
}
