package Other_Design.State;

/**
 * 测试服务类
 */
public class test {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(10);

        machine.insertMoney();

        machine.backMoney();


        System.out.println("----我要中奖----");


        machine.insertMoney();

        machine.turnChunk();

        machine.insertMoney();

        machine.turnChunk();

        machine.insertMoney();

        machine.turnChunk();

        machine.insertMoney();

        machine.turnChunk();

        machine.insertMoney();

        machine.turnChunk();

        machine.insertMoney();

        machine.turnChunk();

        machine.insertMoney();

        machine.turnChunk();


        System.out.println("-------压力测试------");


        machine.insertMoney();

        machine.backMoney();

        machine.backMoney();

        machine.turnChunk();// 无效操作

        machine.turnChunk();// 无效操作

        machine.backMoney();
    }

}
