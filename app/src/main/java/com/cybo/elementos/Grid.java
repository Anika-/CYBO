package com.cybo.elementos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Ana on 2016-05-27.
 */
public class Grid {
    //testing whether its easier deal with matrices or lists

    public ArrayList<Integer> positions = new ArrayList<>();
    public Map<Integer,ArrayList<Carta>> gameBoard;
    public Map<Integer,Carta> tabletop;

    /** Creates an ArrayList with all the grid positions, they are listed as integer numbers starting
     *  from the top left position (11,12,13 and so on).
     * @param max_rows the grid's row number.
     * @param max_columns the grid's column number.
     *
     *
     * */
    public ArrayList<Integer> createGrid(int max_rows, int max_columns) {
        for(int i=1; i<=max_rows; i++){
            for(int j=1; j<=max_columns; j++){
                    positions.add((i*10)+j);
            }
        }
        return positions;
    }


    public Carta getTopCardAt(int position){
        return this.tabletop.get(position);
    }

    public ArrayList<Integer> getPositions() {
        return positions;
    }

    public void setPositions(ArrayList<Integer> positions) {
        this.positions = positions;
    }

    public ArrayList<Carta> getTopCards() {
        return topCards;
    }

    public void setTopCards(ArrayList<Carta> topCards) {
        this.topCards = topCards;
    }

    public Map<Integer,Carta> getTabletop(){
        for (Integer position:positions) {
            if (gameBoard.containsKey(position)){
                ArrayList<Carta> cards = gameBoard.get(position);
                Carta c = cards.get(cards.size() - 1);
                this.tabletop.put(position,c);
            }
        }
        return tabletop;
    }

    public Map<Integer,Carta> setTabletop(Map<Integer,Carta> newTop){
        this.tabletop = newTop;
    }

}
