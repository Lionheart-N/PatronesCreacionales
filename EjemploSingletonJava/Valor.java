public class Valor{

double numero; //valor nulo para hacer el ejemplo
private static Valor valorUno; //valor nulo para hacer el ejemplo
private Valor(){};

public synchronized static Valor getValor(){
  /*
  La palabra clave "synchronized" nos sirve para mantener este proceso sincronizado entre hilos, esto, porque al momento de ejecutar esta clase en hilos diferentes va a generar instancias diferentes, y en este caso números diferentes, con esta palabra clave primero, mantenemos el mismo número y en segundo y más importante, el singleton sigue siendo único.
  */
  if(valorUno== null ){
    Valor valorDos = new Valor();
    valorDos.setNumero((Math.random()*9));
    valorUno=valorDos;
  };
  return valorUno;
}

//metodo privado para que sea accesible solo desde el mismo singleton
private void setNumero (double num){
  numero=num;
}

public double getNumero(){
  return numero;
}

}