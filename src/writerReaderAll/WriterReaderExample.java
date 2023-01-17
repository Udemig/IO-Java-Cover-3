package writerReaderAll;

import common.Utils;

import java.io.*;

public class WriterReaderExample {

    public void write(){
        try{

            Writer writer = new FileWriter(Utils.ADDRESS);
            String content = "Merhaba adim can";
            writer.write(content);
            writer.close();
        }catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void read(){
        try{
            Reader reader = new FileReader(Utils.ADDRESS);
            int data = reader.read();
            while(data != -1){
                System.out.println((char) data);
                data = reader.read();
            }
            reader.close();
        }catch(IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
