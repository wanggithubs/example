package singleton;
/*
* 饱汉式
* 线程是安全
*
* 双重检验
*
* volatile 这个关键字可以防止指令重排
* */
public class Singleton5 {
    private Singleton5(){

    }
    //静态式变量
    private static volatile Singleton5 instance;

    //获取对象的方法
    public static  Singleton5 getInstance(){
        if(instance  == null){
            synchronized (Singleton5.class){
                if(instance  == null){
                    instance  = new Singleton5();
                }
            }
        }
        return instance;
    }

}
