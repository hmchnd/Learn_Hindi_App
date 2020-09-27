package com.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words =  new ArrayList<Word>();

        words.add(new Word("One","EK",R.drawable.number_one));
        words.add(new Word("Two","DO",R.drawable.number_two));
        words.add(new Word("Three","TEEN",R.drawable.number_three));
        words.add(new Word("Four","CHAR",R.drawable.number_four));
        words.add(new Word("Five","PANCH",R.drawable.number_five));
        words.add(new Word("Six","CHAYE",R.drawable.number_six));
        words.add(new Word("Seven","SAAT",R.drawable.number_seven));
        words.add(new Word("Eight","AATH",R.drawable.number_eight));
        words.add(new Word("Nine","NAU",R.drawable.number_nine));
        words.add(new Word("Ten","DUS",R.drawable.number_ten));

/*

        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        int index=0;
        while(index<words.size()){

            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);
            index++;

        }
*/

        WordAdapter itemsAdapter = new WordAdapter (this, words,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);



    }
}