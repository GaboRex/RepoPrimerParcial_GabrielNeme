package EjerciciosExamen.E3;

public class Refrigerador implements IArtefacto{
    private int precio;

    public Refrigerador(int precio) {
        this.precio = precio;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Creando Refrigerador ");
        System.out.println("Su precio es de: " +precio);
        System.out.println("Gracias por su compra:)");
    }
}
