/*
 * LoginView.java
 *
 * Created on __DATE__, __TIME__
 */

package modelview;

import java.awt.HeadlessException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.user;

/**
 *
 * @author  __USER__
 */
public class LoginView extends javax.swing.JFrame {

	/** Creates new form LoginView */
	public LoginView() {
		initComponents();
		jButton1.setOpaque(false);
		jButton2.setOpaque(false);
		jButton3.setOpaque(false);
		this.setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jPanel1.setLayout(null);
		jPanel1.add(jTextField1);
		jTextField1.setBounds(300, 230, 200, 26);
		jPanel1.add(jTextField2);
		jTextField2.setBounds(300, 290, 200, 26);

		jButton1.setBackground(new java.awt.Color(255, 255, 255));
		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/×¢²á°´Å¥.png"))); // NOI18N
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton1);
		jButton1.setBounds(200, 360, 140, 50);

		jButton2.setBackground(new java.awt.Color(255, 255, 255));
		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/µÇÂ¼°´Å¥.png"))); // NOI18N
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton2);
		jButton2.setBounds(360, 360, 140, 50);

		jButton3.setBackground(new java.awt.Color(255, 255, 255));
		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/¡Á°´Å¥.png"))); // NOI18N
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton3);
		jButton3.setBounds(760, 0, 40, 40);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/µÇÂ¼½çÃæ.png"))); // NOI18N
		jPanel1.add(jLabel1);
		jLabel1.setBounds(0, 0, 800, 710);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 798,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 711,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		this.dispose();
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new ResigterView().setVisible(true);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			String uid = this.jTextField1.getText();
			String upw = this.jTextField2.getText();
			user u = new user();

			if (u.login(uid, upw)) {
				new CMap().setVisible(true);
				this.dispose();
			} else {
				JOptionPane.showMessageDialog(this, "µÇÂ¼Ê§°Ü");
			}

		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LoginView().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration//GEN-END:variables

}