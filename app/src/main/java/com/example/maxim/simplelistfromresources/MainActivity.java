package com.example.maxim.simplelistfromresources;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    private String[] currencies_array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        currencies_array = getResources().getStringArray(R.array.cur);
        ArrayAdapter<String> currenciesListAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, currencies_array);
        setListAdapter(currenciesListAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Toast.makeText(this, "Clicked currency: " + currencies_array[position],
                Toast.LENGTH_SHORT).show();
    }
}
