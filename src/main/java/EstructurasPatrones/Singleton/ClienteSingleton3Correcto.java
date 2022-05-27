package EstructurasPatrones.Singleton;

public class ClienteSingleton3Correcto {
    /*
     *  Error al usar concurrencia al llamar a singletons
     * */
    public static void main(String[]args) {


        Thread user1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton3 s1 = Singleton3.getInstance();
                s1.time();
                System.out.println("singleton 1: " + s1);
                System.out.println("singleton 1: " + s1.hashCode());
            }
        });

        Thread user2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton3 s2 = Singleton3.getInstance();
                s2.time();
                System.out.println("singleton 1: " + s2);
                System.out.println("singleton 1: " + s2.hashCode());
            }
        });


        Thread user3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton3 s3 = Singleton3.getInstance();
                s3.time();
                System.out.println("singleton 1: " + s3);
                System.out.println("singleton 1: " + s3.hashCode());
            }
        });


        user1.start();
        user2.start();
        user3.start();
    }
}
