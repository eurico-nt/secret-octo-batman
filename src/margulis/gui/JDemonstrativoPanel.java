package margulis.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import margulis.model.MargulisModel;

public class JDemonstrativoPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private final JTable table;

	// private JFrame frame;

	/**
	 * Create the panel.
	 * 
	 * @param card
	 * @param frame
	 */
	public JDemonstrativoPanel(final JTabbedPane frame, final MargulisModel model) {

		setLayout(new BorderLayout());
		table = new JTable(model.getDemonstrativoModel());

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(200, 100));

		add(BorderLayout.CENTER, scrollPane);
	}

	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event-dispatching thread.
	 */
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Teste");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MargulisModel m = new MargulisModel();
		frame.getContentPane().add(new JDemonstrativoPanel(null, m));

		frame.setPreferredSize(new Dimension(800, 200));
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

}
