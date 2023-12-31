/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.trabalhoFinal.UI;

import com.trabalhoFinal.Dominio.ExameBioquimico;
import com.trabalhoFinal.Lista.GerenciadorDeExame;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author lucas
 */
public class CadastrarExameBioquimicoPainel extends javax.swing.JPanel {

    private GerenciadorDeExame gde;
    private App app;

    /**
     * Creates new form CadastrarExamePanel
     */
    public CadastrarExameBioquimicoPainel(GerenciadorDeExame gde, App app) {
        initComponents();
        this.gde = gde;
        this.app = app;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Id = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        nome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        cpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JLabel();
        cadastrarBtn = new javax.swing.JButton();
        txtGlicose = new javax.swing.JTextField();
        txtColesterol = new javax.swing.JTextField();
        txtTriglicerideos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        voltarBtn = new javax.swing.JButton();

        Id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Id.setText("Id");

        txtId.setPreferredSize(new java.awt.Dimension(80, 22));

        nome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nome.setText("Nome");

        txtNome.setPreferredSize(new java.awt.Dimension(80, 22));

        cpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cpf.setText("CPF");

        txtCpf.setPreferredSize(new java.awt.Dimension(80, 22));

        txtTitulo.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        txtTitulo.setText("Cadastro de Exames Bioquimicos");

        cadastrarBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cadastrarBtn.setText("Cadastrar");
        cadastrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBtnActionPerformed(evt);
            }
        });

        txtGlicose.setPreferredSize(new java.awt.Dimension(80, 22));

        txtColesterol.setPreferredSize(new java.awt.Dimension(80, 22));

        txtTriglicerideos.setPreferredSize(new java.awt.Dimension(80, 22));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Glicose");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Colesterol");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Triglicerideos");

        voltarBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        voltarBtn.setText("Voltar");
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addComponent(txtTitulo)
                .addGap(154, 154, 154))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(cpf)
                        .addComponent(nome))
                    .addComponent(Id)
                    .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(txtColesterol, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(txtGlicose, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(txtTriglicerideos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(txtTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpf)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtGlicose, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtColesterol, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTriglicerideos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(199, 199, 199))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBtnActionPerformed
        JTextField[] campos = {txtId, txtNome, txtCpf, txtGlicose, txtColesterol, txtTriglicerideos};

        for (JTextField campo : campos) {
            if (campo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
                return;
            }
        }

        if (gde.procurarExame(txtId.getText()) != null) {
            JOptionPane.showMessageDialog(this, "ID já cadastrado, mude os caracteres do ID do exame.");
            return;
        }

        String id = txtId.getText();
        String nome = txtNome.getText();
        String cpf = txtCpf.getText();
        double glicose;
        double colesterol;
        double triglicerideos;

        try {
            glicose = Double.parseDouble(txtGlicose.getText());
            colesterol = Double.parseDouble(txtColesterol.getText());
            triglicerideos = Double.parseDouble(txtTriglicerideos.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira números válidos nos campos hemoglobina, leucócitos e plaquetas.");
            return;
        }
        
        Date dataAtual = new Date();

        ExameBioquimico novoExame = new ExameBioquimico(id, dataAtual, nome, cpf, glicose, colesterol, triglicerideos);
        gde.cadastrarExame(novoExame);
        JOptionPane.showMessageDialog(this, "Exame cadastrado com sucesso!");
        limparCampos();
    }//GEN-LAST:event_cadastrarBtnActionPerformed

    private void limparCampos() {
        // Limpa os campos de texto após o cadastro
        txtId.setText("");
        txtNome.setText("");
        txtCpf.setText("");
        txtGlicose.setText("");
        txtColesterol.setText("");
        txtTriglicerideos.setText("");
    }
    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        app.mudaPainel(App.PAINEL_PRINCIPAL);
    }//GEN-LAST:event_voltarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Id;
    private javax.swing.JButton cadastrarBtn;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField txtColesterol;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtGlicose;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JTextField txtTriglicerideos;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables

    void atualiza() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
