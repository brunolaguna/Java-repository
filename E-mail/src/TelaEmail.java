import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;

public class TelaEmail 
{
	public static void main(String[] args) 
	{
		TelaBase T1 = new TelaBase();
		
		T1.setTitle("Email");
		T1.setSize(300,160);
		T1.setLayout(null);
		T1.setLocationRelativeTo(null);
		T1.setVisible(true);
		
		Label labelNome = new Label("Nome: ");
		labelNome.setSize(50,20);
		labelNome.setLocation(20,50);
		T1.add(labelNome);
		
		TextField textFieldNome = new TextField();
		textFieldNome.setSize(180,20);
		textFieldNome.setLocation(100,50);
		T1.add(textFieldNome);
		
		Label labelEmail = new Label("E-mail:");
		labelEmail.setSize(50,20);
		labelEmail.setLocation(20,80);
		T1.add(labelEmail);
		
		TextField textFieldEmail = new TextField();
		textFieldEmail.setSize(180,20);
		textFieldEmail.setLocation(100,80);
		T1.add(textFieldEmail);
		
		Button botaoOk = new Button("OK");
		botaoOk.setSize(80,20);
		botaoOk.setLocation(50,120);
		T1.add(botaoOk);
		
		Button botaoCancela = new Button("Cancelar");
		botaoCancela.setSize(80,20);
		botaoCancela.setLocation(180,120);
		T1.add(botaoCancela);
	}
}
