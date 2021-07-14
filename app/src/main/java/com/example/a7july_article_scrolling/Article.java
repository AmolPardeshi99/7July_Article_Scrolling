package com.example.a7july_article_scrolling;

public class Article {
    private int mIvImage;
    private String mTvSubHeading,mTvHeading1,
            mTvHeading2,mTvPara,mTvAuthorName;

    public Article(int mIvImage, String mTvSubHeading, String mTvHeading1, String mTvHeading2, String mTvPara, String mTvAuthorName) {
        this.mIvImage = mIvImage;
        this.mTvSubHeading = mTvSubHeading;
        this.mTvHeading1 = mTvHeading1;
        this.mTvHeading2 = mTvHeading2;
        this.mTvPara = mTvPara;
        this.mTvAuthorName = mTvAuthorName;
    }

    public int getmIvImage() {
        return mIvImage;
    }

    public String getmTvSubHeading() {
        return mTvSubHeading;
    }

    public String getmTvHeading1() {
        return mTvHeading1;
    }

    public String getmTvHeading2() {
        return mTvHeading2;
    }

    public String getmTvPara() {
        return mTvPara;
    }

    public String getmTvAuthorName() {
        return mTvAuthorName;
    }
}
