import javax.swing.JOptionPane;
public class hello{
    public static void main(String[] args){
        String result;
        result = JOptionPane.showInputDialog("Please enter your nam:");
        JOptionPane.showMessage(null,"Hi " + result + "!");
        System.exit(0);
    }
}