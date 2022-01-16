package com.example.trees.model;

import com.example.trees.model.Trees.Conifer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConiferTest {

    @Test
    public void shouldCreateConifer() {
        //given
        Conifer testConifer = new Conifer(1L, null, false, 50, true);

        //then
        assertFalse(testConifer.isSick());
    }

    @Test
    public void shouldGrowTree() {
        //given
        Conifer testConifer = new Conifer(1L, null, false, 50, true);

        //when
        testConifer.grow();

        //then
        assertEquals(55, testConifer.getOverallTreeHeight());
    }

    @Test
    public void shouldHealTree() {
        //given
        Conifer testConifer = new Conifer(1L, null, true, 50, true);

        //when
        testConifer.healTree();

        //then
        assertFalse(testConifer.isSick());
    }

    @Test
    public void shouldPoisonTree() {
        //given
        Conifer testConifer = new Conifer(1L, null, false, 50, true);

        //when
        testConifer.poisonTree();

        //then
        assertTrue(testConifer.isSick());
    }

    @Test
    public void shouldThrowException() {
        assertThrows(AssertionError.class,
                () -> new Conifer(1L, null, false, -5, true));
    }
}