package mod1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;

public class janela {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janela window = new janela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public janela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seja Bem-Vindo!");
		lblNewLabel.setBounds(22, 11, 155, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JButton Bret = new JButton("Retangulo");
		Bret.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			            System.out.println("Button pressed!");
			    		JLabel testebotao = new JLabel("TESTE");
			    		testebotao.setBounds(40, 180, 46, 14);
			    		frame.getContentPane().add(testebotao);
			}
		});
		Bret.setBounds(22, 119, 89, 23);
		frame.getContentPane().add(Bret);
		
		JButton btnNewButton_1 = new JButton("Circulo");
		btnNewButton_1.setBounds(159, 119, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sair");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(300, 119, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
