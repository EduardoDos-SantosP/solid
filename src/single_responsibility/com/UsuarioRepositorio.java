package single_responsibility.com;

import java.util.ArrayList;

public class UsuarioRepositorio {
    public UsuarioRepositorio(String urlConexaoBancoDeDados) {
        //Prepara conexão com o banco de dados
    }

    public void salvar(Usuario usuario) {
        //Salva um objeto Usuario no banco
    }

    public void excluir(Usuario usuario) {
        //Exclui um usuario do banco de dados
    }

    public Usuario consulte(int id) {
        //Obtem usuario pelo id
        return null;
    }

    public ArrayList<Usuario> consulte() {
        //Obtem todos os usuários
        return null;
    }
}
