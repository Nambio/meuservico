
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nambio
 */
public class QuizDB {
    
    private static Connection con;
    private static double cont;
    private static final String conector = "com.mysql.jdbc.Driver"; 
    private static final String host = "jdbc:mysql://localhost/"; 
    private static final String db = "quiz"; 
    private static final String login = "root";
    private static final String senha = ""; 
    
    public QuizDB()throws ClassNotFoundException, SQLException{  
        Class.forName(conector);
        
        this.con = DriverManager.getConnection(host+db, login, senha);

        if(this.con != null){
            System.out.println("Conexão efetuado com sucesso!");
        }
        else{
            System.out.println("Não foi possivel conectar ao banco de dados!");
        }
    } 
    
    public void gravaUsuario(Usuario usuario) throws Exception{
        
        Statement stm = con.createStatement();
                    
        stm.executeUpdate("INSERT INTO usuario" + 
                "(nome, telefone, pontos)"+
                " VALUES('"+usuario.getNome()+"','"+usuario.getTelefone()+"', "+usuario.getPontos()+")");
        
    }
    
    
    public ArrayList buscaUser(){
        
        PreparedStatement stmt;
        ArrayList <Usuario> usuario = new ArrayList();
        
        try {
            stmt = con.prepareStatement("SELECT nome, telefone, pontos FROM usuario");
    
                // executa um select
                ResultSet dado = stmt.executeQuery();

                // itera no ResultSet
                
                while (dado.next()) {
                    
                    Usuario us = new Usuario();
                    us.setNome(dado.getString("nome"));
                    us.setTelefone(dado.getString("telefone"));
                    us.setPontos(Integer.parseInt(dado.getString("pontos")));
                    usuario.add(us);
                    
                }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"LOG2: "+ex.getMessage());
        }

        return usuario;
    }
    
    public ArrayList buscaQuestao(){
        
        PreparedStatement stmt;
        
        ArrayList <Questao> questao = new ArrayList();
        
        try {
            
            stmt = con.prepareStatement("SELECT* FROM questao ORDER BY id DESC");
            
            
            // executa um select
            ResultSet dado = stmt.executeQuery();
            
            
            // itera no ResultSet
            while (dado.next()) {

                Questao quest = new Questao();

                quest.setId(Integer.parseInt(dado.getString("id")));
                quest.setPergunta(dado.getString("pergunta"));
                quest.setOpA(dado.getString("opA"));
                quest.setOpB(dado.getString("opB"));
                quest.setOpC(dado.getString("opC"));
                quest.setResposta(dado.getString("resp"));
                questao.add(quest);

            }

        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"LOG2: "+ex.getMessage());
        }

        return questao;
    }
    
}
