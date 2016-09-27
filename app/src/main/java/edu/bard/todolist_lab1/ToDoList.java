package edu.bard.todolist_lab1;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class ToDoList extends FragmentActivity {
    public static String TAG = "todolab";
    private EditText mEditText; // enter todo item
    private Button mItemButton; // add the item to the list

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate your view
        setContentView(R.layout.main); // Extracts resources, autogenerates R.java from XML file

        // FragmentManager (Add ListView Fragment)
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.listview_fragment_container, new ListViewFragment());
        ft.commit();


        // Get references to UI widgets
        mEditText = (EditText) findViewById(R.id.myEditText);
        mItemButton = (Button) findViewById(R.id.addButton);


        // Add key listener to add the new todo item
        // when the middle D-pad button is pressed.
        mItemButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ListViewFragment.mToDoItems.add(0, mEditText.getText().toString());
                ListViewFragment.aa.notifyDataSetChanged();
                mEditText.setText("");
            }
        });

        Log.i(TAG, "Entered onCreate");
    }


    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Entered onStart");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Entered onRestart");
    }

    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Entered onResume");
    }

    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Entered onPause");
    }

    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Entered onStop");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Entered onDestroy");
    }


}


