package ejercicio1;

public class Client {

    public static void main(String[] args) {

        LaPaz laPaz = new LaPaz(60,1000,"Frio",10000);
        SantaCruz santaCruz = new SantaCruz(40, 2000, "Calido", 15000);
        Cochabamba cochabamba = new Cochabamba(10, 2000, "Templado", 10000);

        Turista turista = new Turista("Pepe",10000,9876543);

        santaCruz.Visitado(turista);
        laPaz.Visitado(turista);
        cochabamba.Visitado(turista);



    }

}
