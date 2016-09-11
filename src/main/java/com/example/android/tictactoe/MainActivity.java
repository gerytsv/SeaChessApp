package com.example.android.tictactoe;

import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    View v;
    Button tlb, tcb, trb, mlb, mcb, mrb, blb, bcb, brb; // t, m, b for Top, Middle and Bottom
    int turn, doubleWinCase = 0; //this variable is going to help checking if there is a double win at once (ex. diagonal and vertical)
    boolean flag = false, flagForNoWinnerCase = false; //helps checking if there is a winner, otherwise the "No winnner" message will be displayed
    public int checkedCounter = 0,  //@checkedCounter - counts the number of fields checked;
                        round = 1;           // @round - counts the rounds;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar appToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(appToolbar);
        getSupportActionBar().setIcon(R.mipmap.app_icon);
        getSupportActionBar().setTitle(R.string.app_title);

        turns();


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void turns(){

        tlb = (Button) findViewById(R.id.top_left_btn);
        tcb = (Button) findViewById(R.id.top_centre_btn);
        trb = (Button) findViewById(R.id.top_right_btn);

        mlb = (Button) findViewById(R.id.middle_left_btn);
        mcb = (Button) findViewById(R.id.middle_centre_btn);
        mrb = (Button) findViewById(R.id.middle_right_btn);

        blb = (Button) findViewById(R.id.bottom_left_btn);
        bcb = (Button) findViewById(R.id.bottom_centre_btn);
        brb = (Button) findViewById(R.id.bottom_right_btn);

        //the names of the players
        EditText nameOfPlayerX = (EditText) findViewById(R.id.nameOfPlayerX);
        EditText nameOfPlayerO = (EditText) findViewById(R.id.nameOfPlayerO);


        if(round%2 == 0)    turn = 2; // game starts with player O
            else turn = 1; //game starts with player X

        //points which player's turn is with making his name BOLD
        if(turn == 1){
            nameOfPlayerX.setTypeface(null, Typeface.BOLD);
            nameOfPlayerO.setTypeface(null, Typeface.NORMAL);
        }
        if(turn == 2){
            nameOfPlayerO.setTypeface(null, Typeface.BOLD);
            nameOfPlayerX.setTypeface(null, Typeface.NORMAL);
        }

        tlb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tlb.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        tlb.setText("✗");
                        checkedCounter++;
                    } else if (turn == 2) {
                        turn = 1;
                        tlb.setText("◯");
                        checkedCounter++;
                    }
                    endRound();
                }
            }
        });
        tcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tcb.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        tcb.setText("✗");
                        checkedCounter++;
                    } else if (turn == 2) {
                        turn = 1;
                        tcb.setText("◯");
                        checkedCounter++;
                    }
                    endRound();
                }
            }
        });
        trb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (trb.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        trb.setText("✗");
                        checkedCounter++;
                    } else if (turn == 2) {
                        turn = 1;
                        trb.setText("◯");
                        checkedCounter++;
                    }
                    endRound();
                }
            }
        });

        mlb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mlb.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        mlb.setText("✗");
                        checkedCounter++;
                    } else if (turn == 2) {
                        turn = 1;
                        mlb.setText("◯");
                        checkedCounter++;
                    }
                    endRound();
                }
            }
        });
        mcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mcb.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        mcb.setText("✗");
                        checkedCounter++;
                    } else if (turn == 2) {
                        turn = 1;
                        mcb.setText("◯");
                        checkedCounter++;
                    }
                    endRound();
                }
            }
        });
        mrb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mrb.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        mrb.setText("✗");
                        checkedCounter++;
                    } else if (turn == 2) {
                        turn = 1;
                        mrb.setText("◯");
                        checkedCounter++;
                    }
                    endRound();
                }
            }
        });

        blb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (blb.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        blb.setText("✗");
                        checkedCounter++;
                    } else if (turn == 2) {
                        turn = 1;
                        blb.setText("◯");
                        checkedCounter++;
                    }
                    endRound();
                }
            }
        });
        bcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bcb.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        bcb.setText("✗");
                        checkedCounter++;
                    } else if (turn == 2) {
                        turn = 1;
                        bcb.setText("◯");
                        checkedCounter++;
                    }
                    endRound();
                }
            }
        });
        brb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (brb.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        brb.setText("✗");
                        checkedCounter++;
                    } else if (turn == 2) {
                        turn = 1;
                        brb.setText("◯");
                        checkedCounter++;
                    }
                    endRound();
                }
            }
        });

    }

    int scorePlayerX = 0; //global variables
    int scorePlayerO = 0;

    // Displays the given score for player X.
    public void displayForPlayerX(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_x_score);
        scoreView.setText(String.valueOf(score));
    }

    // Displays the given score for player O.
    public void displayForPlayerO(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_o_score);
        scoreView.setText(String.valueOf(score));
    }

    // adds one win to player X's score.
    public void addForPlayerX(View v) {
        if(scorePlayerX <= 8){
           if(doubleWinCase < 2){
                scorePlayerX += 1;
                displayForPlayerX(scorePlayerX); }
        }
        else {
            Toast.makeText(MainActivity.this, "Player X  wins this match!\n" +
                        " Score has been reseted.", Toast.LENGTH_LONG).show();
            scorePlayerO = 0;
            scorePlayerX = 0;
            displayForPlayerX(scorePlayerX);
            displayForPlayerO(scorePlayerO);
            newRound(v);
        }
    }

    // adds one win to player O's score.
    public void addForPlayerO(View v) {
        if(scorePlayerO <= 8){
            if(doubleWinCase < 2){
                scorePlayerO += 1;
                 displayForPlayerO(scorePlayerO); }
        }
        else {
            Toast.makeText(MainActivity.this, "Player O  wins this match!\n" +
                        "  Score has been reseted.", Toast.LENGTH_LONG).show();
            scorePlayerO = 0;
            scorePlayerX = 0;
            displayForPlayerX(scorePlayerX);
            displayForPlayerO(scorePlayerO);
            newRound(v);
        }
    }

    boolean gameFinished = false; //global variable

    public void win(String a, String b, String c) {
        //the names of the players
        EditText nameOfPlayerX = (EditText) findViewById(R.id.nameOfPlayerX);
        String playerNameX = (String) nameOfPlayerX.getText().toString();
        EditText nameOfPlayerO = (EditText) findViewById(R.id.nameOfPlayerO);
        String playerNameO = (String) nameOfPlayerO.getText().toString();

        flag = false; // every time the program checks if there is a winner on this row and it will be used to change the colors of the winning triad.
        if(a.equals(b) && b.equals(c)) { //or if (a == b && b == c) {
            if (a.equals("✗")) {
                if(scorePlayerX < 9 && doubleWinCase < 1)
                    if(!playerNameX.equals(""))
                    Toast.makeText(MainActivity.this, "Player " + playerNameX + " wins this round!", Toast.LENGTH_SHORT).show();
                        else Toast.makeText(MainActivity.this, "Player X wins this round!", Toast.LENGTH_SHORT).show();
                doubleWinCase++;
                gameFinished = true;
                flag = true;
                flagForNoWinnerCase = true;
                addForPlayerX(v);
            }
            else if (a.equals("◯")) {
                if(scorePlayerO < 9 && doubleWinCase < 1)
                    if(!playerNameO.equals(""))
                    Toast.makeText(MainActivity.this, "Player " + playerNameO + " wins this round!", Toast.LENGTH_SHORT).show();
                        else Toast.makeText(MainActivity.this, "Player O wins this round!", Toast.LENGTH_SHORT).show();
                doubleWinCase++;
                gameFinished = true;
                flag = true;
                flagForNoWinnerCase = true;
                addForPlayerO(v);
            }
        }

        //the buttons are being disabled when winner is found
        if (gameFinished) {
            tlb.setEnabled(false);
            tcb.setEnabled(false);
            trb.setEnabled(false);
            mlb.setEnabled(false);
            mcb.setEnabled(false);
            mrb.setEnabled(false);
            blb.setEnabled(false);
            bcb.setEnabled(false);
            brb.setEnabled(false);

            gameFinished = false; //!!!
        }

    }

    public void newRound(View v) {
        round++;
        doubleWinCase = 0;
        tlb = (Button) findViewById(R.id.top_left_btn);
        tcb = (Button) findViewById(R.id.top_centre_btn);
        trb = (Button) findViewById(R.id.top_right_btn);

        mlb = (Button) findViewById(R.id.middle_left_btn);
        mcb = (Button) findViewById(R.id.middle_centre_btn);
        mrb = (Button) findViewById(R.id.middle_right_btn);

        blb = (Button) findViewById(R.id.bottom_left_btn);
        bcb = (Button) findViewById(R.id.bottom_centre_btn);
        brb = (Button) findViewById(R.id.bottom_right_btn);

        checkedCounter = 0;
        //setting the buttons to be enabled again
        tlb.setEnabled(true);
        tcb.setEnabled(true);
        trb.setEnabled(true);
        mlb.setEnabled(true);
        mcb.setEnabled(true);
        mrb.setEnabled(true);
        blb.setEnabled(true);
        bcb.setEnabled(true);
        brb.setEnabled(true);
        //setting the color of the X-es and O-s back to normal(dark purple)
        tlb.setTextColor(Color.parseColor("#5d178f"));
        tcb.setTextColor(Color.parseColor("#5d178f"));
        trb.setTextColor(Color.parseColor("#5d178f"));
        mlb.setTextColor(Color.parseColor("#5d178f"));
        mcb.setTextColor(Color.parseColor("#5d178f"));
        mrb.setTextColor(Color.parseColor("#5d178f"));
        blb.setTextColor(Color.parseColor("#5d178f"));
        bcb.setTextColor(Color.parseColor("#5d178f"));
        brb.setTextColor(Color.parseColor("#5d178f"));
        //deleting the previous game players' moves
        tlb.setText("");
        tcb.setText("");
        trb.setText("");
        mlb.setText("");
        mcb.setText("");
        mrb.setText("");
        blb.setText("");
        bcb.setText("");
        brb.setText("");
        flag = false;
        flagForNoWinnerCase = false;
        gameFinished = false;

        turns();
    }

    public void endRound() {
        String stlb, stcb, strb, smlb, smcb, smrb, sblb, sbcb, sbrb; // s for String; t, m, b for Top, Middle and Bottom

        stlb = tlb.getText().toString();
        stcb = tcb.getText().toString();
        strb = trb.getText().toString();
        smlb = mlb.getText().toString();
        smcb = mcb.getText().toString();
        smrb = mrb.getText().toString();
        sblb = blb.getText().toString();
        sbcb = bcb.getText().toString();
        sbrb = brb.getText().toString();

        //Horizontally
        win(stlb, stcb, strb);
        if (flag) {
            tlb.setTextColor(Color.parseColor("#FFC107"));
            tcb.setTextColor(Color.parseColor("#FFC107"));
            trb.setTextColor(Color.parseColor("#FFC107"));
        }
        win(smlb, smcb, smrb);
        if (flag) {
            mlb.setTextColor(Color.parseColor("#FFC107"));
            mcb.setTextColor(Color.parseColor("#FFC107"));
            mrb.setTextColor(Color.parseColor("#FFC107"));
        }
        win(sblb, sbcb, sbrb);
            if (flag) {
            blb.setTextColor(Color.parseColor("#FFC107"));
            bcb.setTextColor(Color.parseColor("#FFC107"));
            brb.setTextColor(Color.parseColor("#FFC107"));
        }
        //Vertically
        win(stlb, smlb, sblb);
        if (flag) {
            tlb.setTextColor(Color.parseColor("#FFC107"));
            mlb.setTextColor(Color.parseColor("#FFC107"));
            blb.setTextColor(Color.parseColor("#FFC107"));
        }
        win(stcb, smcb, sbcb);
        if (flag) {
            tcb.setTextColor(Color.parseColor("#FFC107"));
            mcb.setTextColor(Color.parseColor("#FFC107"));
            bcb.setTextColor(Color.parseColor("#FFC107"));
        }
        win(strb, smrb, sbrb);
        if (flag) {
            trb.setTextColor(Color.parseColor("#FFC107"));
            mrb.setTextColor(Color.parseColor("#FFC107"));
            brb.setTextColor(Color.parseColor("#FFC107"));
        }
        //Diagonally
        win(stlb, smcb, sbrb);
        if (flag) {
            tlb.setTextColor(Color.parseColor("#FFC107"));
            mcb.setTextColor(Color.parseColor("#FFC107"));
            brb.setTextColor(Color.parseColor("#FFC107"));
        }
        win(strb, smcb, sblb);
        if (flag) {
            trb.setTextColor(Color.parseColor("#FFC107"));
            mcb.setTextColor(Color.parseColor("#FFC107"));
            blb.setTextColor(Color.parseColor("#FFC107"));
        }

        if (checkedCounter == 9 && !flagForNoWinnerCase)
            Toast.makeText(MainActivity.this, "No winner!", Toast.LENGTH_SHORT).show();
    }

    //nulls the scores.
    public void reset(View v) {
        round = 0;
        scorePlayerX = 0;
        scorePlayerO = 0;
        displayForPlayerX(0);
        displayForPlayerO(0);
        newRound(v);
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.android.tictactoe/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.android.tictactoe/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}

