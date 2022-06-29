package ejercicio2;

public class AdaptorCuadraElectrica implements IEmpresaCuadras{
    private CaudraElectrica adaptee;

    public AdaptorCuadraElectrica(CaudraElectrica adaptee){
        this.adaptee=adaptee;
    }

    @Override
    public int estadoCombustible() {
        return this.adaptee.estadoElectricidad();
    }

    @Override
    public void llenarCombustible() {
        this.adaptee.setCarga(10);
        this.adaptee.cargar();
    }
}
