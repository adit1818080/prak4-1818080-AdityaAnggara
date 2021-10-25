package com.example.a1818080recycleview;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class MyHolder extends RecyclerView.ViewHolder {
    ImageView mImageView;
    TextView mTitle, mDes, mDes2;
    public MyHolder(@NonNull View itemView) {
        super(itemView);
        this.mTitle = itemView.findViewById(R.id.titleTv);
        this.mDes = itemView.findViewById(R.id.descriptionTv);
        this.mDes2 = itemView.findViewById(R.id.description2Tv);
    }
}
