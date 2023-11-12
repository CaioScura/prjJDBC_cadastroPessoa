package org.me.pessoa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PessoaConecta {

    private static final String URL = "jdbc:derby://localhost:1527/BDTeste";
    private static final String USERNAME = "EMPRESA";
    private static final String PASSWORD = "empresa";
    private Connection connection = null;
    private PreparedStatement insertNovaPessoa = null;
    private PreparedStatement selecionaPessoa = null;
    private PreparedStatement alteraPessoa = null;
    private PreparedStatement excluiPessoa = null;

    public PessoaConecta() throws ClassNotFoundException {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            insertNovaPessoa = connection.prepareStatement(
                    "INSERT INTO EMPRESA.TABAGENDA " + "(NOME , SOBRENOME, EMAIL, TELEFONE) "
                    + "VALUES (?, ?, ?, ?)");
            
            selecionaPessoa = connection.prepareStatement(
            "SELECT * FROM EMPRESA.TABAGENDA WHERE NOME = ?" );
            
            alteraPessoa = connection.prepareStatement(
            "UPDATE EMPRESA.TABAGENDA SET NOME = ?, SOBRENOME = ?, EMAIL = ?, TELEFONE = ?" + "WHERE ID = ?");
            
            excluiPessoa = connection.prepareStatement("DELETE FROM EMPRESA.TABAGENDA " + "WHERE ID = ?");
            

            
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.exit(1);
        }
    }

    public int adicionaPessoa(
            String pnome, String unome, String mail, String fone) {
        int result = 0;
        try {
            insertNovaPessoa.setString(1, pnome);
            insertNovaPessoa.setString(2, unome);
            insertNovaPessoa.setString(3, mail);
            insertNovaPessoa.setString(4, fone);

            result = insertNovaPessoa.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            close();
        }
        return result;
    }
    
    public int atualizaPessoa(
            String pnome, String unome, String mail, String fone, int cod) {
        int result = 0;
        try {
            alteraPessoa.setString(1, pnome);
            alteraPessoa.setString(2, unome);
            alteraPessoa.setString(3, mail);
            alteraPessoa.setString(4, fone);
            alteraPessoa.setInt(5, cod);
            result = alteraPessoa.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            close();
        }
        return result;
    }
    
    public boolean deletaPessoa(int id) {
        boolean exclui = false;
        try {
            excluiPessoa.clearParameters();
            excluiPessoa.setInt(1, id);
            excluiPessoa.executeUpdate();
            exclui = true;
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return exclui;
    }


    public List<Pessoa> getNomePessoa(String nome) {
        List<Pessoa> resultados = null;
        ResultSet resultSet = null;
        try {
            selecionaPessoa.setString(1, nome);
            resultSet = selecionaPessoa.executeQuery();
            resultados = new ArrayList<Pessoa>();
            while (resultSet.next()) {
                resultados.add(new Pessoa(
                        resultSet.getInt("ID"),
                        resultSet.getString("Nome"),
                        resultSet.getString("Sobrenome"),
                        resultSet.getString("Email"),
                        resultSet.getString("Telefone")));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            close();
        }
        return resultados;
    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

    }
}