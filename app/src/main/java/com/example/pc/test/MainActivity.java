package com.example.pc.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText hr1;
    EditText gr1;
    EditText hr2;
    EditText gr2;
    EditText hr3;
    EditText gr3;
    EditText hr4;
    EditText gr4;
    EditText hr5;
    EditText gr5;
    EditText hr6;
    EditText gr6;
    //EditText hr7;
    //EditText gr7;

    double hr11;
    String gr11;
    double hr22;
    String gr22;
    double hr33;
    String gr33;
    double hr44;
    String gr44;
    double hr55;
    String gr55;
    double hr66;
    String gr66;
    //double hr77;
    //String gr77;



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
        gr1 = (EditText) findViewById(R.id.gr_1);
        hr2 = (EditText) findViewById(R.id.hu_2);
        gr2 = (EditText) findViewById(R.id.gr_2);
        hr3 = (EditText) findViewById(R.id.hr_3);
        gr3 = (EditText) findViewById(R.id.gr_3);
        hr4 = (EditText) findViewById(R.id.hr_4);
        gr4 = (EditText) findViewById(R.id.gr_4);
        btn1 = (Button) findViewById(R.id.btn_1);
        hr5 = (EditText) findViewById(R.id.hr_5);
        gr5 = (EditText) findViewById(R.id.gr_5);
        hr6 = (EditText) findViewById(R.id.hr_6);
        gr6 = (EditText) findViewById(R.id.gr_6);
        //hr7 = (EditText) findViewById(R.id.hr_7);
        //gr7 = (EditText) findViewById(R.id.gr_7);
        txt_1 = (TextView) findViewById(R.id.txt_1);

    }


    public void get(){
        hr11=Double.parseDouble(hr1.getText().toString());
        gr11=(gr1.getText().toString());
        hr22=Double.parseDouble(hr2.getText().toString());
        gr22=(gr2.getText().toString());
        hr33=Double.parseDouble(hr3.getText().toString());
        gr33=(gr3.getText().toString());
        hr44=Double.parseDouble(hr4.getText().toString());
        gr44=(gr4.getText().toString());

        hr55=Double.parseDouble(hr5.getText().toString());
        gr55=(gr5.getText().toString());
        hr66=Double.parseDouble(hr6.getText().toString());
        gr66=(gr6.getText().toString());
        //hr77=Double.parseDouble(hr7.getText().toString());
        //gr77=(gr7.getText().toString());
    }



    public void one(){
        if(hr11==3){
            if(gr1.getText().toString().equals("A+"))
                ON=12;
            if (gr1.getText().toString().equals("A"))
                ON=11.25;
            if(gr1.getText().toString().equals("B+"))
                ON=10.5;
            if(gr1.getText().toString().equals("B"))
                ON=9;
            if(gr1.getText().toString().equals("C+"))
                ON=7.5;
            if(gr1.getText().toString().equals("C"))
                ON=6;
            if(gr1.getText().toString().equals("D+"))
                ON=4.5;
            if(gr1.getText().toString().equals("D"))
                ON=3;
            if(gr1.getText().toString().equals("F"))
                ON=0;
        }
        else if (hr11==2){
            if(gr1.getText().toString().equals("A+"))
                ON=8;
            if (gr1.getText().toString().equals("A"))
                ON=7.5;
            if(gr1.getText().toString().equals("B+"))
                ON=7;
            if(gr1.getText().toString().equals("B"))
                ON=6;
            if(gr1.getText().toString().equals("C+"))
                ON=5;
            if(gr1.getText().toString().equals("C"))
                ON=4;
            if(gr1.getText().toString().equals("D+"))
                ON=3;
            if(gr1.getText().toString().equals("D"))
                ON=2;
            if(gr1.getText().toString().equals("F"))
                ON=0;
        }
        else
            ON=0;
    }
    public void two(){
        if(hr22==3){
            if(gr2.getText().toString().equals("A+"))
                TW=12;
            if (gr2.getText().toString().equals("A"))
                TW=11.25;
            if(gr2.getText().toString().equals("B+"))
                TW=10.5;
            if(gr2.getText().toString().equals("B"))
                TW=9;
            if(gr2.getText().toString().equals("C+"))
                TW=7.5;
            if(gr2.getText().toString().equals("C"))
                TW=6;
            if(gr2.getText().toString().equals("D+"))
                TW=4.5;
            if(gr2.getText().toString().equals("D"))
                TW=3;
            if(gr2.getText().toString().equals("F"))
                TW=0;
        }
        else if (hr22==2){
            if(gr2.getText().toString().equals("A+"))
                TW=8;
            if (gr2.getText().toString().equals("A"))
                TW=7.5;
            if(gr2.getText().toString().equals("B+"))
                TW=7;
            if(gr2.getText().toString().equals("B"))
                TW=6;
            if(gr2.getText().toString().equals("C+"))
                TW=5;
            if(gr2.getText().toString().equals("C"))
                TW=4;
            if(gr2.getText().toString().equals("D+"))
                TW=3;
            if(gr2.getText().toString().equals("D"))
                TW=2;
            if(gr2.getText().toString().equals("F"))
                TW=0;
        }
        else
            TW=0;
    }
    public void three(){
        if(hr33==3){
            if(gr3.getText().toString().equals("A+"))
                TH=12;
            if (gr3.getText().toString().equals("A"))
                TH=11.25;
            if(gr3.getText().toString().equals("B+"))
                TH=10.5;
            if(gr3.getText().toString().equals("B"))
                TH=9;
            if(gr3.getText().toString().equals("C+"))
                TH=7.5;
            if(gr3.getText().toString().equals("C"))
                TH=6;
            if(gr3.getText().toString().equals("D+"))
                TH=4.5;
            if(gr3.getText().toString().equals("D"))
                TH=3;
            if(gr3.getText().toString().equals("F"))
                TH=0;
        }
        else if (hr33==2){
            if(gr3.getText().toString().equals("A+"))
                TH=8;
            if (gr3.getText().toString().equals("A"))
                TH=7.5;
            if(gr3.getText().toString().equals("B+"))
                TH=7;
            if(gr3.getText().toString().equals("B"))
                TH=6;
            if(gr3.getText().toString().equals("C+"))
                TH=5;
            if(gr3.getText().toString().equals("C"))
                TH=4;
            if(gr3.getText().toString().equals("D+"))
                TH=3;
            if(gr3.getText().toString().equals("D"))
                TH=2;
            if(gr3.getText().toString().equals("F"))
                TH=0;
        }
        else
            TH=0;
    }
    public void four(){
        if(hr44==3){
            if(gr4.getText().toString().equals("A+"))
                FU=12;
            if (gr4.getText().toString().equals("A"))
                FU=11.25;
            if(gr4.getText().toString().equals("B+"))
                FU=10.5;
            if(gr4.getText().toString().equals("B"))
                FU=9;
            if(gr4.getText().toString().equals("C+"))
                FU=7.5;
            if(gr4.getText().toString().equals("C"))
                FU=6;
            if(gr4.getText().toString().equals("D+"))
                FU=4.5;
            if(gr4.getText().toString().equals("D"))
                FU=3;
            if(gr4.getText().toString().equals("F"))
                FU=0;
        }
        else if (hr44==2){
            if(gr4.getText().toString().equals("A+"))
                FU=8;
            if (gr4.getText().toString().equals("A"))
                FU=7.5;
            if(gr4.getText().toString().equals("B+"))
                FU=7;
            if(gr4.getText().toString().equals("B"))
                FU=6;
            if(gr4.getText().toString().equals("C+"))
                FU=5;
            if(gr4.getText().toString().equals("C"))
                FU=4;
            if(gr4.getText().toString().equals("D+"))
                FU=3;
            if(gr4.getText().toString().equals("D"))
                FU=2;
            if(gr4.getText().toString().equals("F"))
                FU=0;
        }
        else
            FU=0;
    }

    public void five(){
        if(hr55==3){
            if(gr5.getText().toString().equals("A+"))
                FI=12;
            if (gr5.getText().toString().equals("A"))
                FI=11.25;
            if(gr5.getText().toString().equals("B+"))
                FI=10.5;
            if(gr5.getText().toString().equals("B"))
                FI=9;
            if(gr5.getText().toString().equals("C+"))
                FI=7.5;
            if(gr5.getText().toString().equals("C"))
                FI=6;
            if(gr5.getText().toString().equals("D+"))
                FI=4.5;
            if(gr5.getText().toString().equals("D"))
                FI=3;
            if(gr5.getText().toString().equals("F"))
                FI=0;
        }
        else if (hr55==2){
            if(gr5.getText().toString().equals("A+"))
                FI=8;
            if (gr5.getText().toString().equals("A"))
                FI=7.5;
            if(gr5.getText().toString().equals("B+"))
                FI=7;
            if(gr5.getText().toString().equals("B"))
                FI=6;
            if(gr5.getText().toString().equals("C+"))
                FI=5;
            if(gr5.getText().toString().equals("C"))
                FI=4;
            if(gr5.getText().toString().equals("D+"))
                FI=3;
            if(gr5.getText().toString().equals("D"))
                FI=2;
            if(gr5.getText().toString().equals("F"))
                FI=0;
        }
        else
            FI=2020;
    }
    public void six(){
        if(hr66==3){
            if(gr6.getText().toString().equals("A+"))
                SI=12;
            if (gr6.getText().toString().equals("A"))
                SI=11.25;
            if(gr6.getText().toString().equals("B+"))
                SI=10.5;
            if(gr6.getText().toString().equals("B"))
                SI=9;
            if(gr6.getText().toString().equals("C+"))
                SI=7.5;
            if(gr6.getText().toString().equals("C"))
                SI=6;
            if(gr6.getText().toString().equals("D+"))
                SI=4.5;
            if(gr6.getText().toString().equals("D"))
                SI=3;
            if(gr6.getText().toString().equals("F"))
                SI=0;
        }
        else if (hr66==2){
            if(gr6.getText().toString().equals("A+"))
                SI=8;
            if (gr6.getText().toString().equals("A"))
                SI=7.5;
            if(gr6.getText().toString().equals("B+"))
                SI=7;
            if(gr6.getText().toString().equals("B"))
                SI=6;
            if(gr6.getText().toString().equals("C+"))
                SI=5;
            if(gr6.getText().toString().equals("C"))
                SI=4;
            if(gr6.getText().toString().equals("D+"))
                SI=3;
            if(gr6.getText().toString().equals("D"))
                SI=2;
            if(gr6.getText().toString().equals("F"))
                SI=0;
        }
        else
            SI=2020;
    }
   /* public void sven(){
        if(hr77==3){
            if(gr7.getText().toString().equals("A+"))
                SV=12;
            if (gr7.getText().toString().equals("A"))
                SV=11.25;
            if(gr7.getText().toString().equals("B+"))
                SV=10.5;
            if(gr7.getText().toString().equals("B"))
                SV=9;
            if(gr7.getText().toString().equals("C+"))
                SV=7.5;
            if(gr7.getText().toString().equals("C"))
                SV=6;
            if(gr7.getText().toString().equals("D+"))
                SV=4.5;
            if(gr7.getText().toString().equals("D"))
                SV=3;
            if(gr7.getText().toString().equals("F"))
                SV=0;
        }
        else if (hr77==2){
            if(gr7.getText().toString().equals("A+"))
                SV=8;
            if (gr7.getText().toString().equals("A"))
                SV=7.5;
            if(gr7.getText().toString().equals("B+"))
                SV=7;
            if(gr7.getText().toString().equals("B"))
                SV=6;
            if(gr7.getText().toString().equals("C+"))
                SV=5;
            if(gr7.getText().toString().equals("C"))
                SV=4;
            if(gr7.getText().toString().equals("D+"))
                SV=3;
            if(gr7.getText().toString().equals("D"))
                SV=2;
            if(gr7.getText().toString().equals("F"))
                SV=0;
        }
        else {
            hr77 = 0;
            SV = 0;
        }
    } */





    public void calcu(View h){
        double NQAT=0;
        double ALSAT=0;
        double res=0;

        get();

        one();
        two();
        three();
        four();
        five();
        six();
        //sven();

        ALSAT=hr11+hr22+hr33+hr44+hr55+hr66;
        NQAT=ON+TW+TH+FU+FI+SI;
        res=NQAT/ALSAT;
        txt_1.setText("NQAT:"+NQAT+"      ALSAT:"+ALSAT+"         res:"+res+"");
    }

}
