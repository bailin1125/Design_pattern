package HeadFirst_Design.XingbaZi.MyOwnIo;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 实现我们自己的io包，来保证将每个大写改为小写
 */
public class MyOwnIo extends FilterInputStream {
    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    protected MyOwnIo(InputStream in) {
        super(in);
    }
    /**
     * 实现两个read方法，分别针对字节和字节数组
     */
    @Override
    public int read() throws IOException{
        int c=super.read();
        return (c==-1?c:Character.toLowerCase((char)c));
    }

    @Override
    public int read(byte[]b,int offset,int len) throws IOException{
        int result=super.read(b,offset,len);
        for(int i=offset;i<offset+result;i++){
            b[i]=(byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }

}
