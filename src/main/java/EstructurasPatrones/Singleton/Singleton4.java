package EstructurasPatrones.Singleton;

import java.util.Date;

public class Singleton4 implements Cloneable {
    // 2) attribute del mismo tipo, private, static
    private static Singleton4 instance;

    // 1) constructor private
    private Singleton4(){
        System.out.println("*-*-* Creando mi singleton .....");
        //logic
    }

    // 3) method public static - para el acceso global
    public static Singleton4 getInstance(){
        // garantiza que la instancia es unica
        if (instance == null)
            instance = new Singleton4();
        return instance;
    }

    public void time(){
        System.out.println("time: "+new Date());
    }

    public void resetSingleton(){
        instance=null;
    }

    public  Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Esto es un singleron, no se puede clonar!");
    }
}
