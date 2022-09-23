/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceGrafica.conteudo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author mfm65
 */
public class aula10_JOptionPane extends JFrame implements ActionListener{
    
    static int soma = 0;
    private final JLabel labelTitulo;
    private final JLabel labelImagem;
    private final JButton botaoSoma;
    private final JButton botaoExecutar;
    private final JButton botaoResposta;
    private final JButton botaoSair;
    
    public aula10_JOptionPane(){
        Font fonteTexto = new Font("Verdana", Font.TRUETYPE_FONT, 36);
        Font fonteBotao = new Font("Verdana", Font.ITALIC, 14);
        
        labelTitulo = new JLabel("JOptionPane");
        labelTitulo.setFont(fonteTexto);
        labelTitulo.setBounds(250, 20, 400, 100);
        add(labelTitulo);
        
        Icon imagem = new ImageIcon("/imagensCursoUdemyJava/icone.png");
        labelImagem = new JLabel(imagem);
        labelImagem.setBounds(160, 100, 400, 200);
        add(labelImagem);
        
        botaoSoma = new JButton("Clique para somar +1");
        botaoSoma.setFont(fonteBotao);
        botaoSoma.setBounds(200, 360, 300, 20);
        botaoSoma.setForeground(Color.white);
        botaoSoma.setBackground(Color.black);
        botaoSoma.setOpaque(true);
        add(botaoSoma);
        botaoSoma.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent evento){
                    soma = soma + 1;
                    System.out.println("-> "+ soma);
                }
            }
        );
        
        botaoExecutar = new JButton("Executar");
        botaoExecutar.setBounds(200, 380, 300, 20);
        botaoExecutar.setFont(fonteBotao);
        add(botaoExecutar);
        botaoExecutar.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent evento){
                    JOptionPane.showMessageDialog(null,"Você clicou no botão","Clicou no botão",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        );
        
        botaoResposta = new JButton("Resposta de Usuario");
        botaoResposta.setFont(fonteBotao);
        botaoResposta.setBounds(200, 400, 300, 20);
        botaoResposta.setForeground(Color.black);
        botaoResposta.setBackground(Color.white);
        botaoResposta.setOpaque(true);
        add(botaoResposta);
        botaoResposta.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent evento){
                    int respostaUsuario = JOptionPane.showConfirmDialog(null, "Confirma a Ação?", "Confirme", JOptionPane.DEFAULT_OPTION);
                    if(respostaUsuario == JOptionPane.OK_OPTION){
                        labelTitulo.setText("Clicou em \"OK!\"");
                    } else {
                        labelTitulo.setText("Fechou o Programa");
                        labelTitulo.setBounds(210, 20, 400, 100);
                    }
                }
            }
        );
        
        botaoSair = new JButton("Sair");
        botaoSair.setFont(fonteBotao);
        botaoSair.setBounds(200, 420, 300, 20);
        botaoSair.setForeground(Color.white);
        botaoSair.setBackground(Color.red);
        botaoSair.setOpaque(true);
        add(botaoSair);
        botaoSair.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent evento){
                    System.exit(0);
                }
            }
        );
    }
    
    @Override
    public void actionPerformed(ActionEvent evento){
        
    }
    
    public static void main(String[] args) {
        aula10_JOptionPane form = new aula10_JOptionPane();
        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(0, 0, 700, 500);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setTitle("Aula 10");
    }
}
