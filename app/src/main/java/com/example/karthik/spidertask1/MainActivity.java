package com.example.karthik.spidertask1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int a=0;
    public void Click(View view) {             //invoked when the button is pressed
        display(a++);
    }
    private void display(int number) {         //the incremented no. displayed using this function
        TextView quantityTextView = (TextView) findViewById(R.id.content);
        quantityTextView.setText("" + number);
    }

}
