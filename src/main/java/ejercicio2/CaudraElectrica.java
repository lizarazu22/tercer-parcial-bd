package ejercicio2;

public class CaudraElectrica {
    int carga;

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int estadoElectricidad(){
        this.carga = (int) (Math.random()*(50+1));
        System.out.println("Estado del combustible es :" + carga);
        return carga;
    }

    public void cargar(){
        System.out.println("debe ser numero par: " + carga);

    }
}
