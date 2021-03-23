package Other_Design.TemplateMethod;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 */
@Data
@AllArgsConstructor
public abstract class Worker {
    private String name;

    /**
     * 子类需要覆盖的方法
     */
    public abstract void work();

    /**
     * 定义一个记录工作的算法结构，这个一般情况是不会改变的
     */
    public final void workSave() {
        System.out.println("开始工作啦！");
        enterCompany();
        computerOn();
        work();
        computeroff();
        exitCompany();
        System.out.println("结束工作啦！");
    }


    /**
     * 打开电脑
     */
    private void computerOn() {
        System.out.println("" + name + "：打开电脑！");
    }

    private void computeroff() {
        System.out.println("" + name + "关闭电脑！");
    }

    private void enterCompany() {
        System.out.println("" + name + ":进入公司");
    }

    private void exitCompany() {
        System.out.println("" + name + ":离开公司！");
    }

}
