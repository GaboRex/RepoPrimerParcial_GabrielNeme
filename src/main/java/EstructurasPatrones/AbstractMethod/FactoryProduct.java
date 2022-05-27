package EstructurasPatrones.AbstractMethod;

public class FactoryProduct {
    public static IProduct make(String typeProduct){
        IProduct product;
        switch (typeProduct.toLowerCase()){
            case "product1":
                product = new ConcreteProduct1();
                break;
            case "product2":
                product = new ConcreteProduct2();
                break;
            default:
                product = new ConcreteProduct3();
                break;
        }
        return product;
    }
}
