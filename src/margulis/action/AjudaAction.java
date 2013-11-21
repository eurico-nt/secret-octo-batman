package margulis.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 
 * @author �ndrei
 * 
 */
public class AjudaAction extends AbstractAction {

	private static final long serialVersionUID = 1L;

	private JFrame frame;

	public AjudaAction(JFrame frame) {
		super("Conte�do");
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(frame,
				"Ajuda",
				"Documenta��o.",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
