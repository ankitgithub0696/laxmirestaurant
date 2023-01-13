package com.laxmirestaurant.laxmirestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    PopupMenu popupMenu;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        text=findViewById(R.id.menubar);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupMenu=new PopupMenu(Home.this,view);
                popupMenu.getMenuInflater().inflate(R.menu.storemenu,popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch(menuItem.getItemId()) {
                            case R.id.notify:
                                Toast.makeText(Home.this, "notify", Toast.LENGTH_SHORT).show();
                        }
                        return true;
                    }
                });
            }
        });

    }
}