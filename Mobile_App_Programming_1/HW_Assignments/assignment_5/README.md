# Assignemnt_5 Tour_Guide


# Student name: Ryan Cauble


# ID: 00267379

![homescreen](https://user-images.githubusercontent.com/17748575/31036170-18537656-a539-11e7-9146-2de2216e40c6.png)
![restaurants](https://user-images.githubusercontent.com/17748575/31036173-1c6bc31a-a539-11e7-9024-d475ee758ea6.png)
![strega](https://user-images.githubusercontent.com/17748575/31036177-1e051244-a539-11e7-9cd9-3bef02d6069f.png)
![family](https://user-images.githubusercontent.com/17748575/31036182-21c982fc-a539-11e7-822b-460d10d470d0.png)
![landmark](https://user-images.githubusercontent.com/17748575/31036186-237c8978-a539-11e7-8cdf-c21b0a8187ab.png)
![sports](https://user-images.githubusercontent.com/17748575/31036194-255d8dbe-a539-11e7-808b-b2e03962f28b.png)

# MainActivity.java
```
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView restaurant = (TextView) findViewById(R.id.restaurants);

        // Set a click listener on that View
        restaurant.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent restaurantIntent = new Intent(MainActivity.this, RestaurantsActivity.class);

                // Start the new activity
                startActivity(restaurantIntent);
            }
        });

        TextView family = (TextView) findViewById(R.id.family);

        // Set a click listener on that View
        family.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                // Start the new activity
                startActivity(familyIntent);
            }
        });

        TextView landmarks = (TextView) findViewById(R.id.landmarks);

        // Set a click listener on that View
        landmarks.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {

                Intent landmarkIntent = new Intent(MainActivity.this, LandmarksActivity.class);

                // Start the new activity
                startActivity(landmarkIntent);
            }
        });
        
        TextView sports = (TextView) findViewById(R.id.sports);

        // Set a click listener on that View
        sports.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {

                Intent sportIntent = new Intent(MainActivity.this, SportsActivity.class);

                // Start the new activity
                startActivity(sportIntent);
            }
        });
    }
}

```

# activity_main.xml

```
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/tan_background"
    android:orientation="vertical"
    tools:context="com.example.android.miwok.MainActivity">

    <ImageView
        android:id="@+id/imageViewBoston"
        android:layout_width="match_parent"
        android:layout_height="255dp"
        app:srcCompat="@drawable/boston_photo" />

    <TextView
        android:id="@+id/restaurants"
        style="@style/CategoryStyle"
        android:background="@color/category_restaurants"
        android:text="@string/category_Restaurants" />

    <TextView
        android:id="@+id/family"
        style="@style/CategoryStyle"
        android:background="@color/category_family"
        android:text="@string/category_family_activities" />

    <TextView
        android:id="@+id/landmarks"
        style="@style/CategoryStyle"
        android:background="@color/category_landmarks"
        android:text="@string/category_landmarks" />

    <TextView
        android:id="@+id/sports"
        style="@style/CategoryStyle"
        android:background="@color/category_sports"
        android:text="@string/category_sports" />

</LinearLayout>
```

# list_item.xml

```
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:background="@color/tan_background"
    android:minHeight="@dimen/list_item_height"
    android:orientation="horizontal">

    <ImageView
        android:id="@+id/image"
        android:layout_width="@dimen/list_item_height"
        android:layout_height="@dimen/list_item_height" />

    <LinearLayout
        android:id="@+id/text_container"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        android:paddingLeft="16dp">

        <TextView
            android:id="@+id/miwok_text_view"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:gravity="bottom"
            android:textAppearance="?android:textAppearanceMedium"
            android:textColor="@android:color/white"
            android:textStyle="bold"
            tools:text="lutti" />

        <TextView
            android:id="@+id/default_text_view"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:gravity="top"
            android:textAppearance="?android:textAppearanceMedium"
            android:textColor="@android:color/white"
            android:autoLink="all"
            android:clickable="true"
            tools:text="one" />
    </LinearLayout>
</LinearLayout>

```
# RestaurantsActivity.java

```
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

```
