package com.example.trees.model.TreeElements;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Branch {

    private static final Logger logger = LogManager.getLogger(Branch.class);

    private Long id;

    private Integer leaves;

    private Integer branchLength;

    private Trunk branchTrunk;

    public Branch(Long id, Integer leaves, Integer branchLength, Trunk branchTrunk) {
        if (leaves <= 0 || branchLength <= 0) {
            logger.error("Branch has not been created, number of leaves or branch length was not positive number");
            throw new AssertionError();
        }
        this.id = id;
        this.leaves = leaves;
        this.branchLength = branchLength;
        this.branchTrunk = branchTrunk;
        logger.info("Branch has been created in trunk with id" + branchTrunk.getId());
    }

    public Branch() {
        logger.info("Branch has been created with no args");
    }

    public Integer getLeaves() {
        return leaves;
    }

    public void setLeaves(Integer leaves) {
        this.leaves = leaves;
    }

    public Integer getBranchLength() {
        return branchLength;
    }

    public void setBranchLength(Integer branchLength) {
        this.branchLength = branchLength;
    }

    public Trunk getBranchTrunk() {
        return branchTrunk;
    }

    public void setBranchTrunk(Trunk branchTrunk) {
        this.branchTrunk = branchTrunk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Branch)) return false;
        Branch branch = (Branch) o;
        return Objects.equals(id, branch.id) && Objects.equals(leaves, branch.leaves) && Objects.equals(branchLength, branch.branchLength) && Objects.equals(branchTrunk, branch.branchTrunk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, leaves, branchLength, branchTrunk);
    }

    @Override
    public String toString() {
        return "Branch{" +
                "id=" + id +
                ", leafs=" + leaves +
                ", branchLenght=" + branchLength +
                ", branchTrunk=" + branchTrunk +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
