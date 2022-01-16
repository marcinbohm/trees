package com.example.trees.model.TreeElements;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BranchTest {

    @Test
    public void shouldCreateBranch() {
        //given
        Branch testBranch = new Branch(1L, 10, 20, new Trunk(1L, new ArrayList<>(), 10, 25, null));

        //then
        assertEquals(10, testBranch.getLeaves());
    }

    @Test
    public void shouldThrowException() {
        //then
        assertThrows(AssertionError.class,
                () -> new Branch(1L, -1, 20, null));
    }
}