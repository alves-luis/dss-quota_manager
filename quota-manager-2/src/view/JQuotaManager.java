/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Observable;
import java.util.Observer;
import javax.swing.event.TableModelEvent;
import javax.swing.table.TableModel;
import model.Aluno;
import model.AlunoNaoExisteException;
import model.AtualizaDadosException;
import model.GestaoAlunos;

/**
 *
 * @author Luís Alves
 */
public class JQuotaManager extends javax.swing.JFrame implements Observer {

    private TableModel tableModel;
    private GestaoAlunos model;
    private Aluno alunoSelecionado;

    /**
     * Creates new form ConsultarAlunos
     */
    public JQuotaManager(TableModel modelo, GestaoAlunos model) {
        this.tableModel = modelo;
        this.model = model;
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdicionarAluno = new javax.swing.JFrame();
        adicionarAluno_butaoAdicionar = new javax.swing.JButton();
        adicionarAluno_butaoFechar = new javax.swing.JButton();
        adicionarAluno_labelNome = new javax.swing.JLabel();
        adicionarAluno_fieldNome = new javax.swing.JTextField();
        adicionarAluno_fieldNumero = new javax.swing.JTextField();
        adicionarAluno_labelNumero = new javax.swing.JLabel();
        adicionarAluno_labelCurso = new javax.swing.JLabel();
        adicionarAluno_fieldCurso = new javax.swing.JTextField();
        adicionarAluno_labelAno = new javax.swing.JLabel();
        adicionarAluno_fieldAno = new javax.swing.JTextField();
        adicionarAluno_labelMes = new javax.swing.JLabel();
        adicionarAluno_fieldMes = new javax.swing.JTextField();
        adicionarAluno_labelDia = new javax.swing.JLabel();
        adicionarAluno_fieldDia = new javax.swing.JTextField();
        adicionarAluno_labelMorada = new javax.swing.JLabel();
        adicionarAluno_fieldMorada = new javax.swing.JTextField();
        MenuSocio = new javax.swing.JFrame();
        menuSocio_butaoPagarQuotas = new javax.swing.JButton();
        menuSocio_butaoFechar = new javax.swing.JButton();
        menuSocio_butaoAtualizar = new javax.swing.JButton();
        menuSocio_labelNome = new javax.swing.JLabel();
        menuSocio_fieldNome = new javax.swing.JTextField();
        menuSocio_labelNumero = new javax.swing.JLabel();
        menuSocio_fieldNumero = new javax.swing.JTextField();
        menuSocio_labelCurso = new javax.swing.JLabel();
        menuSocio_fieldCurso = new javax.swing.JTextField();
        menuSocio_labelAno = new javax.swing.JLabel();
        menuSocio_fieldAno = new javax.swing.JTextField();
        menuSocio_labelMes = new javax.swing.JLabel();
        menuSocio_fieldMes = new javax.swing.JTextField();
        menuSocio_labelDia = new javax.swing.JLabel();
        menuSocio_fieldDia = new javax.swing.JTextField();
        menuSocio_labelMorada = new javax.swing.JLabel();
        menuSocio_fieldMorada = new javax.swing.JTextField();
        scrollPane = new javax.swing.JScrollPane();
        tabela_Socios = new javax.swing.JTable();
        mainMenu = new javax.swing.JMenuBar();
        menu_Gestao = new javax.swing.JMenu();
        adicionarSocio_menuItem = new javax.swing.JMenuItem();

        adicionarAluno_butaoAdicionar.setText("Adicionar");
        adicionarAluno_butaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarAluno_butaoAdicionarActionPerformed(evt);
            }
        });

        adicionarAluno_butaoFechar.setText("Fechar");
        adicionarAluno_butaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarAluno_butaoFecharActionPerformed(evt);
            }
        });

        adicionarAluno_labelNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adicionarAluno_labelNome.setText("Nome");

        adicionarAluno_fieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarAluno_fieldNumeroActionPerformed(evt);
            }
        });

        adicionarAluno_labelNumero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adicionarAluno_labelNumero.setText("Número");

        adicionarAluno_labelCurso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adicionarAluno_labelCurso.setText("Curso");

        adicionarAluno_labelAno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adicionarAluno_labelAno.setText("Ano");
        adicionarAluno_labelAno.setToolTipText("Ano de Registo");

        adicionarAluno_labelMes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adicionarAluno_labelMes.setText("Mês");

        adicionarAluno_fieldMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        adicionarAluno_labelDia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adicionarAluno_labelDia.setText("Dia");

        adicionarAluno_labelMorada.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adicionarAluno_labelMorada.setText("Morada");

        javax.swing.GroupLayout AdicionarAlunoLayout = new javax.swing.GroupLayout(AdicionarAluno.getContentPane());
        AdicionarAluno.getContentPane().setLayout(AdicionarAlunoLayout);
        AdicionarAlunoLayout.setHorizontalGroup(
            AdicionarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdicionarAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AdicionarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdicionarAlunoLayout.createSequentialGroup()
                        .addComponent(adicionarAluno_labelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adicionarAluno_fieldCurso))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdicionarAlunoLayout.createSequentialGroup()
                        .addComponent(adicionarAluno_labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adicionarAluno_fieldNome))
                    .addGroup(AdicionarAlunoLayout.createSequentialGroup()
                        .addGap(0, 232, Short.MAX_VALUE)
                        .addComponent(adicionarAluno_butaoAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adicionarAluno_butaoFechar))
                    .addGroup(AdicionarAlunoLayout.createSequentialGroup()
                        .addComponent(adicionarAluno_labelMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adicionarAluno_fieldMorada))
                    .addGroup(AdicionarAlunoLayout.createSequentialGroup()
                        .addGroup(AdicionarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AdicionarAlunoLayout.createSequentialGroup()
                                .addComponent(adicionarAluno_labelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(adicionarAluno_fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AdicionarAlunoLayout.createSequentialGroup()
                                .addComponent(adicionarAluno_labelAno, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(adicionarAluno_fieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(adicionarAluno_labelMes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(adicionarAluno_fieldMes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(adicionarAluno_labelDia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(adicionarAluno_fieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        AdicionarAlunoLayout.setVerticalGroup(
            AdicionarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdicionarAlunoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(AdicionarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarAluno_fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adicionarAluno_labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AdicionarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarAluno_fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adicionarAluno_labelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AdicionarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarAluno_fieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adicionarAluno_labelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AdicionarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarAluno_labelAno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adicionarAluno_fieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adicionarAluno_labelDia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adicionarAluno_fieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adicionarAluno_fieldMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adicionarAluno_labelMes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AdicionarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarAluno_fieldMorada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adicionarAluno_labelMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(AdicionarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarAluno_butaoAdicionar)
                    .addComponent(adicionarAluno_butaoFechar))
                .addContainerGap())
        );

        menuSocio_butaoPagarQuotas.setText("Pagar Quotas");
        menuSocio_butaoPagarQuotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSocio_butaoPagarQuotasActionPerformed(evt);
            }
        });
        menuSocio_butaoPagarQuotas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                menuSocio_butaoPagarQuotasPropertyChange(evt);
            }
        });

        menuSocio_butaoFechar.setText("Fechar");
        menuSocio_butaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSocio_butaoFecharActionPerformed(evt);
            }
        });

        menuSocio_butaoAtualizar.setText("Atualizar Dados");
        menuSocio_butaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSocio_butaoAtualizarActionPerformed(evt);
            }
        });

        menuSocio_labelNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menuSocio_labelNome.setText("Nome");

        menuSocio_labelNumero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menuSocio_labelNumero.setText("Número");

        menuSocio_fieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSocio_fieldNumeroActionPerformed(evt);
            }
        });

        menuSocio_labelCurso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menuSocio_labelCurso.setText("Curso");

        menuSocio_labelAno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menuSocio_labelAno.setText("Ano");
        menuSocio_labelAno.setToolTipText("Ano de Registo");

        menuSocio_labelMes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menuSocio_labelMes.setText("Mês");

        menuSocio_fieldMes.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        menuSocio_labelDia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menuSocio_labelDia.setText("Dia");

        menuSocio_labelMorada.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menuSocio_labelMorada.setText("Morada");

        javax.swing.GroupLayout MenuSocioLayout = new javax.swing.GroupLayout(MenuSocio.getContentPane());
        MenuSocio.getContentPane().setLayout(MenuSocioLayout);
        MenuSocioLayout.setHorizontalGroup(
            MenuSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuSocioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuSocioLayout.createSequentialGroup()
                        .addComponent(menuSocio_butaoPagarQuotas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menuSocio_butaoAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuSocio_butaoFechar))
                    .addGroup(MenuSocioLayout.createSequentialGroup()
                        .addComponent(menuSocio_labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(menuSocio_fieldNome))
                    .addGroup(MenuSocioLayout.createSequentialGroup()
                        .addComponent(menuSocio_labelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(menuSocio_fieldCurso))
                    .addGroup(MenuSocioLayout.createSequentialGroup()
                        .addGroup(MenuSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuSocioLayout.createSequentialGroup()
                                .addComponent(menuSocio_labelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(menuSocio_fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuSocioLayout.createSequentialGroup()
                                .addComponent(menuSocio_labelAno, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(menuSocio_fieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menuSocio_labelMes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(menuSocio_fieldMes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menuSocio_labelDia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(menuSocio_fieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addGroup(MenuSocioLayout.createSequentialGroup()
                        .addComponent(menuSocio_labelMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(menuSocio_fieldMorada)))
                .addContainerGap())
        );
        MenuSocioLayout.setVerticalGroup(
            MenuSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuSocioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuSocio_fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuSocio_labelNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuSocio_labelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuSocio_fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuSocio_labelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuSocio_fieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuSocio_labelAno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuSocio_fieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuSocio_labelMes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuSocio_fieldMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuSocio_labelDia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuSocio_fieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuSocio_labelMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuSocio_fieldMorada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(MenuSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuSocio_butaoPagarQuotas)
                    .addComponent(menuSocio_butaoFechar)
                    .addComponent(menuSocio_butaoAtualizar))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabela_Socios.setModel(tableModel);
        tabela_Socios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_SociosMouseClicked(evt);
            }
        });
        tabela_Socios.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tabela_SociosPropertyChange(evt);
            }
        });
        scrollPane.setViewportView(tabela_Socios);

        menu_Gestao.setText("Novo");
        menu_Gestao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_GestaoActionPerformed(evt);
            }
        });

        adicionarSocio_menuItem.setText("Sócio");
        adicionarSocio_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarSocio_menuItemActionPerformed(evt);
            }
        });
        menu_Gestao.add(adicionarSocio_menuItem);

        mainMenu.add(menu_Gestao);

        setJMenuBar(mainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabela_SociosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tabela_SociosPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tabela_SociosPropertyChange

    private void adicionarSocio_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarSocio_menuItemActionPerformed
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        AdicionarAluno.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        AdicionarAluno.setSize(600,300);
        AdicionarAluno.setVisible(true);
    }//GEN-LAST:event_adicionarSocio_menuItemActionPerformed

    private void menu_GestaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_GestaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_GestaoActionPerformed

    private void adicionarAluno_butaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarAluno_butaoAdicionarActionPerformed
        if (this.adicionarAluno_validaCamposVazios()) {
            int ano = Integer.parseInt(adicionarAluno_fieldAno.getText());
            int dia = Integer.parseInt(adicionarAluno_fieldDia.getText());
            int mes = Integer.parseInt(adicionarAluno_fieldMes.getText());
            String curso = adicionarAluno_fieldCurso.getText();
            String morada = adicionarAluno_fieldMorada.getText();
            String nome = adicionarAluno_fieldNome.getText();
            int numero = Integer.parseInt(adicionarAluno_fieldNumero.getText());
            try {
                this.model.addAluno(new Aluno(numero,nome,curso, morada,LocalDate.of(ano,mes,dia)));
                this.tabela_Socios.tableChanged(new TableModelEvent(tableModel));
            }
            catch (DateTimeException e) {
                javax.swing.JOptionPane.showMessageDialog(this.AdicionarAluno, "Data de registo inválida!", "Data inválida", 0);
            }
        }
    }//GEN-LAST:event_adicionarAluno_butaoAdicionarActionPerformed

    private void adicionarAluno_fieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarAluno_fieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adicionarAluno_fieldNumeroActionPerformed

    private void menuSocio_butaoPagarQuotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSocio_butaoPagarQuotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSocio_butaoPagarQuotasActionPerformed

    private void menuSocio_butaoPagarQuotasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_menuSocio_butaoPagarQuotasPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSocio_butaoPagarQuotasPropertyChange

    private void menuSocio_butaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSocio_butaoFecharActionPerformed
        this.MenuSocio.setVisible(false);
    }//GEN-LAST:event_menuSocio_butaoFecharActionPerformed

    private void menuSocio_butaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSocio_butaoAtualizarActionPerformed
        if (this.menuSocio_validaCamposVazios()) {
            int ano = Integer.parseInt(menuSocio_fieldAno.getText());
            int dia = Integer.parseInt(menuSocio_fieldDia.getText());
            int mes = Integer.parseInt(menuSocio_fieldMes.getText());
            String curso = menuSocio_fieldCurso.getText();
            String morada = menuSocio_fieldMorada.getText();
            String nome = menuSocio_fieldNome.getText();
            int numero = Integer.parseInt(menuSocio_fieldNumero.getText());
            try {
                this.model.atualizaDados(alunoSelecionado, numero, nome, curso, morada, LocalDate.of(ano,mes,dia));
                this.tabela_Socios.tableChanged(new TableModelEvent(tableModel));
            }
            catch (AtualizaDadosException e) {
                javax.swing.JOptionPane.showMessageDialog(this.MenuSocio, "Tentou atualizar o nº para um nº já existente. Tente novamente com outro número!", "Erro de atualização!", 0);
            }
        }
    }//GEN-LAST:event_menuSocio_butaoAtualizarActionPerformed

    private void menuSocio_fieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSocio_fieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSocio_fieldNumeroActionPerformed

    private void adicionarAluno_butaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarAluno_butaoFecharActionPerformed
        AdicionarAluno.setVisible(false);
    }//GEN-LAST:event_adicionarAluno_butaoFecharActionPerformed

    private void tabela_SociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_SociosMouseClicked
        int row = this.tabela_Socios.rowAtPoint(evt.getPoint());
        int column = this.tabela_Socios.columnAtPoint(evt.getPoint());
        try {
            Aluno a = this.model.getAluno((Integer)this.tableModel.getValueAt(row,0));
            LocalDate anoRegisto = a.getAnoRegisto();
            this.menuSocio_fieldAno.setText(String.valueOf(anoRegisto.getYear()));
            this.menuSocio_fieldMes.setText(String.valueOf(anoRegisto.getMonthValue()));
            this.menuSocio_fieldDia.setText(String.valueOf(anoRegisto.getDayOfMonth()));
            this.menuSocio_fieldCurso.setText(a.getCurso());
            this.menuSocio_fieldMorada.setText(a.getMorada());
            this.menuSocio_fieldNome.setText(a.getNome());
            this.menuSocio_fieldNumero.setText(String.valueOf(a.getNumero()));
            this.alunoSelecionado = a;
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            this.MenuSocio.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
            this.MenuSocio.setSize(600,300);
            this.MenuSocio.setVisible(true);
        }
        catch (AlunoNaoExisteException e) {
            System.out.println("Aluno não existe!");
        }
    }//GEN-LAST:event_tabela_SociosMouseClicked

  
    private boolean adicionarAluno_validaCamposVazios() {
        boolean flag = this.adicionarAluno_fieldAno.getText().equals("") ||
                      this.adicionarAluno_fieldCurso.getText().equals("") ||
                      this.adicionarAluno_fieldDia.getText().equals("") ||
                      this.adicionarAluno_fieldMes.getText().equals("") ||
                      this.adicionarAluno_fieldMorada.getText().equals("") ||
                      this.adicionarAluno_fieldNome.getText().equals("") ||
                      this.adicionarAluno_fieldNumero.getText().equals("");
        if (flag)
            javax.swing.JOptionPane.showMessageDialog(this.AdicionarAluno, "Tem dados por preencher!", "Dados incompletos", 0);
        return !flag;
    }
    
    private boolean menuSocio_validaCamposVazios() {
        boolean flag = this.menuSocio_fieldAno.getText().equals("") ||
                      this.menuSocio_fieldCurso.getText().equals("") ||
                      this.menuSocio_fieldDia.getText().equals("") ||
                      this.menuSocio_fieldMes.getText().equals("") ||
                      this.menuSocio_fieldMorada.getText().equals("") ||
                      this.menuSocio_fieldNome.getText().equals("") ||
                      this.menuSocio_fieldNumero.getText().equals("");
        if (flag)
            javax.swing.JOptionPane.showMessageDialog(this.MenuSocio, "Tem dados por preencher!", "Dados incompletos", 0);
        return !flag;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame AdicionarAluno;
    private javax.swing.JFrame MenuSocio;
    private javax.swing.JButton adicionarAluno_butaoAdicionar;
    private javax.swing.JButton adicionarAluno_butaoFechar;
    private javax.swing.JTextField adicionarAluno_fieldAno;
    private javax.swing.JTextField adicionarAluno_fieldCurso;
    private javax.swing.JTextField adicionarAluno_fieldDia;
    private javax.swing.JTextField adicionarAluno_fieldMes;
    private javax.swing.JTextField adicionarAluno_fieldMorada;
    private javax.swing.JTextField adicionarAluno_fieldNome;
    private javax.swing.JTextField adicionarAluno_fieldNumero;
    private javax.swing.JLabel adicionarAluno_labelAno;
    private javax.swing.JLabel adicionarAluno_labelCurso;
    private javax.swing.JLabel adicionarAluno_labelDia;
    private javax.swing.JLabel adicionarAluno_labelMes;
    private javax.swing.JLabel adicionarAluno_labelMorada;
    private javax.swing.JLabel adicionarAluno_labelNome;
    private javax.swing.JLabel adicionarAluno_labelNumero;
    private javax.swing.JMenuItem adicionarSocio_menuItem;
    private javax.swing.JMenuBar mainMenu;
    private javax.swing.JButton menuSocio_butaoAtualizar;
    private javax.swing.JButton menuSocio_butaoFechar;
    private javax.swing.JButton menuSocio_butaoPagarQuotas;
    private javax.swing.JTextField menuSocio_fieldAno;
    private javax.swing.JTextField menuSocio_fieldCurso;
    private javax.swing.JTextField menuSocio_fieldDia;
    private javax.swing.JTextField menuSocio_fieldMes;
    private javax.swing.JTextField menuSocio_fieldMorada;
    private javax.swing.JTextField menuSocio_fieldNome;
    private javax.swing.JTextField menuSocio_fieldNumero;
    private javax.swing.JLabel menuSocio_labelAno;
    private javax.swing.JLabel menuSocio_labelCurso;
    private javax.swing.JLabel menuSocio_labelDia;
    private javax.swing.JLabel menuSocio_labelMes;
    private javax.swing.JLabel menuSocio_labelMorada;
    private javax.swing.JLabel menuSocio_labelNome;
    private javax.swing.JLabel menuSocio_labelNumero;
    private javax.swing.JMenu menu_Gestao;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tabela_Socios;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
