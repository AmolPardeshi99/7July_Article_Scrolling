package com.example.a7july_article_scrolling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {
    private RecyclerView recyclerView;
    private ArrayList<Article> articleArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        builData();
        setRecyclerView();
    }

    private void setRecyclerView() {
        ArticleAdapter articleAdapter = new ArticleAdapter(articleArrayList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(articleAdapter);
    }

    private void builData() {
        int t=3;
        while (t-- >0) {
            articleArrayList.add(new Article(R.drawable.ocean_wave, "FEATURED", "Blue Ocean", "Waves Crash",
                    "See the beautiful oceans of the Pacific coast where the water is so clean you can see the sand.", "Amol"));
            articleArrayList.add(new Article(R.drawable.long_riverbridge, "FEATURED", "Long Exposure", "River Bridge",
                    "Long exposure photography is when you leave the shutter open longer than usual to pick up more light.", "Abhishek"));
        }

    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);

    }

    @Override
    public void onItemClicked(int position, Article article) {
        Toast.makeText(MainActivity.this,"AUthor name is "+article.getmTvAuthorName(),Toast.LENGTH_SHORT).show();

    }
}