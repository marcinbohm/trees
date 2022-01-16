package com.example.trees.model.TreeElements;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TrunkTest {

    @Test
    public void shouldCreateNewTrunk() {
        //given
        Trunk testTrunk = new Trunk(1L, new ArrayList<>(), 10, 25, null);

        //then
        assertEquals(10, testTrunk.getTrunkWidth());
    }

    @Test
    public void shouldThrowException() {
        //then
        assertThrows(AssertionError.class,
                () -> new Trunk(1L, new ArrayList<>(), -1, 25, null));
    }
}