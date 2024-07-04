import java.util.ArrayList;
import java.util.Date;

// Classe principal da conta bancária
public class ContaBancaria {
    private String numeroConta;
    private String nomeTitular;
    private double saldo;
    private ArrayList<String> extrato;

    // Construtor da conta bancária
    public ContaBancaria(String numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
        this.extrato = new ArrayList<>();
        registrarTransacao("Conta criada em " + new Date());
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            registrarTransacao("Depósito de R$" + valor);
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            registrarTransacao("Saque de R$" + valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque ou valor inválido.");
        }
    }

    // Método para transferir dinheiro para outra conta
    public void transferir(ContaBancaria contaDestino, double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            contaDestino.depositar(valor);
            registrarTransacao("Transferência de R$" + valor + " para conta " + contaDestino.numeroConta);
            System.out.println("Transferência de R$" + valor + " para conta " + contaDestino.numeroConta + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para transferência ou valor inválido.");
        }
    }

    // Método para gerar extrato da conta
    public void gerarExtrato() {
        System.out.println("--- Extrato da Conta ---");
        for (String transacao : extrato) {
            System.out.println(transacao);
        }
        System.out.println("Saldo atual: R$" + saldo);
    }

    // Método privado para registrar transações no extrato
    private void registrarTransacao(String descricao) {
        extrato.add(descricao + " em " + new Date());
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando duas contas bancárias para teste
        ContaBancaria conta1 = new ContaBancaria("12345-6", "Fulano");
        ContaBancaria conta2 = new ContaBancaria("54321-0", "Ciclano");

        // Realizando operações de depósito, saque e transferência entre as contas
        conta1.depositar(1000.0);
        conta2.depositar(500.0);

        conta1.transferir(conta2, 300.0);

        conta1.sacar(200.0);
        conta2.sacar(100.0);

        // Gerando extratos das contas
        conta1.gerarExtrato();
        conta2.gerarExtrato();
    }
}
