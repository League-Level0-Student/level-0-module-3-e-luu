import javax.swing.JOptionPane;

public class areyouhappy {
	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog("Are you happy?");
		if (happy.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing");
		}
		if (happy.equals("no")) {
			String no = JOptionPane.showInputDialog("Do you want to be happy?");
			if (no.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}
			if (happy.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			}

		}

	}
}
