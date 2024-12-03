package br.com.alura.bytebank.domain.conta;

import br.com.alura.bytebank.ConnectionFactory;
import br.com.alura.bytebank.domain.RegraDeNegocioException;


import java.math.BigDecimal;
import java.sql.Connection;
import java.util.Set;

public class ContaService {

    ConnectionFactory connection;

    public ContaService(){
        this.connection = new ConnectionFactory();
    }

    public Set<Conta> listarContasAbertas() {
        Connection conn = connection.recuperaConexao();
        return new ContaDAO(conn).listar();
    }

    public BigDecimal consultarSaldo(Integer numeroDaConta) {
        var conta = buscarContaPorNumero(numeroDaConta);
        return conta.getSaldo();
    }

    public void abrir(DadosAberturaConta dadosDaConta) {
        Connection conn = connection.recuperaConexao();
        new ContaDAO(conn).salvar(dadosDaConta);

    }

    public void realizarSaque(Integer numeroDaConta, BigDecimal valor) {
        var conta = buscarContaPorNumero(numeroDaConta);
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new RegraDeNegocioException("Valor do saque deve ser superior a zero!");
        }

        if (conta == null){
            throw new RegraDeNegocioException("Conta não existe!");
        }

        if (valor.compareTo(conta.getSaldo()) > 0) {
            throw new RegraDeNegocioException("Saldo insuficiente!");
        }

        if (!conta.getAtiva()) {
            throw new RegraDeNegocioException("Conta não está ativa!");
        }

        BigDecimal novoSaldo = conta.getSaldo().subtract(valor);
        Connection conn = new ConnectionFactory().recuperaConexao();
        new ContaDAO(conn).realizarSaque(conta.getNumero(), novoSaldo);
    }

    public void realizarDeposito(Integer numeroDaConta, BigDecimal valor) {
        var conta = buscarContaPorNumero(numeroDaConta);
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new RegraDeNegocioException("Valor do deposito deve ser superior a zero!");
        }

        if (!conta.getAtiva()) {
            throw new RegraDeNegocioException("Conta não está ativa!");
        }

        Connection conn = new ConnectionFactory().recuperaConexao();
        BigDecimal novoValor = conta.getSaldo().add(valor);
        new ContaDAO(conn).alterar(conta.getNumero(), novoValor);
    }

    public void realizarTransferencia(Integer numeroDaContaOrigem, Integer numeroDaContaDestino, BigDecimal valor){
        this.realizarSaque(numeroDaContaOrigem, valor);
        this.realizarDeposito(numeroDaContaDestino, valor);
    }

    public void encerrar(Integer numeroDaConta) {
        var conta = buscarContaPorNumero(numeroDaConta);

        if (conta.possuiSaldo()) {
            throw new RegraDeNegocioException("Conta não pode ser encerrada pois ainda possui saldo!");
        }
        Connection conn = connection.recuperaConexao();
        new ContaDAO(conn).encerrar(numeroDaConta);
    }

    public void desativar(Integer numeroDaConta){
        var conta = buscarContaPorNumero(numeroDaConta);

        if (conta.possuiSaldo()) {
            throw new RegraDeNegocioException("Conta não pode ser encerrada pois ainda possui saldo!");
        }

        Connection conn = connection.recuperaConexao();
        new ContaDAO(conn).desativar(numeroDaConta);

    }

    private Conta buscarContaPorNumero(Integer numero) {
        Connection conn = connection.recuperaConexao();
        try {
            return new ContaDAO(conn).buscarPorNumero(numero);
        }  catch (NullPointerException e) {
            throw new RegraDeNegocioException("ERRO! Conta não existe.");
        }
    }

    public void ativarConta(Integer numeroConta){
        Connection conn = connection.recuperaConexao();
        new ContaDAO(conn).ativar(numeroConta);
    }
}
