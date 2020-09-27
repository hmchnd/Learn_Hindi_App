package com.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words =  new ArrayList<Word>();
        words.add(new Word("Hello","Namaskaar"));
        words.add(new Word("How Are You?","Aap Kaise Hai?"));
        words.add(new Word("I am good","Mai theek hu"));
        words.add(new Word("Where are you going?","Aap Kaha Ja Rahe Hai?"));
        words.add(new Word("Come Here Please!","Kripya Idhar Aiye!"));
        words.add(new Word("Happy Birthday!!","Janamdin ki Subhkamnayein"));


        WordAdapter itemsAdapter = new WordAdapter (this, words,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);




    }
}