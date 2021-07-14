package com.example.a7july_article_scrolling;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleViewHolder> {

    private ArrayList<Article> articleArrayList;
    private ItemClickListener itemClickListener;

    public ArticleAdapter(ArrayList<Article> articleArrayList, ItemClickListener itemClickListener) {
        this.articleArrayList = articleArrayList;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new ArticleViewHolder(view,itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleViewHolder holder, int position) {
        Article article = articleArrayList.get(position);
        holder.setData(article);
    }

    @Override
    public int getItemCount() {
        return articleArrayList.size();
    }
}
