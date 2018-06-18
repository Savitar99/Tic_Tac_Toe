package com.uelbosque.tic_tac_toe.Multiplayer;

import android.graphics.Color;
import android.os.Bundle;


import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.uelbosque.tic_tac_toe.R;


public class Multiplayer extends Activity
{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int turn;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiplayer);
        this.initComponents();





    }

    public void initComponents()
    {

        b1 = findViewById(R.id.one);
        b2 = findViewById(R.id.two);
        b3 = findViewById(R.id.three);
        b4 = findViewById(R.id.four);
        b5 = findViewById(R.id.five);
        b6 = findViewById(R.id.six);
        b7 = findViewById(R.id.seven);
        b8 = findViewById(R.id.eight);
        b9 = findViewById(R.id.nine);


        turn = 1;

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

             if(b1.getText().toString().equals(" "))
             {
                 if(turn==1)
                 {
                     turn=2;
                     b1.setText("X");

                 }
                 else if(turn==2)
                 {
                     turn=1;
                     b1.setText("O");

                 }

             }
                endGame();



            }
        });


        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                if(b2.getText().toString().equals(" "))
                {
                    if(turn==1)
                    {
                        turn=2;
                        b2.setText("X");

                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b2.setText("O");

                    }

                }
                endGame();


            }
        });


        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(b3.getText().toString().equals(" "))
                {
                    if(turn==1)
                    {
                        turn=2;
                        b3.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b3.setText("O");
                    }

                }
                endGame();


            }
        });


        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(b4.getText().toString().equals(" "))
                {
                    if(turn==1)
                    {
                        turn=2;
                        b4.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b4.setText("O");
                    }

                }
                endGame();


            }
        });


        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(b5.getText().toString().equals(" "))
                {
                    if(turn==1)
                    {
                        turn=2;
                        b5.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b5.setText("O");
                    }

                }
                endGame();


            }
        });


        b6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(b6.getText().toString().equals(" "))
                {
                    if(turn==1)
                    {
                        turn=2;
                        b6.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b6.setText("O");
                    }

                }
                endGame();


            }
        });


        b7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(b7.getText().toString().equals(" "))
                {
                    if(turn==1)
                    {
                        turn=2;
                        b7.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b7.setText("O");
                    }

                }
                endGame();


            }
        });


        b8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(b8.getText().toString().equals(" "))
                {
                    if(turn==1)
                    {
                        turn=2;
                        b8.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b8.setText("O");
                    }

                }
                endGame();


            }
        });


        b9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(b9.getText().toString().equals(" "))
                {
                    if(turn==1)
                    {
                        turn=2;
                        b9.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b9.setText("O");
                    }

                }
                endGame();


            }
        });



    }


    public void endGame()
    {
        String a,b,c,d,e,f,g,h,i;
        boolean end = false;

        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

        //------------------------------------------------------------------------------------------
        //Win Starting with button 1 for X
        if(a.equals(b) && a.equals(c) && a.equals("X"))
        {
            Toast.makeText(Multiplayer.this, "Winner is Player 1",Toast.LENGTH_SHORT).show();
            end = true;
            b1.setBackgroundColor(Color.GREEN);
            b1.setTextColor(Color.RED);

            b2.setBackgroundColor(Color.GREEN);
            b2.setTextColor(Color.RED);

            b3.setBackgroundColor(Color.GREEN);
            b3.setTextColor(Color.RED);

        }

        if(a.equals(e) && a.equals(i) && a.equals("X"))
        {
            Toast.makeText(Multiplayer.this, "Winner is Player 1",Toast.LENGTH_SHORT).show();
            end = true;

            b1.setBackgroundColor(Color.GREEN);
            b1.setTextColor(Color.RED);

            b9.setBackgroundColor(Color.GREEN);
            b9.setTextColor(Color.RED);

            b5.setBackgroundColor(Color.GREEN);
            b5.setTextColor(Color.RED);

        }

        if(a.equals(d) && a.equals(g) && a.equals("X"))
        {
            Toast.makeText(Multiplayer.this, "Winner is Player 1",Toast.LENGTH_SHORT).show();
            end = true;

            b1.setBackgroundColor(Color.GREEN);
            b1.setTextColor(Color.RED);

            b4.setBackgroundColor(Color.GREEN);
            b4.setTextColor(Color.RED);

            b7.setBackgroundColor(Color.GREEN);
            b7.setTextColor(Color.RED);

        }

        //Win Starting with button 1 for O
        if(a.equals(b) && a.equals(c) && a.equals("O"))
        {
            Toast.makeText(Multiplayer.this, "Winner is Player 2",Toast.LENGTH_SHORT).show();
            end = true;

            b1.setBackgroundColor(Color.GREEN);
            b1.setTextColor(Color.RED);

            b2.setBackgroundColor(Color.GREEN);
            b2.setTextColor(Color.RED);

            b3.setBackgroundColor(Color.GREEN);
            b3.setTextColor(Color.RED);
        }

        if(a.equals(e) && a.equals(i) && a.equals("O"))
        {
            Toast.makeText(Multiplayer.this, "Winner is Player 2",Toast.LENGTH_SHORT).show();
            end = true;

            b1.setBackgroundColor(Color.GREEN);
            b1.setTextColor(Color.RED);

            b9.setBackgroundColor(Color.GREEN);
            b9.setTextColor(Color.RED);

            b5.setBackgroundColor(Color.GREEN);
            b5.setTextColor(Color.RED);


        }

        if(a.equals(d) && a.equals(g) && a.equals("O"))
        {
            Toast.makeText(Multiplayer.this, "Winner is Player 2",Toast.LENGTH_SHORT).show();
            end = true;

            b1.setBackgroundColor(Color.GREEN);
            b1.setTextColor(Color.RED);

            b4.setBackgroundColor(Color.GREEN);
            b4.setTextColor(Color.RED);

            b7.setBackgroundColor(Color.GREEN);
            b7.setTextColor(Color.RED);

        }

        //------------------------------------------------------------------------------------------
        //Win Starting with button 2 for X
        if(b.equals(e) && b.equals(h) && b.equals("X"))
        {
            Toast.makeText(Multiplayer.this, "Winner is Player 1",Toast.LENGTH_SHORT).show();
            end = true;

            b2.setBackgroundColor(Color.GREEN);
            b2.setTextColor(Color.RED);

            b5.setBackgroundColor(Color.GREEN);
            b5.setTextColor(Color.RED);

            b8.setBackgroundColor(Color.GREEN);
            b8.setTextColor(Color.RED);




        }



        //Win Starting with button 2 for O
        if(b.equals(e) && b.equals(h) && b.equals("O"))
        {
            Toast.makeText(Multiplayer.this, "Winner is Player 2",Toast.LENGTH_SHORT).show();
            end = true;


            b2.setBackgroundColor(Color.GREEN);
            b2.setTextColor(Color.RED);

            b5.setBackgroundColor(Color.GREEN);
            b5.setTextColor(Color.RED);

            b8.setBackgroundColor(Color.GREEN);
            b8.setTextColor(Color.RED);

        }


        //------------------------------------------------------------------------------------------
        //Win Starting with button 3 for X
        if(c.equals(f) && c.equals(i) && c.equals("X"))
        {
            Toast.makeText(Multiplayer.this, "Winner is Player 1",Toast.LENGTH_SHORT).show();
            end = true;


            b3.setBackgroundColor(Color.GREEN);
            b3.setTextColor(Color.RED);

            b6.setBackgroundColor(Color.GREEN);
            b6.setTextColor(Color.RED);

            b9.setBackgroundColor(Color.GREEN);
            b9.setTextColor(Color.RED);

        }

        if(c.equals(e) && c.equals(g) && c.equals("X"))
        {
            Toast.makeText(Multiplayer.this, "Winner is Player 1",Toast.LENGTH_SHORT).show();
            end = true;

            b3.setBackgroundColor(Color.GREEN);
            b3.setTextColor(Color.RED);

            b5.setBackgroundColor(Color.GREEN);
            b5.setTextColor(Color.RED);

            b7.setBackgroundColor(Color.GREEN);
            b7.setTextColor(Color.RED);

        }

        //Win Starting with button 3 for O

        if(c.equals(f) && c.equals(i) && c.equals("O"))
        {
            Toast.makeText(Multiplayer.this, "Winner is Player 2",Toast.LENGTH_SHORT).show();
            end = true;

            b3.setBackgroundColor(Color.GREEN);
            b3.setTextColor(Color.RED);

            b6.setBackgroundColor(Color.GREEN);
            b6.setTextColor(Color.RED);

            b9.setBackgroundColor(Color.GREEN);
            b9.setTextColor(Color.RED);


        }

        if(c.equals(e) && c.equals(g) && c.equals("O"))
        {
            Toast.makeText(Multiplayer.this, "Winner is Player 2",Toast.LENGTH_SHORT).show();
            end = true;

            b3.setBackgroundColor(Color.GREEN);
            b3.setTextColor(Color.RED);

            b5.setBackgroundColor(Color.GREEN);
            b5.setTextColor(Color.RED);

            b7.setBackgroundColor(Color.GREEN);
            b7.setTextColor(Color.RED);

        }


        //------------------------------------------------------------------------------------------
        //Win Starting with button 4 for X


        if(d.equals(e) && d.equals(f) && d.equals("X"))
        {
            Toast.makeText(Multiplayer.this, "Winner is Player 1",Toast.LENGTH_SHORT).show();
            end = true;

            b4.setBackgroundColor(Color.GREEN);
            b4.setTextColor(Color.RED);

            b5.setBackgroundColor(Color.GREEN);
            b5.setTextColor(Color.RED);

            b6.setBackgroundColor(Color.GREEN);
            b6.setTextColor(Color.RED);

        }

        //Win Starting with button 4 for O

        if(d.equals(e) && d.equals(f) && d.equals("O"))
        {
            Toast.makeText(Multiplayer.this, "Winner is Player 2",Toast.LENGTH_SHORT).show();
            end = true;

            b4.setBackgroundColor(Color.GREEN);
            b4.setTextColor(Color.RED);

            b5.setBackgroundColor(Color.GREEN);
            b5.setTextColor(Color.RED);

            b6.setBackgroundColor(Color.GREEN);
            b6.setTextColor(Color.RED);

        }

        //------------------------------------------------------------------------------------------
        //Win Starting with button 5 for X


        if(g.equals(h) && g.equals(i) && g.equals("X"))
        {
            Toast.makeText(Multiplayer.this, "Winner is Player 1",Toast.LENGTH_SHORT).show();
            end = true;

            b8.setBackgroundColor(Color.GREEN);
            b8.setTextColor(Color.RED);

            b7.setBackgroundColor(Color.GREEN);
            b7.setTextColor(Color.RED);

            b9.setBackgroundColor(Color.GREEN);
            b9.setTextColor(Color.RED);

        }

        if(g.equals(h) && g.equals(i) && g.equals("O"))
        {
            Toast.makeText(Multiplayer.this, "Winner is Player 2",Toast.LENGTH_SHORT).show();
            end = true;

            b8.setBackgroundColor(Color.GREEN);
            b8.setTextColor(Color.RED);

            b7.setBackgroundColor(Color.GREEN);
            b7.setTextColor(Color.RED);

            b9.setBackgroundColor(Color.GREEN);
            b9.setTextColor(Color.RED);

        }



        if(end)
        {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }



    }


}



