package singleton;
/*
* 饱汉式
* 线程是安全
*
* 但是这个会影响效率
* */
public class Singleton4 {
    private Singleton4(){

    }
    //静态式变量
    private static Singleton4 instance;

    //获取对象的方法
    public static synchronized  Singleton4 getInstance(){
        instance  = new Singleton4();
        return instance;
    }

}
