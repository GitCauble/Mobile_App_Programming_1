# Assignemnt_6 Music Mash


# Student name: Ryan Cauble


# ID: 00267379



![screen1](https://user-images.githubusercontent.com/17748575/31294021-64513b74-aaa7-11e7-9825-94976eb9af9a.png)
![screen2](https://user-images.githubusercontent.com/17748575/31294026-695bdb10-aaa7-11e7-948a-a4f2b6bae324.png)
![screen3](https://user-images.githubusercontent.com/17748575/31294027-6ba43ab6-aaa7-11e7-8688-2e67238c5126.png)
![screen4](https://user-images.githubusercontent.com/17748575/31294032-6d9e464a-aaa7-11e7-95db-e7b47cfcca80.png)
![screen5](https://user-images.githubusercontent.com/17748575/31294034-7032e398-aaa7-11e7-99f2-0959bdaf610c.png)



# MainActivity.java:

```
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(eu.ryancauble.musicmash.R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(eu.ryancauble.musicmash.R.id.viewpager);
        viewPager.setAdapter(new FragmentAdapter(this, getSupportFragmentManager()));

        TabLayout tabLayout = (TabLayout) findViewById(eu.ryancauble.musicmash.R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
```

# activity_main.xml:

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:orientation="vertical">

    <android.support.design.widget.TabLayout
        android:id="@+id/sliding_tabs"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:tabMaxWidth="0dp"
        style="@style/tabs"
        />

    <android.support.v4.view.ViewPager
        android:id="@+id/viewpager"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />

</LinearLayout>
```

# list_item.xml:

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical" android:layout_width="match_parent"
    android:layout_height="match_parent">

    <android.support.v7.widget.CardView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="8dp">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="vertical">

            <ImageView
                android:id="@+id/photoImageView"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:scaleType="centerInside"
                android:adjustViewBounds="true"
                />

            <TextView
                android:id="@+id/nameTextView"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text=""
                style="@style/locationTitle" />

            <TextView
                android:id="@+id/descriptionTextView"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text=""
                style="@style/locationDescription"/>

            <TextView
                android:id="@+id/addressTextView"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text=""
                android:autoLink="all"
                android:clickable="true"
                style="@style/locationDescription"/>




        </LinearLayout>


    </android.support.v7.widget.CardView>

</LinearLayout>
```

# FragmentAdapter:

```
public class FragmentAdapter extends FragmentPagerAdapter {

    private Context context;


    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new StudyFragment();
        } else if (position == 1) {
            return new GymFragment();
        } else if (position == 2){
            return new SleepFragment();
        } else {
            return new WorkFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(eu.ryancauble.musicmash.R.string.category_study);
        } else if (position == 1) {
            return context.getString(eu.ryancauble.musicmash.R.string.category_gym);
        } else if (position == 2) {
            return context.getString(eu.ryancauble.musicmash.R.string.category_sleep);
        } else {
            return context.getString(eu.ryancauble.musicmash.R.string.category_work);
        }
    }
}

```

# StudyFragment:

```
public class StudyFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<Music> list = new ArrayList<>();
        Study.initSightsList(list, getContext());

        MusicAdapter adapter = new MusicAdapter(getActivity(), -1, list);
        View view = inflater.inflate(eu.ryancauble.musicmash.R.layout.locations_list, container, false);
        ListView listView = (ListView) view.findViewById(eu.ryancauble.musicmash.R.id.listView);

        listView.setAdapter(adapter);

        return view;
    }
}
```

# Study.java:

```
public class Study {

    public static void initSightsList(List<Music> list, Context context) {

        list.add(new Music(
                context.getString(eu.ryancauble.musicmash.R.string.study_signer_name1),
                context.getString(eu.ryancauble.musicmash.R.string.study_song_title1),
                context.getString(eu.ryancauble.musicmash.R.string.study_signer_link1),

                eu.ryancauble.musicmash.R.drawable.sam_hunt
        ));

        list.add(new Music(
                context.getString(eu.ryancauble.musicmash.R.string.study_signer_name2),
                context.getString(eu.ryancauble.musicmash.R.string.study_song_title2),
                context.getString(eu.ryancauble.musicmash.R.string.study_signer_link2),

                eu.ryancauble.musicmash.R.drawable.dustin_lynch
        ));

        list.add(new Music(
                context.getString(eu.ryancauble.musicmash.R.string.study_signer_name3),
                context.getString(eu.ryancauble.musicmash.R.string.study_song_title3),
                context.getString(eu.ryancauble.musicmash.R.string.study_signer_link3),

                eu.ryancauble.musicmash.R.drawable.luke_combs
        ));

        list.add(new Music(
                context.getString(eu.ryancauble.musicmash.R.string.study_signer_name4),
                context.getString(eu.ryancauble.musicmash.R.string.study_song_title4),
                context.getString(eu.ryancauble.musicmash.R.string.study_signer_link4),

                eu.ryancauble.musicmash.R.drawable.thomas_rhett
        ));

        list.add(new Music(
                context.getString(eu.ryancauble.musicmash.R.string.study_signer_name5),
                context.getString(eu.ryancauble.musicmash.R.string.study_song_title5),
                context.getString(eu.ryancauble.musicmash.R.string.study_signer_link5),

                eu.ryancauble.musicmash.R.drawable.jon_pardi
        ));

        list.add(new Music(
                context.getString(eu.ryancauble.musicmash.R.string.study_signer_name6),
                context.getString(eu.ryancauble.musicmash.R.string.study_song_title6),
                context.getString(eu.ryancauble.musicmash.R.string.study_signer_link6),

                eu.ryancauble.musicmash.R.drawable.kenny_chesney
        ));


    }
}
```
# strings.xml:

```
<resources>
    <string name="app_name">Music Mash</string>


    <string name="category_study">Study</string>
    <string name="category_gym">Gym</string>
    <string name="category_sleep">Sleep</string>
    <string name="category_work">Work</string>


    <string name="study_signer_name1">Sam Hunt</string>
    <string name="study_song_title1">Body Like A Back Road</string>
    <string name="study_signer_link1">https://www.youtube.com/watch?v=Mdh2p03cRfw</string>

    <string name="study_signer_name2">Dustin Lynch</string>
    <string name="study_song_title2">Small Town Boy</string>
    <string name="study_signer_link2">https://www.youtube.com/watch?v=BSDxUVZJwTg</string>

    <string name="study_signer_name3">Luke Combs</string>
    <string name="study_song_title3">When It Rains It Pours</string>
    <string name="study_signer_link3">https://www.youtube.com/watch?v=uXyxFMbqKYA</string>

    <string name="study_signer_name4">Thomas Rheyy</string>
    <string name="study_song_title4">Unforgettable</string>
    <string name="study_signer_link4">https://www.youtube.com/watch?v=_T8ml-P0GkI</string>

    <string name="study_signer_name5">Jon Pardi</string>
    <string name="study_song_title5">Heartache On The Dance Floor</string>
    <string name="study_signer_link5">https://www.youtube.com/watch?v=Cg4Eui4sGlk</string>

    <string name="study_signer_name6">Kenny Chesney</string>
    <string name="study_song_title6">All The Pretty Girls</string>
    <string name="study_signer_link6">https://www.youtube.com/watch?v=pksszku7l0g</string>

</resources>
```

