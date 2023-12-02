package publisher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServicoNotificacao {
    Map<String, List<OuvintesEvento>> ouvintes = new HashMap<>();

    public ServicoNotificacao(String... operacoes) {
        for (String operacao : operacos) {
            this.ouvintes.put(operacao, new ArrayList<>());
        }
    }

    public void inscrever(String tipoEvento, OuvintesEvento ouvinte) {
        List<OuvintesEvento> usuarios = ouvintes.get(tipoEvento);
        usuarios.add(ouvinte);
    }

    public void desinscrever(String tipoEvento, OuvintesEvento ouvinte) {
        List<OuvintesEvento> usuarios = ouvintes.get(tipoEvento);
        usuarios.remove(ouvinte);
    }

    public void notifica(String tipoEvento, String indentificador) {
        List<OuvintesEvento> usuarios = ouvintes.get(tipoEvento);
        for (OuvintesEvento ouvinte : usuarios) {
            ouvinte.atualizar(tipoEvento, indentificador);
        }
    }
}