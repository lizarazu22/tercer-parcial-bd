package ejercicio2;

public class CuadraGasolinaEspecial implements IEmpresaCuadras{
    int combustible = 10;
    @Override
    public int estadoCombustible() {
        return this.combustible;
    }

    @Override
    public void llenarCombustible() {
        this.combustible = (int) (Math.random()*(50+1));
        System.out.println("El estado del combustible es :" + estadoCombustible());
    }
}
