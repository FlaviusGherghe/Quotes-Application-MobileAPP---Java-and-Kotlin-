package com.example.aplicatiecitate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.aplicatiecitate.categorii.CategoriiAdapter;
import com.example.aplicatiecitate.categorii.CategoriiList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final List<CategoriiList> categoriiListe = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView categoriiRecyclerView = findViewById(R.id.categoriiRecyclerView);

        categoriiRecyclerView.setHasFixedSize(true);
        categoriiRecyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));

        //adaugare categorii la categoriiListe
        CategoriiList iubireCategorie = new CategoriiList("Iubire", R.drawable.love);
        categoriiListe.add(iubireCategorie); //adauga categoria iubire la categoriiListe

        CategoriiList motivatieCategorie = new CategoriiList("Motivatie",R.drawable.motivation);
        categoriiListe.add(motivatieCategorie);

        CategoriiList englezaCategorie = new CategoriiList("Engleza",R.drawable.english);
        categoriiListe.add(englezaCategorie);

        CategoriiList succesCategorie = new CategoriiList("Succes",R.drawable.succes);
        categoriiListe.add(succesCategorie);

        CategoriiList viataCategorie = new CategoriiList("Viata",R.drawable.life);
        categoriiListe.add(viataCategorie);

        //setare adapter la recyclerView
        categoriiRecyclerView.setAdapter(new CategoriiAdapter(categoriiListe, MainActivity.this));
    }
}