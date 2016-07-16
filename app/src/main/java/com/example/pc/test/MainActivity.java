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



    double ON=0;
    double TW=0;
    double TH=0;
    double FU=0;
    double FI=0;
    double SI=0;
    double SV=0;

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

        List<String> list=new ArrayList<String>();
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



    public void one(){
        if(hr11==3){
            if(gr1.getSelectedItem().toString().equals("A+"))
                ON=12;
            if (gr1.getSelectedItem().toString().equals("A"))
                ON=11.25;
            if(gr1.getSelectedItem().toString().equals("B+"))
                ON=10.5;
            if(gr1.getSelectedItem().toString().equals("B"))
                ON=9;
            if(gr1.getSelectedItem().toString().equals("C+"))
                ON=7.5;
            if(gr1.getSelectedItem().toString().equals("C"))
                ON=6;
            if(gr1.getSelectedItem().toString().equals("D+"))
                ON=4.5;
            if(gr1.getSelectedItem().toString().equals("D"))
                ON=3;
            if(gr1.getSelectedItem().toString().equals("F"))
                ON=0;
        }
        else if (hr11==2){
            if(gr1.getSelectedItem().toString().equals("A+"))
                ON=8;
            if (gr1.getSelectedItem().toString().equals("A"))
                ON=7.5;
            if(gr1.getSelectedItem().toString().equals("B+"))
                ON=7;
            if(gr1.getSelectedItem().toString().equals("B"))
                ON=6;
            if(gr1.getSelectedItem().toString().equals("C+"))
                ON=5;
            if(gr1.getSelectedItem().toString().equals("C"))
                ON=4;
            if(gr1.getSelectedItem().toString().equals("D+"))
                ON=3;
            if(gr1.getSelectedItem().toString().equals("D"))
                ON=2;
            if(gr1.getSelectedItem().toString().equals("F"))
                ON=0;
        }
        else
            ON=0;
    }
    public void two(){
        if(hr22==3){
            if(gr2.getSelectedItem().toString().equals("A+"))
                TW=12;
            if (gr2.getSelectedItem().toString().equals("A"))
                TW=11.25;
            if(gr2.getSelectedItem().toString().equals("B+"))
                TW=10.5;
            if(gr2.getSelectedItem().toString().equals("B"))
                TW=9;
            if(gr2.getSelectedItem().toString().equals("C+"))
                TW=7.5;
            if(gr2.getSelectedItem().toString().equals("C"))
                TW=6;
            if(gr2.getSelectedItem().toString().equals("D+"))
                TW=4.5;
            if(gr2.getSelectedItem().toString().equals("D"))
                TW=3;
            if(gr2.getSelectedItem().toString().equals("F"))
                TW=0;
        }
        else if (hr22==2){
            if(gr2.getSelectedItem().toString().equals("A+"))
                TW=8;
            if (gr2.getSelectedItem().toString().equals("A"))
                TW=7.5;
            if(gr2.getSelectedItem().toString().equals("B+"))
                TW=7;
            if(gr2.getSelectedItem().toString().equals("B"))
                TW=6;
            if(gr2.getSelectedItem().toString().equals("C+"))
                TW=5;
            if(gr2.getSelectedItem().toString().equals("C"))
                TW=4;
            if(gr2.getSelectedItem().toString().equals("D+"))
                TW=3;
            if(gr2.getSelectedItem().toString().equals("D"))
                TW=2;
            if(gr2.getSelectedItem().toString().equals("F"))
                TW=0;
        }
        else
            TW=0;
    }
    public void three(){
        if(hr33==3){
            if(gr3.getSelectedItem().toString().equals("A+"))
                TH=12;
            if (gr3.getSelectedItem().toString().equals("A"))
                TH=11.25;
            if(gr3.getSelectedItem().toString().equals("B+"))
                TH=10.5;
            if(gr3.getSelectedItem().toString().equals("B"))
                TH=9;
            if(gr3.getSelectedItem().toString().equals("C+"))
                TH=7.5;
            if(gr3.getSelectedItem().toString().equals("C"))
                TH=6;
            if(gr3.getSelectedItem().toString().equals("D+"))
                TH=4.5;
            if(gr3.getSelectedItem().toString().equals("D"))
                TH=3;
            if(gr3.getSelectedItem().toString().equals("F"))
                TH=0;
        }
        else if (hr33==2){
            if(gr3.getSelectedItem().toString().equals("A+"))
                TH=8;
            if (gr3.getSelectedItem().toString().equals("A"))
                TH=7.5;
            if(gr3.getSelectedItem().toString().equals("B+"))
                TH=7;
            if(gr3.getSelectedItem().toString().equals("B"))
                TH=6;
            if(gr3.getSelectedItem().toString().equals("C+"))
                TH=5;
            if(gr3.getSelectedItem().toString().equals("C"))
                TH=4;
            if(gr3.getSelectedItem().toString().equals("D+"))
                TH=3;
            if(gr3.getSelectedItem().toString().equals("D"))
                TH=2;
            if(gr3.getSelectedItem().toString().equals("F"))
                TH=0;
        }
        else
            TH=0;
    }
    public void four(){
        if(hr44==3){
            if(gr4.getSelectedItem().toString().equals("A+"))
                FU=12;
            if (gr4.getSelectedItem().toString().equals("A"))
                FU=11.25;
            if(gr4.getSelectedItem().toString().equals("B+"))
                FU=10.5;
            if(gr4.getSelectedItem().toString().equals("B"))
                FU=9;
            if(gr4.getSelectedItem().toString().equals("C+"))
                FU=7.5;
            if(gr4.getSelectedItem().toString().equals("C"))
                FU=6;
            if(gr4.getSelectedItem().toString().equals("D+"))
                FU=4.5;
            if(gr4.getSelectedItem().toString().equals("D"))
                FU=3;
            if(gr4.getSelectedItem().toString().equals("F"))
                FU=0;
        }
        else if (hr44==2){
            if(gr4.getSelectedItem().toString().equals("A+"))
                FU=8;
            if (gr4.getSelectedItem().toString().equals("A"))
                FU=7.5;
            if(gr4.getSelectedItem().toString().equals("B+"))
                FU=7;
            if(gr4.getSelectedItem().toString().equals("B"))
                FU=6;
            if(gr4.getSelectedItem().toString().equals("C+"))
                FU=5;
            if(gr4.getSelectedItem().toString().equals("C"))
                FU=4;
            if(gr4.getSelectedItem().toString().equals("D+"))
                FU=3;
            if(gr4.getSelectedItem().toString().equals("D"))
                FU=2;
            if(gr4.getSelectedItem().toString().equals("F"))
                FU=0;
        }
        else
            FU=0;
    }

    public void five(){
        if(hr55==3){
            if(gr5.getSelectedItem().toString().equals("A+"))
                FI=12;
            if (gr5.getSelectedItem().toString().equals("A"))
                FI=11.25;
            if(gr5.getSelectedItem().toString().equals("B+"))
                FI=10.5;
            if(gr5.getSelectedItem().toString().equals("B"))
                FI=9;
            if(gr5.getSelectedItem().toString().equals("C+"))
                FI=7.5;
            if(gr5.getSelectedItem().toString().equals("C"))
                FI=6;
            if(gr5.getSelectedItem().toString().equals("D+"))
                FI=4.5;
            if(gr5.getSelectedItem().toString().equals("D"))
                FI=3;
            if(gr5.getSelectedItem().toString().equals("F"))
                FI=0;
        }
        else if (hr55==2){
            if(gr5.getSelectedItem().toString().equals("A+"))
                FI=8;
            if (gr5.getSelectedItem().toString().equals("A"))
                FI=7.5;
            if(gr5.getSelectedItem().toString().equals("B+"))
                FI=7;
            if(gr5.getSelectedItem().toString().equals("B"))
                FI=6;
            if(gr5.getSelectedItem().toString().equals("C+"))
                FI=5;
            if(gr5.getSelectedItem().toString().equals("C"))
                FI=4;
            if(gr5.getSelectedItem().toString().equals("D+"))
                FI=3;
            if(gr5.getSelectedItem().toString().equals("D"))
                FI=2;
            if(gr5.getSelectedItem().toString().equals("F"))
                FI=0;
        }
        else
            FI=2020;
    }
    public void six(){
        if(hr66==3){
            if(gr6.getSelectedItem().toString().equals("A+"))
                SI=12;
            if (gr6.getSelectedItem().toString().equals("A"))
                SI=11.25;
            if(gr6.getSelectedItem().toString().equals("B+"))
                SI=10.5;
            if(gr6.getSelectedItem().toString().equals("B"))
                SI=9;
            if(gr6.getSelectedItem().toString().equals("C+"))
                SI=7.5;
            if(gr6.getSelectedItem().toString().equals("C"))
                SI=6;
            if(gr6.getSelectedItem().toString().equals("D+"))
                SI=4.5;
            if(gr6.getSelectedItem().toString().equals("D"))
                SI=3;
            if(gr6.getSelectedItem().toString().equals("F"))
                SI=0;
        }
        else if (hr66==2){
            if(gr6.getSelectedItem().toString().equals("A+"))
                SI=8;
            if (gr6.getSelectedItem().toString().equals("A"))
                SI=7.5;
            if(gr6.getSelectedItem().toString().equals("B+"))
                SI=7;
            if(gr6.getSelectedItem().toString().equals("B"))
                SI=6;
            if(gr6.getSelectedItem().toString().equals("C+"))
                SI=5;
            if(gr6.getSelectedItem().toString().equals("C"))
                SI=4;
            if(gr6.getSelectedItem().toString().equals("D+"))
                SI=3;
            if(gr6.getSelectedItem().toString().equals("D"))
                SI=2;
            if(gr6.getSelectedItem().toString().equals("F"))
                SI=0;
        }
        else
            SI=20200;
    }
   public void sven(){
        if(hr77==3){
            if(gr7.getSelectedItem().toString().equals("A+"))
                SV=12;
            if (gr7.getSelectedItem().toString().equals("A"))
                SV=11.25;
            if(gr7.getSelectedItem().toString().equals("B+"))
                SV=10.5;
            if(gr7.getSelectedItem().toString().equals("B"))
                SV=9;
            if(gr7.getSelectedItem().toString().equals("C+"))
                SV=7.5;
            if(gr7.getSelectedItem().toString().equals("C"))
                SV=6;
            if(gr7.getSelectedItem().toString().equals("D+"))
                SV=4.5;
            if(gr7.getSelectedItem().toString().equals("D"))
                SV=3;
            if(gr7.getSelectedItem().toString().equals("F"))
                SV=0;
        }
        else if (hr77==2){
            if(gr7.getSelectedItem().toString().equals("A+"))
                SV=8;
            if (gr7.getSelectedItem().toString().equals("A"))
                SV=7.5;
            if(gr7.getSelectedItem().toString().equals("B+"))
                SV=7;
            if(gr7.getSelectedItem().toString().equals("B"))
                SV=6;
            if(gr7.getSelectedItem().toString().equals("C+"))
                SV=5;
            if(gr7.getSelectedItem().toString().equals("C"))
                SV=4;
            if(gr7.getSelectedItem().toString().equals("D+"))
                SV=3;
            if(gr7.getSelectedItem().toString().equals("D"))
                SV=2;
            if(gr7.getSelectedItem().toString().equals("F"))
                SV=0;
        }
        else {
            hr77 = 0;
            SV = 0;
        }
    }





    public void calcu(View h){
        double NQAT=0.0;
        double ALSAT=0.0;
        double res=0.0;

        get();

        one();
        two();
        three();
        four();
        five();
        six();
        sven();

        ALSAT=hr11+hr22+hr33+hr44+hr55+hr66+hr77;
        NQAT=ON+TW+TH+FU+FI+SI+SV;
        res=NQAT/ALSAT;
        txt_1.setText("النقاط:"+NQAT+"    الساعات: "+ALSAT+"         النسبة:"+res+"");
    }

}
