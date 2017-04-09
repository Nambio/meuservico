/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.QuizDB;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Questao;
import model.Usuario;
import java.awt.event.MouseAdapter;  
import java.awt.event.MouseEvent;  

/**
 *
 * @author nambio
 */
public class TelaQuestao extends javax.swing.JFrame {
    
    private static Usuario usuario;
    private static ArrayList<Questao> questao;
    private int[] numAle;
    private int controle;
    private QuizDB db;
    private int respVigente;
    private int selecionado;
    private int pontos;
    private static String oi = "Oi";


    /**
     * Creates new form TelaPrincipal
     */
    public TelaQuestao(Usuario usuario) {

        initComponents();
        
        this.getContentPane().setBackground(new java.awt.Color(250, 250, 250));
        this.setLocationRelativeTo(null);
              
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo2.png"))); // NOI18N
        
        this.usuario = usuario;
        this.controle = 0;
        this.selecionado = 0;
        this.pontos = 0;
        
        inciarQuetionario();
        click();
        
    }
    
    public void inciarQuetionario(){
        
        try {
            this.db = new QuizDB();
            
            //this.usuario = usuario;
            this.questao = this.db.buscaQuestao();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaQuestao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaQuestao.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        novaQuestao();

    }
    
    
    public void novaQuestao(){
        
        this.numAle = aleatorio();
        
        
        if(this.controle < 3){
                    
            Questao quest;
            quest = this.questao.get(this.numAle[this.controle]);
            
            lbA.setForeground(Color.white);
            lba.setForeground(Color.white);
            lbb.setForeground(Color.white);
            lbB.setForeground(Color.white);
            lbc.setForeground(Color.white);
            lbC.setForeground(Color.white);
            
            lbPerg.setText(tratarPerg(quest.getPergunta()));
            lbA.setText(tratarOpc(quest.getOpA()));
            lbB.setText(tratarOpc(quest.getOpB()));
            lbC.setText(tratarOpc(quest.getOpC()));
            this.respVigente = Integer.parseInt(quest.getResposta());
            this.selecionado = 0;
            
        }                
        this.controle++;
    }
    
    
    public int[] aleatorio(){
        
        int[] numAle = new int[3];       
        
        for(int i = 0; i<3; i++){
            
            boolean ok = true;
            
            int num = (int) (Math.random()*9);
            
            for(int j=0; j < numAle.length; j++){
                if(num == numAle[j]){
                    ok = false;
                    if(i > 0)i--;
                }
            }
            
            if(ok){
                numAle[i] = num;
            }
        }
        
        return numAle;
    }
    
    public String tratarPerg(String str){
    
        return "<html>"+str+"</html>";
    }
    
    
    public String tratarOpc(String str){
        
        return "<html>"+str+"</html>";
    }
    
    private void atualizaResp(int resp){
        this.selecionado = resp;
    }
    
    private void click(){
        
        jPanel3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                lba.setForeground(Color.green);
                lbA.setForeground(Color.green);


                lbb.setForeground(Color.white);
                lbB.setForeground(Color.white);


                lbc.setForeground(Color.white);
                lbC.setForeground(Color.white);

                atualizaResp(1);
            
            }

        });
        
        jPanel4.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                lbb.setForeground(Color.green);
                lbB.setForeground(Color.green);



                lba.setForeground(Color.white);
                lbA.setForeground(Color.white);


                lbc.setForeground(Color.white);
                lbC.setForeground(Color.white);
                atualizaResp(2);
            }

        });
        
        jPanel5.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                lbc.setForeground(Color.green);
                lbC.setForeground(Color.green);



                lba.setForeground(Color.white);
                lbA.setForeground(Color.white);


                lbb.setForeground(Color.white);
                lbB.setForeground(Color.white);
               
                atualizaResp(3);
            }

        });
        
    }
//    /
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbPerg = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbA = new javax.swing.JLabel();
        lba = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbB = new javax.swing.JLabel();
        lbb = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbC = new javax.swing.JLabel();
        lbc = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(203, 227, 227));

        jLabel1.setToolTipText("");

        jButton1.setBackground(new java.awt.Color(0, 147, 154));
        jButton1.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sair");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 147, 154), 10, true));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 147, 154));
        jButton2.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Responder");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 147, 154), 10, true));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 147, 154));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 147, 154), 1, true));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lbPerg.setBackground(new java.awt.Color(0, 147, 154));
        lbPerg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbPerg.setForeground(new java.awt.Color(255, 255, 255));
        lbPerg.setText("O que você entende como doenças osteomuscular?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbPerg, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPerg, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 147, 154));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 147, 154), 1, true));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbA.setBackground(new java.awt.Color(0, 19, 97));
        lbA.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbA.setForeground(new java.awt.Color(255, 255, 255));
        lbA.setText("São doenças que acometem os ossos, as articulações e os músculos.");

        lba.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        lba.setForeground(new java.awt.Color(255, 255, 255));
        lba.setText("a)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lba)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbA, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(lba, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addComponent(lbA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 147, 154));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 147, 154), 1, true));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbB.setBackground(new java.awt.Color(0, 19, 97));
        lbB.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbB.setForeground(new java.awt.Color(255, 255, 255));
        lbB.setText("São doenças que acometem o somente os ossos.");

        lbb.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        lbb.setForeground(new java.awt.Color(255, 255, 255));
        lbb.setText("b)");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(lbB, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbB, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addComponent(lbb))
        );

        jPanel5.setBackground(new java.awt.Color(0, 147, 154));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 147, 154), 1, true));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbC.setBackground(new java.awt.Color(0, 19, 97));
        lbC.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbC.setForeground(new java.awt.Color(255, 255, 255));
        lbC.setText("São doenças que acometem somente os músculos.");

        lbc.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        lbc.setForeground(new java.awt.Color(255, 255, 255));
        lbc.setText("c)");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbC, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbc, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addComponent(lbC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(193, 191, 191));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(214, 209, 209), 1, true));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(193, 191, 191));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(214, 209, 209), 1, true));
        jPanel11.setForeground(new java.awt.Color(214, 209, 209));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(193, 191, 191));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(214, 209, 209), 1, true));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(73, 69, 69));
        jLabel7.setText("Pergunta:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(167, 167, 167)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jButton2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(58, 58, 58)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(this.selecionado != 0){
            
            if(this.selecionado != 0 && this.selecionado == this.respVigente){
                this.pontos++;
                this.usuario.setPontos(this.pontos);
//                JOptionPane.showMessageDialog(this, this.usuario.getPontos());
                
                if(this.controle == 1){
                    jPanel10.setBackground(Color.green);
                }
                if(this.controle == 2){
                    jPanel11.setBackground(Color.green);
                }
                if(this.controle == 3){
                    jPanel12.setBackground(Color.green);
                }
                
            }
            
            else if(this.selecionado != 0 && this.selecionado != this.respVigente){
                if(this.controle == 1){
                    jPanel10.setBackground(Color.red);
                }
                if(this.controle == 2){
                    jPanel11.setBackground(Color.red);
                }
                if(this.controle == 3){
                    jPanel12.setBackground(Color.red);
                }
            }
            
            if(this.controle>2){
               
                try {
                    this.db.gravaUsuario(this.usuario);
                } catch (Exception ex) {
                    System.out.println("Erro ao salvar no banco de dados>LOG: "+ex.getMessage());
                }
                
                JOptionPane.showMessageDialog(this, "Obrigado por participar do Quiz Saúde!");
                
                    TelaInicio telaInicio = new TelaInicio();
                    telaInicio.setLocationRelativeTo(this);
                    telaInicio.setVisible(true);
                    this.setVisible(false);
                
            }

            novaQuestao();                

        }
        else{
            
            JOptionPane.showMessageDialog(this,"Selecione uma opção!");
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair do jogo?");
        
        if(resp == 0){
          System.exit(0);  
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbA;
    private javax.swing.JLabel lbB;
    private javax.swing.JLabel lbC;
    private javax.swing.JLabel lbPerg;
    private javax.swing.JLabel lba;
    private javax.swing.JLabel lbb;
    private javax.swing.JLabel lbc;
    // End of variables declaration//GEN-END:variables
}
