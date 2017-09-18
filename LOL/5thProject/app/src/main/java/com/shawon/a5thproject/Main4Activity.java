package com.shawon.a5thproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Main4Activity extends AppCompatActivity {

    ListView listView;
    int[] movie_postar_resource = {R.drawable.a, R.drawable.b, R.drawable.c,
            R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g,
            R.drawable.h, R.drawable.i, R.drawable.j, R.drawable.k};
    String[] movie_titles;
    String[] movie_ratings;
    Movie_adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        listView = (ListView) findViewById(R.id.movie_listview);
        movie_titles = getResources().getStringArray(R.array.movie_title);
        movie_ratings = getResources().getStringArray(R.array.movie_rating);

        int i = 0;
        adapter = new Movie_adapter(getApplicationContext(), R.layout.row_layout);
        listView.setAdapter(adapter);


        for (String titles : movie_titles) {

            MovieDataProvider dataProvider = new MovieDataProvider(movie_postar_resource[i],
                    titles, movie_ratings[i]);
            adapter.add(dataProvider);
            i++;

        }


    }
}
