package com.example.trees.model.Trees;

import com.example.trees.model.TreeElements.Trunk;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class LeafyTree extends Tree {

    private static final Logger logger = LogManager.getLogger(LeafyTree.class);

    private boolean havePoisoningFruits;

    public LeafyTree(Long id, Trunk treeTrunk, boolean isSick, Integer overallTreeHeight, boolean poisoningFruits) {
        if (overallTreeHeight <= 0) {
            logger.error("Leafy tree has been not created, overall tree height was not positive number");
            throw new AssertionError();
        }
        this.id = id;
        this.isSick = isSick;
        this.treeTrunk = treeTrunk;
        this.overallTreeHeight = overallTreeHeight;
        this.havePoisoningFruits = poisoningFruits;
        logger.info("Leafy tree has been created");
    }

    public LeafyTree() {
        logger.info("Leafy tree has been created with no args");
    }

    @Override
    public void poisonTree() {
        super.poisonTree();
    }

    @Override
    public void healTree() {
        super.healTree();
    }

    @Override
    public void grow() {
        setOverallTreeHeight(overallTreeHeight + 3);
        logger.info("Leafy tree with id " + id + " have now " + overallTreeHeight + " height");
    }

    public boolean isHavePoisoningFruits() {
        return havePoisoningFruits;
    }

    public void setHavePoisoningFruits(boolean havePoisoningFruits) {
        this.havePoisoningFruits = havePoisoningFruits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LeafyTree)) return false;
        if (!super.equals(o)) return false;
        LeafyTree leafyTree = (LeafyTree) o;
        return havePoisoningFruits == leafyTree.havePoisoningFruits;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), havePoisoningFruits);
    }

    @Override
    public String toString() {
        return "LeafyTree{" +
                "Id=" + id +
                "overallTreeHeight=" + overallTreeHeight +
                "treeTrunk=" + treeTrunk +
                "havePoisoningFruits=" + havePoisoningFruits +
                '}';
    }
}
