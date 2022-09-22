package gui_Learning;
import javax.swing.JOptionPane; //

public class UserInterface {
	public static void main(String[] arg) {
		
		String name=JOptionPane.showInputDialog("Enter your Name :");
		JOptionPane.showMessageDialog(null," Hello "+name);
		
		// Age is an integer so we have to use conversion operator Integer.parseInt()
		int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your Age : "));
		JOptionPane.showMessageDialog(null,"Your are "+age+" years old");
		
		// For Double type also we have to use conversion operator as above
		
		double height=Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height : "));
		JOptionPane.showMessageDialog(null," Your are " +height+" cm tall");
		
		
	}

	

}
