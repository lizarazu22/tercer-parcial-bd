package ejercicio4;

public class Servidor implements IServidor {

    @Override
    public void ingresar(String usuario, String password) {
        System.out.println("Atendiendo y guardando al usuario: " + usuario);

    }

}
