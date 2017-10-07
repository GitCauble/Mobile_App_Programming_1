package eu.ryancauble.musicmash;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

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
