package control;

import javax.swing.JOptionPane;

import view.telaPessoas;

public class telaPessoasController {
	private telaPessoas view;

	public telaPessoasController(telaPessoas view) {
		this.view = view;
	}

	public void habilitaCampos(boolean habilita) {
		view.getTxtCod().setEnabled(habilita);
		view.getTxtCpf().setEnabled(habilita);
		view.getTxtData().setEnabled(habilita);
		view.getTxtEmail().setEnabled(habilita);
		view.getTxtNome().setEnabled(habilita);
	}

	public void evento(String evento) {
		switch (evento) {
		case "BTN_NOVO_ONCLICK":
			habilitaCampos(true);
			view.getTxtEmail().setText("email@email.com.br");
			break;

		default:
			JOptionPane.showMessageDialog(null, "erro ao executar evento!");
			break;
		}
	}
}
