package com.example.dnddice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;

import java.util.Random;


class Dice{
    /*
     * use random for dice
     *
     */
    public int numFaces;
    Random random;
    //class constructor
    public Dice(int n)
    {
        this.random = new Random();
        numFaces = n;
    }

    public int roll()
    {
        //Pass in numFaces, to generate a random result
        return random.nextInt(numFaces);
    }

}


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonPressed(View view) {
        //Grab Text from button; grab the int from the string
        //make a dice using the int as parameter
        //set i = roll
        //set view to i
        TextView tv = (TextView) findViewById(R.id.Roll);
        Dice dice;
        Button b = (Button)view;
        String buttonText = b.getText().toString();

        int i = Integer.parseInt(buttonText.substring(1));
        dice = new Dice(i);
        int j = dice.roll() + 1;
        tv.setText("You rolled a " + j);
    }
}
