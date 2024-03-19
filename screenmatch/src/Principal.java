public class Principal {
    public static void main(String[] args) {
        Filme filme01 = new Filme();
        filme01.nome = "O podereso chefão";
        filme01.anoDeLancamento = 1970;
        filme01.duracaoEmMinutos = 180;

        filme01.exibiFichaTecnica();
    }
}