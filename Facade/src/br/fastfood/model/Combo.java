package br.fastfood.model;

import java.util.ArrayList;
import java.util.List;

public class Combo {
    private List<ItemCombo> itens;

    public Combo() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemCombo item) {
        itens.add(item);
    }

    public void exibirItens() {
        for (ItemCombo item : itens) {
            System.out.println(item.getNome() + " - R$ " + item.getPreco());
        }
    }

    public double getPrecoTotal() {
        double total = 0;
        for (ItemCombo item : itens) {
            total += item.getPreco();
        }
        return total;
    }
}
