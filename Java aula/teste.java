import javax.swing.JOptionPane;

public class teste {

public static void main(String[] args) {
    JOptionPane.showMessageDialog(null,
    "CFP113-Escola Senai Conde José Vincente de Azevedo\n\n"
+"  Técnico em Desenvolvimento de Sistemas \n"
+   "Kaique Magalhães Santos\n"
+   "Fundamentos de Programação Orientadaa Objeto");
    String funcionario = JOptionPane.showInputDialog(null,
        "Qual o nome do funcionário que deseja?",
        "Nome do funcionário",
        JOptionPane.QUESTION_MESSAGE);
    double valorHora = Double.parseDouble(JOptionPane.showInputDialog(null,
        "Quanto o funcionário recebe por hora trabalhada?",
        "Valor da hora",
        JOptionPane.QUESTION_MESSAGE));
    double horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog(null,
        "Quantas horas o funcionário " + funcionario + " trabalhou no dia?",
        JOptionPane.QUESTION_MESSAGE));
    double salarioDia = (valorHora*horasTrabalhadas);
        JOptionPane.showMessageDialog(null,
        "O funcionário " + funcionario + " Recebeu em um dia de trabalho R$" + salarioDia);
        JOptionPane.showMessageDialog(null,
        "Deseja saber quanto funcionario recebe no mês?",
        "Salário Mensal",
        JOptionPane.YES_NO_CANCEL_OPTION);
}
}
