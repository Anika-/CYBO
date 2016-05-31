package com.cybo.cartaspyro;

import org.junit.Test;

import java.util.ArrayList;

import com.cybo.elementos.Grid;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void criacaoGrid() throws Exception{
        Grid grid = new Grid();
        ArrayList lista = grid.createGrid(3,3);
        System.out.println(lista);
    }
}