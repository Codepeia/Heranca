
import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Fornecedor f = new Fornecedor();
        Empregado e = new Empregado();
        Administrador a = new Administrador();
        
        
       /* System.out.println("Digite o nome:");
        String nomeF = sc.nextLine();
        f.setNome(nomeF);
       
        
        System.out.println("Digite o endereco:");
        String end = sc.nextLine();
        f.setEndereco(end);
        
        System.out.println("Digite o telefone:");
        String tel = sc.nextLine();
        f.setTelefone(tel);
           
        System.out.println("Digite o credito:");
        double credito = sc.nextDouble();
        f.setValorCredito(credito);
        
        System.out.println("Digite o divida:");
        double divida = sc.nextDouble();
        f.setValorDivida(divida);
        
        System.out.println("Informacoes Fornecedor: "+f.toString());*/
       
       e.setNome("Maria");
       e.setSalarioBase(1000);
       e.setImposto(10);
       
       System.out.println("Empregado: "+e.toString());
       
       a.setNome("Lucas");
       a.setSalarioBase(2000);
       a.setImposto(5);
       a.setAjudaDeCusto(500);
        System.out.println("Administrador: "+a.toString());
        
       
    }
    
}
