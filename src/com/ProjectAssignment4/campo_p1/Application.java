package com.ProjectAssignment4.campo_p1;

import com.ProjectAssignment4.campo_p1.DuplicateRemover;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {

        DuplicateRemover duplicateRemover = new DuplicateRemover();
        duplicateRemover.remove("problem1.txt");
        duplicateRemover.write("unique_words.txt");

    }
}
