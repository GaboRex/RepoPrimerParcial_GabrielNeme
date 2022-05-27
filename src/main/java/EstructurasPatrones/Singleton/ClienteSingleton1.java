package EstructurasPatrones.Singleton;

public class ClienteSingleton1 {
    public static void main(String[]args){

        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();
        Singleton1 s3 = Singleton1.getInstance();

        System.out.println("singleton 1: "+s1);
        System.out.println("singleton 2: "+s2);
        System.out.println("singleton 3: "+s3);


        Singleton1.getInstance().time();
        Singleton1.getInstance().time();
        Singleton1.getInstance().time();
        Singleton1.getInstance().time();
        Singleton1.getInstance().resetSingleton();
        Singleton1.getInstance().time();
        Singleton1.getInstance().time();
        Singleton1.getInstance().time();
        Singleton1.getInstance().time();
    }
}
