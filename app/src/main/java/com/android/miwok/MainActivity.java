package com.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbers = (TextView)findViewById(R.id.numbers);
        TextView colors = (TextView)findViewById(R.id.colors);
        TextView phrases = (TextView)findViewById(R.id.phrases);
        TextView family = (TextView)findViewById(R.id.family);
         // Event listener for Number Text view.
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Event Listener for color text view.

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           Intent colorIntent = new Intent(MainActivity.this,ColorsActivity.class);
           startActivity(colorIntent);
            }
        });

       // Event Listener for Phrases text view.
       phrases.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent phraseIntent = new Intent(MainActivity.this,PhrasesActivity.class);
               startActivity(phraseIntent);
           }
       });

       // Event Listener for Family Activity.

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(familyIntent);
            }
        });


    }

}