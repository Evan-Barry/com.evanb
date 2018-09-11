import javax.swing.*;

public class welcome {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name :");
        JOptionPane.showMessageDialog(null, "Welcome " + name + " to year 2");
    }
}