package com.example.yurivanderburg.taschenrechner.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {


    Button one, two, three, four, five, six, seven, eight, nine, zero,
            addition, subtract, equal ;

    EditText et1 ;

    float mValue1, mValue2, solution;

    boolean mAddition, mSubtract, mMultiplication, mDivison ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = (Button) findViewById((R.id.zero));
        one = (Button) findViewById((R.id.one));
        two = (Button) findViewById((R.id.two));
        three = (Button) findViewById((R.id.three));
        four = (Button) findViewById((R.id.four));
        five = (Button) findViewById((R.id.five));
        six = (Button) findViewById((R.id.six));
        seven = (Button) findViewById((R.id.seven));
        eight = (Button) findViewById((R.id.eight));
        nine = (Button) findViewById((R.id.nine));
        addition = (Button) findViewById(R.id.addition);
        subtract = (Button) findViewById(R.id.subtract);
        equal = (Button) findViewById(R.id.equal);
        et1 = (EditText) findViewById(R.id.et1);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"0");
            }
        });

        addition.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                    mValue1 = Float.parseFloat(et1.getText().toString() +"");
                    mValue2 = Float.parseFloat(et1.getText().toString() +"");

                solution = mValue1 + mValue2;

                    et1.setText(null);

                }
            });


        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValue1 = Float.parseFloat(et1.getText() +"");
                mValue2 = Float.parseFloat(et1.getText() +"");
                solution = mValue1 + mValue2;

                et1.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValue2=Float.parseFloat(et1.getText()+"");
                if (mAddition==true) {
                    et1.setText(mValue1+mValue2+"");
                    mAddition=false;
                }
                if (mSubtract==true) {
                    et1.setText(mValue1-mValue2+"");
                    mSubtract=false;
                }
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_settings) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

 }





