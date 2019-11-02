package com.ProjectAssignment4.campo_p1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {

    private Set<String> uniqueWords;

    public void remove(String dataFile) throws IOException{

        String word;
        uniqueWords = new HashSet<String>();
        Scanner scnr = new Scanner (new File(dataFile));
        while(scnr.hasNext())
        {
            word = scnr.next();
            uniqueWords.add(word);
        }
        scnr.close();


    }
    public void write(String outputFile)throws IOException{

        File problem2;
        FileWriter fw;

        problem2 = new File(outputFile);

        if(problem2.exists()) {
            fw = new FileWriter(problem2);
            Iterator i = uniqueWords.iterator();

            while(i.hasNext())
            {
                String s = (String)i.next();
                fw.write(s + "\n");
            }

            fw.close();
            System.out.println("Words printed:");

        }

        else
        {

            problem2.createNewFile();
            fw = new FileWriter(problem2);
            Iterator i = uniqueWords.iterator();

            while(i.hasNext())
            {
                String s = (String)i.next();
                fw.write(s + "\n");
            }
            fw.close();
            System.out.println("Words printed:");
        }
}
}
