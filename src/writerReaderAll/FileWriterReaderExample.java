package writerReaderAll;

import common.Utils;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderExample {

    public void write(){
        try{
            FileWriter fileWriter = new FileWriter(Utils.ADDRESS);
            fileWriter.write("Ahmey bey");
            fileWriter.close();
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void read(){
        try{
            FileReader fileReader = new FileReader(Utils.ADDRESS);
            int i;
            while ((i = fileReader.read()) != -1)
                System.out.println((char) i);
            fileReader.close();
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
