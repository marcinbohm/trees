package com.example.trees.model.Trees;

import com.example.trees.model.TreeElements.Trunk;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public abstract class Tree {

    private static final Logger logger = LogManager.getLogger(Tree.class);

    protected Long id;

    protected Trunk treeTrunk;

    protected boolean isSick;

    protected Integer overallTreeHeight;

    public Tree(Long id, Trunk treeTrunk, boolean isSick, Integer overallTreeHeight) {
        if (overallTreeHeight <= 0) {
            logger.error("Tree has been not created, overall tree height was not positive number");
            throw new AssertionError();
        }
        this.id = id;
        this.treeTrunk = treeTrunk;
        this.isSick = isSick;
        this.overallTreeHeight = overallTreeHeight;
        logger.info("Tree has been created");
    }

    public Tree() {
        logger.info("Tree has been created with no args");
    }

    public abstract void grow();

    public void poisonTree() {
        this.setSick(true);
        logger.info("Tree with id " + this.getId() + " has been poisoned");
    }

    public void healTree() {
        this.setSick(false);
        logger.info("Tree with id " + this.getId() + " has been healed");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Trunk getTreeTrunk() {
        return treeTrunk;
    }

    public void setTreeTrunk(Trunk treeTrunk) {
        this.treeTrunk = treeTrunk;
    }

    public boolean isSick() {
        return isSick;
    }

    public void setSick(boolean sick) {
        isSick = sick;
    }

    public Integer getOverallTreeHeight() {
        return overallTreeHeight;
    }

    public void setOverallTreeHeight(Integer overallTreeHeight) {
        this.overallTreeHeight = overallTreeHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tree)) return false;
        Tree tree = (Tree) o;
        return Objects.equals(id, tree.id) && Objects.equals(treeTrunk, tree.treeTrunk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, treeTrunk);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "id=" + id +
                ", treeTrunk=" + treeTrunk +
                '}';
    }
}
