import javax.swing.JOptionPane;

public class horoscope {
	public static void main(String[] args) {
		String zodiac = JOptionPane.showInputDialog("What is your zodic sign?");
		if (zodiac.equals("aries")) {
			JOptionPane.showMessageDialog(null, "you will win somthing tomorrow");
		}
		if (zodiac.equals("taurus")) {
			JOptionPane.showMessageDialog(null, "you will get a reward tomorrow");
		}
		if (zodiac.equals("gemini")) {
			JOptionPane.showMessageDialog(null, "you will make a new friend tomorrow");
		}
		if(zodiac.equals("cancer")) {
			JOptionPane.showMessageDialog(null, "you will earn someone's trust");
	}
		if(zodiac.equals("leo")) {
			JOptionPane.showMessageDialog(null, "you will feel appreciated tomorrow");}
		if(zodiac.equals("virgo")) {
			JOptionPane.showMessageDialog(null, "you will have good luck tomorrow");}
		if(zodiac.equals("libra")) {
			JOptionPane.showMessageDialog(null, "you will have fun tomorrow");}
		if(zodiac.equals("scorpio")) {
			JOptionPane.showMessageDialog(null, "you will feel loved");}
		if(zodiac.equals("sagittarius")) {
			JOptionPane.showMessageDialog(null, "you will have bad luck tomorrow");}
		if(zodiac.equals("capricorn")) {
			JOptionPane.showMessageDialog(null, "you will not have fun tomorrow");}
		if(zodiac.equals("aquarius")) {
			JOptionPane.showMessageDialog(null, "you will be the best at something");}
		if(zodiac.equals("pisces")) {
			JOptionPane.showMessageDialog(null, "you will feel great tomorrow");}
	}}