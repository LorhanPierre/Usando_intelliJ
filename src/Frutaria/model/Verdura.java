package Frutaria.model;

public class Verdura extends Produto{

    private String tipo;

    public Verdura(){
        super();
        this.tipo = "";
    }

    public Verdura(String tipo,String nome,double preco,int quantidade){
        super(nome, preco, quantidade);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
}
