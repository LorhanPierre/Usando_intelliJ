package Frutaria.model;

public class Fruta extends Produto {

    private double peso;

    public Fruta(){

        super();
        this.peso = 0.0;
    }

    public Fruta(String nome, double preco, int quantidade,double peso){

        super(nome, preco, quantidade);
        this.peso = peso;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(){
        this.peso = peso;
    }

}
