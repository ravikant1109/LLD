package main.java.StructuralPatterns.compositepattern.designfilestructure;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("Movies");
        FileStructure file1 = new File("Border");
        FileStructure file2 = new File("Hulchul");
        Directory directory2 = new Directory("Comedy");
        directory.add(file1);
        directory.add(directory2);
        directory2.add(file2);
        directory.ls();
    }
}
