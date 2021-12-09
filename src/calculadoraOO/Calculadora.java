
package calculadoraOO;

public class Calculadora extends Operacoes {
    
    private double valor1;

    private double valor2;
    
    private String operacao;

    public Calculadora() {
    }

    public Calculadora(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
 
    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
    
    public String getOperacao() {
           return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
   
}
