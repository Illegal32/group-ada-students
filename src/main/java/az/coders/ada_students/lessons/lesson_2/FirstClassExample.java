package az.coders.ada_students.lessons.lesson_2;

import java.io.*;

public class FirstClassExample
{
    public static void main(String args[])
    {
        if(args.length < 1){
            System.out.println(" ");
            return;
        }
        String filePath = args[0];
        File rootFile = new File(filePath);
        if(!rootFile.exists()){
            System.out.println("Specified file/directory does not exist!");
        }
        recPrint(rootFile);
    }
    static void recPrint(File root){
        if(root.isFile()){
            System.out.printf("Source: %s %s\n", root.getName(), root.getAbsolutePath());
            return;
        }
        System.out.printf(">Started : (%d)  %s\n", root.list().length, root.getAbsolutePath());
        for (File subFile : root.listFiles()){
            recPrint(subFile);
        }
    }
}