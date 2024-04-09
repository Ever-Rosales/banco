package banco;
import java.util.Scanner;
public class Tarjeta {
    //ATRIBUTOS
    //hola
    Scanner sc;
    
    public String Nombre;
    public String FechaNacimiento;
    public String NumeroCelular;
    public String CLABE;
    
    //CONSTRUCTORES
    public Tarjeta (){
        
    }
    
    //METODOS
    public void Consultar (){
        
    }
    
    public void Registrar (){
        System.out.println("Ingresa tu nombre: ");
        Nombre = sc.nextLine();
        System.out.println("Ingresa tu fecha de la siguiente manera dd/mm/aa: ");
        FechaNacimiento = sc.nextLine();
        System.out.println("Ingresa tu número de celular de la siguiente manera 55-##-##-##-##: ");
        NumeroCelular = sc.nextLine();
        
    }
    
    public void Listar (){
    
        
        
    }
}
