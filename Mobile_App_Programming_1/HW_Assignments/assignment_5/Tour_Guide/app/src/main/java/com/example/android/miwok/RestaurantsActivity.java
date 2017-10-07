package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Ryan on 9/29/2017.
 */

public class RestaurantsActivity extends AppCompatActivity{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.word_list);

            // Create a list of words
            ArrayList<Word> words = new ArrayList<Word>();
            words.add(new Word("http://www.stregaristorante.com/", "Strega", R.drawable.strega_food));
            words.add(new Word("http://www.hongkongboston.com/", "Hong Kong", R.drawable.hong_kong_logo));
            words.add(new Word("http://www.neddevinesboston.com/", "Ned Devine's Irish Pub", R.drawable.ned_devines_logo));
            words.add(new Word("https://www.mijaboston.com/", "Mija Cantina & Tequila Bar", R.drawable.mija_cantina_logo));
            words.add(new Word("http://bellinhand.com/", "Bell in Hand Tavern", R.drawable.bell_in_hand_logo));
            words.add(new Word("http://www.thefours.com/", "The Fours", R.drawable.the_fours_logo));
            words.add(new Word("https://www.hurricaneoreillysboston.com/", "Hurricane O'Reilly's", R.drawable.hurricane_logo));
            words.add(new Word("http://www.harpboston.com/", "The Harp", R.drawable.the_harp_logo));
            words.add(new Word("http://www.lansdownepubboston.com/", "The Lansdowne Pub", R.drawable.lansdown_logo));
            words.add(new Word("https://cheersboston.com/", "Cheers", R.drawable.cheers_logo));

            // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
            // adapter knows how to create list items for each item in the list.
            WordAdapter adapter = new WordAdapter(this, words, R.color.category_restaurants);

            // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
            // There should be a {@link ListView} with the view ID called list, which is declared in the
            // word_list.xml layout file.
            ListView listView = (ListView) findViewById(R.id.list);

            // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
            // {@link ListView} will display list items for each {@link Word} in the list.
            listView.setAdapter(adapter);
        }

}
