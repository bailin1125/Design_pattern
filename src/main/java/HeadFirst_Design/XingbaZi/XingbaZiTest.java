package HeadFirst_Design.XingbaZi;

import HeadFirst_Design.XingbaZi.Decroter.Mocha;
import HeadFirst_Design.XingbaZi.Decroter.Soy;
import HeadFirst_Design.XingbaZi.Decroter.Whip;
import HeadFirst_Design.XingbaZi.Drink.Espresso;
import HeadFirst_Design.XingbaZi.Drink.HouseBlend;

/**
 * 测试调用一下我们设计得咖啡模式
 */
public class XingbaZiTest {
    public static void main(String[] args) {
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        /**
         * 然后是添加一些作料，看看多少钱
         */
        Beverage beverage1=new Espresso();
        Beverage beverage2=new Mocha(beverage1);
        Beverage beverage3=new Mocha(beverage2);
        System.out.println(beverage3.getDescription()+" $"+beverage3.cost());

        /**
         * 最后我们继续测试一些新鲜玩意
         */
        Beverage beverage4=new HouseBlend();
        Beverage beverage5=new Soy(beverage4);
        Beverage beverage6=new Mocha(beverage5);
        Beverage beverage7=new Whip(beverage6);
        System.out.println(beverage7.getDescription()+" $"+beverage7.cost());
    }
}
