package Frutaria.app;

import Frutaria.service.Estoque;
import Frutaria.view.Atendente;

public class Frutapp {

    public static void main(String[]args){
        Atendente atendente = new Atendente();
        Estoque estoque = new Estoque();
        int opcaoMenu = 0;

        do {
            opcaoMenu = atendente.menuPrincipal();
            estoque.gerenciarEstoque(opcaoMenu, atendente);
        } while (opcaoMenu != 4);
    }
}
