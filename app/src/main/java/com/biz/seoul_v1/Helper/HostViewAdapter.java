package com.biz.seoul_v1.Helper;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.biz.seoul_v1.R;
import com.biz.seoul_v1.data.Seoul_Pet_VO;

import java.util.List;

public class HostViewAdapter extends RecyclerView.Adapter{

    List<Seoul_Pet_VO> pets ;

    public HostViewAdapter(List<Seoul_Pet_VO> pets) {
        this.pets = pets;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.host_item_view, parent, false);

        return new HostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        HostViewHolder hostViewHolder = (HostViewHolder)holder ;

        hostViewHolder.txt_name.setText(pets.get(position).name);
        hostViewHolder.txt_tel.setText("전화번호: "+pets.get(position).tel);
        hostViewHolder.txt_addr.setText("주소: "+pets.get(position).addr);

    }

    @Override
    public int getItemCount() {
        return pets.size();
    }

    class HostViewHolder extends RecyclerView.ViewHolder{

        TextView txt_name ;
        TextView txt_tel ;
        TextView txt_addr ;

        public HostViewHolder(View itemView) {
            super(itemView);

            txt_name = itemView.findViewById(R.id.host_item_name);
            txt_tel = itemView.findViewById(R.id.host_item_tel);
            txt_addr = itemView.findViewById(R.id.host_item_addr);
        }
    }
}
