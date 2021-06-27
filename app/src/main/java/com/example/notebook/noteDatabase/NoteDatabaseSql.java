package com.example.notebook.noteDatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class NoteDatabaseSql extends SQLiteOpenHelper {
    public NoteDatabaseSql(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    /*
    * 建立便签数据库
    * noteID : 便签编号
    * noteContext : 便签内容
    * noteTag : 便签标签
    * noteTime : 便签时间
    * */
    private  String noteContext ="create table note(" +
            "noteID integer primary key autoincrement,"  +
            "noteContext text," +
            "noteTag text,"+
            "noteTime text);";
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(noteContext);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if(oldVersion <=1){
            db.execSQL(noteContext);
        }
        /*else if(oldVersion <= 2){

        }*/

    }
}
