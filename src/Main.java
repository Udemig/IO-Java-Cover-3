import writerReaderAll.*;

public class Main {

    public static void main(String[] args) {
        /* Writer - Abstract
        WriterReaderExample writerReaderExample = new WriterReaderExample();
        // writerReaderExample.write();
        writerReaderExample.read();

        FileWriterReaderExample fileWriterReaderExample = new FileWriterReaderExample();
        // fileWriterReaderExample.write();
        fileWriterReaderExample.read();

        BufferedWriterReaderExample bufferedWriterReaderExample = new BufferedWriterReaderExample();
        // bufferedWriterReaderExample.write();
        // bufferedWriterReaderExample.read();
        // bufferedWriterReaderExample.readByLine();
        bufferedWriterReaderExample.readAllLines();


        CharArrayWriterReaderExample reader = new CharArrayWriterReaderExample();
       // reader.read();
        reader.write();

        PrintStreamExample printStreamExample = new PrintStreamExample();
        printStreamExample.print();


        OutputInputStreamWriterExample outputStreamWriter = new OutputInputStreamWriterExample();
        //outputStreamWriter.write();
        outputStreamWriter.read();



        PushBackReaderInputStreamExample pushBackReaderInputStreamExample = new PushBackReaderInputStreamExample();
        pushBackReaderInputStreamExample.read();

        StringWriterReaderExample stringWriterReaderExample = new StringWriterReaderExample();
       // stringWriterReaderExample.write();
        stringWriterReaderExample.read();
           */

        PipedWriterReaderExample pipedWriterReaderExample = new PipedWriterReaderExample();
        pipedWriterReaderExample.writeAndRead();

    }
}