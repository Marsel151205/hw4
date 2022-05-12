package com.example.lesson4android1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lesson4android1.databinding.ActivityInfoBinding;

public class InfoActivity extends AppCompatActivity {
    private ActivityInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}