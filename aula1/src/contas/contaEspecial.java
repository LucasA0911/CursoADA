package contas;

public class contaEspecial extends contaBancaria{
    public contaEspecial( double numero, double saldo, double limite){
        super(numero, saldo, limite);
    }

    public double novoSaldo(){
        double novoSaldo = super.getSaldo() + super.getLimite();
        return novoSaldo;
    }

    @Override
    public double sacar(double valor){
       if(valor > novoSaldo()){
           System.out.println("Saldo insuficiente");
       }else{
           ;
       }
       return valor;
    }
}
