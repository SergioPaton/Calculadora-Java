package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 555);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton igual = new JButton("=");
		igual.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				igual.setBackground(SystemColor.activeCaption);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				igual.setBackground(SystemColor.inactiveCaption);
			}
		});
		igual.setBackground(new Color(191, 205, 219));
		igual.setBounds(235, 460, 75, 50);
		contentPane.add(igual);
		
		JButton sumar = new JButton("+");
		sumar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				sumar.setBackground(SystemColor.control);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				sumar.setBackground(SystemColor.controlHighlight);
			}
		});
		sumar.setBackground(SystemColor.controlHighlight);
		sumar.setBounds(235, 410, 75, 50);
		contentPane.add(sumar);
		
		JButton restar = new JButton("-");
		restar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				restar.setBackground(SystemColor.control);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				restar.setBackground(SystemColor.controlHighlight);
			}
		});
		restar.setBackground(SystemColor.controlHighlight);
		restar.setBounds(235, 360, 75, 50);
		contentPane.add(restar);
		
		JButton multiplicar = new JButton("X");
		multiplicar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				multiplicar.setBackground(SystemColor.control);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				multiplicar.setBackground(SystemColor.controlHighlight);
			}
		});
		multiplicar.setBackground(SystemColor.controlHighlight);
		multiplicar.setBounds(235, 310, 75, 50);
		contentPane.add(multiplicar);
		
		JButton dividir = new JButton("/");
		dividir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				dividir.setBackground(SystemColor.control);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				dividir.setBackground(SystemColor.controlHighlight);
			}
		});
		dividir.setBackground(SystemColor.controlHighlight);
		dividir.setBounds(235, 260, 75, 50);
		contentPane.add(dividir);
		
		JButton cero = new JButton("0");
		cero.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				cero.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				cero.setBackground(Color.WHITE);
			}
		});
		cero.setBackground(Color.WHITE);
		cero.setBounds(160, 460, 75, 50);
		contentPane.add(cero);
		
		JButton tres = new JButton("3");
		tres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				tres.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				tres.setBackground(Color.WHITE);
			}
		});
		tres.setBackground(Color.WHITE);
		tres.setBounds(160, 410, 75, 50);
		contentPane.add(tres);
		
		JButton seis = new JButton("6");
		seis.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				seis.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				seis.setBackground(Color.WHITE);
			}
		});
		seis.setBackground(Color.WHITE);
		seis.setBounds(160, 360, 75, 50);
		contentPane.add(seis);
		
		JButton nueve = new JButton("9");
		nueve.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				nueve.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				nueve.setBackground(Color.WHITE);
			}
		});
		nueve.setBackground(Color.WHITE);
		nueve.setBounds(160, 310, 75, 50);
		contentPane.add(nueve);
		
		JButton punto = new JButton(".");
		punto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				punto.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				punto.setBackground(Color.WHITE);
			}
		});
		punto.setBackground(Color.WHITE);
		punto.setBounds(85, 460, 75, 50);
		contentPane.add(punto);
		
		JButton dos = new JButton("2");
		dos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				dos.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				dos.setBackground(Color.WHITE);
			}
		});
		dos.setBackground(Color.WHITE);
		dos.setBounds(85, 410, 75, 50);
		contentPane.add(dos);
		
		JButton cinco = new JButton("5");
		cinco.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				cinco.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				cinco.setBackground(Color.WHITE);
			}
		});
		cinco.setBackground(Color.WHITE);
		cinco.setBounds(85, 360, 75, 50);
		contentPane.add(cinco);
		
		JButton ocho = new JButton("8");
		ocho.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ocho.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ocho.setBackground(Color.WHITE);
			}
		});
		ocho.setBackground(Color.WHITE);
		ocho.setBounds(85, 310, 75, 50);
		contentPane.add(ocho);
		
		JButton masMenos = new JButton("+/-");
		masMenos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				masMenos.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				masMenos.setBackground(Color.WHITE);
			}
		});
		masMenos.setBackground(Color.WHITE);
		masMenos.setBounds(10, 460, 75, 50);
		contentPane.add(masMenos);
		
		JButton uno = new JButton("1");
		uno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				uno.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				uno.setBackground(Color.WHITE);
			}
		});
		uno.setBackground(Color.WHITE);
		uno.setBounds(10, 410, 75, 50);
		contentPane.add(uno);
		
		JButton cuatro = new JButton("4");
		cuatro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				cuatro.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				cuatro.setBackground(Color.WHITE);
			}
		});
		cuatro.setBackground(Color.WHITE);
		cuatro.setBounds(10, 360, 75, 50);
		contentPane.add(cuatro);
		
		JButton siete = new JButton("7");
		siete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				siete.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				siete.setBackground(Color.WHITE);
			}
		});
		siete.setBackground(Color.WHITE);
		siete.setBounds(10, 310, 75, 50);
		contentPane.add(siete);
	}
	
}
