package br.fastfood.facade;

import java.util.Scanner;
import br.fastfood.model.Combo;
import br.fastfood.model.Burger;
import br.fastfood.model.Bebida;
import br.fastfood.model.Sobremesa;

public class ComboFacade {
    private Combo combo;

    public void criarCombo(int escolha) {
        combo = new Combo();

        if (escolha == 1) {
            combo.adicionarItem(new Burger("Big Cheddar", 18.0));
            combo.adicionarItem(new Bebida("Refrigerante", 7.0));
            combo.adicionarItem(new Sobremesa("Sorvete", 10.0));
        } else if (escolha == 2) {
            combo.adicionarItem(new Burger("Duplo Bacon", 22.0));
            combo.adicionarItem(new Bebida("Suco Natural", 8.0));
            combo.adicionarItem(new Sobremesa("Torta de Maçã", 12.0));
        } else {
            System.out.println("Opção inválida. Nenhum combo foi criado.");
        }
    }

    public void exibirItens() {
        combo.exibirItens();
    }

    public double getPrecoTotal() {
        return combo.getPrecoTotal();
    }
}

