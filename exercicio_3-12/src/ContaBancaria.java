public class ContaBancaria {
    private int numeroDaConta;
    private double saldoDaConta;
    public String titularDaconta;

    //Getters
    public int getNumeroDaConta(){
        return numeroDaConta;
    }

    public double getSaldoDaConta(){
        return saldoDaConta;
    }

    //Setters
    public void setNumeroDaConta(int numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    public void setSaldoDaConta(double saldoDaConta){
        this.saldoDaConta = saldoDaConta;
    }

}
