package com.abdullaev.and_3_1_1.and_3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.abdullaev.and_3_1.R;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    TextView textView1;
    TextView textView;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonDot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            button0.setText("0");
            String b0 = button0.getText().toString();
            textView1.setText(b0);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1.setText("1");
                String b1 = button1.getText().toString();
                textView1.setText(b1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button2.setText("2");
                String b2 = button2.getText().toString();
                textView1.setText(b2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button3.setText("3");
                String b3 = button3.getText().toString();
                textView1.setText(b3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button4.setText("4");
                String b4 = button4.getText().toString();
                textView1.setText(b4);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button5.setText("5");
                String b5 = button6.getText().toString();
                textView1.setText(b5);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button6.setText("6");
                String b6 = button6.getText().toString();
                textView1.setText(b6);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button7.setText("7");
                String b7 = button7.getText().toString();
                textView1.setText(b7);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button8.setText("8");
                String b8 = button8.getText().toString();
                textView1.setText(b8);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button9.setText("9");
                String b9 = button9.getText().toString();
                textView1.setText(b9);
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonDot.setText(".");
                String bDot = buttonDot.getText().toString();
                textView1.setText(bDot);
            }
        });


    }

    private void initView() {
        linearLayout = findViewById(R.id.linearLayout);
        textView1 =findViewById(R.id.textView);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonDot = findViewById(R.id.buttonDot);
    }
}