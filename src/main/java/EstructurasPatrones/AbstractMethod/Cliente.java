package EstructurasPatrones.AbstractMethod;

public class Cliente {
    public static void main(String[] args) {
        myProduct(FactoryProduct.make("product1"));

        FactoryProduct.make("product2").method1();

        FactoryProduct.make("product3").method2();
    }

    public static void myProduct(IProduct product){
        product.method1();
        product.method2();
    }
}
