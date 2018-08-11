import javax.swing.JOptionPane;

public class areyouhappy {
	public static void main(String[] args) {
String happy = JOptionPane.showInputDialog("Are you happy?");
if(happy.equals("yes")) {
JOptionPane.showMessageDialog(null, "Keep doing what you're doing");
}
}
	}

