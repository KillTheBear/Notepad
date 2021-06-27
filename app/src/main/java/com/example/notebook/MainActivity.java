package com.example.notebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.notebook.addNote.EditContextActivity;
import com.example.notepad.R;

public class MainActivity extends AppCompatActivity {
    private ImageButton mIb_AddNote;
    private RecyclerView mRcv_List;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        mIb_AddNote = findViewById(R.id.floatingActionButton);
        mRcv_List = findViewById(R.id.rcv_list);
        mRcv_List.setLayoutManager(new LinearLayoutManager(this));
        mRcv_List.setAdapter(new LinearAdapter(this));
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