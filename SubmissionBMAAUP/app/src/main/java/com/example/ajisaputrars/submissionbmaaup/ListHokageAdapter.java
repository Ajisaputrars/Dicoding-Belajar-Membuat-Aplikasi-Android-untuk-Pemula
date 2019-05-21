package com.example.ajisaputrars.submissionbmaaup;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListHokageAdapter extends RecyclerView.Adapter<ListHokageAdapter.CategoryViewHolder> {

    private ArrayList<Hokage> listHokage;
    private Context context;

    public ListHokageAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Hokage> getListHokage() {
        return listHokage;
    }

    public void setListHokage(ArrayList<Hokage> listHokage) {
        this.listHokage = listHokage;
    }


    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_data, viewGroup, false);
        return new CategoryViewHolder(itemRow);    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int i) {
        final String deskripsi = getListHokage().get(i).getDescription();
        final String nama = getListHokage().get(i).getName();
        categoryViewHolder.tvName.setText(nama);
        categoryViewHolder.tvRemarks.setText(getListHokage().get(i).getRemarks());
        categoryViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MoveActivity.class);
                intent.putExtra("Deskripsi", deskripsi);
                intent.putExtra("Nama", nama);
                context.startActivity(intent);
            }
        });
        Glide.with(context)
                .load(getListHokage().get(i).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);

    }

    @Override
    public int getItemCount() {
        return getListHokage().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;
        CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
