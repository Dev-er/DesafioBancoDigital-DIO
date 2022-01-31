package atan.Desktop.DIO.Projetos.DesafioBancoDigital;

public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected double limite;
    protected Cliente cliente;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
   } 


    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    void depositar(double valor) {
        saldo += valor;
    }

    @Override
    void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
    
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
       return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

}