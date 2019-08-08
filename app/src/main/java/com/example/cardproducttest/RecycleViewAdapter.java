package com.example.cardproducttest;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Book> mData;

    public RecycleViewAdapter(Context mContext, List<Book> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.card_book_item,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {
        myViewHolder.tv_book_tittle.setText(mData.get(i).getTittle());
        myViewHolder.img_book_thumbnail.setImageResource(mData.get(i).getThumbnail());
        myViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, BookActivity.class);
                intent.putExtra("Tittle", mData.get(i).getTittle());
                intent.putExtra("Description", mData.get(i).getDescription());
                intent.putExtra("Thumbnail", mData.get(i).getThumbnail());
                intent.putExtra("Category", mData.get(i).getCategory());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_book_tittle;
        ImageView img_book_thumbnail;
        CardView cardView;

        public MyViewHolder(View itemView){
            super(itemView);
            tv_book_tittle = (TextView) itemView.findViewById(R.id.book_name);
            img_book_thumbnail = (ImageView) itemView.findViewById(R.id.book_image);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);
        }
    }
}
