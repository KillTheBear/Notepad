package com.example.notebook.noteDatabase;

import java.util.Date;

public class Note {
    private int noteID;
    private String noteContext,noteTag;
    private Date noteTime;
    public Note(int noteID,String noteContext,String noteTag,Date noteTime ) {
        this.noteContext = noteContext;
        this.noteID = noteID;
        this.noteTag = noteTag;
        this.noteTime = noteTime;
    }

    public void setNoteID(int noteID) {
        this.noteID = noteID;
    }

    public void setNoteContext(String noteContext) {
        this.noteContext = noteContext;
    }

    public void setNoteTag(String noteTag) {
        this.noteTag = noteTag;
    }

    public void setNoteTome(Date noteTime) {
        this.noteTime = noteTime;
    }

    public int getNoteID() {
        return noteID;
    }

    public String getNoteContext() {
        return noteContext;
    }

    public String getNoteTag() {
        return noteTag;
    }

    public Date getNoteTime() {
        return noteTime;
    }


}
