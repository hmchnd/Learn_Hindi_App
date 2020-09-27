package com.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words =  new ArrayList<Word>();
        words.add(new Word("Dad","Pitaji/ PAPA",R.drawable.family_father));
        words.add(new Word("MOM","Mummy",R.drawable.family_mother));
        words.add(new Word("Sister","Behen",R.drawable.family_older_sister));
        words.add(new Word("Brother","Bhai",R.drawable.family_older_brother));
        words.add(new Word("Friend","Dost",R.drawable.family_younger_brother));
        words.add(new Word("Uncle","Cha Cha",R.drawable.family_older_brother));
        words.add(new Word("Aunty","Chachi",R.drawable.family_mother));
        words.add(new Word("Wife","Patni",R.drawable.family_younger_sister));
        words.add(new Word("Husband","Pati",R.drawable.family_older_sister));

        WordAdapter itemsAdapter = new WordAdapter (this, words,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}