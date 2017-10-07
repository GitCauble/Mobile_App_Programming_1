package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Ryan on 9/29/2017.
 */

public class LandmarksActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.word_list);

            // Create a list of words
            ArrayList<Word> words = new ArrayList<Word>();
            words.add(new Word("https://www.paulreverehouse.org/", "Paul Revere House"));
            words.add(new Word("http://oldnorth.com/", "The Old North Church"));
            words.add(new Word("http://www.bostonhistory.org/", "Old State House"));
            words.add(new Word("http://www.kings-chapel.org/", "Kings Chapel"));
            words.add(new Word("https://malegislature.gov/", "Massachusetts State House"));
            words.add(new Word("https://www.nps.gov/bost/learn/historyculture/bhm.htm", "Bunker Hill Monument"));
            words.add(new Word("http://www.oldsouthmeetinghouse.org/", "Old South Meeting House"));
            words.add(new Word("https://www.boston.gov/", "The Boston Common"));

            // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
            // adapter knows how to create list items for each item in the list.
            WordAdapter adapter = new WordAdapter(this, words, R.color.category_landmarks);

            // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
            // There should be a {@link ListView} with the view ID called list, which is declared in the
            // word_list.xml layout file.
            ListView listView = (ListView) findViewById(R.id.list);

            // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
            // {@link ListView} will display list items for each {@link Word} in the list.
            listView.setAdapter(adapter);
        }













}
