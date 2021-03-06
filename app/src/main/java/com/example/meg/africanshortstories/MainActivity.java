package com.example.meg.africanshortstories;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;



public class MainActivity extends Activity {

    RecyclerView mRecyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //geting the recycler from xml
        mRecyclerView= (RecyclerView)findViewById(R.id.recycler_view);
        //setting the recycler to fixed size to improve performance
        mRecyclerView.setHasFixedSize(true);

       //create a LayoutManager and set it to the RecyclerView

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
//initializing adapter
        RecyclerView.Adapter mAdapter;
         mAdapter= new CardAdapter();


         /*mAdapter = new CardAdapter();*/
        mRecyclerView.setAdapter(mAdapter);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
