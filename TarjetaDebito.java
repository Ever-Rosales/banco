package banco;
import java.util.Scanner;
public class TarjetaDebito extends Tarjeta {
    //ATRIBUTOS
    Scanner sc;
    public int SaldoDisponible=0;
    
    //CONSTRUCTORES
    
    
    //METODOS
    public void Retirar (){
        
    }
    
    public void Transferir (){
        
    }
    
    public void Ingresar (){
        
    }
    
    @Override
    public void Consultar (){
        
    }
    
    @Override
    public void Registrar (){
        System.out.println ("ESTA ES TU TARJETA DE DÉBITO...");
        super.Registrar();
        System.out.println("Saldo disponible $" + SaldoDisponible);
        
    }
    
    @Override
    public void Listar (){
        
    }
    
}
