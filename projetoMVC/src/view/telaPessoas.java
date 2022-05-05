package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.telaPessoasController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class telaPessoas extends JFrame {

	private telaPessoasController controller;

	private JPanel contentPane;
	private JTextField txtCod;
	private JTextField txtNome;
	private JTextField txtData;
	private JTextField txtCpf;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaPessoas frame = new telaPessoas();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public telaPessoas() {

		controller = new telaPessoasController(this); // instancia controller

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 450, 263);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblCd = new JLabel("cód:");
		lblCd.setBounds(12, 22, 70, 15);
		panel.add(lblCd);

		txtCod = new JTextField();
		txtCod.setBounds(12, 37, 114, 19);
		panel.add(txtCod);
		txtCod.setColumns(10);

		JLabel lblNome = new JLabel("nome:");
		lblNome.setBounds(169, 12, 70, 25);
		panel.add(lblNome);

		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(138, 37, 114, 19);
		panel.add(txtNome);

		JLabel lblCd_1 = new JLabel("data");
		lblCd_1.setBounds(12, 74, 70, 15);
		panel.add(lblCd_1);

		txtData = new JTextField();
		txtData.setColumns(10);
		txtData.setBounds(12, 89, 114, 19);
		panel.add(txtData);

		JLabel lblCd_1_1 = new JLabel("cpf");
		lblCd_1_1.setBounds(148, 74, 70, 15);
		panel.add(lblCd_1_1);

		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(148, 89, 114, 19);
		panel.add(txtCpf);

		JLabel lblCd_1_1_1 = new JLabel("email");
		lblCd_1_1_1.setBounds(12, 111, 70, 15);
		panel.add(lblCd_1_1_1);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(12, 126, 397, 19);
		panel.add(txtEmail);

		JButton btnNovo = new JButton("novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.evento("BTN_NOVO_ONCLICK"); // aqui chama um evento
			}
		});
		btnNovo.setBounds(22, 157, 117, 25);
		panel.add(btnNovo);

		controller.habilitaCampos(false); // aqui chama uma função
	}

	public JTextField getTxtCod() {
		return txtCod;
	}

	public JTextField getTxtNome() {
		return txtNome;
	}

	public JTextField getTxtData() {
		return txtData;
	}

	public JTextField getTxtCpf() {
		return txtCpf;
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

}
