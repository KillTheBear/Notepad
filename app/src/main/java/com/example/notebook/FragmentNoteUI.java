package com.example.notebook;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notepad.R;

public class FragmentNoteUI extends Fragment {
    NoteList noteList;
    private RecyclerView mRcvList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_notelist,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        noteList = new NoteList();
        mRcvList = getActivity().findViewById(R.id.rcv_list);
//        mRcvList.setLayoutManager(new LinearLayoutManager(noteList));
//        mRcvList.setAdapter(new LinearAdapter(noteList));
    }
}
