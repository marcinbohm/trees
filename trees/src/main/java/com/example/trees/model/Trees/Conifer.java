package com.example.trees.model.Trees;

import com.example.trees.model.TreeElements.Trunk;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Conifer extends Tree {

    private static final Logger logger = LogManager.getLogger(Conifer.class);

    private boolean isShedingNeedlesForTheWinter;

    public Conifer(Long id, Trunk treeTrunk, boolean isSick, Integer overallTreeHeight, boolean isShedingNeedles) {
        if (overallTreeHeight <= 0) {
            logger.error("Conifer has been not created, overall tree height was not positive number");
            throw new AssertionError();
        }

        this.id = id;
        this.isSick = isSick;
        this.treeTrunk = treeTrunk;
        this.overallTreeHeight = overallTreeHeight;
        this.isShedingNeedlesForTheWinter = isShedingNeedles;
        logger.info("Conifer has been created");
    }

    public Conifer() {
        logger.info("Conifer has been created with no args");
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
        setOverallTreeHeight(overallTreeHeight + 5);
        logger.info("Conifer with id " + id + " have now " + overallTreeHeight + " height");
    }

    public boolean isShedingNeedlesForTheWinter() {
        return isShedingNeedlesForTheWinter;
    }

    public void setShedingNeedlesForTheWinter(boolean shedingNeedlesForTheWinter) {
        isShedingNeedlesForTheWinter = shedingNeedlesForTheWinter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conifer)) return false;
        if (!super.equals(o)) return false;
        Conifer conifer = (Conifer) o;
        return isShedingNeedlesForTheWinter == conifer.isShedingNeedlesForTheWinter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isShedingNeedlesForTheWinter);
    }

    @Override
    public String toString() {
        return "Conifer{" +
                "isShedingNeedlesForTheWinter=" + isShedingNeedlesForTheWinter +
                ", id=" + id +
                ", treeTrunk=" + treeTrunk +
                ", isSick=" + isSick +
                ", overallTreeHeight=" + overallTreeHeight +
                '}';
    }
}
