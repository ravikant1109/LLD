package main.java.StructuralPatterns.compositepattern.designfilestructure;

public class File implements FileStructure{
    String fileName;

    public File(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void ls() {
        System.out.println("This is file :" + fileName);
    }
}
