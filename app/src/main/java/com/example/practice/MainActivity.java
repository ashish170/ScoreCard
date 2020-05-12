package com.example.practice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.practice.R;

public class MainActivity extends AppCompatActivity {
    int score=0;
    int score1=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.Menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.b1) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v)

    {
        score=score+1;
        displayForTeamA(score);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v)

    {
        score=score+2;
        displayForTeamA(score);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v)

    {
        score=score+3;
        displayForTeamA(score);
    }

    public void addOneForTeamB(View v)

    {
        score1=score1+1;
        displayForTeamB(score1);
    }
    public void addTwoForTeamB(View v)

    {
        score1=score1+2;
        displayForTeamB(score1);
    }

    public void addThreeForTeamB(View v)

    {
        score1=score1+3;
        displayForTeamB(score1);
    }

    public void reset(View v)
    {
        score=0;
        score1=0;
        displayForTeamA(score);
        displayForTeamB(score1);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.d2);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score1) {
        TextView scoreView = (TextView) findViewById(R.id.c2);
        scoreView.setText(String.valueOf(score1));
    }


}