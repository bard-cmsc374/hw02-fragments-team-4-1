package edu.bard.todolist_lab1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by Ben on 9/22/2016.
 */

public class AdderFragment  extends Fragment{

    private EditText mEditText; // enter todo item
    private Button mItemButton; // add the item to the list
    private ArrayList<String> mToDoItems; // list of items

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater,  container, savedInstanceState);
        View view = inflater.inflate(R.layout.adder_fragment, container, false);


        //view.setContentView(R.layout.adder_fragment);

        mEditText = (EditText) view.findViewById(R.id.myEditText);
        mItemButton = (Button) view.findViewById(R.id.addButton);

        mItemButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mToDoItems.add(0, mEditText.getText().toString());
                //ToDoList.aa.notifyDataSetChanged();
                mEditText.setText("");
            }
        });



        return view;

    }

}


