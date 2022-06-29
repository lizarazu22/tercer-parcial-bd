package ejercicio4;

import java.util.LinkedList;
import java.util.List;

public class Proxy implements IServidor {
    List<Usuario> usuarios;
    IServidor servidor1;
    IServidor servidor2;
    int numeroUsuarios;

    public Proxy(IServidor servidor1, IServidor servidor2) {
        usuarios = new LinkedList<Usuario>();
        this.servidor1 = servidor1;
        this.servidor2 = servidor2;
        numeroUsuarios = 0;
    }

    public void registrar(String usuario, String contrasena) {
        numeroUsuarios++;
        usuarios.add(new Usuario(numeroUsuarios, usuario, contrasena));
    }
    public boolean esPrimo(int n) {
        if(n==1) {
            return false;
        }
        if(n==2) {
            return true;
        }
        for(int i = 2; i<n;i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    @Override
    public void ingresar(String usuario, String password) {
        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(usuario)) {
                if (u.getContrasena().equals(password)) {
                    if (esPrimo(u.getId())) {
                        System.out.println("El servidor 1 esta realizando La accion");
                        servidor1.ingresar(usuario, password);
                    } else {
                        System.out.println("El servidor 2 está realizando la accion");
                        servidor2.ingresar(usuario, password);
                    }
                } else {
                    System.out.println("Contraseña incorrecta");
                }
            }
        }

    }



}