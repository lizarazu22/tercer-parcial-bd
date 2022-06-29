package ejercicio5;

public class Client {

    public static void main(String[] args) {
        Marcas marcas = null;

        ICelular celular = new Celular(marcas.Samsung, 1200, 6, 16,"AMD");
        celular = new Carcasa(celular, 150);
        celular = new VidrioTemplado(celular, 60);
        celular = new MemoriaExterna(celular, 40, 16);

        celular.operation();
        System.out.println();
        System.out.println("******************************************");
        System.out.println("Precio final: " + celular.getPrecioTotal() + " Almacenamiento final: " + celular.getAlmacenamientoTotal());
    }

}
