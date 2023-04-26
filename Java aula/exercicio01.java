import javax.swing.JOptionPane;

public class exercicio01 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
        "CFP113-Escola Senai Conde José Vincente de Azevedo\n\n"
    +   "Técnico em Desenvolvimento de Sistemas \n"
    +   "Kaique Magalhães Santos\n"
    +   "Fundamentos de Programação Orientadaa Objeto");

        String produto = JOptionPane.showInputDialog(null, "Qual produto você deseja comprar?",
        "Escolha seu produto",
        JOptionPane.QUESTION_MESSAGE);
        int valorCompra = Integer.parseInt(JOptionPane.showInputDialog(null, "Ótimo que você queira comprar um " + produto +", Qual o valor do produto",
        "valor",
        JOptionPane.QUESTION_MESSAGE));
        double desc = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor do desconto que você deseja (%)?", "Desconto", JOptionPane.QUESTION_MESSAGE));
        int parcela = Integer.parseInt(JOptionPane.showInputDialog(null, "Em quantas vezes deseja parcelar a sua compra?", "Parcelas", JOptionPane.QUESTION_MESSAGE));
        double juros = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantos juros você deseja ter por parcela?", "Juros", JOptionPane.QUESTION_MESSAGE));
        JOptionPane.showMessageDialog(null, "O valor da sua compra é de R$ " + valorCompra);
        double descontoDecimal = (desc/100);
        double valorAvista = (valorCompra*(1.0-descontoDecimal));
        JOptionPane.showMessageDialog(null, "O valor da sua compra com desconto é de R$ " + valorAvista);
        double valorJuros = valorCompra+(valorCompra*(juros/100));
        JOptionPane.showMessageDialog(null, "O valor da sua compra com juros é de R$ " + valorJuros);
        JOptionPane.showMessageDialog(null, "Quanto você vai pagar por parcela é de R$ " + (valorJuros/parcela));
         System.out.println(descontoDecimal);
    }
}
/*
    produto -> nome do produto
    valor -> valor do produto digitado pelo user
    desc -> desconto que o user quer receber
    parcela -> quantas vezes o user quer parcelar a compra
    juros -> quantidade de juros que o user deseja
    descDeci -> vamor do desconto em decimal
    valorDesc -> valor do produto com desconto
 */