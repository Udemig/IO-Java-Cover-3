package writerReaderAll;

import common.Utils;

import java.io.*;

public class OutputInputStreamWriterExample {
    public void write(){
        try{
            OutputStream outputStream = new FileOutputStream(Utils.ADDRESS);
            Writer writer = new OutputStreamWriter(outputStream);
            writer.write("Merhaba ben OutputStreamWriterExample");
            writer.close();

        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void read(){
       try{
           InputStream stream = new FileInputStream(Utils.ADDRESS);
           Reader reader = new InputStreamReader(stream);
           int data = reader.read();
           while (data != -1){
               System.out.println((char) data);
               data = reader.read();
           }
       }catch (IOException e){
           System.out.println(e.getLocalizedMessage());
       }
    }
}
