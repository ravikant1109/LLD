package main.java.StructuralPatterns.compositepattern.designfilestructure;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileStructure{

    String directory;
    List<FileStructure> contains;

    public Directory(String directory){
        this.directory = directory;
        contains = new ArrayList<>();
    }

    public void add(FileStructure fileStructure){
        contains.add(fileStructure);
    }

    @Override
    public void ls() {
        System.out.println("This is directory: " + directory);
        for(FileStructure fileStructure: contains){

            fileStructure.ls();
        }
    }
}
