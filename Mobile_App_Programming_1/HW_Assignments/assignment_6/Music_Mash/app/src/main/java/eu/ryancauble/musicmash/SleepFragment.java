package eu.ryancauble.musicmash;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class SleepFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<Music> list = new ArrayList<>();
        Sleep.initShopsList(list, getContext());

        MusicAdapter adapter = new MusicAdapter(getActivity(), -1, list);
        View view = inflater.inflate(eu.ryancauble.musicmash.R.layout.locations_list, container, false);
        ListView listView = (ListView) view.findViewById(eu.ryancauble.musicmash.R.id.listView);

        listView.setAdapter(adapter);

        return view;
    }
}
