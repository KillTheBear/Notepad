package com.example.notebook.addNote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

import com.example.notebook.MainActivity;
import com.example.notepad.R;

public class EditContextActivity extends AppCompatActivity {
    private EditText mTitle, mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_context);
        mTitle = findViewById(R.id.et_context);
        mContext = findViewById(R.id.et_context);

        mTitle.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mTitle.setFocusableInTouchMode(true);
                return false;
            }
        });
    }
    public void setListener(){
        OnClick onClick = new OnClick();
        mTitle.setOnClickListener(onClick);

    }


    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                case R.id.et_title:

                    break;
            }
            startActivity(intent);
        }
    }
}