package writerReaderAll;

import common.Utils;
import jdk.jshell.execution.Util;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterReaderExample {
    char[] kisiler = {'a','f','g','r','t'};
    public void read(){
        try{
            CharArrayReader reader = new CharArrayReader(kisiler);
            int i = 0;
            while ((i= reader.read()) != -1){
                char value = (char) i;
                System.out.print(value + " ");
            }
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void write(){
        try{
            CharArrayWriter writer = new CharArrayWriter();
            writer.write("merhaba CharArrayWriter");
            FileWriter fileWriter = new FileWriter(Utils.ADDRESS);
            FileWriter fileWriter1 = new FileWriter(Utils.RATE_ADDRESS);
            writer.writeTo(fileWriter);
            writer.writeTo(fileWriter1);
            fileWriter.close();
            fileWriter1.close();
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
