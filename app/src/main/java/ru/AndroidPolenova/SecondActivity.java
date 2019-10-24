package ru.AndroidPolenova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.ThreadLocalRandom;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final TextView textView2 = (TextView) findViewById(R.id.textNextSecond);
        int rnd = ThreadLocalRandom.current().nextInt(0, 100);
        textView2.setText("http://myfile.org/" + rnd);
        Button btnNext2 = (Button) findViewById(R.id.buttonNextSecond);
        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
        Button btnBack2 = (Button) findViewById(R.id.btnBackSecond);
        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
