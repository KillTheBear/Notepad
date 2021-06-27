package com.example.notebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notepad.R;

public class LinearAdapter extends RecyclerView.Adapter<LinearAdapter.LinearList> {
    private Context mContextView;
    LinearList linearList;
    public  LinearAdapter(Context context){
        this.mContextView=context;
    }

    @NonNull
    @Override
    public LinearAdapter.LinearList onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        linearList = new LinearList(LayoutInflater.from(mContextView).inflate(R.layout.note_context,parent,false));
        return linearList;
    }

    @Override
    public void onBindViewHolder(@NonNull LinearAdapter.LinearList holder, int position) {
        holder.mContext.setText("第一行代码");
        holder.mTime.setText(2021-05-06);
    }

    @Override
    public int getItemCount()
    {
        return 1;
    }

    class LinearList extends RecyclerView.ViewHolder{
        private TextView mContext,mTime;
        public LinearList(@NonNull View itemView) {
            super(itemView);
            mContext= itemView.findViewById(R.id.tv_noteContent);
            mTime =itemView.findViewById(R.id.tv_noteTime);

        }
    }
}
