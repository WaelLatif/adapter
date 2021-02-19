package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    Button btn_add;
    TextView et_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.test_list);
        btn_add = findViewById(R.id.btn_add);
        et_name = findViewById(R.id.et_add_item);

        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 5; i++)

            names.add("name #" + i);


        MyAdapter adapter = new MyAdapter(this, android.R.layout.simple_list_item_1, names);

        lv.setAdapter(adapter);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.addItem(et_name.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
    }
}