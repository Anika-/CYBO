package com.cybo.elementos;

/**
 * Created by Ana on 2016-05-27.
 */
public class Player {

    public int conscience;
    public int offense;
    public float heat;
    public Hand playerHand;
    public int position;


    public int getConscience() {
        return conscience;
    }

    public void setConscience(int conscience) {
        this.conscience = conscience;
    }

    public int getOffense() {
        return offense;
    }

    public void setOffense(int offense) {
        this.offense = offense;
    }

    public float getHeat() {
        return heat;
    }

    public void setHeat(float heat) {
        this.heat = heat;
    }

    public Hand getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(Hand playerHand) {
        this.playerHand = playerHand;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
