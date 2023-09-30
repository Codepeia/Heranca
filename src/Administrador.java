
public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }
    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    @Override
    public double calcularSalario(){
            double salarioFinal = super.calcularSalario() + getAjudaDeCusto();
            return salarioFinal;
    }
    @Override
    public String toString(){
        return String.format(""+super.toString()+
                            "\nAjuda de Custo: "+getAjudaDeCusto()
                            );
    }
}
