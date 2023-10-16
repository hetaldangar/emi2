package com.example.emicalculator2;

import static android.os.Build.VERSION_CODES.P;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FD_CalculatorActivity extends AppCompatActivity {

    Button emiCalcBtn,btnClearbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fd_calculator);

        initview();

    }

    private void initview() {

        EditText principle = (EditText) findViewById(R.id.principal);
        EditText interest = (EditText) findViewById(R.id.interest);
        EditText years = (EditText) findViewById(R.id.years);
        EditText total_interest = (EditText) findViewById(R.id.interest_total);
        EditText result = (EditText) findViewById(R.id.emi);
        emiCalcBtn = (Button) findViewById(R.id.btn_calculate2);
        btnClearbutton = (Button) findViewById(R.id.btn_calculate1);

        emiCalcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st1 = principle.getText().toString();
                String st2 = interest.getText().toString();
                String st3 = years.getText().toString();
                if (TextUtils.isEmpty(st1)) {
                    principle.setError("Enter Prncipal Amount");
                    principle.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(st2)) {
                    interest.setError("Enter Interest Rate");
                    interest.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(st3)) {
                    years.setError("Enter Years");
                    years.requestFocus();
                    return;
                }
                float principle = Float.parseFloat(st1);
                float interest = Float.parseFloat(st2);
                float years = Float.parseFloat(st3);
                float Principal = calPric(P);
                float Rate = calInt(interest);
                float Months = calMonth(years);
                float Dvdnt = calDvdnt(Rate, Months);
                float FD = calFinalDvdnt(Principal, Rate, Dvdnt);
                float D = calDivider(Dvdnt);
                float emi = calEmi(FD, D);
                float TA = calTa(emi, Months);
                float ti = calTotalInt(TA, Principal);
                result.setText(String.valueOf(emi));
                total_interest.setText(String.valueOf(ti));
            }
        });

        btnClearbutton.setOnClickListener(v ->{
            principle.setText("");
            interest.setText("");
            years.setText("");
            total_interest.setText("");
            result.setText("");

        });
    }
    public float calPric(float p) {
        return (float)(p);
    }

    public float calInt(float i) {
        return (float)(i / 12 / 100);
    }
    public float calMonth(float y) {
        return (float)(y * 12);
    }
    public float calDvdnt(float Rate, float Months) {
        return (float)(Math.pow(1 + Rate, Months));
    }
    public float calFinalDvdnt(float Principal, float Rate, float Dvdnt) {
        return (float)(Principal * Rate * Dvdnt);
    }
    public float calDivider(float Dvdnt) {
        return (float)(Dvdnt - 1);
    }
    public float calEmi(float FD, Float D) {
        return (float)(FD / D);
    }
    public float calTa(float emi, Float Months) {
        return (float)(emi * Months);
    }
    public float calTotalInt(float TA, float Principal) {
        return (float)(TA - Principal);
    }
}
