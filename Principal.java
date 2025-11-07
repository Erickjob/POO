 void main() {

    
        System.out.println("Olá Mundo!");
        Circulo meuCirculo = new Circulo(r:2); // new circulo é é a classe do objeto que cria o objeto e o 
        //meu circulo é a variável que irá receber atribuíção do objeto.
        var s = IO.readln(prompt, "Qual o valor do raio?");
        var raio = Double.parseDouble(s);
        meuCirculo.setRaio(raio);
        System.out.println(meuCirculo.getRaio());
        System.out.println(meuCirculo.area());
        System.out.println(meuCirculo.circunferencia());
        
    }