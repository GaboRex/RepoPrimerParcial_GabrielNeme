package EstructurasPatrones.Prototype;

public class Cliente {
    public static void main(String[] args){
    ConcretePrototype1 obj1 = new ConcretePrototype1();
        obj1.setAttribute1("valor 1");
        obj1.setAttribute2("valor 2");
        obj1.setAttribute3("valor 3");
        obj1.setAttribute4("valor 4");
        obj1.setAttribute5("valor 5");
        obj1.setAttribute6("valor 6");
        obj1.setAttribute7("fecha de caducidad: 9/9/2022");

        System.out.println("obj1: "+obj1.getAttribute1());
        System.out.println("obj1: "+obj1.getAttribute2());
        System.out.println("obj1: "+obj1.getAttribute3());
        System.out.println("obj1: "+obj1.getAttribute4());
        System.out.println("obj1: "+obj1.getAttribute5());
        System.out.println("obj1: "+obj1.getAttribute6());
        System.out.println("obj1: "+obj1.getAttribute7());

    // Usamos el método clone para crear un objeto
    ConcretePrototype1 obj2 = (ConcretePrototype1) obj1.clone();

        obj2.setAttribute7("fecha de caducidad: 4/4/2024");

        System.out.println("obj2: "+obj2.getAttribute1());
        System.out.println("obj2: "+obj2.getAttribute2());
        System.out.println("obj2: "+obj2.getAttribute3());
        System.out.println("obj2: "+obj2.getAttribute4());
        System.out.println("obj2: "+obj2.getAttribute5());
        System.out.println("obj2: "+obj2.getAttribute6());
        System.out.println("obj2: "+obj2.getAttribute7());

        System.out.println("obj1: "+obj1.getAttribute7());
        System.out.println("obj2: "+obj2.getAttribute7());
    }
}
