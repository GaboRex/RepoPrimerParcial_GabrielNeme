package EjerciciosExamen.E3;

public class Tv implements IArtefacto{
    private int precio;

    public Tv(int precio) {
        this.precio = precio;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Creando Tv ");
        System.out.println("Su precio es de: " +precio);
        System.out.println("Gracias por su compra:)");
    }
}
