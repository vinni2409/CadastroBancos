public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void exibirInfo(){
        System.out.println("Conta: " + numeroConta);
        System.out.println("Titutlar: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if(valor > saldo){
            System.out.println("saldo insuficiente");
        }else {
            saldo -= valor;
        }
    }




}
