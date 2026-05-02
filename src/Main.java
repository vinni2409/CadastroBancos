public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("001", "Vinni", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("002", "Maria", 500.0);
        ContaBancaria conta3 = new ContaBancaria("003", "João", 250.0);

        Banco banco = new Banco();

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);
        banco.adicionarConta(conta3);
        banco.adicionarConta(new ContaBancaria("001", "Duplicado", 0.0));

        System.out.println("\n=== Lista de Contas ===");
        banco.listarContas();

        System.out.println("\n=== Depósito ===");
        conta1.depositar(500.0);
        System.out.println("Depósito realizado. Novo saldo de " + conta1.getTitular() + ": R$ " + conta1.getSaldo());

        System.out.println("\n=== Saque ===");
        conta2.sacar(100.0);
        System.out.println("Saque realizado. Novo saldo de " + conta2.getTitular() + ": R$ " + conta2.getSaldo());
        conta3.sacar(999.0);

        System.out.println("\n=== Busca de Conta ===");
        ContaBancaria encontrada = banco.buscarConta("002");
        if (encontrada != null) {
            System.out.println("Conta encontrada: " + encontrada.getTitular());
        } else {
            System.out.println("Conta não encontrada.");
        }

        System.out.println("\n=== Remoção de Conta ===");
        banco.removerConta("003");

        System.out.println("\n=== Lista Final ===");
        banco.listarContas();
    }
}