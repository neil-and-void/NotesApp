package com.example.notesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class NoteActivity extends AppCompatActivity {

    EditText noteEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        Intent intent = getIntent();
        int notePos = intent.getIntExtra("notePos",-1);

        noteEditText = (EditText) findViewById(R.id.NoteEditText);
        noteEditText.setText(MainActivity.notesArray.get(notePos));


    }

    // write to noteArrayList on back button pressed
    @Override
    public void onBackPressed() {

        Log.i("dao;jkfs","fjpaoekd");

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);

    }

}
