package ejercicio2;

public class Client {
    public static void main(String[]args){
        CaudraElectrica caudraElectrica = new CaudraElectrica();

        AdaptorCuadraElectrica cuadraElectricaAdapatada = new AdaptorCuadraElectrica(caudraElectrica);


        System.out.println("Tipo cuadra: Electrica");
        cuadraElectricaAdapatada.llenarCombustible();
        cuadraElectricaAdapatada.estadoCombustible();
    }
}
