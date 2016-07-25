package com.example.pc.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RadioButton r1,r2;


    double ON=0; //variable of point
    double TW=0;
    Button btn1;
    TextView txt_1;

    Spinner spinner;
    EditText editText;

    ArrayList<Subject> subjects ;
    ListView subjectList ;
    SubjectListAdapter subjectListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        editText = (EditText) findViewById(R.id.edittext);

        subjects = new ArrayList<>();
        subjectList = (ListView) findViewById(R.id.subjectList);
        subjectListAdapter = new SubjectListAdapter(this,R.layout.grades_raw,subjects);
        subjectList.setAdapter(subjectListAdapter);

        btn1= (Button) findViewById(R.id.btn_1);
        txt_1 = (TextView) findViewById(R.id.txt_1);
        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);

        DisplayMetrics metrics = getResources().getDisplayMetrics();

        int deviceHeight = metrics.heightPixels;
        deviceHeight+=300;
        ViewGroup.LayoutParams params2 = subjectList.getLayoutParams();
        params2.height =deviceHeight/3;


    }

    public void add(View v){
        if(editText.getText().toString().equals(""))
            editText.setText("0");
        Subject subject = new Subject(Integer.valueOf(editText.getText().toString()),spinner.getSelectedItem().toString());
        Log.d("Dev_ADD",String.format("%s - %d \n",subject.getGrade(),subject.getHours()));
        subjects.add(subject);
        editText.setText("");
        spinner.setSelection(0);
        subjectListAdapter.notifyDataSetChanged();
    }

    public void onRadioButtonClicked(View view) {

        if(view.getId()==R.id.radioButton) {
            if (r1.isChecked()) {
                r2.setChecked(false);
                r1.setChecked(true);
            }
        }
        if(view.getId()==R.id.radioButton2){
            if(r2.isChecked()){
                r1.setChecked(false);
                r2.setChecked(true);
            }
        }

}

    public void test(double hours,String grade) {

            switch (grade) {
                case "A+":ON += hours*4;
                    TW+=(hours*5);
                    break;
                case "A":ON += hours*3.75;
                    TW+=(hours*4.75);
                    break;
                case "B+":ON += hours*3.5;
                    TW+=(hours*4.5);
                    break;
                case "B":ON += hours*3;
                    TW+=(hours*4);
                    break;
                case "C+":ON += hours*2.5;
                    TW+=(hours*3.5);
                    break;
                case "C":ON += hours*2;
                    TW+=(hours*3);
                    break;
                case "D+":ON += hours*1.5;
                    TW+=(hours*2.5);
                    break;
                case "D":ON += hours*1;
                    TW+=(hours*2);
                    break;
                case "F":ON += hours*0;
                    TW+=hours;
                    break;
            }
    }

    public void calculate(View h) {

        double hours = 0.0;
        double result = 0.0;
        ON = 0.0;
        TW = 0.0;

        for (Subject subject : subjects) {
            test(Double.valueOf(subject.getHours()), subject.getGrade());
            hours += Double.valueOf(subject.getHours());
        }

        Log.i("Result", String.format("TW = %.2f , Hours = %.2f", TW, hours));

        if (hours == 0.0) {
            Toast.makeText(getApplicationContext(), "ادخل عدد الساعات اولاً", Toast.LENGTH_LONG).show();
        } else if (r1.isChecked()) {

            result = TW / hours;
            txt_1.setText("النقاط: " + String.format("%.1f", (double) TW) + "    الساعات: " + String.format("%.1f", (double) hours) + "      النسبة: " + String.format("%.2f", (double) result) + "");
        } else if (r2.isChecked()) {

            result = ON / hours;
            txt_1.setText("النقاط: " + String.format("%.1f", (double) ON) + "    الساعات: " + String.format("%.1f", (double) hours) + "      النسبة: " + String.format("%.2f", (double) result) + "");
        }
    }
}
