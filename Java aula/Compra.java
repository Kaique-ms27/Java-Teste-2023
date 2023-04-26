public class Compra {
    public static void main(String[] args) {
        int valorCompra = 15;
        double compraDesconto = (valorCompra*0.9);
        System.out.println("Valor com Desconto de 10%: "+ compraDesconto);
        double compraJuros = (valorCompra*1.1);
        System.out.println("Valor com Juros de 10%: "+ compraJuros);
    }
}