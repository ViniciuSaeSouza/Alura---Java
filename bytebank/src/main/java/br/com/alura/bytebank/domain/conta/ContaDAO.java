package br.com.alura.bytebank.domain.conta;

import br.com.alura.bytebank.domain.RegraDeNegocioException;
import br.com.alura.bytebank.domain.cliente.Cliente;
import br.com.alura.bytebank.domain.cliente.DadosCadastroCliente;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContaDAO {
    Connection conn;

    ContaDAO(Connection connection) {
        this.conn = connection;
    }

    public void salvar(DadosAberturaConta dadosDaConta) {
        var cliente = new Cliente(dadosDaConta.dadosCliente());
        var conta = new Conta(dadosDaConta.numero(), cliente, BigDecimal.ZERO);

        String sql = "INSERT INTO conta (numero, saldo, cliente_nome, cliente_cpf, cliente_email) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
//            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setInt(1, conta.getNumero());
            preparedStatement.setBigDecimal(2, BigDecimal.ZERO);
            preparedStatement.setString(3, cliente.getNome());
            preparedStatement.setString(4, cliente.getCpf());
            preparedStatement.setString(5, cliente.getEmail());

            preparedStatement.execute();
//            preparedStatement.close();
            conn.close();

        } catch (SQLIntegrityConstraintViolationException e) {
            throw new RegraDeNegocioException("Número da conta já existe!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public Set<Conta> listar() {
        Set<Conta> contas = new HashSet<>();

        String sql = "SELECT * FROM conta";

        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Integer numero = rs.getInt(1);
                BigDecimal saldo = rs.getBigDecimal(2);
                String nome = rs.getString(3);
                String cpf = rs.getString(4);
                String email = rs.getString(5);
                DadosCadastroCliente dadosCliente = new DadosCadastroCliente(nome, cpf, email);
                var cliente = new Cliente(dadosCliente);
                var conta = new Conta(numero, cliente, saldo);
                contas.add(conta);
            }
            rs.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return contas;
    }

    public Conta buscarPorNumero(Integer numero) {
        Conta conta = null;
        ResultSet rs;
        Cliente cliente;
        DadosCadastroCliente dadosConta;
        String sql = "SELECT * FROM conta WHERE numero = " + numero;

        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                BigDecimal saldo = rs.getBigDecimal(2);
                String nome = rs.getString(3);
                String cpf = rs.getString(4);
                String email = rs.getString(5);
                dadosConta = new DadosCadastroCliente(nome, cpf, email);
                cliente = new Cliente(dadosConta);
                conta = new Conta(numero, cliente, saldo);
            }
            rs.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conta;
    }

    public void alterar(Integer numeroConta, BigDecimal valor) {
        String sql = "UPDATE conta SET saldo = ? WHERE numero = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setBigDecimal(1, valor);
            ps.setInt(2, numeroConta);

            ps.execute();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void realizarSaque(Integer numeroConta, BigDecimal valor) {
        String sql = "UPDATE conta SET saldo = ? WHERE numero = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setBigDecimal(1, valor);
            ps.setInt(2, numeroConta);
            ps.executeUpdate();

            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
