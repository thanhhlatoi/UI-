package com.example.myapplication;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.example.myapplication.Model.PropertyDomain;
import com.example.myapplication.databinding.ActivityDetailMainBinding;
import com.example.myapplication.databinding.ActivityMainBinding;

public class DetailMainActivity extends AppCompatActivity {
    ActivityDetailMainBinding binding;
    private PropertyDomain object;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setContentView(binding.getRoot());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getBundles();
        setVariable();
    }

    private void setVariable() {
        binding.backBtn.setOnClickListener(v -> finish());
        int drawableResourceID = getResources().getIdentifier(object.getPickPath(),"drawable",DetailMainActivity.this.getPackageName());
        Glide.with(DetailMainActivity.this)
                .load(drawableResourceID)
                .into(binding.picDetail);
        binding.titleeAddressTxt.setText(object.getTitle()+"in"+object.getAddress());
        binding.typeTxt.setText(object.getType());
        binding.descriptionnTxt.setText(object.getDescription());
        binding.priceeTxt.setText("$"+object.getPrice());
        binding.bedTxt1.setText(object.getBed()+"Bedroom");
        binding.bathTxt.setText(object.getBath()+"Bathroom");
        binding.sizeeText.setText(object.getSize()+"m2");
        if(object.isGatage()){
            binding.garageeTxt.setText("Car Garage");
        }else {
            binding.garageeTxt.setText("No - Car Garage");
        }

    }

    private void getBundles() {
        object = (PropertyDomain) getIntent().getSerializableExtra("object");
    }
}