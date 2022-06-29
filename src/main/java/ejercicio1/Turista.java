package ejercicio1;

import java.util.Random;

public class Turista implements ITurista {
    private String nombre;
    private double montoDinero;
    private int ci;

    public Turista(String nombre, double montoDinero, int ci) {
        this.nombre = nombre;
        this.montoDinero = montoDinero;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMontoDinero() {
        return montoDinero;
    }

    public void setMontoDinero(double montoDinero) {
        this.montoDinero = montoDinero;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    @Override
    public void visitar(LaPaz laPaz) {
        System.out.println("************* Visitando La Paz");
        Random rd = new Random();

        double dineroGastado=montoDinero*rd.nextDouble();
        System.out.println("Dinero Gastado "+dineroGastado);
        montoDinero-=dineroGastado;

        this.mostrarInfo();
    }

    @Override
    public void visitar(SantaCruz santaCruz) {
        System.out.println("********** Visitando Santa Cruz");

        double dineroGastado=(santaCruz.getNumeroProvincias()*0.5);

        System.out.println("Dinero Gastado "+dineroGastado);
        montoDinero-=dineroGastado;
        this.mostrarInfo();
    }


    @Override
    public void visitar(Cochabamba cochabamba) {
        System.out.println("************** Visitando Cochabamba");
        double dineroGastado=(cochabamba.getNumeroHabitantes()*0.1);
        System.out.println("Dinero Gastado "+dineroGastado);
        montoDinero-=dineroGastado;
        this.mostrarInfo();

    }
    @Override
    public void mostrarInfo() {
        System.out.println("Informacion Turista");
        System.out.println("Nombre: "+nombre);
        System.out.println("CI: "+ci);
        System.out.println("Dinero turista: "+montoDinero);
    }


}
