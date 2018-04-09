package edu.wcc.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import edu.wcc.tictactoe.business.PlayerType;
import edu.wcc.tictactoe.business.TicTacToeBoard;
import edu.wcc.tictactoe.TicTacToeCell;

public class TicTacToeActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG=TicTacToeActivity.class.toString();
    private TicTacToeBoard myBoard = new TicTacToeBoard();
    // Either x turn or o turn
    private boolean xTurn=false;
    private int[] cellButtons = { R.id.button11, R.id.button12, R.id.button13,
        R.id.button21, R.id.button22, R.id.button23,
        R.id.button31, R.id.button32, R.id.button33 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
        TicTacToeCell button11=(TicTacToeCell)findViewById(R.id.button11);
        button11.setOnClickListener(this);
        for( int counter=0; counter<cellButtons.length; counter++ ) {
            TicTacToeCell currentButton = (TicTacToeCell)findViewById(cellButtons[counter]);
            currentButton.setOnClickListener(this);
        }
    }

    // Set a tag in the view..
    @Override
    public void onClick(View view) {
        TicTacToeCell myButton=(TicTacToeCell)view;
       PlayerType myTurn=PlayerType.O;
       if( xTurn ) {
           myTurn=PlayerType.X;
           xTurn=false;
           myButton.setPosition(PlayerType.X);
       } else { // This is when it's O's turn
           myButton.setPosition(PlayerType.O);
           xTurn=true;
       }

       String rowColumnTag=(String)view.getTag();
       int row = Integer.parseInt(rowColumnTag.substring(0, 1));
       int column = Integer.parseInt(rowColumnTag.substring(1, 2));
       boolean isWinner=myBoard.setCell(row, column, myTurn);

       Log.i( TAG, myBoard.toString() );

       EditText myStatus=(EditText)findViewById(R.id.editText_status);

        String turn="It's ";
        if( xTurn ) {
            turn+="X";
        } else { turn+="O"; }
        turn+=" turn";
        if( isWinner ) {
            myStatus.setText( "Winner? " + isWinner );
        } else {
            myStatus.setText( turn);
        }
    }
}
