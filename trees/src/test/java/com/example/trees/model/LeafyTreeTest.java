package com.example.trees.model;

import com.example.trees.model.Trees.LeafyTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeafyTreeTest {
    
    @Test
    public void shouldCreateLeafyTree() {
        //given
        LeafyTree testLeafyTree = new LeafyTree(1L, null, false, 50, false);
        
        //then
        assertEquals(50, testLeafyTree.getOverallTreeHeight());
    }


    @Test
    public void shouldGrowTree() {
        //given
        LeafyTree testLeafyTree = new LeafyTree(1L, null, false, 50, true);

        //when
        testLeafyTree.grow();

        //then
        assertEquals(53, testLeafyTree.getOverallTreeHeight());
    }

    @Test
    public void shouldHealTree() {
        //given
        LeafyTree testLeafyTree = new LeafyTree(1L, null, true, 50, true);

        //when
        testLeafyTree.healTree();

        //then
        assertFalse(testLeafyTree.isSick());
    }

    @Test
    public void shouldPoisonTree() {
        //given
        LeafyTree testLeafyTree = new LeafyTree(1L, null, false, 50, true);

        //when
        testLeafyTree.poisonTree();

        //then
        assertTrue(testLeafyTree.isSick());
    }

    @Test
    public void shouldThrowException() {
        assertThrows(AssertionError.class,
                () -> new LeafyTree(1L, null, false, -5, true));
    }
}