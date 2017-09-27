package com.wearegap.raffle;

import com.sun.media.jfxmedia.logging.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindThePrey {

    public static void main(String[] args) {
        readFile().forEach((intItems) -> {
            System.out.println(String.valueOf(intItems));
        });
    }
    
    public static List<List<String>> readFile() {
        
        final String path = "src/com/wearegap/raffle/res/";
        final String fileName = path + "HoundMaze.txt";
        
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
            
        } catch (IOException e) { Logger.logMsg(Logger.ERROR, e.toString()); }
        
        return map;
    }
    
    private static void findBoxes() {
        
    }
}