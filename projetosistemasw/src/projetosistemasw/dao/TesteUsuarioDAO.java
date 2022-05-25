package projetosistemasw.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import projetosistemasw.Conexao;
import projetosistemasw.model.TesteUsuario;
import java.sql.ResultSet;
import projetosistemasw.model.TesteRelatorio;

import projetosistemasw.view.TelaRelatorio;
import projetosistemasw.view.TelaLogin;

/**
 *
 * @author danie
 */
public class TesteUsuarioDAO {

    private Connection c;
    public boolean confirmacaoNomeCPF;
    public boolean confirmacaoLoginSenha;

    public TesteUsuarioDAO() {
        this.c = new Conexao().getConnection();

    }

    public void salvar(TesteUsuario tu) {
        try {
            PreparedStatement st = c.prepareStatement("INSERT INTO usuarios (Nome, Email, Telefone, Celular, Sexo, Endereco, Numero, Complemento, Bairro, Cep, Cidade, Estados, RG, CPF, Usuario, Nascimento, Senha, Imagem) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            st.setString(1, tu.getNome());
            st.setString(2, tu.getEmail());
            st.setString(3, tu.getTelefone());
            st.setString(4, tu.getCelular());
            st.setString(5, tu.getSexo());
            st.setString(6, tu.getEndereco());
            st.setString(7, tu.getNumero());
            st.setString(8, tu.getComplemento());
            st.setString(9, tu.getBairro());
            st.setString(10, tu.getCep());
            st.setString(11, tu.getCidade());
            st.setString(12, tu.getEstados());
            st.setString(13, tu.getRG());
            st.setString(14, tu.getCPF());
            st.setString(15, tu.getUsuario());
            st.setString(16, tu.getNascimento());
            st.setString(17, tu.getSenha());
            st.setString(18, tu.getImagem());
            st.execute();
            st.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean logar(TelaLogin tl) {
        try {
            ResultSet rslogin;
            PreparedStatement st = c.prepareStatement("SELECT * FROM usuarios WHERE usuario=? AND Senha=?");
            st.setString(1, tl.txtUsuario.getText());
            st.setString(2, tl.pswSenha.getText());
            rslogin = st.executeQuery();
            if (rslogin.next()) { // Se encontrou o usuário na tabela
                //manda a confirmação para a TelaLogin para confirmar o login do usuario
                return true;
            } else { //Senão encontrou o usuário
                return false;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean puxar(TelaRelatorio tl) {

        try {
            ResultSet rspuxar;
            PreparedStatement st = c.prepareStatement("SELECT * FROM usuarios WHERE Nome=? AND CPF=?");
            st.setString(1, tl.txtRNome.getText());
            st.setString(2, tl.txtRCPF.getText());
            rspuxar = st.executeQuery();
            if (rspuxar.next()) { // Se encontrou o usuário na tabela
                return true;
            } else { //Senão encontrou o usuário
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    

    public int salvarDadosR(TesteRelatorio tr) {
        //retorna 1 se a gravação deu certo
        //retorna 1062 se vc está tentando cadastrar uma matrícula que já foi cadastrada
        //retorn 0 se deu qualquer outro tipo de erro na gravação

        try {
            PreparedStatement st = c.prepareStatement("INSERT INTO dadosacidente (Codigo ,Nome, CPF, Data, Local, Causa) VALUES (?, ?, ?, ?, ?, ?)");
            st.setInt(1, tr.getTxtRCodigo());
            st.setString(2, tr.getTxtRNome());
            st.setString(3, tr.getTxtRCPF());
            st.setString(4, tr.getTxtRData());
            st.setString(5, tr.getTxtRLocal());
            st.setString(6, tr.getTxtRCausa());
            st.execute();
            return 1;
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                return 1062;
            } else {
                return 0;
            }
        }
    }
   public boolean puxarCodigo(TesteRelatorio tr) {

        try {
            ResultSet rspuxar;
            PreparedStatement st = c.prepareStatement("SELECT * FROM dadosacidente WHERE Codigo=?");
            st.setInt(1, tr.getTxtRCodigo());
            rspuxar = st.executeQuery();
            if (rspuxar.next()) { // Se encontrou o usuário na tabela
                tr.setTxtRNome(rspuxar.getString("Nome"));
                tr.setTxtRCPF(rspuxar.getString("CPF"));
                tr.setTxtRData(rspuxar.getString("Data"));
                tr.setTxtRLocal(rspuxar.getString("Local"));
                tr.setTxtRCausa(rspuxar.getString("Causa"));
                return true;
            } else { //Senão encontrou o usuário
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    } 
    
    public boolean excluir(TesteRelatorio tr){
      try {
          PreparedStatement st = c.prepareStatement("DELETE FROM dadosacidente WHERE Codigo = ?");
          st.setInt(1, tr.getTxtRCodigo());
          int r = st.executeUpdate(); //executar o delete preparado acima
          if(r==1){//Se conseguiu excluir
           return true;
          }else{ //Não excluiu porque não encontrou
              return false;
          }
      } catch (SQLException ex) {
          return false;
      }
    }
    

    public boolean GRpdf(TesteRelatorio trg, TesteUsuario tug) {
        try {
            ResultSet rslogin;
            PreparedStatement st = c.prepareStatement("SELECT * FROM usuarios WHERE CPF=?");
            st.setString(1, trg.getTxtRCPF());
            rslogin = st.executeQuery();
            if (rslogin.next()) { // Se encontrou o usuário na tabela
                //manda a confirmação para a TelaLogin para confirmar o login do usuario
                tug.setNome(rslogin.getString("Nome"));
                tug.setEmail(rslogin.getString("Email"));
                tug.setTelefone(rslogin.getString("Telefone"));
                tug.setCelular(rslogin.getString("Celular"));
                tug.setSexo(rslogin.getString("Sexo"));
                tug.setEndereco(rslogin.getString("Endereco"));
                tug.setComplemento(rslogin.getString("Complemento"));
                tug.setBairro(rslogin.getString("Bairro"));
                tug.setNumero(rslogin.getString("Numero"));
                tug.setCep(rslogin.getString("Cep"));
                tug.setCidade(rslogin.getString("Cidade"));
                tug.setEstados(rslogin.getString("Estados"));
                tug.setRG(rslogin.getString("RG"));
                tug.setCPF(rslogin.getString("CPF"));
                tug.setNascimento(rslogin.getString("Nascimento"));
                tug.setImagem(rslogin.getString("Imagem"));
                return true;
            } else { //Senão encontrou o usuário
                return false;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
 
  

}
