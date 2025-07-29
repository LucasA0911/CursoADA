import contas.contaBancaria;
import contas.contaEspecial;

public class Main{
    public static void main(String[] args){
        contaBancaria conta1 = new contaBancaria(1.0,500.0, 0);
        contaEspecial conta2 = new contaEspecial(1.0,500.0, 300);

        conta2.sacar(400.0);
        System.out.println(conta2.consultarSaldo());

        conta2.sacar(200.0);
        System.out.println(conta2.consultarSaldo());

       // conta2.depositar(700.0);
        // System.out.println(conta2.consultarSaldo());
    }
}