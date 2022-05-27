package EstructurasPatrones.Builder;

public class ConcreteBuilder2 extends Builder{
    @Override
    public void buildAttribute1() {
        product.setAttribute1("attribute1");
    }

    @Override
    public void buildAttribute2() {
        product.setAttribute2("attribute2");
    }

    @Override
    public void buildAttribute3() {
        product.setAttribute3("attribute3");
    }

    @Override
    public void buildAttribute4() {
        product.setAttribute4("attribute4");
    }

    @Override
    public void buildAttribute5() {
        product.setAttribute5("attribute5");
    }
}
