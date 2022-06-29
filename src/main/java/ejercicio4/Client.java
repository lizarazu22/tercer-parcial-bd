package ejercicio4;

public class Client {

    public static void main(String[] args) {

        Proxy proxy = new Proxy(new Servidor(), new Servidor());

        proxy.registrar("Juan1", "720");
        proxy.registrar("Juan2", "467");
        proxy.registrar("Juan3", "191");
        proxy.registrar("Juan4", "111");
        proxy.registrar("Juan5", "222");
        proxy.registrar("Juan6", "277");

        proxy.ingresar("Juan1", "222");

        proxy.ingresar("Juan1", "720");
        proxy.ingresar("Juan2", "467");
        proxy.ingresar("Juan3", "191");
        proxy.ingresar("Juan4", "111");
        proxy.ingresar("Juan5", "222");
        proxy.ingresar("Juan6", "277");

    }

}
