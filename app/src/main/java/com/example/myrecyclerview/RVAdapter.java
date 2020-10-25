package com.example.myrecyclerview;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonaViewHolder> {

    @NonNull
    @Override
    public RVAdapter.PersonaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RVAdapter.PersonaViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class PersonaViewHolder extends RecyclerView.ViewHolder{
        public PersonaViewHolder(@NonNull View itemView){
            super(itemView);
        }
    }
}
