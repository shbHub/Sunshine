package com.example.android.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList weekForecast = new ArrayList();
        weekForecast.add("Today- 21 Sunny");
        weekForecast.add("Tommorrow - 20 Sunny");
        weekForecast.add("Tuesday - 20 Sunny");
        weekForecast.add("Wednesday - 20 Sunny");
        weekForecast.add("Thursday - 20 Sunny");
        weekForecast.add("Friday - 20 Sunny");
        weekForecast.add("Saturday - 20 Sunny");
        weekForecast.add("Sunday - 20 Sunny");
        weekForecast.add("Monday - 20 Sunny");
        weekForecast.add("Tuesday - 20 Sunny");
        weekForecast.add("Wednesday - 20 Sunny");
        weekForecast.add("Thursday - 20 Sunny");
        weekForecast.add("Friday - 20 Sunny");
        weekForecast.add("Saturday - 20 Sunny");
        weekForecast.add("Sunday - 20 Sunny");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast
        );

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(arrayAdapter);
        return rootView;
    }
}
