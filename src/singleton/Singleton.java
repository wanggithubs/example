package singleton;
/*
* 饿汉式
* 静态常量的方式
*
* */
public class Singleton {


    //私有化构造方法
    private Singleton(){

    }

    //静态常量

    private static Singleton instance = new Singleton();

    //通过公共方法来获取对象

    public static Singleton getInstance(){
        return instance;
    }
}
