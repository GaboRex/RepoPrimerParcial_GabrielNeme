package EstructurasPatrones.Singleton;

import java.util.Date;

public class Singleton1 {
    // 2) attribute del mismo tipo, private, static
    private static Singleton1 instance;

    // 1) constructor private
    private Singleton1(){
        System.out.println("*-*-* Creando mi singleton .....");
        //logic
    }

    // 3) method public static - para el acceso global
    public static Singleton1 getInstance(){
        // garantiza que la instancia es unica
        if (instance== null)
            instance= new Singleton1();
        return instance;
    }

    public void time(){
        System.out.println("time: "+new Date());
    }

    public void resetSingleton(){
        instance=null;
    }
}
