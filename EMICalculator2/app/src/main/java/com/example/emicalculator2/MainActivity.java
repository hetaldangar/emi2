package com.example.emicalculator2;

import  static android.os.Build.VERSION_CODES.P;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imgemi,imgloan,imgvehicle,imgfd,imgrd,imgppf,imgsip;

    TextView txtEMI,txtloan,txtvehicle,txtfd,txtrd,txtppf,txtsip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview();


    }


    private void initview() {

        imgemi=findViewById(R.id.imgemi);
        imgloan=findViewById(R.id.imgloan);
        imgvehicle=findViewById(R.id.imgvehicle);
        imgfd=findViewById(R.id.imgfd);
        imgrd=findViewById(R.id.imgrd);
        imgppf=findViewById(R.id.imgppf);
        imgsip=findViewById(R.id.imgsip);

        txtEMI=findViewById(R.id.txtEMI);
        txtloan=findViewById(R.id.txtloan);
        txtvehicle=findViewById(R.id.txtvehicle);
        txtfd=findViewById(R.id.txtfd);
        txtrd=findViewById(R.id.txtrd);
        txtppf=findViewById(R.id.txtppf);
        txtsip=findViewById(R.id.txtsip);




        txtEMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, EMI_CalculatorActivity.class);
                startActivity(i);

            }
        });
        txtloan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Loan_EligiblityActivity.class);
                startActivity(i);

            }
        });
        txtvehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, VehicleLoanActivity.class);
                startActivity(i);

            }
        });
        txtfd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FD_CalculatorActivity.class);
                startActivity(i);

            }
        });
        txtrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,RD_CalculatorActivity.class);
                startActivity(i);

            }
        });
        txtppf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PPF_CalculatorActivity.class);
                startActivity(i);

            }
        });
        txtsip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SIPActivity.class);
                startActivity(i);

            }
        });

        imgemi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, EMI_CalculatorActivity.class);
                startActivity(i);
            }
        });
        imgloan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Loan_EligiblityActivity.class);
                startActivity(i);
            }
        });
        imgvehicle.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,VehicleLoanActivity.class);
                startActivity(i);
            }
        });
        imgfd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FD_CalculatorActivity.class);
                startActivity(i);
            }
        });
        imgrd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RD_CalculatorActivity.class);
                startActivity(i);
            }
        });
        imgppf.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PPF_CalculatorActivity.class);
                startActivity(i);
            }
        });
        imgsip.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SIPActivity.class);
                startActivity(i);
            }
        });


    }
}










