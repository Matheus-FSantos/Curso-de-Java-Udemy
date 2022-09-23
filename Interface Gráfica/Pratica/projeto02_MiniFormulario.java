/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.interfaceGrafica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author mfm65
 */
public class projeto02_MiniFormulario extends JFrame implements ActionListener{
    
    //Vars Globais
    int idade = 0;
    String CPF = "";
    String mais = "";
    String sexo = "";
    
    //Textos
    private final JLabel labelTexto;
    private final JLabel labelNome;
    private final JLabel labelIdade;
    private final JLabel labelCPF;
    private final JLabel labelEndereco;
    private final JLabel labelSexo;
    private final JLabel labelMais;
    private final JLabel background;
    
    //Campos
    private final JTextField campoNome;
    private final JTextField campoIdade;
    private final JTextField campoCPF;
    private final JTextField campoEndereco;
    private final JComboBox campoSexo;
    private final JTextArea campoMais;
    
    //Barra de Rolagem
    private final JScrollPane barra;
    
    //Imagens
    private final JLabel labelImagemFormulario;
    
    //Botao
    private final JButton botaoConfirmar;
    private final JButton botaoSair;
    
    
    public projeto02_MiniFormulario(){
        Font fonteLabel = new Font("SansSerif", Font.BOLD, 28);
        Font fonteCampos = new Font("SansSerif", Font.ITALIC, 16);
        Font fonteMais = new Font("SansSerif", Font.TRUETYPE_FONT, 20);
        labelTexto = new JLabel("Formulário:");
        labelTexto.setFont(fonteLabel);
        labelTexto.setForeground(Color.gray);
        labelTexto.setBounds(220, 0, 200, 50);
        add(labelTexto);
        
        Icon imagem = new ImageIcon("/imagensCursoUdemyJava/imagemProjetoFormulario/imagemFormulario.png");
        labelImagemFormulario = new JLabel(imagem);
        labelImagemFormulario.setBounds(270, 50, 48, 48);
        add(labelImagemFormulario);
        
        //Seção Nome:
        labelNome = new JLabel("*Informe o seu nome:");
        labelNome.setFont(fonteCampos);
        labelNome.setForeground(Color.gray);
        labelNome.setBounds(60, 100, 200, 30);
        add(labelNome);
        
        campoNome = new JTextField();
        campoNome.setFont(fonteCampos);
        campoNome.setForeground(Color.gray);
        campoNome.setBorder(null);
        campoNome.setOpaque(true);
        campoNome.setBounds(60, 130, 200, 30);
        add(campoNome);
        
        //Seção idade
        labelIdade = new JLabel("*Informe a sua idade:");
        labelIdade.setFont(fonteCampos);
        labelIdade.setForeground(Color.gray);
        labelIdade.setBounds(330, 100, 200, 30);
        add(labelIdade);
        
        campoIdade = new JTextField();
        campoIdade.setFont(fonteCampos);
        campoIdade.setForeground(Color.gray);
        campoIdade.setBorder(null);
        campoIdade.setOpaque(true);
        campoIdade.setBounds(330, 130, 200, 30);
        add(campoIdade);
        
        //Seção CPF
        labelCPF = new JLabel("*Informe o seu CPF:");
        labelCPF.setFont(fonteCampos);
        labelCPF.setForeground(Color.gray);
        labelCPF.setBounds(60, 200, 200, 30);
        add(labelCPF);
        
        campoCPF = new JTextField();
        campoCPF.setFont(fonteCampos);
        campoCPF.setForeground(Color.gray);
        campoCPF.setBorder(null);
        campoCPF.setOpaque(true);
        campoCPF.setBounds(60, 230, 200, 30);
        add(campoCPF);
        
        //Seção Endereço
        labelEndereco = new JLabel("Informe o seu endereço:");
        labelEndereco.setFont(fonteCampos);
        labelEndereco.setForeground(Color.gray);
        labelEndereco.setBounds(330, 200, 200, 30);
        add(labelEndereco);
        
        campoEndereco = new JTextField();
        campoEndereco.setFont(fonteCampos);
        campoEndereco.setForeground(Color.gray);
        campoEndereco.setBorder(null);
        campoEndereco.setOpaque(true);
        campoEndereco.setBounds(330, 230, 200, 30);
        add(campoEndereco);
        
        //Seção Sexo
        labelSexo = new JLabel("Informe o seu sexo:");
        labelSexo.setFont(fonteCampos);
        labelSexo.setForeground(Color.gray);
        labelSexo.setBounds(60, 300, 200, 30);
        add(labelSexo);
        
        campoSexo = new JComboBox();
        campoSexo.setFont(fonteCampos);
        campoSexo.setForeground(Color.gray);
        campoSexo.setBackground(Color.white);
        campoSexo.setBorder(null);
        campoSexo.setBounds(60, 330, 200, 30);
        add(campoSexo);
        campoSexo.addItem("Selecione...");
        campoSexo.addItem("Masculino");
        campoSexo.addItem("Feminino");
        campoSexo.addItem("Outro");
        campoSexo.addItemListener(
            new ItemListener(){
                @Override
                public void itemStateChanged(ItemEvent evento){
                    sexo = campoSexo.getSelectedItem().toString();
                    
                }
            }
        );
        
        //Seção Mais
        labelMais = new JLabel("Sobre Você:");
        labelMais.setFont(fonteCampos);
        labelMais.setForeground(Color.gray);
        labelMais.setBorder(null);
        labelMais.setBounds(60, 400, 200, 30);
        add(labelMais);
        
        campoMais = new JTextArea();
        campoMais.setFont(fonteMais);
        campoMais.setBorder(null);
        campoMais.setForeground(Color.gray);
        
        barra = new JScrollPane(campoMais);
        barra.setBounds(60, 430, 470, 180);
        add(barra);
        
        //Seção Botão
        botaoConfirmar = new JButton("Confirmar");
        botaoConfirmar.setFont(fonteCampos);
        botaoConfirmar.setBounds(200, 680, 200, 30);
        add(botaoConfirmar);
        botaoConfirmar.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent evento){
                    if (("".equals(campoNome.getText()) || "".equals(campoIdade.getText())) || ("".equals(campoCPF.getText()))){
                            JOptionPane.showMessageDialog(null, "Existem campos OBRIGATÓRIOS não preenchidos", "Preencha todos os campos", JOptionPane.INFORMATION_MESSAGE);
                    } else{
                        String nome = campoNome.getText();
                        idade = Integer.parseInt(campoIdade.getText());
                        CPF = campoCPF.getText();
                        mais = campoMais.getText();
                        if (CPF.length() != 11){
                            JOptionPane.showMessageDialog(null, "Informe um CPF válido", "CPF Inválido", JOptionPane.WARNING_MESSAGE);
                        } else {
                            if (sexo.equals("Selecione...") || sexo.equals("")){
                                JOptionPane.showMessageDialog(null, "Informe um sexo válido", "Sexo Inválido", JOptionPane.WARNING_MESSAGE);
                            } else {
                                if (idade < 18) {
                                    int res = JOptionPane.showConfirmDialog(null, "Não pode acessar", "Menor de idade", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                                    if (res == JOptionPane.OK_OPTION || (res == JOptionPane.CANCEL_OPTION || res == JOptionPane.CLOSED_OPTION)){
                                        System.exit(0);
                                    }
                                }

                                System.out.println("\n----Informações do Usuário----");
                                System.out.println("\nNome: " + nome + "\nIdade: " + idade + "\nCPF: " + CPF + "\nSexo: " + sexo + "\nSobre: " + mais);
                                System.out.println();

                                campoNome.setText("");
                                campoIdade.setText("");
                                campoCPF.setText("");
                                campoEndereco.setText("");
                                campoSexo.setSelectedIndex(0);
                                campoMais.setText("");

                                JOptionPane.showMessageDialog(null, "Seus dados foram Salvos", "Dados salvos", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                }
            }
        );
        
        botaoSair = new JButton("Sair");
        botaoSair.setFont(fonteCampos);
        botaoSair.setBounds(200, 720, 200, 30);
        add(botaoSair);
        botaoSair.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent evento){
                   int res = JOptionPane.showConfirmDialog(null, "Deseja realmente Sair?", "Sair", JOptionPane.YES_NO_CANCEL_OPTION);
                   if (res == JOptionPane.YES_OPTION){
                       System.exit(0);
                   }
                }
            }
        );
        
        //Seção Backgrond
        Icon imagem2 = new ImageIcon("/imagensCursoUdemyJava/background/azulClaro2.jpg");
        background = new JLabel(imagem2);
        background.setBounds(0, 0, 600, 800);
        add(background);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento){
        
    }
    
    public static void main(String[] args) {
        projeto02_MiniFormulario form = new projeto02_MiniFormulario();
        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(0, 0, 600, 800);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setTitle("Formulário");
    }
}
