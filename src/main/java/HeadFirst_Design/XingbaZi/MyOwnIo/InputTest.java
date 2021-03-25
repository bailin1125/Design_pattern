package HeadFirst_Design.XingbaZi.MyOwnIo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 测试一下我们的输入流
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try{
            InputStream inputStream=new MyOwnIo(
                    new BufferedInputStream(
                            new FileInputStream("D:\\java\\Design_pattern\\input\\LowerCase.txt")));
            while((c=inputStream.read())>=0){
                System.out.print((char)c);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
