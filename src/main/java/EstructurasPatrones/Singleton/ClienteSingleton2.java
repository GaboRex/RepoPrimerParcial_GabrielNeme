package EstructurasPatrones.Singleton;

public class ClienteSingleton2 {
    public static void main(String[]args){

        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();
        Singleton2 s3 = Singleton2.getInstance();

        System.out.println("singleton 1: "+s1);
        System.out.println("singleton 2: "+s2);
        System.out.println("singleton 3: "+s3);


        Singleton2.getInstance().time();
        Singleton2.getInstance().time();
        Singleton2.getInstance().time();
        Singleton2.getInstance().time();
        Singleton2.getInstance().time();
        Singleton2.getInstance().time();
        Singleton2.getInstance().time();
        Singleton2.getInstance().time();
    }
}
