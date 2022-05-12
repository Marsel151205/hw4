package com.example.lesson4android1.adapters;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson4android1.R;

import java.util.ArrayList;

public class NameAdapter extends RecyclerView.Adapter<NameAdapter.NameHolder> {
    ArrayList<String> list = new ArrayList<>();
    ArrayList<String> numberList = new ArrayList<>();
    ArrayList<Integer> avatarList = new ArrayList<>();

    public NameAdapter(ArrayList<String> list, ArrayList<String> numberList, ArrayList<Integer> avatarList) {
        this.list = list;
        this.numberList = numberList;
        this.avatarList = avatarList;
    }

    @NonNull
    @Override
    public NameAdapter.NameHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_name_holder, parent, false);
        return new NameHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NameAdapter.NameHolder holder, int position) {
        holder.onBind(list.get(position));
        holder.onBindNumber(numberList.get(position));
        holder.onBindAvatar(avatarList.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class NameHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvNumber;
        ImageView ivAvatar;

        public NameHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            tvNumber = itemView.findViewById(R.id.tv_number);
            ivAvatar = itemView.findViewById(R.id.iv_avatar);
        }

        public void onBind(String s) {
            tvName.setText(s);
        }

        public void onBindNumber(String s) {
            tvNumber.setText(s);
        }

        public void onBindAvatar(Integer integer) {
            ivAvatar.setImageResource(integer);
        }
    }
}
