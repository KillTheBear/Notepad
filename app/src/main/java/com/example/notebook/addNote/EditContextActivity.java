package com.example.notebook.addNote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.notepad.R;

public class EditContextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_context);
        getSupportActionBar().hide();
    }
}