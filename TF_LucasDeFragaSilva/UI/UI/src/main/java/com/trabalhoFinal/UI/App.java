/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.trabalhoFinal.UI;

import com.trabalhoFinal.Calculo.CalculaEstatistica;
import com.trabalhoFinal.Lista.GerenciadorDeExame;

/**
 *
 * @author lucas
 */
public class App extends javax.swing.JFrame {

    private PainelPrincipal painelPrincipal;
    private VisualizarExamesPainel visualizarExamesPainel;
    private ProcurarExamePainel procurarExamePainel;
    private CadastrarExameSanguePainel cadastrarExameSanguePainel;
    private CadastrarExameBioquimicoPainel cadastrarExameBioquimicoPainel;
    private EditarExameSanguePainel editarExameSanguePainel;
    private EditarExameBioquimicoPainel editarExameBioquimicoPainel;
    private ExibirEstatisticasPainel exibirEstatisticaPainel;
    private GerenciadorDeExame gerenciadorDeExame;

    public static final int PAINEL_PRINCIPAL = 0;
    public static final int PAINEL_VISUALIZAR_EXAMES = 1;
    public static final int PAINEL_PROCURAR_EXAME = 2;
    public static final int PAINEL_CADASTRAR_EXAME_SANGUE = 3;
    public static final int PAINEL_CADASTRAR_EXAME_BIOQUIMICO = 4;
    public static final int PAINEL_EDITAR_EXAME_SANGUE = 5;
    public static final int PAINEL_EDITAR_EXAME_BIOQUIMICO = 6;
    public static final int PAINEL_EXIBIR_ESTATISTICAS = 7;

    /**
     * Creates new form App
     *
     * @param painelPrincipal
     */
    public App(GerenciadorDeExame gerenciadorDeExame) {
        super();
        initComponents();
        this.gerenciadorDeExame = gerenciadorDeExame;
        this.painelPrincipal = new PainelPrincipal(gerenciadorDeExame, this);
        visualizarExamesPainel = new VisualizarExamesPainel(gerenciadorDeExame, this);
        procurarExamePainel = new ProcurarExamePainel(gerenciadorDeExame, this);
        cadastrarExameSanguePainel = new CadastrarExameSanguePainel(gerenciadorDeExame, this);
        cadastrarExameBioquimicoPainel = new CadastrarExameBioquimicoPainel(gerenciadorDeExame, this);
        editarExameSanguePainel = new EditarExameSanguePainel(gerenciadorDeExame, this);
        editarExameBioquimicoPainel = new EditarExameBioquimicoPainel(gerenciadorDeExame, this);
        exibirEstatisticaPainel = new ExibirEstatisticasPainel(gerenciadorDeExame, this);

        this.setContentPane(painelPrincipal);
        setTitle("Laboratório - Sistema de Gestão de Exames");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mudaPainel(int painel) {
        switch (painel) {
            case PAINEL_PRINCIPAL:
                this.setContentPane(painelPrincipal);
                break;
            case PAINEL_VISUALIZAR_EXAMES:
                visualizarExamesPainel.atualiza();
                this.setContentPane(visualizarExamesPainel);
                this.pack();
                this.setSize(800, 600);
                break;
            case PAINEL_PROCURAR_EXAME:
                this.setContentPane(procurarExamePainel);
                pack();
                this.setSize(800, 600);
                break;
            case PAINEL_CADASTRAR_EXAME_SANGUE:
                this.setContentPane(cadastrarExameSanguePainel);
                pack();
                this.setSize(800, 600);
                break;
            case PAINEL_CADASTRAR_EXAME_BIOQUIMICO:
                this.setContentPane(cadastrarExameBioquimicoPainel);
                pack();
                this.setSize(800, 600);
                break;
            case PAINEL_EDITAR_EXAME_SANGUE:
                this.setContentPane(editarExameSanguePainel);
                pack();
                this.setSize(800, 600);
                break;
            case PAINEL_EDITAR_EXAME_BIOQUIMICO:
                this.setContentPane(editarExameBioquimicoPainel);
                pack();
                this.setSize(800, 600);
                break;
            case PAINEL_EXIBIR_ESTATISTICAS:
                exibirEstatisticaPainel.atualizarEstatisticas();
                this.setContentPane(exibirEstatisticaPainel);
                pack();
                this.setSize(800, 600);
                break;
            default:
                break;
        }

        // Ajusta o tamanho do frame e revalida/repinta após a mudança de conteúdo.
        this.revalidate();
        this.repaint();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
