package single_responsibility.sem;

import java.util.ArrayList;

public class Usuario {
    private int id;
    private String nome;

    public Usuario(String urlConexaoBancoDeDados) {
        //Prepara conexão com o banco de dados
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void login() {
        //Efetua o login do usuário 'this'
    }

    public String gerarTokenAcesso() {
        //Gera token de acesso ao sistema do usuário atual
        return "";
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
