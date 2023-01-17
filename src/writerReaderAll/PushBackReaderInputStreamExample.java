package writerReaderAll;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushBackReaderInputStreamExample {
    String characters = "1£@@@@2@3©4$5@@@@@∞6§7|8[9]@@@@0≈±";

    public void read(){
        byte[] charArry = characters.getBytes();
        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(charArry);
        PushbackInputStream pushbackInputStream = new PushbackInputStream(arrayInputStream);
        int i;
        try{

            while ((i=pushbackInputStream.read()) != -1){
                if (i=='@'){
                    int j;
                    if ((j=pushbackInputStream.read()) == '@'){
                        System.out.println("*");
                    } else {
                        pushbackInputStream.unread(j);
                        System.out.println((char) j);
                    }
                } else {
                    System.out.println((char) i);
                }
            }
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
