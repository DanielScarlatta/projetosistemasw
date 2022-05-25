package projetosistemasw.view;

import javax.swing.JOptionPane;
import projetosistemasw.dao.TesteUsuarioDAO;
import projetosistemasw.model.TesteRelatorio;
import projetosistemasw.model.TesteUsuario;

/**
 *
 * @author danie
 */
public class TelaLogin extends javax.swing.JFrame {
    //conecta a classe DAO a TelaLogin
    TesteUsuarioDAO tud = new TesteUsuarioDAO();
    TelaRelatorio tr = new TelaRelatorio();

    public TelaLogin() {
        initComponents();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBack = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        lblSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        sprUsuario = new javax.swing.JSeparator();
        lblUsuario = new javax.swing.JLabel();
        sprSenha = new javax.swing.JSeparator();
        pswSenha = new javax.swing.JPasswordField();
        lblImagemLogin = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblCadastro = new javax.swing.JLabel();
        pnlLogos = new javax.swing.JPanel();
        lblImagemComputador = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlBack.setLayout(null);

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlLogin.setLayout(null);

        lblSenha.setFont(new java.awt.Font("Candara Light", 0, 15)); // NOI18N
        lblSenha.setText("Senha");
        pnlLogin.add(lblSenha);
        lblSenha.setBounds(20, 200, 60, 20);

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        pnlLogin.add(txtUsuario);
        txtUsuario.setBounds(20, 140, 240, 20);
        pnlLogin.add(sprUsuario);
        sprUsuario.setBounds(20, 160, 230, 10);

        lblUsuario.setFont(new java.awt.Font("Candara Light", 0, 15)); // NOI18N
        lblUsuario.setText("Usuário");
        pnlLogin.add(lblUsuario);
        lblUsuario.setBounds(20, 120, 60, 20);
        pnlLogin.add(sprSenha);
        sprSenha.setBounds(20, 240, 230, 10);

        pswSenha.setBorder(null);
        pswSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswSenhaActionPerformed(evt);
            }
        });
        pnlLogin.add(pswSenha);
        pswSenha.setBounds(20, 220, 230, 20);

        lblImagemLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosistemasw/imgs/login2.png"))); // NOI18N
        pnlLogin.add(lblImagemLogin);
        lblImagemLogin.setBounds(100, 10, 60, 50);

        btnEntrar.setBackground(new java.awt.Color(255, 255, 255));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        pnlLogin.add(btnEntrar);
        btnEntrar.setBounds(20, 280, 230, 30);

        btnCadastro.setFont(new java.awt.Font("Segoe UI Symbol", 0, 15)); // NOI18N
        btnCadastro.setText("Cadastre-se");
        btnCadastro.setBorderPainted(false);
        btnCadastro.setContentAreaFilled(false);
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        pnlLogin.add(btnCadastro);
        btnCadastro.setBounds(150, 320, 110, 40);
        pnlLogin.add(jLabel7);
        jLabel7.setBounds(20, 330, 0, 0);

        lblCadastro.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        lblCadastro.setText("Não está cadastrado?");
        pnlLogin.add(lblCadastro);
        lblCadastro.setBounds(20, 330, 130, 30);

        pnlBack.add(pnlLogin);
        pnlLogin.setBounds(0, 0, 280, 480);

        pnlLogos.setBackground(new java.awt.Color(204, 204, 204));
        pnlLogos.setLayout(null);

        lblImagemComputador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosistemasw/imgs/icons8-computador-100.png"))); // NOI18N
        pnlLogos.add(lblImagemComputador);
        lblImagemComputador.setBounds(220, 90, 100, 90);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Sistema SW");
        pnlLogos.add(jLabel2);
        jLabel2.setBounds(170, 200, 210, 40);

        pnlBack.add(pnlLogos);
        pnlLogos.setBounds(280, 0, 530, 480);

        getContentPane().add(pnlBack);
        pnlBack.setBounds(0, 0, 810, 480);

        setSize(new java.awt.Dimension(825, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void pswSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswSenhaActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        //recebe a confirmação do DAO, para efetuar o login
        
        if(tud.logar(this) == true){
            TelaRelatorio tela;
            tela = new TelaRelatorio();
            tela.setVisible(true);
            txtUsuario.setText("");
            pswSenha.setText("");
 
        }else{
            JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos");
            txtUsuario.requestFocus();
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        //Chama a tela de cadastramento.
        TelaCadastro TelaCadastro;
        TelaCadastro = new TelaCadastro();
        TelaCadastro.setVisible(true);

    }//GEN-LAST:event_btnCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblImagemComputador;
    private javax.swing.JLabel lblImagemLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlLogos;
    public javax.swing.JPasswordField pswSenha;
    private javax.swing.JSeparator sprSenha;
    private javax.swing.JSeparator sprUsuario;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
