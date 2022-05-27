package EstructurasPatrones.FactoryMethod;

public class ConcreteCreatorP1 extends Creator {
    //Puede tener más lógica

    @Override
    public ConcreteProduct1 factoryMethodProduct() {
        ConcreteProduct1 product = new ConcreteProduct1();
        // Llenar / Instancias de objetos / Agregación / Lógica de creación
        return product;
    }
}
