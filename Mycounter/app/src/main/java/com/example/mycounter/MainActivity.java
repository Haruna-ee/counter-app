package com.example.mycounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textCount;
Button counterBtn ;
int counterValue = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textCount = (TextView)findViewById(R.id.textView1);
        counterBtn = (Button)findViewById(R.id.button1);
        counterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterValue++;
                textCount.setText("" + counterValue);
            }
        });
    }
}
