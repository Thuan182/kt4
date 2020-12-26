package com.example.ktlan4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class dladapter extends  RecyclerView.Adapter<dladapter.ViewHodel>{
    ArrayList<datadl> datadls;
    Context context;

    public dladapter(ArrayList<datadl> datadls, Context context) {
        this.datadls = datadls;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View itemview =layoutInflater.inflate(R.layout.item_row,parent,false);

        return new ViewHodel(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHodel holder, int position) {
holder.textname.setText(datadls.get(position).getTen());
holder.textaddress.setText(datadls.get(position).getDiachi());
holder.hinh.setImageResource(datadls.get(position).getHinh());
    }

    @Override
    public int getItemCount() {
        return datadls.size();
    }

    public class ViewHodel extends RecyclerView.ViewHolder{
        TextView textname;
        TextView textaddress;
        ImageView hinh;
        public ViewHodel(@NonNull View itemView) {
            super(itemView);
            textname =(TextView)itemView.findViewById(R.id.textname);
            textaddress= (TextView)itemView.findViewById(R.id.textaddress);
            hinh  = (ImageView)itemView.findViewById(R.id.hinh);
        }
    }
}
