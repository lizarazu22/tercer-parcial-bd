package ejercicio3;

public class Twitter implements IRedSocial{
    @Override
    public void RedSocial(ISistemaInscripcion sistemaInscripcion) {
        System.out.println(" Instalando Twitter");
        sistemaInscripcion.showInfo();
    }
}
