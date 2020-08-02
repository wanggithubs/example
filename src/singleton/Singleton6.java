package singleton;
/*
* 饱汉式
* 线程是安全
*
* 静态内部类
*
*
* */
public class Singleton6 {
    private Singleton6(){

    }

    private static class SingleStatic{
        private static final Singleton6 instance = new Singleton6();
    }

    public static Singleton6 getInstance(){
        return SingleStatic.instance;
    }
}
