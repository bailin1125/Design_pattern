package HeadFirst_Design.WeatherData.DevialAndAngel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 一个简单的小程序，娱乐自己一下
 */
public class DevilAndAngel {
    private JFrame jFrame;

    /**
     * 启动方法
     * @param args
     */
    public static void main(String[] args) {
        DevilAndAngel devilAndAngel=new DevilAndAngel();
        devilAndAngel.proceed();
    }
    public DevilAndAngel(){}

    /**
     * 执行的方法
     */
    public void proceed(){
        jFrame=new JFrame();
        jFrame.setSize(300,300);
        JButton jButton=new JButton("我应该这样做嘛？？");
        jButton.addActionListener(new Angel());
        jButton.addActionListener(new Devial());
        jFrame.getContentPane().add(BorderLayout.CENTER,jButton);
        jFrame.setEnabled(true);
        jFrame.setVisible(true);
    }
}

class Angel implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("天使：我给你说哈，你必须得上啊！");
    }
}

class Devial implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("魔鬼：要我说哈，你还是歇息吧！");
    }
}
