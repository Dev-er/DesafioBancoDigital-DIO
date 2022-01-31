package atan.Desktop.DIO.Projetos.DesafioBancoDigital;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super.(cliente);
    }
    
    @Override
    public void imprimirExtrato() { 
        System.out.print("*** Extrato Conta Corrente");
        System.out.print(String.format('Titular %s', cliente.getNome()));
        System.out.print(String.format('Agencia %d', agencia));
        System.out.print(String.format('Numero', agencia));
        System.out.print(String,format('Saldo %.2', saldo));
    }
}