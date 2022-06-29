package ejercicio2;

public class CuadraDiesel implements IEmpresaCuadras{
    int combustible = 35;
    @Override
    public int estadoCombustible() {
        return this.combustible;
    }

    @Override
    public void llenarCombustible() {
        this.combustible = (int) (Math.random()*(50+1));
        System.out.println("Estado del combustible es :" + estadoCombustible());
    }
}
