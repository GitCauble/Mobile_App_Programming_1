package eu.ryancauble.musicmash;

import android.content.Context;

import java.util.List;


public class Sleep {

    public static void initShopsList(List<Music> list, Context context) {



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
    }
}
