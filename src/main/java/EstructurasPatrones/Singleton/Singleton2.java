package EstructurasPatrones.Singleton;

import java.util.Date;

public class Singleton2 {
    private static final Singleton2 instance= new Singleton2();

    private Singleton2(){
        System.out.println("*-*-* Creando mi singleton2 .....");
    }

    public static Singleton2 getInstance(){
        return instance;
    }
    public void time(){
        System.out.println("time: "+new Date());
    }
}
