package br.ufjf.la3;

import javax.swing.JOptionPane;

public class aula0109 {

    public static void main(String[] args) throws Exception {
        try{
        Float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite largura"));
        Float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite comprimento"));
        Float n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite altura"));
        JOptionPane.showMessageDialog(null,"O volume e "+ (n1*n2*n3)+ "cm3", "Volume total", JOptionPane.PLAIN_MESSAGE);
        }
        catch (NumberFormatException e) {JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
