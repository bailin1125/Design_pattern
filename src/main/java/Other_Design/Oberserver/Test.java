package Other_Design.Oberserver;

/**
 * 用来进行测试
 */
public class Test {
    public static void main(String[] args) {
        Subjectimpl subjet = new Subjectimpl();
        Oberverimpl observer1 = new Oberverimpl(subjet);
        Oberver oberver2 = new Oberverimpl(subjet);
        subjet.setMsg("消息体111");
        subjet.setMsg("消息体2");
    }


}
