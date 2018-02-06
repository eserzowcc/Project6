package edu.wcc.tictactoe.business;

/**
 * Created by admin on 2/5/2018.
 */
// Starting Point
// https://github.com/eserzowcc/ConstraintLayout_TicTacToe
public class TicTacToeBoard {
    // Keeep in mind that our array starts 0!!
    private PlayerType[] rowOne={ PlayerType.U, PlayerType.U,  PlayerType.U };
    private PlayerType[] rowTwo={ PlayerType.U, PlayerType.U,  PlayerType.U  };
    private PlayerType[] rowThree={ PlayerType.U, PlayerType.U,  PlayerType.U  };

    public PlayerType getCell( int row, int column) {
        return rowOne[column];
    }

    // The boolean is the return -- whether or not the player one or not
    public boolean setCell( int row, int column, PlayerType move ) {
        if( row == 1 ) {
            rowOne[column-1]=move;
        } else if( row == 2 ) {
            rowTwo[column-1]=move;
        } else if( row == 3 ) {
            rowThree[column-1]=move;
        }
        return isWinner();
    }

    private boolean isWinner( ) {
        if( rowOne[0] != PlayerType.U && rowOne[0] == rowOne[1] &&
                rowOne[1] == rowOne[2]) {
            return true;
        }

        return false;
    }

    public String toString( ) {
        return rowOne[0].toString()+rowOne[1].toString()+rowOne[2].toString()+"\r\n"+
                rowTwo[0].toString()+rowTwo[1].toString()+rowTwo[2].toString()+"\r\n"+
                rowThree[0].toString()+rowThree[1].toString()+rowThree[2].toString();

    }
}
