package com.example.laba1Alexandrov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    ArrayList<Product> products = new ArrayList<Product>();
    BoxAdapter boxAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        fillData();
        boxAdapter = new BoxAdapter(this, products);
        ListView lvMain = (ListView) findViewById(R.id.lvMain);
        lvMain.setAdapter(boxAdapter);
    }
    void fillData() {
        for (int i = 1; i <= 1000000; i++) {
            if(i%2==0) {
                products.add(new Product(Perevod.fromIntToString(i), R.drawable.picture2, 0xFFCCCCCC));
            }
            else{
                products.add(new Product(Perevod.fromIntToString(i), R.drawable.picture2, 0xFFFFFFFF));
            }
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
