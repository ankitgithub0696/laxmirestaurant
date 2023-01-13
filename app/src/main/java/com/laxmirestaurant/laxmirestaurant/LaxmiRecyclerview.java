package com.laxmirestaurant.laxmirestaurant;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LaxmiRecyclerview extends RecyclerView.Adapter<LaxmiRecyclerview.ViewHolder> {
    ArrayList<laxmiadapter> arrayListdata;

    public LaxmiRecyclerview(ArrayList<laxmiadapter> arrayListdata) {
        this.arrayListdata = arrayListdata;
    }


    @NonNull
    @Override
    public LaxmiRecyclerview.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.structure_resturant,parent,false);
       ViewHolder viewHolder=new ViewHolder(view);
       return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LaxmiRecyclerview.ViewHolder holder, int position) {

            laxmiadapter laxmiadapter=arrayListdata.get(position);

            int ImageIcon=arrayListdata.get(position).getImage();
            String ProductTitle=arrayListdata.get(position).getTitlename();
            String ProductPrice=arrayListdata.get(position).getProductprice();

            holder.setdata(ImageIcon,ProductTitle,ProductPrice);


    }

    @Override
    public int getItemCount() {
        return arrayListdata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView Image;
        TextView Name,Price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Image=itemView.findViewById(R.id.icon);
            Name=itemView.findViewById(R.id.titlename);
            Price=itemView.findViewById(R.id.titleprice);
        }

        public void setdata(int imageIcon, String productPrice, String productPrice1) {

            Image.setImageResource(imageIcon);
            Name.setText(productPrice);
            Price.setText(productPrice1);
        }
    }
}
