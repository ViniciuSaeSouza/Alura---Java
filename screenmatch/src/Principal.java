public class Principal {
    public static void main(String[] args) {
        Filme filme01 = new Filme();
        filme01.nome = "O podereso chefão";
        filme01.anoDeLancamento = 1970;
        filme01.duracaoEmMinutos = 180;

        filme01.exibiFichaTecnica();
        filme01.avalia(8);
        filme01.avalia(7);
        filme01.avalia(10);
        System.out.println(filme01.somaDasAvaliacoes);
        System.out.println(filme01.totalDeAvaliacoes);
        System.out.println(filme01.pegaMedia());
    }
}