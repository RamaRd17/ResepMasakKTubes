package com.example.resepmasak.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.resepmasak.SetGet.SetterGetter;
import com.example.resepmasak.R;

import java.util.ArrayList;

public class AdapterDaerah extends RecyclerView.Adapter<AdapterDaerah.CategoryViewHolder> {
    private Context context;
    private ArrayList<SetterGetter> listDaerah;

    private ArrayList<SetterGetter> getlistDaerah() {
        return listDaerah;
    }

    public void setListDaerah(ArrayList<SetterGetter> listDaerah) {
        this.listDaerah = listDaerah;
    }

    public AdapterDaerah(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.kategoridetailitem, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvName.setText(getlistDaerah().get(position).getJudul());

        Glide.with(context)
                .load(getlistDaerah().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getlistDaerah().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        ImageView imgPhoto;

        CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}