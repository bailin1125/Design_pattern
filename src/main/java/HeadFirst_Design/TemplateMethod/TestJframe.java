package HeadFirst_Design.TemplateMethod;

import javax.swing.*;
import java.awt.*;

/**
 *
 */
public class TestJframe extends JFrame {
    public static void main(String[] args) {
        TestJframe testJframe=new TestJframe("我的设计模式");
    }

    public TestJframe(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setVisible(true);
    }
    /**
     * 实现几个钩子
     */
    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);
        String name="Hello World!";
        graphics.drawString(name,300,300);
    }
}
