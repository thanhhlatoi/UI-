package com.example.myapplication;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Adapter.ItemsAdapter;
import com.example.myapplication.Model.PropertyDomain;
import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
private RecyclerView.Adapter adapterRecommeneded, adapterNearby;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        initLocation();
        initList();
        initList2();
    }

    private void initList2() {
        ArrayList<PropertyDomain> itemss = new ArrayList<>();
        itemss.add(new PropertyDomain("Apartment","Royal Apartment","LosAngles LA","house_1",1500,2,3,350,true,4.5,"hihih"));
        itemss.add(new PropertyDomain("House","House with Great","Newyourk NY","house_2",800,1,2,500,true,4.5,"hihih"));
        itemss.add(new PropertyDomain("Apartment","Royal Apartment","LosAngles LA","house_3",1500,2,3,350,true,4.5,"hihih"));
        itemss.add(new PropertyDomain("Apartment","Royal Apartment","LosAngles LA","house_4",1500,2,3,350,true,4.5,"hihih"));
        itemss.add(new PropertyDomain("Apartment","Royal Apartment","LosAngles LA","house_1",1500,2,3,350,true,4.5,"hihih"));
        itemss.add(new PropertyDomain("Apartment","Royal Apartment","LosAngles LA","house_1",1500,2,3,350,true,4.5,"hihih"));
        itemss.add(new PropertyDomain("Apartment","Royal Apartment","LosAngles LA","house_1",1500,2,3,350,true,4.5,"hihih"));
        itemss.add(new PropertyDomain("Apartment","Royal Apartment","LosAngles LA","house_1",1500,2,3,350,true,4.5,"hihih"));
        binding.nearView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        binding.nearView.setAdapter(new ItemsAdapter(itemss));
    }

    private void initList() {
        ArrayList<PropertyDomain> items = new ArrayList<>();
        items.add(new PropertyDomain("Apartment","Royal Apartment","LosAngles LA","house_1",1500,2,3,350,true,4.5,"hihih"));
        items.add(new PropertyDomain("House","House with Great","Newyourk NY","house_2",800,1,2,500,true,4.5,"hihih"));
        items.add(new PropertyDomain("Apartment","Royal Apartment","LosAngles LA","house_3",1500,2,3,350,true,4.5,"hihih"));
        items.add(new PropertyDomain("Apartment","Royal Apartment","LosAngles LA","house_4",1500,2,3,350,true,4.5,"hihih"));
        items.add(new PropertyDomain("Apartment","Royal Apartment","LosAngles LA","house_1",1500,2,3,350,true,4.5,"hihih"));
        items.add(new PropertyDomain("Apartment","Royal Apartment","LosAngles LA","house_1",1500,2,3,350,true,4.5,"hihih"));
        items.add(new PropertyDomain("Apartment","Royal Apartment","LosAngles LA","house_1",1500,2,3,350,true,4.5,"hihih"));
        items.add(new PropertyDomain("Apartment","Royal Apartment","LosAngles LA","house_1",1500,2,3,350,true,4.5,"hihih"));
        binding.RecommendedView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        binding.RecommendedView.setAdapter(new ItemsAdapter(items));
    }

    private void initLocation() {
        String[] items = new String[]{"LosAngLes,USA","New York , USA"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this , android.R.layout.simple_spinner_item , items);
        binding.locationSpiner.setAdapter(adapter);
    }
}