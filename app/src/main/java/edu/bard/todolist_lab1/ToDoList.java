package edu.bard.todolist_lab1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/*


CMSC 374
HW #2 Fragments: Feedback

Names: Ben (Min?) and Chance

     Rubric
----------------------------------------------------------
40	1. App functions correctly from end user perspective.
20	2. Fragments are correctly created.
5	3. Fragments share information on the adapter arraylist.
10	4. Code is clearly commented.
20	5. Code is readable and well constructed.

Score: 95


----------------

Comments

My comments in your code are marked with XX in a comment.



1. App functions correctly from end user perspective. YES, resources used, too.

2. Fragments are correctly created.

3. Fragments share information on the adapter arraylist.   Using
statics is not quite the right approach, since it's too limiting.


4. Code is clearly commented.
Good!


5. Code is readable and well constructed.
Yes...good throughout.



 */

public class ToDoList extends FragmentActivity {
    public static String TAG = "todolab";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate your view
        setContentView(R.layout.main); // Extracts resources, autogenerates R.java from XML file

        // FragmentManager (Add ListView Fragment) & (Add Adder Fragment)
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.listview_fragment_container, new ListViewFragment());
        ft.add(R.id.adder_fragment_container, new AdderFragment()); // Should be Adder Fragment
        ft.commit();


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


