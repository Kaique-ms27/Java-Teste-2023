//Progrma para calcular área do retângulo

import javax.swing.JOptionPane;

public class teste {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
        "CFP113-Escola SENAI José Conde Vicente de Azevedo\n\n"
        + "     Técnico em Desenvolvimento de Sistemas\n"
        + "           Kaique Magalhães Santos\n"
        + " Fundamentos da Programação Orientada a Objeto\n\n");

        Double base= Double.parseDouble( JOptionPane.showInputDialog(null, 
            "Digite o valor da Base do Retângulo",
            "Entrada de dados",
            JOptionPane.QUESTION_MESSAGE));
        
            Double altura= Double.parseDouble( JOptionPane.showInputDialog(null, 
            "Digite o valor da Altura do Retângulo",
            "Entrada de dados",
            JOptionPane.QUESTION_MESSAGE));

            double area = (base*altura);

            JOptionPane.showMessageDialog(null,
            "O valor da área do seu Retângulo é " + area + "cm²");
    }
}