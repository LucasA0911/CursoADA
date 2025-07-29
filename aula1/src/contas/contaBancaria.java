//Exercício 1 – Banco de Contas
//Crie uma classe ContaBancaria com:
//Atributos: numero, saldo, limite.
//        Métodos: sacar(double valor), depositar(double valor), consultarSaldo().
//Depois, crie uma subclasse ContaEspecial que:
//Herda de ContaBancaria.
//Permite saque acima do saldo, até o limite.
//        Implemente main() e teste criando duas contas. Faça saques, depósitos e tente ultrapassar o limite.

package contas;

public class contaBancaria{
    private double numero;
    private double saldo;
    private double limite;

    public contaBancaria(double numero, double saldo, double limite){
        this.limite = limite;
        this.numero = numero;
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getNumero() {
        return numero;
    }

    public double sacar(double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
        }else {
            System.out.println("Saldo insuficiente.");
        }
        return valor;
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Valor depositado com sucesso.");
        }else {
            System.out.println("Insira um valor maior que zero.");
        }
    }

    public double consultarSaldo(){
        return this.saldo;
    }

}
