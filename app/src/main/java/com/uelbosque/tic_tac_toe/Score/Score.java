package com.uelbosque.tic_tac_toe.Score;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.uelbosque.tic_tac_toe.R;

/**
 * Created by RAFAEL on 27/11/2017.
 */

public class Score extends AppCompatActivity
{
    Button btn_single,btn_multiplayer,btn_bluetooth;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score_window);

    }


    public void initComponents()
    {
        btn_single = (Button)findViewById(R.id.btn_single);
        btn_multiplayer = (Button)findViewById(R.id.btn_multiplayer);
        btn_bluetooth = (Button)findViewById(R.id.btn_bluetooth);


    }
}
