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
public class aula11_JOptionPane extends JFrame implements ActionListener{
    
    static int soma = 0;
    private final JLabel labelTitulo;
    private final JLabel labelImagem;
    private final JButton botaoSoma;
    private final JButton botaoExecutar;
    private final JButton botaoResposta;
    private final JButton botaoSair;

    
    public aula11_JOptionPane(){
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
        
        botaoSoma = new JButton("Clique para soma +1");
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
                    System.out.println("-> " + soma);
                }
            }
        );
        
        botaoExecutar = new JButton("Executar");
        botaoExecutar.setFont(fonteBotao);
        botaoExecutar.setBounds(200, 380, 300, 20);
        add(botaoExecutar);
        botaoExecutar.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent evento){
                    JOptionPane.showMessageDialog(null, "Você clicou no botão", "Clicou no botão", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        );
        
        botaoResposta = new JButton("Resposta de Usuário");
        botaoResposta.setFont(fonteBotao);
        botaoResposta.setBounds(200, 400, 300, 20);
        botaoResposta.setForeground(Color.white);
        botaoResposta.setBackground(Color.LIGHT_GRAY);
        botaoResposta.setOpaque(true);
        add(botaoResposta);
        botaoResposta.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent evento){
                    int respostaUsuario = JOptionPane.showConfirmDialog(null, "Você confima a ação?", "Confirmar Ação", JOptionPane.YES_NO_CANCEL_OPTION);
                
                    if(respostaUsuario == 0){
                        labelTitulo.setText("Clicou em \"OK!\"");
                        labelTitulo.setBounds(210, 20, 400, 100);
                    } else if (respostaUsuario == 1){
                        labelTitulo.setText("Clicou em \"NÃO!\"");
                        labelTitulo.setBounds(210, 20, 400, 100);
                    } else {
                        System.exit(0);
                    }
                }
            }
        );
        
        botaoSair = new JButton("Sair");
        botaoSair.setFont(fonteBotao);
        botaoSair.setBounds(200, 420, 300, 20);
        botaoSair.setForeground(Color.black);
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
        aula11_JOptionPane form = new aula11_JOptionPane();
        form.setLayout(null);
        form.setVisible(true);
        form.setBounds(0, 0, 700, 500);
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setResizable(false);
        form.setTitle("Aula 11");
    }
}
