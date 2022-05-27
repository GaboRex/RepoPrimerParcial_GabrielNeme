package EstructurasPatrones.Builder;

public class Cliente {
    public static void main(String[] args){
        Director director = new Director();
        ConcreteBuilder1 p1=new ConcreteBuilder1();
        ConcreteBuilder2 p2=new ConcreteBuilder2();

        director.setBuilder(p2);
        director.buildProduct();
        Product product = director.getProductBuilder();
        product.showInfo();

        Product p3 = new Product();
        p3.setAttribute1("").setAttribute5("");
        p3.setAttribute1("").setAttribute2("").setAttribute3("");
        p3.setAttribute1("").setAttribute2("").setAttribute3("").setAttribute4("");
        p3.setAttribute1("").setAttribute2("").setAttribute3("").setAttribute4("").setAttribute5("");
    }
}
