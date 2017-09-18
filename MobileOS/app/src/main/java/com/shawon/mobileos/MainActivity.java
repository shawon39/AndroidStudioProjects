package com.shawon.mobileos;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdView;

public class MainActivity extends Activity {

    ListView myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myList = (ListView) findViewById(R.id.mylistview);

        String[] myos = {"Android", "Windows phone", "IOS", "Java", "Blackberry"};
        int [] myosimg = {R.drawable.android, R.drawable.windows, R.drawable.ios, R.drawable.java, R.drawable.blackberry};

        MyCustomAdapter myAdap = new MyCustomAdapter(this,myos,myosimg);
        myList.setAdapter(myAdap);

        PublisherAdView mPublisherAdView = (PublisherAdView) findViewById(R.id.publisherAdView);
        PublisherAdRequest adRequest = new PublisherAdRequest.Builder().build();
        mPublisherAdView.loadAd(adRequest);

        for(int i=0; i<10; i++){
            Log.d("my log tag", i+"");
        }

        int[] num = {1,2,3,45,55};
        num[10] = 12;

    }
}
