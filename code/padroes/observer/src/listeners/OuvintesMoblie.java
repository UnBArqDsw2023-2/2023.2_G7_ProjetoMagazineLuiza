package listeners;

public class OuvintesMobile implements OuvintesEvento {

    private String id;

    public OuvintesMobile(String idCliente) {
        this.id = idCliente;
    }

    @Override
    public void atualizar(String id) {
        System.out.println("Uma notificação no aplicativo foi realizada para o cliente com id: " + id + ".\n"
    }
}