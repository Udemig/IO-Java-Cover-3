package writerReaderAll;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedWriterReaderExample {
    public void writeAndRead(){
        try{
            PipedReader pipedReader = new PipedReader();
            PipedWriter pipedWriter = new PipedWriter(pipedReader);
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        pipedWriter.write("Merhaba ben PipedWriterReaderExample");
                    } catch (IOException e){
                        System.out.println(e.getLocalizedMessage());
                    }
                }
            });

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        int data = pipedReader.read();
                        while (data != -1){
                            System.out.println((char) data);
                            data = pipedReader.read();
                        }
                    }catch (IOException e){
                        System.out.println(e.getLocalizedMessage());
                    }
                }
            });

            thread.start();
            thread1.start();

        } catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }

    }
}
