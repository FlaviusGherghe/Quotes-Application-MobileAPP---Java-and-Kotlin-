package com.example.aplicatiecitate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Citate extends AppCompatActivity {


    private TextView citatTxt, scriitorNume;
    private final List<CitateList> citateListe = new ArrayList<>();
    private int curentCitatPosition = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citate);

        final TextView categorieNume = findViewById(R.id.categorieNume);
        citatTxt = findViewById(R.id.citatTxt);
        scriitorNume = findViewById(R.id.scriitorNume);

        final Button anteriorBtn = findViewById(R.id.anteriorBtn);
        final Button urmatorBtn = findViewById(R.id.urmatorBtn);
        final ImageView copyBtn = findViewById(R.id.copyBtn);

         final String getNume = getIntent().getStringExtra("nume");

         categorieNume.setText(getNume);

         if(getNume.equals("Viata")){
            citateListe.addAll(CitateData.getViataCitate());
         }
         else if(getNume.equals("Succes")){
             citateListe.addAll(CitateData.getSuccesCitate());
         }
         else if(getNume.equals("Motivatie")){
             citateListe.addAll(CitateData.getMotivatieCitate());
         }
         else if(getNume.equals("Iubire")){
             citateListe.addAll(CitateData.getIubireCitate());
         }
         else if(getNume.equals("Engleza")){
             citateListe.addAll(CitateData.getEnglezaCitate());
         }

         setCitatToTextView();

         anteriorBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 curentCitatPosition--;
                if(curentCitatPosition < 0){
                    curentCitatPosition = citateListe.size() - 1 ;
                }
                setCitatToTextView();
             }
         });

         copyBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                 ClipData clipData = ClipData.newPlainText("citat", citateListe.get(curentCitatPosition).getCitat()+"\nde "+citateListe.get(curentCitatPosition).getScriitor() );
                clipboardManager.setPrimaryClip(clipData);
             }
         });

         urmatorBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 curentCitatPosition++;

                 if(curentCitatPosition >= citateListe.size()){
                     curentCitatPosition = 0;
                 }
                 setCitatToTextView();
             }
         });
    }

    private void setCitatToTextView(){

        citatTxt.setText(citateListe.get(curentCitatPosition).getCitat());

        scriitorNume.setText(citateListe.get(curentCitatPosition).getScriitor());
    }
}