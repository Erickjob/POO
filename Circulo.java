
public class Circulo
{
	private double raio; // fazendo isso transforma essa variável numa variável global declarando logo no inicio.

    public Circulo(double r) { //Construtor / inicializador
      if (r >=0){
            raio = r;
        } else{
            raio = 1.0;
        }
         
    }
    public Circulo(double r) { //Construtor / inicializador     foi atribuíto isso para já para possuir um valor que possa ser usado o programa
      raio = 1.0
         
    }

    public double setRaio(double r){
        if (r >=0){
            raio = r;
        }            
    }

	
	public double area() {
	    return Math.PI * raio * raio;
	    
    }
    
    public double circunferencia() {
        return 2 * Math.PI * raio;
    }
    
    
}