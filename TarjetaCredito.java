package banco;
import java.util.Scanner;
public class TarjetaCredito extends Tarjeta {
    //ATRIBUTOS
    Scanner sc;
    public float Credito = 3000;
    
    //CONSTRUCTORES
    public TarjetaCredito (){
    }
    
    //METODOS
    public void Comprar(){
        
    }
    
    public void Pagar (){
        
    }
    
    @Override
    public void Consultar(){
        
    }
    
    @Override
    public void Registrar (){
        System.out.println("ESTA ES TU TARJETA DE CRÉDITO...");
        super.Registrar();
    }
    
    @Override
    public void Listar (){
        System.out.println("Nombre: " +Nombre);
        System.out.println("Fecha de nacimiento: " +FechaNacimiento);
        System.out.println("Número de celular: " + NumeroCelular);
        System.out.println("Crédito disponible $" +Credito);

    }
    
}
