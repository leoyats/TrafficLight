package com.example.leoyats.trafficlight;

import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;
    private Button buttonGreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mConstraintLayout = (ConstraintLayout)findViewById(R.id.constraintLayout);
        mInfoTextView = (TextView)findViewById(R.id.textView);
    }

    public void buttonOnClickRed(View view) {
        mInfoTextView.setText(R.string.color_text_name_red);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));
    }

    public void buttonOnClickYellow(View view) {
        mInfoTextView.setText(R.string.color_text_name_yellow);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor));
    }

    public void buttonOnClickGreen(View view) {
        mInfoTextView.setText(R.string.color_text_name_green);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
    }
}
