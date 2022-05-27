package EstructurasPatrones.Builder;

public class Director {
    private Builder builder;

    public Product getProductBuilder(){
        return builder.getProduct();
    }

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public void buildProduct(){
        this.builder.createProduct();
        this.builder.buildAttribute1();
        this.builder.buildAttribute2();
        this.builder.buildAttribute3();
        this.builder.buildAttribute4();
        this.builder.buildAttribute5();
    }
}
