package com.bisponet.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.ArrayMap;
import android.view.View;
import android.widget.TextView;

import com.bisponet.tic_tac_toe.Controller.GameController;

public class MainActivity extends AppCompatActivity {

    TextView ffirst, fsecond, fthird, sfirst, ssecond, sthird, tfirst, tsecond, tthird, auxtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);

        ffirst = findViewById(R.id.ffirst);
        fsecond = findViewById(R.id.fsecond);
        fthird = findViewById(R.id.fthird);
        sfirst = findViewById(R.id.sfirst);
        ssecond = findViewById(R.id.ssecond);
        sthird = findViewById(R.id.sthird);
        tfirst = findViewById(R.id.tfirst);
        tsecond = findViewById(R.id.tsecond);
        tthird = findViewById(R.id.tthird);
        auxtext = findViewById(R.id.auxText);

        final GameController myController = new GameController();

        ffirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myController.play(1, 1);
            }
        });

        fsecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myController.play(1,2);
            }
        });

        fthird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myController.play(1,3);
            }
        });

        sfirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myController.play(2,1);
            }
        });

        ssecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myController.play(2,2);
            }
        });

        sthird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myController.play(2,3);
            }
        });

        tfirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myController.play(3,1);
            }
        });

        tsecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myController.play(3,2);
            }
        });

        tthird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myController.play(3,3);
            }
        });
    }
}
