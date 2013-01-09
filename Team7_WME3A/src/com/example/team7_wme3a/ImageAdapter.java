package com.example.team7_wme3a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
 
public class ImageAdapter extends BaseAdapter {
    private Context mContext;
 
    //array with images
    public Integer[] mThumbIds = {
            R.drawable.amsterdam, R.drawable.arena, R.drawable.beeren/*, 
            R.drawable.bilbao, R.drawable.bohnen, R.drawable.boule,
            R.drawable.buschberg, R.drawable.catedraldelbuenpastor,
            R.drawable.donostia, R.drawable.drachen, R.drawable.eis, 
            R.drawable.eisbrocken, R.drawable.eisholz, R.drawable.falke, 
            R.drawable.feld, R.drawable.feuerbluete, R.drawable.fractions, 
            R.drawable.frosch, R.drawable.fruehling, R.drawable.gang, 
            R.drawable.gridlayout, R.drawable.gruen, R.drawable.hdr, 
            R.drawable.lampe, R.drawable.leben, R.drawable.leckerbissen, 
            R.drawable.lndw, R.drawable.mainframe, R.drawable.mohn, 
            R.drawable.morninggold, R.drawable.open, R.drawable.output, 
            R.drawable.plauen, R.drawable.puentedelazurriola, R.drawable.roboter,
            R.drawable.schilf, R.drawable.schnee, R.drawable.seerose, 
            R.drawable.skywalk, R.drawable.splash, R.drawable.steine, 
            R.drawable.strasse, R.drawable.strelizie, R.drawable.telc, 
            R.drawable.teufelchen, R.drawable.tunnel, R.drawable.wtc
            */
    };
 
    // constructor
    public ImageAdapter(Context c){
        mContext = c;
    }
 
    @Override
    public int getCount() {
        return mThumbIds.length;
    }
 
    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }
 
    @Override
    public long getItemId(int position) {
        return 0;
    }
 
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(150, 150));
        return imageView;
    }
 
}