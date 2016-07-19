package com.example.pc.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText hr1;
    Spinner gr1;
    EditText hr2;
    Spinner gr2;
    EditText hr3;
    Spinner gr3;
    EditText hr4;
    Spinner gr4;
    EditText hr5;
    Spinner gr5;
    EditText hr6;
    Spinner gr6;
    EditText hr7;
    Spinner gr7;

    double hr11;
    double hr22;
    double hr33;
    double hr44;
    double hr55;
    double hr66;
    double hr77;

    List<String> list=new ArrayList<String>(); //list for element of spinner

    double ON=0; //variable of point

    Button btn1;
    TextView txt_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hr1 = (EditText) findViewById(R.id.hu_1);
        gr1 = (Spinner) findViewById(R.id.gr1);
        hr2 = (EditText) findViewById(R.id.hu_2);
        gr2 = (Spinner) findViewById(R.id.gr2);
        hr3 = (EditText) findViewById(R.id.hr_3);
        gr3 = (Spinner) findViewById(R.id.gr3);
        hr4 = (EditText) findViewById(R.id.hr_4);
        gr4 = (Spinner) findViewById(R.id.gr4);
        btn1= (Button) findViewById(R.id.btn_1);
        hr5 = (EditText) findViewById(R.id.hr_5);
        gr5 = (Spinner) findViewById(R.id.gr5);
        hr6 = (EditText) findViewById(R.id.hr_6);
        gr6 = (Spinner) findViewById(R.id.gr6);
        hr7 = (EditText) findViewById(R.id.hr_7);
        gr7 = (Spinner) findViewById(R.id.gr7);
        txt_1 = (TextView) findViewById(R.id.txt_1);


        list.add("A+");
        list.add("A");
        list.add("B+");
        list.add("B");
        list.add("C+");
        list.add("C");
        list.add("D+");
        list.add("D");
        list.add("F");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item ,list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        gr1.setAdapter(adapter);
        gr2.setAdapter(adapter);
        gr3.setAdapter(adapter);
        gr4.setAdapter(adapter);
        gr5.setAdapter(adapter);
        gr6.setAdapter(adapter);
        gr7.setAdapter(adapter);

    }


    public void get(){
        hr11=Double.parseDouble((hr1.getText().toString().equals(""))? "0.0": hr1.getText().toString());
        hr22=Double.parseDouble((hr2.getText().toString().equals(""))? "0.0": hr2.getText().toString());
        hr33=Double.parseDouble((hr3.getText().toString().equals(""))? "0.0": hr3.getText().toString());
        hr44=Double.parseDouble((hr4.getText().toString().equals(""))? "0.0": hr4.getText().toString());
        hr55=Double.parseDouble((hr5.getText().toString().equals(""))? "0.0": hr5.getText().toString());
        hr66=Double.parseDouble((hr6.getText().toString().equals(""))? "0.0": hr6.getText().toString());
        hr77=Double.parseDouble((hr7.getText().toString().equals(""))? "0.0": hr7.getText().toString());
    }



    public void test(double hours,String grade) {
        if (hours == 3) {
            switch (grade) {
                case "A+":ON += 12.0;
                    break;
                case "A":ON += 11.25;
                    break;
                case "B+":ON += 10.5;
                    break;
                case "B":ON += 9;
                    break;
                case "C+":ON += 7.6;
                    break;
                case "C":ON += 6;
                    break;
                case "D+":ON += 4.5;
                    break;
                case "D":ON += 3;
                    break;
                case "F":ON += 0;
                    break;
            }
        } else
            if (hours == 2) {
                switch (grade) {
                    case "A+":ON += 8;
                        break;
                    case "A":ON += 7.5;
                        break;
                    case "B+":ON += 7;
                        break;
                    case "B":ON += 6;
                        break;
                    case "C+":ON += 5;
                        break;
                    case "C":ON += 4;
                        break;
                    case "D+":ON += 3;
                        break;
                    case "D":ON += 2;
                        break;
                    case "F":ON += 0;
                        break;
                }
            }
        else
            ON += 0;
    }

    public void calculate(View h){
        double hours=0.0;
        double result=0.0;
        ON=0.0;

        get();

        test(hr11,gr1.getSelectedItem().toString());
        test(hr22,gr2.getSelectedItem().toString());
        test(hr33,gr3.getSelectedItem().toString());
        test(hr44,gr4.getSelectedItem().toString());
        test(hr55,gr5.getSelectedItem().toString());
        test(hr66,gr6.getSelectedItem().toString());
        test(hr77,gr7.getSelectedItem().toString());

        hours=hr11+hr22+hr33+hr44+hr55+hr66+hr77;

        if (hours==0.0){
            txt_1.setText( "                   ادخل عدد الساعات اولاً                                    ");
        }else {
            result= ON/hours;
            txt_1.setText("النقاط: " + ON + "    الساعات: " + hours + "      النسبة: " +  String.format("%.2f", (double)result) + "");
        }
    }

}
