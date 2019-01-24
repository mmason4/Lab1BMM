package com.example.jsu2.androidexampleapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.*;
import java.util.ArrayList;
import java.util.Random;
import java.lang.String;

//import static com.example.jsu2.androidexampleapp.R.id.textView2;

public class AndroidExampleActivity extends AppCompatActivity {

    private ArrayList mysteryHelper;
    private ArrayList alreadyUsed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_example);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mysteryHelper = new ArrayList();
        alreadyUsed = new ArrayList();

        mysteryHelper.add("you get knocked out\n");
        mysteryHelper.add("you go somewhere else\n");
        mysteryHelper.add("you find a dead man\n");
        mysteryHelper.add("you find a dead woman\n");
        mysteryHelper.add("you meet a buxom blonde\n");
        mysteryHelper.add("someone has searched the place\n");
        mysteryHelper.add("a crooked cop warns you\n");
        mysteryHelper.add("you are arrested\n");
        mysteryHelper.add("you find a gun\n");
        mysteryHelper.add("you find a knife\n");
        mysteryHelper.add("you find a frayed rope\n");
        mysteryHelper.add("a bullet whizzes past your ear!\n");
        mysteryHelper.add("you are almost run over\n");
        mysteryHelper.add("you are being followed\n");
        mysteryHelper.add("you smell familiar perfume\n");
        mysteryHelper.add("the telephone rings\n");
        mysteryHelper.add("there is a knock at the door\n");
        mysteryHelper.add("you hear footsteps behind you ...\n");
        mysteryHelper.add("you hear a gunshot!\n");
        mysteryHelper.add("you hear a scream!\n");
        mysteryHelper.add("you are not alone ...\n");
        mysteryHelper.add("... forget this story, it stinks!");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_android_example, menu);
        return true;
    }

    public void getHelp(View v) {

        /* Select Random Fragment */

        Random rand = new Random();
        int index = rand.nextInt(mysteryHelper.size());
        String s = (String) mysteryHelper.remove(index);

        /* Get Reference to TextView */

        TextView t = (TextView) findViewById(R.id.outputText);

        /* Display Fragment in TextView */

        t.setText(s);

        /* Add Fragment to Already-Used List */

        alreadyUsed.add(s);

        /* Was that the last fragment?  If so, copy them all back */

        if ( mysteryHelper.size() == 0 ) {

            for (int i = 0; i < alreadyUsed.size(); ++i) {
                mysteryHelper.add( alreadyUsed.get(i) );
            }

            alreadyUsed.clear();

        }

    }

@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
