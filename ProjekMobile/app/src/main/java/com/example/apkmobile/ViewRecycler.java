package com.example.apkmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ViewRecycler extends AppCompatActivity {
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_recycler);

        addData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ViewRecycler.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Aliffrianto Yudha Prakoso", "E41200675", "085731379***"));
        mahasiswaArrayList.add(new Mahasiswa("Boy Dymas Hidayat", "E41267849", "085231143***"));
        mahasiswaArrayList.add(new Mahasiswa("Anton Sebrianto", "E41205674", "082228905***"));
        mahasiswaArrayList.add(new Mahasiswa("Prasetyo Dwiki Nugroho", "E41200694", "082333546***"));
    }
    //Tampilan di atas merupakan Tampilan yang akan muncul ketika anda mengklik Button Recycleview
}