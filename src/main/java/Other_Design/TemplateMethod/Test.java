package Other_Design.TemplateMethod;

/**
 * 所谓模板方法模式，就是预先定义一个算法的骨架，将实现算法的步骤延迟到子类中，
 * 使得可以在不改变算法结构情况下，重新定义算法过程
 */
public class Test {
    public static void main(String[] args) {
        Worker aa = new IT("小王");
        Worker bb = new HR("狗叼");
        aa.workSave();
        bb.workSave();
    }


}
