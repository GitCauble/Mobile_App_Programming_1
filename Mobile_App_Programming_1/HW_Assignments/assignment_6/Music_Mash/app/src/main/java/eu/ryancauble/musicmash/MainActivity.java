package eu.ryancauble.musicmash;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.TabLayout;


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
