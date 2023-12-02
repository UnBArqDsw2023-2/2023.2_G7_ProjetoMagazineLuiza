package listeners;

public class OuvintesEmail implements OuvintesEvento {

    private String email;

    public OuvintesEmail(String emailCliente) {
        this.email = emailCliente;
    }

    @Override
    public void atualizar(String email) {
        System.out.println("Um e-mail foi enviado para: " + email + "\n Ocorreu uma alteração no preço do produto que você deseja."
    }
}