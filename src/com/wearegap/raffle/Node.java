package com.wearegap.raffle;

import java.util.ArrayList;

import javafx.util.Pair;

public class Node {
    
    private int x, y;
    
    private boolean adjacentNodes;
    
    private final ArrayList<Node> nodes;
    private final ArrayList<Pair<Integer, Integer>> adjacents;
    
    public Node() {
        adjacentNodes = false;
        nodes = new ArrayList<>();
        adjacents = new ArrayList<>();
    }
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public boolean hasAdjacentNodes() {
        return adjacentNodes;
    }
    
    public void setAdjacentNodes(boolean adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    } 
    
    public ArrayList<Node> getNodes() {
        return nodes;
    }
    
    public void addNode(Node node) {
        this.nodes.add(node);
    }
    
    public ArrayList<Pair<Integer, Integer>> getAdjacents() {
        return adjacents;
    }
    
    public void addAdjacent(Pair<Integer, Integer> pair) {
        this.adjacents.add(pair);
    }
}