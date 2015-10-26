package com.kpr.hus.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
    private String[] listData = new String[]{"Post 1", "Post 2", "Post 3", "Post 4", "Post 5", "Post 6" ,"fINAL"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postlist);

        ListView listView = (ListView)this.findViewById(R.id.postListView);
        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this, R.layout.postitem, listData);
        listView.setAdapter(itemAdapter);
    }
}
