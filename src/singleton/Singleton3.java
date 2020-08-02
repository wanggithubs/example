package singleton;
/*
* 饱汉式
* 线程是不安全
* */
public class Singleton3 {
    private Singleton3(){

    }
    //静态式变量
    private static Singleton3 instance;

    //获取对象的方法
    public static Singleton3 getInstance(){
        instance  = new Singleton3();
        return instance;
    }

}
