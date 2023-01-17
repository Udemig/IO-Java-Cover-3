package writerReaderAll;

import common.Utils;

import java.io.*;

public class StringWriterReaderExample {
    public void write(){
        StringWriter stringWriter = new StringWriter();
        char[] arr = new char[512];
        try{
            FileInputStream inputStream = new FileInputStream(Utils.ADDRESS);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
            int i;
            while ((i=bufferedReader.read(arr)) != -1){

                stringWriter.write(arr,0,i);
            }
            System.out.println(stringWriter.toString());
            stringWriter.close();
            bufferedReader.close();
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void read(){
        String name = "can";
        StringReader stringReader = new StringReader(name);
        int i = 0;
        try {
            while((i=stringReader.read()) != -1){
                System.out.println((char) i);
            }
        } catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
