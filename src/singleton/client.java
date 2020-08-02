package singleton;

public class client {

    public static void main(String[] args) {

       /* Singleton instance1 = Singleton.getInstance();
        Singleton instance = Singleton.getInstance();
        System.out.println(instance == instance1);*/


        /*Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance = Singleton2.getInstance();
        System.out.println(instance == instance1);*/

        /*Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance = Singleton3.getInstance();
        System.out.println(instance == instance1);*/

       /* Singleton7 singleton7 = Singleton7.INSTANCE;
        Singleton7 singleton8 = Singleton7.INSTANCE;
        System.out.println(singleton7 == singleton8);*/

        Singleton6 singleton7 = Singleton6.getInstance();
        Singleton6 singleton8 = Singleton6.getInstance();
        System.out.println(singleton7 == singleton8);
    }
}
