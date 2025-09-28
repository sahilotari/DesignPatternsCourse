package org.sahilo.SOLIDPrinciples.LSP.GoodCode;

public class Main {

    public static void readAnyFile(ReadableFile file) {
        file.read();
    }

    public static void main(String[] args) {
        ReadableFile readableFile = new ReadOnlyFile();
        readableFile.read();
       // readableFile.write()   : this operation is not supported now


        WritableFile writableFile = new WritableFile();
        writableFile.read();
        writableFile.write();


        //This is possible because we created base class Readable file which is extended by ReadOnlyFile and WriteableFile
        readAnyFile(readableFile);
        readAnyFile(writableFile);
    }
}
