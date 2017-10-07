# Assignment_3 Resume Application

# Student name: Ryan Cauble


# ID: 00267379


# ScrollingActivity.java  :

```
package com.example.ryan.resume_app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hire me!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
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

```

# content_scrolling.xml  :

```
<?xml version="1.0" encoding="utf-8"?>

<android.support.v4.widget.NestedScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:layout_behavior="@string/appbar_scrolling_view_behavior"
    tools:context="com.example.ryan.resume_app.ScrollingActivity"
    tools:showIn="@layout/activity_scrolling">



    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical">

            <ImageView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_alignParentBottom="true"
                android:layout_centerHorizontal="true"
                android:layout_marginBottom="16dp"
                android:src="@drawable/androidparty" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_margin="@dimen/text_margin"
                android:text="@string/large_text" />

    </LinearLayout>




</android.support.v4.widget.NestedScrollView>
```


![screenshot](https://user-images.githubusercontent.com/17748575/30487740-577c6398-9a02-11e7-8ddc-bc250c43c504.png)

![scroll](https://user-images.githubusercontent.com/17748575/30488152-8e8f91ec-9a03-11e7-99b0-27a4da88660a.png)

![scroll_1](https://user-images.githubusercontent.com/17748575/30488155-8ed2e6f4-9a03-11e7-83dc-628cad20e91c.png)

![scroll_2](https://user-images.githubusercontent.com/17748575/30488154-8e921dd6-9a03-11e7-8813-5e1c09f58425.png)

![scroll_3](https://user-images.githubusercontent.com/17748575/30488153-8e901efa-9a03-11e7-8602-a93449b11539.png)


