package cadastroclienteswingnetbeans;

import dao.ClienteMapDAO;
import dao.IClienteDAO;
import domain.Cliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *Esse e o cara responsvel por criar a tela e todos os seus componentes
 * @author Vilnei
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
//Para usar Tabela na tela, pricisamos instanciar a Tabela
    private DefaultTableModel modelo = new DefaultTableModel();
    private IClienteDAO clienteDAO = new ClienteMapDAO ();
    
//criando a tela, e iniciando seus componentes
    public TelaPrincipal() {
        initComponents();
        initCustomComponents();
    }

//Este método é chamado de dentro do construtor para inicializar o formulário.
//Ele e criado automaticamente pelo Form
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblNome = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLblCpf = new javax.swing.JLabel();
        jTxtCpf = new javax.swing.JTextField();
        jLblTelefone = new javax.swing.JLabel();
        jTxtTelefone = new javax.swing.JTextField();
        jLblEmail = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jLblEndereco = new javax.swing.JLabel();
        jLblNumero = new javax.swing.JLabel();
        jLblCidade = new javax.swing.JLabel();
        jLblEstado = new javax.swing.JLabel();
        jTxtEndereco = new javax.swing.JTextField();
        jTxtNumero = new javax.swing.JTextField();
        jTxtCidade = new javax.swing.JTextField();
        jTxtEstado = new javax.swing.JTextField();
        jBtnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBtnExcluir = new javax.swing.JButton();
        jBtnLimpar = new javax.swing.JButton();
        jBtnAtualizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLblNome.setText("Nome:");

        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });

        jLblCpf.setText("CPF:");

        jLblTelefone.setText("Telefone:");

        jLblEmail.setText("Email:");

        jLblEndereco.setText("Endereço:");

        jLblNumero.setText("Numero:");

        jLblCidade.setText("Cidade:");

        jLblEstado.setText("Estado:");

        jBtnSalvar.setText("Salvar");
        jBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnLimpar.setText("Limpar");
        jBtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimparActionPerformed(evt);
            }
        });

        jBtnAtualizar.setText("Atualizar");
        jBtnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAtualizarActionPerformed(evt);
            }
        });

        jMenu1.setText("Opções");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLblEmail)
                    .addComponent(jLblTelefone)
                    .addComponent(jLblCpf)
                    .addComponent(jLblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jTxtCpf)
                            .addComponent(jTxtTelefone)
                            .addComponent(jTxtEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblEndereco)
                                    .addComponent(jLblNumero, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(jTxtEndereco)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLblCidade)
                                    .addComponent(jLblEstado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(jTxtCidade)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNome)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblEndereco)
                    .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCpf)
                    .addComponent(jTxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblNumero)
                    .addComponent(jTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblTelefone)
                    .addComponent(jLblCidade)
                    .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblEmail)
                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblEstado)
                    .addComponent(jTxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSalvar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnLimpar)
                    .addComponent(jBtnAtualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarActionPerformed

        String nome = jTxtNome.getText();
        String cpf = jTxtCpf.getText();
        
        if (!isCamposValidos(nome, cpf)) {
            JOptionPane.showMessageDialog(null, "Existe Campos em Branco", "ERRO", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
//Instanciando o Contrutor la da classe Cliente
        Cliente cliente = new Cliente (nome, cpf, cpf, null, cpf, null, null);
        
//Chamando o Metodo cadastrar que esta em ClienteMapDAO
        Boolean isCadastrado = this.clienteDAO.cadastrar(cliente);
        
        if(isCadastrado) {
//recebe os objetos e coloca eles nas linhas e colunas ta tabela de exibição
            modelo.addRow(new Object[] {cliente.getNome(), cliente.getCpf()});
//limparCampos faz a limpesa dos campos de digitação "automaticamente
            limparCampos();
//mensagem de Sucesso mostrando que foi adicionado na tabela
            JOptionPane.showMessageDialog(null, nome + ", foi salvo com sucesso", "Cadastrado com SUCESSO", JOptionPane.INFORMATION_MESSAGE);
        }else{
//mensagem de ERRO mostrando que o cliente ja foi cadastrado, ou tem valores duplicados
            JOptionPane.showMessageDialog(null, "Cliente ja cadastrado", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
        }   
        
    }//GEN-LAST:event_jBtnSalvarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int linhaSelecionada = jTable1.getSelectedRow();
        Long cpf = (Long) jTable1.getValueAt(linhaSelecionada, 1);
        
        Cliente cliente = this.clienteDAO.consultar(cpf);
        
        jTxtNome.setText(cliente.getNome());
        jTxtCpf.setText(cliente.getCpf().toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        int linhaSelecionada = jTable1.getSelectedRow();
        
        if (linhaSelecionada >= 0) {
            int result = JOptionPane.showConfirmDialog ( this, "Deseja realmente excluir este Cliente?", "ALERTA",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            
            if(result == JOptionPane.YES_OPTION ){
                
                Long cpf = (Long)jTable1.getValueAt(linhaSelecionada, 1);
                this.clienteDAO.excluir(cpf);
                modelo.removeRow(linhaSelecionada);
                
                JOptionPane.showMessageDialog(null, "Cliente excluido com SUCESSO", "EXCLUIDO", JOptionPane.INFORMATION_MESSAGE);
                limparCampos();
            }
        }else {
                JOptionPane.showMessageDialog(null, "Nenhum cliente selecionado!"," ERRO ", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_jBtnLimparActionPerformed

    private void jBtnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAtualizarActionPerformed
        int linhaSelecionada = jTable1.getSelectedRow();
        
        String nomeNovo = jTxtNome.getText();
        String cpfNovo = jTxtCpf.getText();
        
        if (!isCamposValidos(nomeNovo, cpfNovo)) {
            JOptionPane.showMessageDialog(null, "Existe Campos em Branco", "ERRO", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
//cria um cliente novo com os dados alterados
        Cliente clienteNovo = new Cliente (nomeNovo, cpfNovo, cpfNovo, null, cpfNovo, null, null);
//exclui o cliente antigo usando o cpf que vem da seleçao de linha
        Long cpf = (Long)jTable1.getValueAt(linhaSelecionada, 1);
        this.clienteDAO.excluir(cpf);
        modelo.removeRow(linhaSelecionada);
//salva o novo cliente
        this.clienteDAO.cadastrar(clienteNovo);
        modelo.addRow(new Object[] {clienteNovo.getNome(), clienteNovo.getCpf()});
        JOptionPane.showMessageDialog(null, "Cliente Atualizado com SUCESSO", "ATUALIZADO", JOptionPane.INFORMATION_MESSAGE);
        limparCampos();

    }//GEN-LAST:event_jBtnAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAtualizar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnLimpar;
    private javax.swing.JButton jBtnSalvar;
    private javax.swing.JLabel jLblCidade;
    private javax.swing.JLabel jLblCpf;
    private javax.swing.JLabel jLblEmail;
    private javax.swing.JLabel jLblEndereco;
    private javax.swing.JLabel jLblEstado;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblNumero;
    private javax.swing.JLabel jLblTelefone;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtCpf;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtEstado;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtNumero;
    private javax.swing.JTextField jTxtTelefone;
    // End of variables declaration//GEN-END:variables

    private boolean isCamposValidos(String ...campos) {
        for (String campo : campos) {
            if (campos == null || "".equals(campo)) {
                return false;
            }
        }
        return true;
    }

    private void initCustomComponents() {

        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
//muda a tabela de acordo com os "valores" estabelecidos acima
        jTable1.setModel(modelo);
    }
    
    private void limparCampos () {
        
        jTxtNome.setText("");
        jTxtCpf.setText("");
        
    }
    
}
