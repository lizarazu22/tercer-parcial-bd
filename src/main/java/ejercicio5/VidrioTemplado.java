package ejercicio5;

public class VidrioTemplado extends Decorator{
    private String name;
    private int precio;
    private int precioTotal;
    private int almacenamientoTotal;

    public VidrioTemplado(ICelular componente, int precio) {
        super(componente);
        this.precioTotal = precio + componente.getPrecioTotal();
        this.precio = precio;
        this.almacenamientoTotal = componente.getAlmacenamientoTotal();
    }

    @Override
    public int getPrecioTotal() {
        return precioTotal;
    }

    public int getPrecio(){
        return precio;
    }

    public void operation(){
        super.operation();
        this.name = "Vidrio Templado";
        System.out.println("Agregando "+ name + " precio de: "+ this.getPrecio());
    }

    @Override
    public int getAlmacenamientoTotal() {
        return almacenamientoTotal;
    }



}
