package com.example.a7july_article_scrolling;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ArticleViewHolder extends RecyclerView.ViewHolder {

    private ItemClickListener itemClickListener;
    private ImageView mIvImage;
    private TextView mTvHeading1,mTvHeading2,mTvPara;
    public ArticleViewHolder(@NonNull  View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initViews();
    }

    private void initViews() {
        mIvImage = itemView.findViewById(R.id.ivImage);
        mTvHeading1 = itemView.findViewById(R.id.tvHeading1);
        mTvHeading2 = itemView.findViewById(R.id.tvHeading2);
        mTvPara = itemView.findViewById(R.id.para);
    }

    public void setData(Article article){
        mIvImage.setImageResource(article.getmIvImage());
        mTvHeading1.setText(article.getmTvHeading1());
        mTvHeading2.setText(article.getmTvHeading2());
        mTvPara.setText(article.getmTvPara());
        mIvImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(getAdapterPosition(),article);
            }
        });
    }
}
