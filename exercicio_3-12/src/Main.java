public class Main {
    public static void main(String[] args) {
        /*ContaBancaria conta1 = new ContaBancaria();
        conta1.setNumeroDaConta(4004);
        conta1.setSaldoDaConta(1000);
        conta1.titularDaconta = "Saes";

        System.out.println("Número da conta: " + conta1.getNumeroDaConta());
        System.out.println("Saldo: " + conta1.getSaldoDaConta());
        System.out.println("Titular: " + conta1.titularDaconta);

        conta1.setSaldoDaConta(15000);
        System.out.println("Novo saldo da conta: " + conta1.getSaldoDaConta());*/

        Produto produto = new Produto();
        produto.setNome("Bombom");
        produto.setPreco(10);
        System.out.println("Preço: " + produto.getPreco());
        produto.aplicarDesconto(10);
        System.out.println("Preço com desconto: " + produto.getPreco());
    }
}