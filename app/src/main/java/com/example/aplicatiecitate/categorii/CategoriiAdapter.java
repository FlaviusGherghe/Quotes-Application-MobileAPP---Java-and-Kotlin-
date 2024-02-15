package com.example.aplicatiecitate.categorii;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aplicatiecitate.Citate;
import com.example.aplicatiecitate.R;

import java.util.List;

public class CategoriiAdapter extends RecyclerView.Adapter<CategoriiAdapter.MyViewHolder> {

    private final List<CategoriiList> list;
    private final Context context;

    public CategoriiAdapter(List<CategoriiList> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @SuppressLint("InflateParams")
    @NonNull
    @Override
    public CategoriiAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder((LayoutInflater.from(parent.getContext()).inflate(R.layout.categorii_adapter_layout, null)));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriiAdapter.MyViewHolder holder, int position) {

        CategoriiList list2 = list.get(position);

        holder.categorieNume.setText(list2.getCategorieNume());
        holder.categorieImagine.setImageResource(list2.getCategorieImg());

        holder.rootLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(context, Citate.class);
                intent.putExtra("nume",list2.getCategorieNume());

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        private final TextView categorieNume;
        private final ImageView categorieImagine;
        private final CardView rootLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            categorieNume = itemView.findViewById(R.id.categorieNume);
            categorieImagine = itemView.findViewById(R.id.categorieImagine);
            rootLayout = itemView.findViewById(R.id.rootLayout);
        }
    }
}
