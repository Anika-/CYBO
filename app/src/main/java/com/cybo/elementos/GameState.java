package com.cybo.elementos;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import java.util.Map;

/** GameState is modified after every player action.
 * Created by Ana on 2016-05-30.
 */
public class GameState {

    //Singleton to Allow global access to only one instance of gameState
    private static GameState _instance = null;
    protected GameState(){};

    public static GameState getInstance(){
        if(_instance == null){
            _instance = new GameState();
        }
        return _instance;
    }

    protected List<Player> players;
    protected Player currentPlayer;
    protected Map<Player, Hand> currentHand;
    protected Map<Player, Integer>  currentPosition;
    protected Map<Integer,Carta> tableTop;
    protected Map<Integer,ArrayList<Carta>> gameBoard;

    //TODO criar estado dos cemiterios


    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Map<Player, Hand> getCurrentHand() {
        return currentHand;
    }

    public void setCurrentHand(Map<Player, Hand> currentHand) {
        this.currentHand = currentHand;
    }

    public Map<Player, Integer> getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Map<Player, Integer> currentPosition) {
        this.currentPosition = currentPosition;
    }






}
