package writerReaderAll;

import common.Utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamExample {

    public void print(){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(Utils.ADDRESS);
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.println("Merhaba");
            printStream.println("2023");
            printStream.close();
            fileOutputStream.close();
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
