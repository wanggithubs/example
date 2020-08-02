package singleton;
/*
* 饱汉式
* 线程是安全
*
* 枚举类实现
*
*
* */
enum Singleton7 {
    INSTANCE;
    void print(){
        System.out.println("枚举类实现单例模式");
    }

}
