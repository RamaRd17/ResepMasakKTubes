package com.example.resepmasak.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.resepmasak.Activity.DetailActivity;
import com.example.resepmasak.R;

import java.util.ArrayList;

import static android.support.constraint.Constraints.TAG;

public class HomePageAdapter extends RecyclerView.Adapter<HomePageAdapter.ViewHolder> {

    private ArrayList<String> judulResep = new ArrayList<>();
    private ArrayList<String> photoResep = new ArrayList<>();
    private ArrayList<String> bahanLangkah = new ArrayList<>();
    private Context mContext;

    public HomePageAdapter(Context mContext, ArrayList<String> judulResep, ArrayList<String> photoResep, ArrayList<String> bahanLangkah) {
        this.judulResep = judulResep;
        this.photoResep = photoResep;
        this.bahanLangkah = bahanLangkah;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public HomePageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_kategori,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomePageAdapter.ViewHolder holder, final int position) {

        Log.d(TAG, "onBindViewHolder: called : "+ judulResep.get(position));

        Glide.with(mContext)
                .asBitmap()
                .load(photoResep.get(position))
                .into(holder.photonya);


        holder.judulnya.setText(judulResep.get(position));

        holder.CardViewparent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DetailActivity.class);
                intent.putExtra("judul", judulResep.get(position));
                intent.putExtra("photo", photoResep.get(position));
                intent.putExtra("deskripsi", bahanLangkah.get(position));
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return judulResep.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView photonya;
        TextView judulnya;
        CardView CardViewparent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            judulnya = itemView.findViewById(R.id.judulnya);
            photonya = itemView.findViewById(R.id.photonya);
            CardViewparent = itemView.findViewById(R.id.card_view_parent);

        }
    }


}
