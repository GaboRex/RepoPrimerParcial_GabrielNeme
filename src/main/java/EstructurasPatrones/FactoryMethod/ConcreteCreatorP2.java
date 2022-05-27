package EstructurasPatrones.FactoryMethod;

public class ConcreteCreatorP2 extends Creator {
    //Puede tener más lógica

    @Override
    public ConcreteProduct2 factoryMethodProduct() {
        ConcreteProduct2 product = new ConcreteProduct2();
        // Llenar / Instancias de objetos / Agregación / Lógica de creación
        return product;
    }
}
