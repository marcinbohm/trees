package com.example.trees.model.TreeElements;

import com.example.trees.model.Trees.Tree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Objects;

public class Trunk {

    private static final Logger logger = LogManager.getLogger(Trunk.class);

    private Long id;

    private List<Branch> trunkBranches;

    private Integer trunkWidth;

    private Integer trunkHeight;

    private Tree trunkTree;

    public Trunk(Long id, List<Branch> trunkBranches, Integer trunkWidth, Integer trunkHeight, Tree trunkTree) {
        if (trunkHeight <= 0 || trunkWidth <= 0) {
            logger.error("Trunk has been not created, height or width was not positive numbers");
            throw new AssertionError();
        }
        this.id = id;
        this.trunkBranches = trunkBranches;
        this.trunkWidth = trunkWidth;
        this.trunkHeight = trunkHeight;
        this.trunkTree = trunkTree;
        logger.info("Trunk has been created");
    }

    public Trunk() {
        logger.info("Trunk has been created with no args");
    }

    public List<Branch> getTrunkBranches() {
        return trunkBranches;
    }

    public void addTrunkBranch(Branch trunkBranch) {
        trunkBranch.setBranchTrunk(this);
        trunkBranches.add(trunkBranch);
    }

    public Integer getTrunkWidth() {
        return trunkWidth;
    }

    public void setTrunkWidth(Integer trunkWidth) {
        this.trunkWidth = trunkWidth;
    }

    public Integer getTrunkHeight() {
        return trunkHeight;
    }

    public void setTrunkHeight(Integer trunkHeight) {
        this.trunkHeight = trunkHeight;
    }

    public Tree getTrunkTree() {
        return trunkTree;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTrunkBranches(List<Branch> trunkBranches) {
        this.trunkBranches = trunkBranches;
    }

    public void setTrunkTree(Tree trunkTree) {
        this.trunkTree = trunkTree;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trunk)) return false;
        Trunk trunk = (Trunk) o;
        return Objects.equals(id, trunk.id) && Objects.equals(trunkBranches, trunk.trunkBranches) && Objects.equals(trunkWidth, trunk.trunkWidth) && Objects.equals(trunkHeight, trunk.trunkHeight) && Objects.equals(trunkTree, trunk.trunkTree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, trunkBranches, trunkWidth, trunkHeight, trunkTree);
    }

    @Override
    public String toString() {
        return "Trunk{" +
                "id=" + id +
                ", trunkBranches=" + trunkBranches +
                ", trunkWidth=" + trunkWidth +
                ", trunkHeight=" + trunkHeight +
                ", trunkTree=" + trunkTree +
                '}';
    }
}
