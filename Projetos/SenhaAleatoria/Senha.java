package SenhaAleatoria;
import javax.swing.*;
import java.awt.event.*;

public class Senha extends JFrame{
	private JTextField campoSenha;
	private JButton botao;
	
	public Senha(){
		campoSenha = new JTextField("");
		campoSenha.setBounds(50, 50, 400, 40);
		add(campoSenha);
		
		botao = new JButton("Gerar senha");
		botao.setBounds(150, 150, 200, 40);
		add(botao);
		botao.addActionListener(
		new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campoSenha.setText("");
				campoSenha.setText(gerarSenha());
			}
		});
	}
	
	public String gerarSenha() {
		int tamanhoSenha = (int)(Math.random()*20+10);
		String senha = "";
		String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$?";
		int random = 0;

		for(int i = 0; i < tamanhoSenha; i++) {
			random = (int)(Math.random()*65+0);
			senha = caracteres.charAt(random) + senha;
		}
		return senha;
	}
	
	
	public static void main(String[] args) {
		Senha form = new Senha();
		
		form.setLayout(null);
		form.setVisible(true);
		form.setBounds(0, 0, 500, 300);
		form.setLocationRelativeTo(null);
		form.setResizable(false);
		form.setDefaultCloseOperation(EXIT_ON_CLOSE);
		form.setTitle("Senha aleatória");
	}
}
