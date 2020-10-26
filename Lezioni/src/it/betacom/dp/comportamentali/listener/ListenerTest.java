package it.betacom.dp.comportamentali.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ListenerTest {

	public static void main(String[] args) {
		WindowAdapter adapter = new WindowAdapter() {
			public void windowClosing(WindowEvent event) {
				System.exit(0);
			}
		};
		
		JFrame frame = new JFrame("Listener test");
		frame.addWindowListener(adapter);
		JButton btn = new JButton("Test");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Gestito evento");
				
			}
		});
		frame.getContentPane().add(btn);
		frame.setVisible(true);
		frame.setSize(500,300);
	}
}
