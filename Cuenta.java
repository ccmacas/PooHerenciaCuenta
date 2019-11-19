
package cuenta;


public class Cuenta {

    private double saldo; // variable de instancia que almacene el saldo

// constructor 

    public Cuenta(double saldoInicial) {
     
// valida que el saldoInicial sea mayor que 0.0;
// si no lo es, saldo se inicializa con el valor predeterminado 0.0

if (saldoInicial > 0.0);
    this.saldo = saldoInicial;
    
    }
    
// abona un monto a la cuenta
public void abonar(double monto){
    if (monto >0){
saldo = saldo + monto; // suma el monto al saldo
    }
}
    
public void Cargar(double monto){
    //carga un monto a la cuenta
    if (monto >0.0){
        if (monto < saldo){
            // resta el monto al saldo
            saldo = saldo - monto;
            
        }else{
            // si el monto excede el saldo de la cuenta se imprime el siguiente mensaje
            System.out.println("El monto a cargar excede el saldo de la cuenta.");
        }
    }
    
}
  public double getSaldo(){
      return saldo;
  }
  public void setSaldo(double saldo){
      this.saldo = saldo;
  }
      

    
    
    
}
