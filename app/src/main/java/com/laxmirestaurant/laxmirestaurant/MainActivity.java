package com.laxmirestaurant.laxmirestaurant;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<laxmiadapter> arrayList1=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView=findViewById(R.id.mainview);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        arrayList1.add(new laxmiadapter(R.drawable.pizza,"Chess Pizza","Rs.199"));
        arrayList1.add(new laxmiadapter(R.drawable.pepsi,"Pepsi","Rs.39"));
        arrayList1.add(new laxmiadapter(R.drawable.pudding,"Pudding","Rs.199"));
        arrayList1.add(new laxmiadapter(R.drawable.pizza,"Vegi Farm Pizza","Rs.199"));
        arrayList1.add(new laxmiadapter(R.drawable.pepsi,"Diet Zero","Rs.49"));
        LaxmiRecyclerview laxmiRecyclerview=new LaxmiRecyclerview(arrayList1);
        recyclerView.setAdapter(laxmiRecyclerview);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.storemenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       return true;
    }
}