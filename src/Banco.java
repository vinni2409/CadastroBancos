import java.util.ArrayList;

public class Banco {

    private ArrayList<ContaBancaria> listaContas;

    public Banco() {
        listaContas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta) {
        if (buscarConta(conta.getNumeroConta()) != null) {
            System.out.println("Já existe uma conta com esse número.");
            return;
        }
        listaContas.add(conta);
        System.out.println("Conta criada.");
    }

    public void listarContas() {
        if (listaContas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
            return;
        }
        for (ContaBancaria conta : listaContas) {
            conta.exibirInfo();
            System.out.println("----------");
        }
    }

    public ContaBancaria buscarConta(String numeroConta) {
        for (ContaBancaria conta : listaContas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                return conta;
            }
        }
        return null;
    }

    public void removerConta(String numeroConta) {
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta == null) {
            System.out.println("Conta não encontrada.");
            return;
        }
        listaContas.remove(conta);
        System.out.println("Conta removida.");
    }
}