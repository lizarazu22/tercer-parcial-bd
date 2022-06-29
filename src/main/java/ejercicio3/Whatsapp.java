package ejercicio3;

public class Whatsapp implements IRedSocial{
    @Override
    public void RedSocial(ISistemaInscripcion sistemaInscripcion) {
        System.out.println(" Instalando Whatsapp");
        sistemaInscripcion.showInfo();
    }
}
