package HeadFirst_Design.AdaptorDuck;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 写一个适配枚举类和迭代器的
 * 适配器模式，需要实现目标的接口，并且持有一个旧的对象实例
 */
public class EumerationIterator implements Iterator {
    Enumeration enumeration;
    public EumerationIterator(Enumeration enumeration){
        this.enumeration=enumeration;
    }
    /**
     * 使用枚举类，但是外界看来是一个迭代器的接口
     * @return
     */
    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }
}
