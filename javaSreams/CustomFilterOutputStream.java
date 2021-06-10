package javaSreams;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CustomFilterOutputStream extends FilterOutputStream {

    public CustomFilterOutputStream(OutputStream out) {
        super(out);
    }

    @Override
    public void write(int b) throws IOException {
        if (b>=48&&b<=57)
        super.write(b);
        else super.write(63); // 63='?'
    }


    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        for (int i = off; i <off+len ; i++) {
            super.write(b[i]);
        }

    }
}
