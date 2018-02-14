/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.datafrominternet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mSearchBoxEditText;

    private TextView mUrlDisplayTextView;

    private TextView mSearchResultsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSearchBoxEditText = (EditText) findViewById(R.id.et_search_box);

        mUrlDisplayTextView = (TextView) findViewById(R.id.tv_url_display);
        mSearchResultsTextView = (TextView) findViewById(R.id.tv_github_search_results_json);
    }

    // Do 2 - 7 in menu.xml ///////////////////////////////////////////////////////////////////////
    // COMPLETED (2) Create a menu xml called 'main.xml' in the res->menu folder
    // COMPLETED (3) Add one menu item to your menu
    // COMPLETED (4) Give the menu item an id of @+id/action_search
    // COMPLETED (5) Set the orderInCategory to 1
    // COMPLETED (6) Show this item if there is room (use app:showAsAction, not android:showAsAction)
    // COMPLETED (7) Set the title to the search string ("Search") from strings.xml
    // Do 2 - 7 in menu.xml ///////////////////////////////////////////////////////////////////////


    // COMPLETED (8) Override onCreateOptionsMenu
    // COMPLETED (9) Within onCreateOptionsMenu, use getMenuInflater().inflate to inflate the menu
    // COMPLETED (10) Return true to display your menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /* Initialize the contents of the Activity's standard options menu. You should place your menu items in to menu */
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        /* getMenuInflator() returns a MenuInflator object
        * MenuInflator is This class is used to instantiate menu XML files into Menu objects.
        * inflate() function is a method of this class that takes the menu layout XML id and the menu to inflate into, and inflates the menu.
            * Its return type is void
        */
        return true;
    }

    // COMPLETED (11) Override onOptionsItemSelected
    // COMPLETED (12) Within onOptionsItemSelected, get the ID of the item that was selected
    // COMPLETED (13) If the item's ID is R.id.action_search, show a Toast and return true to tell Android that you've handled this menu click
    // COMPLETED (14) Don't forgot to call .show() on your Toast

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /*
        * This hook is called whenever an item in your options menu is selected.
        * The default implementation simply returns false to have the normal processing happen
            (calling the item's Runnable or sending a message to its Handler as appropriate).
        * You can use this method for any items for which you would like to do processing without those other facilities.
        */
        int menuItemID = item.getItemId();
        if (menuItemID == R.id.action_search)
            Toast.makeText(MainActivity.this, "Search clicked", Toast.LENGTH_SHORT).show();
        return true;
    }
}
