package view;

import dao.MySQL;
import javax.swing.JOptionPane;
import classe.Venda;

/**
 *
 * @author Cassillo
 */
public class VendaView extends javax.swing.JFrame {

    MySQL conectar = new MySQL();
    Venda novaVenda = new Venda();
    
    public VendaView() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private void VendaDinheiro(Venda novaVenda){
        this.conectar.conectaBanco(); 
        
        novaVenda.setNome(nomeField.getText());
        novaVenda.setCpf(cpfField.getText());
        novaVenda.setTelefone(telefoneField.getText());
        novaVenda.setIngresso(ingressoComboBox.getSelectedItem().toString());
        novaVenda.setAssento(assentoComboBox.getSelectedItem().toString());
        novaVenda.setPagamento("Dinheiro");
        
    try {
                        
            this.conectar.insertSQL("INSERT INTO Vendas ("
                    + "nome,"
                    + "cpf,"
                    + "telefone,"
                    + "ingresso,"
                    + "assento,"
                    + "pagamento"
                + ") VALUES ("
                    + "'" + novaVenda.getNome() + "',"
                    + "'" + novaVenda.getCpf() + "',"
                    + "'" + novaVenda.getTelefone() + "',"
                    + "'" + novaVenda.getIngresso() + "',"
                    + "'" + novaVenda.getAssento() + "',"
                    + "'" + novaVenda.getPagamento() + "'"
                + ");");
            
        } catch (Exception e) {
            
            System.out.println("Ocorreu um erro:" +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Não foi possivel completar a Venda");
            
        } finally{            
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso");
            dispose();
            view.VendaView venda = new VendaView();
            venda.setVisible(true);

    
        }                
    }
    
    private void VendaPix(Venda novaVenda){
        this.conectar.conectaBanco(); 
        
        novaVenda.setNome(nomeField.getText());
        novaVenda.setCpf(cpfField.getText());
        novaVenda.setTelefone(telefoneField.getText());
        novaVenda.setIngresso(ingressoComboBox.getSelectedItem().toString());
        novaVenda.setAssento(assentoComboBox.getSelectedItem().toString());
        novaVenda.setPagamento("PIX");
        
    try {
                        
            this.conectar.insertSQL("INSERT INTO Vendas ("
                    + "nome,"
                    + "cpf,"
                    + "telefone,"
                    + "ingresso,"
                    + "assento,"
                    + "pagamento"
                + ") VALUES ("
                    + "'" + novaVenda.getNome() + "',"
                    + "'" + novaVenda.getCpf() + "',"
                    + "'" + novaVenda.getTelefone() + "',"
                    + "'" + novaVenda.getIngresso() + "',"
                    + "'" + novaVenda.getAssento() + "',"
                    + "'" + novaVenda.getPagamento() + "'"
                + ");");
            
        } catch (Exception e) {
            
            System.out.println("Ocorreu um erro:" +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Não foi possivel completar a Venda");
            
        } finally{            
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso");
            dispose();
            view.VendaView venda = new VendaView();
            venda.setVisible(true);
        }                
    }
    
    private void VendaCredito(Venda novaVenda){
        this.conectar.conectaBanco(); 
        
        novaVenda.setNome(nomeField.getText());
        novaVenda.setCpf(cpfField.getText());
        novaVenda.setTelefone(telefoneField.getText());
        novaVenda.setIngresso(ingressoComboBox.getSelectedItem().toString());
        novaVenda.setAssento(assentoComboBox.getSelectedItem().toString());
        novaVenda.setPagamento("Crédito");
        
    try {
                        
            this.conectar.insertSQL("INSERT INTO Vendas ("
                    + "nome,"
                    + "cpf,"
                    + "telefone,"
                    + "ingresso,"
                    + "assento,"
                    + "pagamento"
                + ") VALUES ("
                    + "'" + novaVenda.getNome() + "',"
                    + "'" + novaVenda.getCpf() + "',"
                    + "'" + novaVenda.getTelefone() + "',"
                    + "'" + novaVenda.getIngresso() + "',"
                    + "'" + novaVenda.getAssento() + "',"
                    + "'" + novaVenda.getPagamento() + "'"
                + ");");
            
        } catch (Exception e) {
            
            System.out.println("Ocorreu um erro:" +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Não foi possivel completar a Venda");
            
        } finally{            
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso");
            dispose();
            view.VendaView venda = new VendaView();
            venda.setVisible(true);
        }                
    }
    
    private void VendaDebito(Venda novaVenda){
        this.conectar.conectaBanco(); 
        
        novaVenda.setNome(nomeField.getText());
        novaVenda.setCpf(cpfField.getText());
        novaVenda.setTelefone(telefoneField.getText());
        novaVenda.setIngresso(ingressoComboBox.getSelectedItem().toString());
        novaVenda.setAssento(assentoComboBox.getSelectedItem().toString());
        novaVenda.setPagamento("Débito");
        
    try {
                        
            this.conectar.insertSQL("INSERT INTO Vendas ("
                    + "nome,"
                    + "cpf,"
                    + "telefone,"
                    + "ingresso,"
                    + "assento,"
                    + "pagamento"
                + ") VALUES ("
                    + "'" + novaVenda.getNome() + "',"
                    + "'" + novaVenda.getCpf() + "',"
                    + "'" + novaVenda.getTelefone() + "',"
                    + "'" + novaVenda.getIngresso() + "',"
                    + "'" + novaVenda.getAssento() + "',"
                    + "'" + novaVenda.getPagamento() + "'"
                + ");");
            
        } catch (Exception e) {
            
            System.out.println("Ocorreu um erro:" +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Não foi possivel completar a Venda");
            
        } finally{            
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso");
            dispose();
            view.VendaView venda = new VendaView();
            venda.setVisible(true);
        }                
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        cpfField = new javax.swing.JTextField();
        telefoneField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ingressoComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        assentoComboBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        botaoDinheiro = new javax.swing.JButton();
        botaoDebito = new javax.swing.JButton();
        botaoCredito = new javax.swing.JButton();
        BotaoPix = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();

        jButton3.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        jLabel3.setText("Telefone");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Escolha o tipo de Ingresso");

        ingressoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casal", " " }));

        jLabel5.setText("Escolha o assento");

        assentoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A11", "A12", "A13", "A14", "A15", "B21", "B22", "B23", "B24", "B25", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingressoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(assentoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingressoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assentoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("<html> Escolha a forma <br> de pagamento.");

        botaoDinheiro.setText("Dinheiro");
        botaoDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDinheiroActionPerformed(evt);
            }
        });

        botaoDebito.setText("<html>Cartão <br>Débito");
        botaoDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDebitoActionPerformed(evt);
            }
        });

        botaoCredito.setText("<html>Cartão <br>Crédito");
        botaoCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCreditoActionPerformed(evt);
            }
        });

        BotaoPix.setText("PIX");
        BotaoPix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPixActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botaoDebito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(BotaoPix, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoPix, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        botaoVoltar.setText("<< Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(botaoVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDinheiroActionPerformed
        VendaDinheiro(novaVenda);
    }//GEN-LAST:event_botaoDinheiroActionPerformed

    private void botaoDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDebitoActionPerformed
        VendaDebito(novaVenda);
    }//GEN-LAST:event_botaoDebitoActionPerformed

    private void botaoCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCreditoActionPerformed
        VendaCredito(novaVenda);
    }//GEN-LAST:event_botaoCreditoActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        view.SelectionView selection = new SelectionView();
        selection.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void BotaoPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPixActionPerformed
        VendaPix(novaVenda);
    }//GEN-LAST:event_BotaoPixActionPerformed

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
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoPix;
    private javax.swing.JComboBox<String> assentoComboBox;
    private javax.swing.JButton botaoCredito;
    private javax.swing.JButton botaoDebito;
    private javax.swing.JButton botaoDinheiro;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField cpfField;
    private javax.swing.JComboBox<String> ingressoComboBox;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nomeField;
    private javax.swing.JTextField telefoneField;
    // End of variables declaration//GEN-END:variables
}
