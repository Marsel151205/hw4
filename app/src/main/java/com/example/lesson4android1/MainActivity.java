package com.example.lesson4android1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.lesson4android1.adapters.NameAdapter;
import com.example.lesson4android1.data.NameData;
import com.example.lesson4android1.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    ArrayList<String> list = new ArrayList<>();
    ArrayList<String> numberList = new ArrayList<>();
    ArrayList<Integer> avatarList = new ArrayList<>();
    NameAdapter nameAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialization();
    }

    private void initialization() {
        list = NameData.getName();
        numberList = NameData.getNumber();
        avatarList = NameData.getImage();
        nameAdapter = new NameAdapter(list, numberList, avatarList);
        binding.recyclerName.setAdapter(nameAdapter);
    }
}