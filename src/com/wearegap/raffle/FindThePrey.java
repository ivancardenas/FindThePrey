package com.wearegap.raffle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class FindThePrey {
    
    private static final String PATH = "src/com/wearegap/raffle/res/";
    private static final String FILENAME = PATH + "HoundMaze.txt";
    
    static final List<List<String>> MAZE = fillMaze(FILENAME);

    public static void main(String[] args) {
        
        new FindThePrey();
        
        /* fillMaze(FILENAME).forEach((items) -> {
            System.out.println(String.valueOf(items));
        }); */
    }
    
    public FindThePrey() {
        createPath();
    }

    private static List<List<String>> fillMaze(String fileName) {
        
        List<List<String>> map = new ArrayList<>();
        
        try {
            File file = new File(fileName);
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);

            String readLine;
            
            while ((readLine = br.readLine()) != null) {
                if (!readLine.trim().isEmpty()) {
                    ArrayList<String> items = new ArrayList<>();
                    String[] item = readLine.split("\t");
                    String[] finalLine = Arrays
                            .copyOfRange(item, 5, item.length);
                    
                    items.addAll(Arrays.asList(finalLine));
                    map.add(items);
                }
            }
            
            br.close();
            
        } catch (IOException e) { 
            Logger.getAnonymousLogger().log(Level.SEVERE, "Exception", e);
        }
        
        return map;
    }

    private Node createPath() {
        
        Stack stack = new Stack();
        Node rootNode = new Node();
        
        for (int i = 0; i < MAZE.size(); i++) {
            for (int j = 0; j < MAZE.get(i).size(); j++) {
                
                if (MAZE.get(i).get(j).equals("F")) {
                    /* Node node = new Node();
                    node.setX(i); node.setY(j);
                    
                    if (isThereAdjacents(i, j))
                        stack.add(node);
                    
                    rootNode.addNode(node);*/
                }
            }
        }
        
        return rootNode;
    }
    
    private boolean isThereAdjacents(int i, int j) {
        
        return false;
    }
}