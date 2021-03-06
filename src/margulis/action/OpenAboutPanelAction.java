package margulis.action;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 * Margulis simulator about action.
 * 
 * @author marco.mangan@gmail.com
 */
public class OpenAboutPanelAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private transient final JFrame frame;

	/**
	 * 
	 * @param frame
	 */
	public OpenAboutPanelAction(final JFrame frame) {
		super("Sobre");
		this.frame = frame;
		putValue(
				SMALL_ICON,
				new ImageIcon(OpenAboutPanelAction.class
						.getResource("/margulis/gui/image/sobre.png")));
		putValue(MNEMONIC_KEY, KeyEvent.VK_A);
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_A, Toolkit
				.getDefaultToolkit().getMenuShortcutKeyMask()));
	}

	@Override
	public void actionPerformed(final ActionEvent event) {
		JOptionPane.showMessageDialog(frame,
				"v. 5.0 (dev) (c) 2013, 2014, LAPRO III, FSPOA.\nMarianne Stampe\nMarco Mangan\n"
				+"Andrei Mesquita, Bruno Welhausen, Mauricio Carvalho, Gisela Lucena, Paulo Lima e Silva, Thiago Dias",
				"Sobre Margulis, um Simulador de Mercado",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
