package edu.bard.todolist_lab1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewFragment extends Fragment {
    public static ArrayList<String> mToDoItems; // list of items
    public static ArrayAdapter<String> aa; // adapter from list to viewlist
    public ListView mListView; // ListView in xml

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      return inflater.inflate(R.layout.listview_fragment, parent, false);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // Get Reference to UI widgets
        mListView = (ListView) view.findViewById(R.id.myListView);

        // Create the ArrayList and the ArrayAdapter
        mToDoItems = new ArrayList<>();
        aa = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, mToDoItems);

        // Bind the listview to the array adapter
        mListView.setAdapter(aa);

    }


}
