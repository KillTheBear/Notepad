package com.example.notebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.notebook.addNote.EditContextActivity;
import com.example.notepad.R;

public class MainActivity extends AppCompatActivity {
    private  Fragment mFragment;
    private ImageButton mIb_AddNote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        mIb_AddNote = findViewById(R.id.floatingActionButton);
        if(mFragment == null){
            mFragment = new FragmentNoteUI();
            getSupportFragmentManager().beginTransaction().add(R.id.fl_mainUI,mFragment).commitAllowingStateLoss();

        }
        setListener();

    }
    public void setListener(){
        OnClick onClick = new OnClick();
        mIb_AddNote.setOnClickListener(onClick);

    }


    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                case R.id.floatingActionButton:
                    intent = new Intent(MainActivity.this, EditContextActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }



}