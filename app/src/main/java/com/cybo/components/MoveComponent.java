package com.cybo.components;

import android.util.ArraySet;

import com.cybo.elementos.GameState;
import com.cybo.elementos.Player;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Ana on 2016-05-31.
 */
public class MoveComponent {



    /**
     * Verifies if the move is valid
     * */
    public boolean isValid(Integer targetPosition){
        GameState game = GameState.getInstance();
        Collection currentPositions = game.getCurrentPosition().values();
        int position = game.getCurrentPlayer().getPosition();


        int difference = position-targetPosition;

        if(difference == 10){ //vertical up movement

        }else if (difference == -10){ //vertical down movement

        }

                return false;
    }



}
