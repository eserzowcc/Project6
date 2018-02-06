package edu.wcc.tictactoe.business;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by admin on 2/5/2018.
 */
public class TicTacToeBoardTest {
    @Test
    public void unitTestGetCellCheck() throws Exception {
        TicTacToeBoard myBoard=new TicTacToeBoard();
        myBoard.setCell(1, 1, PlayerType.O );

        PlayerType workingPlayer=myBoard.getCell(1,1);
        assertEquals(PlayerType.O.toString(), workingPlayer.toString());
    }

}