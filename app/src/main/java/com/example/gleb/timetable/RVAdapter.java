package com.example.gleb.timetable;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Gleb on 17.10.2015.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {
    private List<Lesson> lessons;

    RVAdapter(List<Lesson> lessons){
        this.lessons = lessons;
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView nameLesson;
        TextView auditory;
        TextView nameTeacher;
        ImageView photoTeacher;

        PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            nameLesson = (TextView)itemView.findViewById(R.id.nameLesson);
            nameTeacher = (TextView)itemView.findViewById(R.id.nameTeacher);
            auditory = (TextView)itemView.findViewById(R.id.auditory);
            photoTeacher = (ImageView)itemView.findViewById(R.id.photoTeacher);
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_item, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        personViewHolder.nameTeacher.setText(lessons.get(i).getNameTeacher());
        personViewHolder.nameLesson.setText(lessons.get(i).getNameLesson());
        personViewHolder.auditory.setText(lessons.get(i).getAuditory());
        personViewHolder.photoTeacher.setImageResource(lessons.get(i).getIdPhotoTeacher());
    }

    @Override
    public int getItemCount() {
        return lessons.size();
    }
}
