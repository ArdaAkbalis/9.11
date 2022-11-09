package com.example.bitk.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bitk.R;
import com.example.bitk.databinding.ActivitySignInBinding;

public class SignUpActivity extends AppCompatActivity {

    private ActivitySignInBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.textSignIn.setOnClickListener(v -> onBackPressed());
    }
}