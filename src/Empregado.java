
public class Empregado extends Pessoa{
    private int codSetor;
    private double salarioBase;
    private double imposto;

    public int getCodSetor() {
        return codSetor;
    }

    public void setCodSetor(int codSetor) {
        this.codSetor = codSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    public double calcularSalario(){
        double salarioFinal = getSalarioBase()-(getSalarioBase() * (getImposto() /100));
        return salarioFinal;
    }
    
    public String toString(){
        return String.format(""+super.toString()+
                            "\nSalario base: "+getSalarioBase()+
                            "\nImposto: "+getImposto()+
                            "\nSalario Final: "+calcularSalario());
    }
        
}
