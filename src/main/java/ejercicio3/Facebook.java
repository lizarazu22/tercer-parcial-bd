package ejercicio3;

public class Facebook implements IRedSocial{
    @Override
    public void RedSocial(ISistemaInscripcion sistemaInscripcion) {
        System.out.println("Instalando Facebook");
        sistemaInscripcion.showInfo();
    }
}
