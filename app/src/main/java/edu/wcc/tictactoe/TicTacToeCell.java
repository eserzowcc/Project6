package edu.wcc.tictactoe;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import edu.wcc.tictactoe.business.PlayerType;

/**
 * Created by venus on 4/9/18.
 */

public class TicTacToeCell extends View {
    private static final String TAG=TicTacToeCell.class.toString();

    // You are going to want to keep track of the player type
    // Put something here

    public TicTacToeCell(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    // For purposes of this example we are hard coding the height and width...
    // The final project is intended to be relatively simple and an exploration of drawing
    // onto a view
    @Override
    public void onMeasure( int width, int height ) {
        // Don't change this
        setMeasuredDimension(200, 200 );
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // I would strongly suggest using the example from class to see how to draw on the canvas
        // use paint -- what you need to do is very similar to class

        // Get the dimensions of the Canvas

        // Set paint to black

        // Draw a square around the border of the canvas


        // Draw an O if the player is an O

        // Draw an X if the player is an X

    }

    public void setPosition(PlayerType myPlayer) {
        // Look at where set position is called from and noticed what is passed in.  Save it

        // Now... how do you get the cell to redraw
    }
}
