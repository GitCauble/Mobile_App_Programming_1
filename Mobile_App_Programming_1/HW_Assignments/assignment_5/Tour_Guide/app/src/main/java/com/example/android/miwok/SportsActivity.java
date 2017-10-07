package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Ryan on 9/29/2017.
 */

public class SportsActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.word_list);

            // Create a list of words
            ArrayList<Word> words = new ArrayList<Word>();
            words.add(new Word("New England Patriots", "Boston's Football Team:", R.drawable.patriots_logo));
            words.add(new Word("Boston Celtics", "Boston's Basketball Team:", R.drawable.celtics_logo));
            words.add(new Word("Boston Bruins", "Boston's Hockey Team:", R.drawable.bruins_logo));
            words.add(new Word("Boston Red Sox", "Boston's Baseball Team:", R.drawable.red_sox_logo));
            words.add(new Word("Boston Cannons", "Boston's Lacrosse Team:", R.drawable.cannons_logo));


            // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
            // adapter knows how to create list items for each item in the list.
            WordAdapter adapter = new WordAdapter(this, words, R.color.category_sports);

            // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
            // There should be a {@link ListView} with the view ID called list, which is declared in the
            // word_list.xml layout file.
            ListView listView = (ListView) findViewById(R.id.list);

            // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
            // {@link ListView} will display list items for each {@link Word} in the list.
            listView.setAdapter(adapter);
        }

}
