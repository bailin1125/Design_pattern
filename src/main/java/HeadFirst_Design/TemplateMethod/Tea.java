package HeadFirst_Design.TemplateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends BaseDrink{

    @Override
    void brew() {
        System.out.println("开始冲泡茶叶啦");
    }

    @Override
    void addGridents() {
        System.out.println("如果是茶叶的话，那我这边就放一些调料啦");
    }

    //在这里我们实现可选的钩子算法
    @Override
    public boolean hook(){
        String answer=null;
        System.out.println("请用户键入是否需要加调料！");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        try{
            answer=bufferedReader.readLine();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return !(answer==null||(!answer.contains("yes")));
    }
}
