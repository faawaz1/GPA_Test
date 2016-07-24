package com.example.pc.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Addaui on 7/21/2016.
 */
public class SubjectListAdapter extends ArrayAdapter<Subject>{

    ArrayList<Subject> subjects;

    public SubjectListAdapter(Context context,int id ,ArrayList<Subject> subjects) {
        super(context, id, subjects);
        this.subjects = subjects;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if(v==null){
            LayoutInflater vi = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.grades_raw,null);
        }

        Subject subject = subjects.get(position);

        if(subject!=null){
            TextView rawHour = (TextView) v.findViewById(R.id.row_hour);
            TextView rawGrade = (TextView) v.findViewById(R.id.row_grade);

            if(rawHour!=null){
                rawHour.setText(String.valueOf(subject.getHours()));
            }
            if (rawGrade!=null){
                rawGrade.setText(subject.getGrade());
            }
        }

        Button delete = (Button) v.findViewById(R.id.row_delete);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subjects.remove(position);
                notifyDataSetChanged();
            }
        });








        return v;
    }


}
