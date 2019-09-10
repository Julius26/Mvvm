package com.example.mvvm.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.mvvm.R;
import com.example.mvvm.model.NicePlace;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<NicePlace> mNicePlace = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(Context mContext, List<NicePlace> mNicePlace) {
        this.mNicePlace = mNicePlace;
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem,parent,false);
        ViewHolder  vh= new ViewHolder(view);
        return vh;
    }


//    this is the method to set the data at specific position
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        // Set the name of the 'NicePlace'
        ((ViewHolder)viewHolder).mName.setText(mNicePlace.get(i).getTitle());

//        set the image
        RequestOptions defaultOptions = new RequestOptions()
                .error(R.drawable.ic_launcher_background);
        Glide.with(mContext)
                .setDefaultRequestOptions(defaultOptions)
                .load(mNicePlace.get(i).getImgUrl())
                .into(((ViewHolder)viewHolder).mImage);
    }

    @Override
    public int getItemCount() {
        return mNicePlace.size();
    }

//    class for storing the specific view in memory
    private class ViewHolder extends RecyclerView.ViewHolder{
        private CircleImageView mImage;
        private TextView mName;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        mImage = itemView.findViewById(R.id.image);
        mName = itemView.findViewById(R.id.image_name);

    }
}
}
