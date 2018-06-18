package com.uelbosque.tic_tac_toe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


import com.uelbosque.tic_tac_toe.Bluetooth.Bluetooth;
import com.uelbosque.tic_tac_toe.Multiplayer.Multiplayer;
import com.uelbosque.tic_tac_toe.Score.Score;
import com.uelbosque.tic_tac_toe.Single.Single;

/**
 * Created by RAFAEL on 25/11/2017.
 */

public class MainActivity extends AppCompatActivity
{

    Button btn_Single,btn_Multiplayer,btn_Bluetooth,btn_Scores;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initComponents();


    }

    public void initComponents()
    {

        this.btn_Single = (Button) findViewById(R.id.btn_Single);
        this.btn_Multiplayer = (Button) findViewById(R.id.btn_Multiplayer);
        this.btn_Bluetooth = (Button) findViewById(R.id.btn_Bluetooth);
        this.btn_Scores = (Button) findViewById(R.id.btn_Scores);

        btn_Single.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(MainActivity.this, Single.class);
                startActivity(i);


            }
        });

        btn_Multiplayer.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(MainActivity.this, Multiplayer.class);
                startActivity(i);


            }
        });


        btn_Scores.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(MainActivity.this,Score.class);
                startActivity(i);

            }
        });



        btn_Bluetooth.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                Intent i = new Intent(MainActivity.this, Bluetooth.class);
                startActivity(i);



            }
        });


    }


}
