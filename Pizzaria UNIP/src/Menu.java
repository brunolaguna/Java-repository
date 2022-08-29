import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;


public class Menu implements ActionListener{
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setTitle("Menu");
		frame.setBounds(300, 300, 750, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lalbelProduto = new JLabel("Produtos");
		lalbelProduto.setFont(new Font("Arial Black", Font.BOLD, 15));
		lalbelProduto.setBounds(34, 11, 99, 16);
		frame.getContentPane().add(lalbelProduto);
		
		JLabel labelIndividual = new JLabel("$ Individual");
		labelIndividual.setFont(new Font("Arial Black", Font.BOLD, 15));
		labelIndividual.setBounds(155, 12, 118, 15);
		frame.getContentPane().add(labelIndividual);
		
		JLabel labelRegular = new JLabel("$ Regular");
		labelRegular.setFont(new Font("Arial Black", Font.PLAIN, 15));
		labelRegular.setBounds(293, 8, 91, 22);
		frame.getContentPane().add(labelRegular);
		
		JLabel labelFamilia = new JLabel("$ Familia");
		labelFamilia.setFont(new Font("Arial Black", Font.BOLD, 15));
		labelFamilia.setBounds(415, 8, 98, 22);
		frame.getContentPane().add(labelFamilia);
		
		JLabel labelCoberturaExtra = new JLabel("Cobertura Extra");
		labelCoberturaExtra.setFont(new Font("Arial Black", Font.PLAIN, 15));
		labelCoberturaExtra.setBounds(537, 11, 150, 16);
		frame.getContentPane().add(labelCoberturaExtra);
		
		
		JRadioButton radioIndividualPepperoni = new JRadioButton("R$ 15,00");
		radioIndividualPepperoni.setBounds(155, 49, 109, 23);
		frame.getContentPane().add(radioIndividualPepperoni);
		
		JRadioButton radioRegularPepperoni = new JRadioButton("R$ 27,00");
		radioRegularPepperoni.setBounds(293, 49, 109, 23);
		frame.getContentPane().add(radioRegularPepperoni);
		
		JRadioButton radioFamiliaPepperoni = new JRadioButton("R$ 33,00");
		radioFamiliaPepperoni.setBounds(415, 49, 109, 23);
		frame.getContentPane().add(radioFamiliaPepperoni);
		
		JRadioButton radioIndividualMussarela = new JRadioButton("R$ 12,00");
		radioIndividualMussarela.setBounds(155, 97, 109, 23);
		frame.getContentPane().add(radioIndividualMussarela);
		
		JRadioButton radioRegularMussarela = new JRadioButton("R$ 21,60");
		radioRegularMussarela.setBounds(293, 97, 109, 23);
		frame.getContentPane().add(radioRegularMussarela);
		
		JRadioButton radioFamiliaMussarela = new JRadioButton("R$ 26,40");
		radioFamiliaMussarela.setBounds(415, 97, 109, 23);
		frame.getContentPane().add(radioFamiliaMussarela);
		
		JRadioButton radioIndividualSupreme = new JRadioButton("R$ 17,00");
		radioIndividualSupreme.setBounds(155, 145, 109, 23);
		frame.getContentPane().add(radioIndividualSupreme);
		
		JRadioButton radioRegularSupreme = new JRadioButton("R$ 30,60");
		radioRegularSupreme.setBounds(293, 145, 109, 23);
		frame.getContentPane().add(radioRegularSupreme);
		
		JRadioButton radioFamiliaSupreme = new JRadioButton("R$ 37,40");
		radioFamiliaSupreme.setBounds(415, 145, 109, 23);
		frame.getContentPane().add(radioFamiliaSupreme);
		
		
		JCheckBox checkBoxBacon = new JCheckBox("Bacon R$ 2,00");
		checkBoxBacon.setBounds(548, 49, 127, 23);
		frame.getContentPane().add(checkBoxBacon);
		
		JCheckBox checkBoxCebola = new JCheckBox("Cebola R$ 1,50");
		checkBoxCebola.setBounds(548, 97, 127, 23);
		frame.getContentPane().add(checkBoxCebola);
		
		JCheckBox checkBoxChampignon = new JCheckBox("Champignon R$ 2,50 ");
		checkBoxChampignon.setBounds(548, 145, 150, 23);
		frame.getContentPane().add(checkBoxChampignon);
		
		JCheckBox checkBoxTomate = new JCheckBox("Tomate R$ 1,00");
		checkBoxTomate.setBounds(548, 185, 139, 23);
		frame.getContentPane().add(checkBoxTomate);
		
		JCheckBox checkBoxCatupiry = new JCheckBox("Catupiry R$ 3,00");
		checkBoxCatupiry.setBounds(548, 229, 127, 23);
		frame.getContentPane().add(checkBoxCatupiry);
		
		JCheckBox checkBoxPresunto = new JCheckBox("Presunto R$ 2,50");
		checkBoxPresunto.setBounds(548, 272, 139, 23);
		frame.getContentPane().add(checkBoxPresunto);
	
		
		ButtonGroup buttonGroup1 = new ButtonGroup();
		
		buttonGroup1.add(radioIndividualPepperoni);
		buttonGroup1.add(radioRegularPepperoni);
		buttonGroup1.add(radioFamiliaPepperoni);
		buttonGroup1.add(radioIndividualMussarela);
		buttonGroup1.add(radioRegularMussarela);
		buttonGroup1.add(radioFamiliaMussarela);
		buttonGroup1.add(radioIndividualSupreme);
		buttonGroup1.add(radioRegularSupreme);
		buttonGroup1.add(radioFamiliaSupreme);
		
		
		JButton botao = new JButton("Confirmar Pedido");
		botao.setBounds(72, 251, 150, 40);
		frame.getContentPane().add(botao);
		
		
		JLabel lblNewLabel = new JLabel("Pepperoni:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(44, 53, 89, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mussarela:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(44, 101, 73, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Supreme:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(44, 148, 63, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(72, 341, 312, 40);
		frame.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(470, 341, 139, 60);
		frame.getContentPane().add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(72, 379, 312, 22);
		frame.getContentPane().add(textArea_2);
		
		
		JButton btnNewButton = new JButton("Limpa tela");
		btnNewButton.setBounds(293, 251, 127, 40);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				checkBoxBacon.setSelected(false);
				checkBoxCebola.setSelected(false);
				checkBoxChampignon.setSelected(false);
				checkBoxTomate.setSelected(false);
				checkBoxCatupiry.setSelected(false);
				checkBoxPresunto.setSelected(false);
				textArea.setText(null);
				textArea_1.setText(null);
				textArea_2.setText(null);
			}
		});
		
	
		botao.addActionListener(new ActionListener() 
		{
			Double somaPizza;
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					if(radioIndividualPepperoni.isSelected())
					{
						somaPizza =+ 15.00;
						textArea.setText("Você pediu uma pizza de Pepperoni tamanho Individual");
					}
					if(radioRegularPepperoni.isSelected())
					{
						somaPizza =+ 27.00;
						textArea.setText("Você pediu uma pizza de Pepperoni tamanho Regular");
					}
					if(radioFamiliaPepperoni.isSelected())
					{
						somaPizza =+ 33.00;
						textArea.setText("Você pediu uma pizza de Pepperoni tamanho Familia");
					}
					if(radioIndividualMussarela.isSelected())
					{
						somaPizza =+ 12.00;
						textArea.setText("Você pediu uma pizza de Mussarela tamanho Individual");
					}
					if(radioRegularMussarela.isSelected())
					{
						somaPizza =+ 21.60;
						textArea.setText("Você pediu uma pizza de Mussarela tamanho Regular");
					}
					if(radioFamiliaMussarela.isSelected())
					{
						somaPizza =+ 26.40;
						textArea.setText("Você pediu uma pizza de Mussarela tamanho Familia");
					}
					if(radioIndividualSupreme.isSelected())
					{
						somaPizza =+ 17.00;
						textArea.setText("Você pediu uma pizza de Supreme tamanho Individual");
					}
					if(radioRegularSupreme.isSelected())
					{
						somaPizza =+ 30.60;
						textArea.setText("Você pediu uma pizza de Supreme tamanho Regular");
					}
					if(radioFamiliaSupreme.isSelected())
					{
						somaPizza =+ 37.40;
						textArea.setText("Você pediu uma pizza de Supreme tamanho Familia");
					}
					if(checkBoxBacon.isSelected())
					{
						somaPizza += 2.00;
						textArea_1.setText("+ Bacon");
						
					}
					if(checkBoxCebola.isSelected())
					{
						somaPizza += 1.50;
						textArea_1.setText("+ Cebola");
					}
					if(checkBoxBacon.isSelected() & checkBoxCebola.isSelected())
					{
						textArea_1.setText("+ Bacon" + "\n" + "+ Cebola");
						
					}
					if(checkBoxChampignon.isSelected())
					{
						somaPizza += 2.50;
						textArea_1.setText("+ Champignon");
					}
					if(checkBoxBacon.isSelected() & checkBoxCebola.isSelected() & checkBoxChampignon.isSelected())
					{
						textArea_1.setText("+ Bacon" + "\n" + "+ Cebola" + "\n" + "+ Champignon" );
						
					}
					if(checkBoxTomate.isSelected())
					{
						somaPizza += 1.00;
						textArea_1.setText("+ Tomate");
					}
					if(checkBoxCatupiry.isSelected())
					{
						somaPizza += 3.00;
						textArea_1.setText("+ Catupiry");
					}
					if(checkBoxPresunto.isSelected())
					{
						somaPizza += 2.50;
						textArea_1.setText("+ Presunto");
					}
					System.out.println(somaPizza);
					textArea_2.setText("R$" + somaPizza);
				}
			catch(NullPointerException error) {
				JOptionPane.showMessageDialog(null, "Selecione uma Pizza.");
			}
		}});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
