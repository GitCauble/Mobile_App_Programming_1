package eu.ryancauble.musicmash;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class MusicAdapter extends ArrayAdapter<Music> {

    public MusicAdapter(Context context, int resources, List<Music> locationsList) {
        super(context, 0, locationsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Music currentLocation = getItem(position);
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    eu.ryancauble.musicmash.R.layout.list_item, parent, false);
        }

        TextView nameLocationTextView = (TextView) listItemView.findViewById(eu.ryancauble.musicmash.R.id.nameTextView);
        nameLocationTextView.setText(currentLocation.getName());

        TextView descriptionLocationTextView = (TextView)
                listItemView.findViewById(eu.ryancauble.musicmash.R.id.descriptionTextView);
        descriptionLocationTextView.setText(currentLocation.getDescription());

        TextView addressLocationTextView = (TextView) listItemView.findViewById(eu.ryancauble.musicmash.R.id.addressTextView);
        addressLocationTextView.setText(currentLocation.getAddress());


        ImageView photoLocationImageView = (ImageView) listItemView.findViewById(eu.ryancauble.musicmash.R.id.photoImageView);

        if (currentLocation.hasImage()){
            photoLocationImageView.setImageResource(currentLocation.getImageResourceId());
            photoLocationImageView.setVisibility(View.VISIBLE);
        } else {
            photoLocationImageView.setVisibility(View.GONE);
        }



        if (currentLocation.hasAddress()){
            addressLocationTextView.setVisibility(View.VISIBLE);
        } else {
            addressLocationTextView.setVisibility(View.GONE);
        }


        return listItemView;
    }


}
