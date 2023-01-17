package writerReaderAll;

import common.Utils;

import java.io.*;

public class BufferedWriterReaderExample {

    public void write(){
        try{
            FileWriter fileWriter = new FileWriter(Utils.ADDRESS);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("selam ayse");
            bufferedWriter.close();
        } catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void read(){
        try{
            FileReader fileReader = new FileReader(Utils.ADDRESS);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int i;
            while ((i = bufferedReader.read()) != -1){
                System.out.println((char)i);
            }
            bufferedReader.close();
            fileReader.close();
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void readByLine(){
        try{
            FileReader fileReader = new FileReader(Utils.ADDRESS);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String content = bufferedReader.readLine();
            System.out.println(content);
            bufferedReader.close();
            fileReader.close();
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }

    }


    public void readAllLines(){
        try{
            FileReader fileReader = new FileReader(Utils.ADDRESS);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String content = "";
            while (!content.equals("dur")){
                content = bufferedReader.readLine();
                System.out.println(content);
            }
            bufferedReader.close();
            fileReader.close();
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
