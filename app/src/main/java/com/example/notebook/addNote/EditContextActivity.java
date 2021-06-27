package com.example.notebook.addNote;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

import com.example.notebook.MainActivity;
import com.example.notepad.R;

import java.security.PrivateKey;

public class EditContextActivity extends AppCompatActivity {
    private EditText mTitle, mContext;
    private Editable mNoteContext;

    @SuppressLint({"CutPasteId", "ClickableViewAccessibility"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_context);
        mTitle = findViewById(R.id.et_context);
        mContext = findViewById(R.id.et_context);
        /*
        * 判断新增便签内容，将内容传递给notelist
        * */
        if(mTitle != null){
            mNoteContext = mTitle.getText();
        }
        else if (mTitle == null || mContext != null){
            mNoteContext = mContext.getText();
        }
        else{
            finish();
        }

        /*
        *当重新点击标题栏时重新获取光标
        * */
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
    /*
    * android自带按钮事件
    * KEYCODE_BACK 返回键
    * KEYCODE_HOME 主页键
     * */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK ){
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString("input", String.valueOf(mNoteContext));
            intent.putExtras(bundle);
            finish();
            return true;
        }
        else if(keyCode == KeyEvent.KEYCODE_HOME){
            return true;
        }

        return super.onKeyDown(keyCode, event);
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