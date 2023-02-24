package conta.controller;

import conta.model.Conta;
import conta.repository.ContaRepository;

import java.util.ArrayList;

public class ContaController implements ContaRepository {

    private ArrayList<Conta> listaContas = new ArrayList<>();
    @Override
    public void procurarPorNumero(int numero) {
        var conta = buscarNaCollection(numero);

        if (conta != null) {
            conta.visualizar();
        } else {
            System.out.println("A Conta número: " + numero + " não foi encontrada!");
        }
    }

    @Override
    public void listarTodas() {
        for (var conta : listaContas) {
            conta.visualizar();
        }
    }

    @Override
    public void cadastrar(Conta conta) {
        listaContas.add(conta);
        System.out.println("A Conta foi Criada!");
    }

    @Override
    public void atualizar(Conta conta) {
        var buscaConta = buscarNaCollection(conta.getNumero());

        if (buscaConta != null) {
            listaContas.set(listaContas.indexOf(buscaConta), conta);
            System.out.println("A Conta número: " + conta.getNumero() + " foi atualizada!");
        } else {
            System.out.println("A Conta número: " + conta.getNumero() + " não foi encontrada!");
        }
    }

    @Override
    public void deletar(int numero) {
        var conta = buscarNaCollection(numero);

        if (conta != null) {
            if (listaContas.remove(conta)) {
                System.out.println("A Conta número: " + numero + " foi excluída!");
            }
        } else {
            System.out.println("A Conta número: " + numero + " não foi encontrada!");
        }
    }

    @Override
    public void sacar(int numero, float valor) {

    }

    @Override
    public void depositar(int numero, float valor) {

    }

    @Override
    public void transferir(int numero, int numeroDestino, float valor) {

    }

    public int gerarNumero() {
        return listaContas.size() + 1;
    }

    public Conta buscarNaCollection(int numero) {
        for (var conta : listaContas) {
            if (conta.getNumero() == numero) {
                return  conta;
            }
        }
        return  null;
    }

    public int retornaTipo(int numero) {

        for (var conta : listaContas) {
            if (conta.getNumero() == numero) {
                return  conta.getTipo();
            }
        }
        return 0;
    }
}