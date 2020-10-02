import javax.swing.JOptionPane;
public class AbarcaOmar_WiFiDiagnosis {

	public static void main(String[] args) {
		int choice = JOptionPane.showConfirmDialog(null, "Do you have wifi problems?");
		if(choice == JOptionPane.NO_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Done");	
			return;
		}
		else
			JOptionPane.showMessageDialog(null, "Here are some possible solutions");
		
		JOptionPane.showMessageDialog(null, "Disconnect then reconnect to wifi");
		int choice2 = JOptionPane.showConfirmDialog(null, "Did that work?");
		if(choice2 == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Done");	
			return;
		}
		else
			JOptionPane.showMessageDialog(null, "Next option");
		
		JOptionPane.showMessageDialog(null, "Restart router");
		int choice3 = JOptionPane.showConfirmDialog(null, "Did that work?");
		if(choice3 == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Done");	
			return;
		}
		else
			JOptionPane.showMessageDialog(null, "Next option");
		
		JOptionPane.showMessageDialog(null, "Check if router wires are tighten, if not, tighten them");
		int choice4 = JOptionPane.showConfirmDialog(null, "Did that work?");
		if(choice4 == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Done");	
			return;
		}	
		else
			JOptionPane.showMessageDialog(null, "Next option");
		
		JOptionPane.showMessageDialog(null, "Contact your ISP");
			JOptionPane.showMessageDialog(null, "Done");
			
		JOptionPane.showMessageDialog(null, "By Programmer: Omar Abarca");
	}
}
