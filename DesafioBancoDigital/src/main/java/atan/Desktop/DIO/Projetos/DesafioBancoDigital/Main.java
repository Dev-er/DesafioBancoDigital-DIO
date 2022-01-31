package atan.Desktop.DIO.Projetos.DesafioBancoDigital;

public class Main {
    public static void main(String[] args) {
        Cliente bira = new Cliente();
        bira.setNome("ubiratan");

        Conta cc = new ContaCorrente(bira);
        Conta poupanca = new ContaPoupanca(bira);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}