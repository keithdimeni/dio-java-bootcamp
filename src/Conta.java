public class Conta {

    /*
    Tipos de escopos
     */

    //Variavel da classe
    double saldo = 1500.00;

    public String sacar(double valor){
        //variavel do metodo
        double novoSaldo;
        novoSaldo = saldo - valor;
        return "Valor de Saque: "+ valor +"\n\nSaldo atual: "+ novoSaldo;
    }

    public void imprimirSaldo(){
        System.out.println("Saldo total: "+saldo);
    }

    public double calcularDividaExponencial(){
        //variável local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0; // começando a variável com valor zero
        for(int x=1; x<=5; x++) {
            //x variável de escopo de fluxo
            //esta variável será reiniciada a cada execução for
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }
        //escopo de fluxo
        //x e valorCalculado nunca estarão disponíveis fora do for

        return valorMontante;
    }

}

