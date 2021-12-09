
package calculadoraOO;

public abstract class Operacoes implements IOperacoes {
    
    @Override
    public double somar(double x, double y) {
        return x + y;
    }

    @Override
    public double subtrair(double x, double y) {
        return x - y; 
    }

    @Override
    public double dividir(double x, double y) {
        return x / y;
    }

    @Override
    public double multiplicar(double x, double y) {
        return x * y;
    }

    @Override
    public double porcento(double x) {
        return x / 100;
    }
    
    @Override
    public double porcento(double x, double y) {
        return ((y + 100) * x) /100 ;
    }
    
    @Override
    public double menosporcento(double x, double y) {
        return ((100 - y) * x) /100 ;
    }
    
    @Override
    public double multporcento(double x, double y) {
        return (y * x) /100 ;
    }
    
    @Override
    public double divporcento(double x, double y) {
        return x * 100 / y ;
    }
    
}
