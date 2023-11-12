package org.me.testepessoa;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.me.pessoa.Pessoa;
import org.me.pessoa.PessoaConecta;

public class TestePessoa extends javax.swing.JFrame {
    private Pessoa indiceEntrada;
    private int numero = 0;
    private int indice;
    private List <Pessoa> resultado;

    private PessoaConecta pessoaCon;
    public TestePessoa() throws ClassNotFoundException {
    pessoaCon = new PessoaConecta();

    /**
     * Creates new form TestePessoa
     */
    //public TestePessoa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Sobrenome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Telefone = new javax.swing.JTextField();
        Botao_salvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Pesquisa = new javax.swing.JTextField();
        botao_consultar = new javax.swing.JButton();
        botao_alterar = new javax.swing.JButton();
        botao_excluir = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Sobrenome");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agenda", 0, 0, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(102, 102, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nome");

        Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Sobrenome");

        Sobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobrenomeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("E-mail");

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Telefone");

        Telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefoneActionPerformed(evt);
            }
        });

        Botao_salvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Botao_salvar.setText("Salvar");
        Botao_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_salvarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Codigo");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Pesquisa");

        Pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisaActionPerformed(evt);
            }
        });

        botao_consultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botao_consultar.setText("Consultar");
        botao_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_consultarActionPerformed(evt);
            }
        });

        botao_alterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botao_alterar.setText("Alterar");
        botao_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_alterarActionPerformed(evt);
            }
        });

        botao_excluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botao_excluir.setText("Excluir");
        botao_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(Codigo))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Botao_salvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botao_consultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botao_alterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botao_excluir)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao_salvar)
                    .addComponent(botao_consultar)
                    .addComponent(botao_alterar)
                    .addComponent(botao_excluir))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeActionPerformed

    private void SobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SobrenomeActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void TelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefoneActionPerformed

    private void Botao_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_salvarActionPerformed
        int result = pessoaCon.adicionaPessoa(Nome.getText(),
        Sobrenome.getText(), Email.getText(), Telefone.getText());
        if (result ==1)
            JOptionPane.showMessageDialog(this, "Pessoa inserida", "Pessoainserida", JOptionPane.PLAIN_MESSAGE);
        else
            JOptionPane.showMessageDialog(this, "Pessoa não inserida",
            "Erro", JOptionPane.PLAIN_MESSAGE);

    }//GEN-LAST:event_Botao_salvarActionPerformed

    private void PesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisaActionPerformed

    private void botao_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_consultarActionPerformed
        resultado = pessoaCon.getNomePessoa(Pesquisa.getText());
        numero = resultado.size();
        if (numero != 0) {
            indice = 0;
            indiceEntrada = resultado.get(indice);
            Codigo.setText(" " + indiceEntrada.getID());
            Nome.setText(indiceEntrada.getNome());
            Sobrenome.setText(indiceEntrada.getSobrenome());
            Email.setText(indiceEntrada.getEmail());
            Telefone.setText(indiceEntrada.getTelefone());
        }

    }//GEN-LAST:event_botao_consultarActionPerformed

    private void botao_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_alterarActionPerformed
        int result = pessoaCon.atualizaPessoa(Nome.getText(), Sobrenome.getText(),
                Email.getText(), Telefone.getText(), Integer.parseInt(Codigo.getText().trim()));
        if (result == 1) {
            JOptionPane.showMessageDialog(this, "Registro alterado", "Registro alterado", JOptionPane.PLAIN_MESSAGE);
        }else
            JOptionPane.showMessageDialog(this, "Registro não alterado", "Erro", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_botao_alterarActionPerformed

    private void botao_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_excluirActionPerformed
        boolean result
                = pessoaCon.deletaPessoa(Integer.parseInt(Codigo.getText().trim()));
        if (result == true) {
            JOptionPane.showMessageDialog(this, "Pessoa excluida", "Pessoa excluida", JOptionPane.PLAIN_MESSAGE);
        }else
            JOptionPane.showMessageDialog(this, "Pessoa não excluida", "Erro", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_botao_excluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TestePessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestePessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestePessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestePessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TestePessoa().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TestePessoa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_salvar;
    private javax.swing.JTextField Codigo;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField Pesquisa;
    private javax.swing.JTextField Sobrenome;
    private javax.swing.JTextField Telefone;
    private javax.swing.JButton botao_alterar;
    private javax.swing.JButton botao_consultar;
    private javax.swing.JButton botao_excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
