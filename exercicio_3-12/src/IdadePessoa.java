public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void avaliaIdade(){
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade, com " + idade + " anos.");
        }else {
            System.out.println(nome + " é menor de idade, com " + idade + " anos.");
        }
    }
}
