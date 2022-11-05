package com.gildedrose;

// Nous n'avons pas fait de rendu git avec les commits envoyés petit à petit pour ce TP.
// Nous allons le réaliser pour le prochain TP. Nous avons ajouté des commentaires pour expliquer l'évolution du code
// à la place des commit ce qui explique que les commentaires ne sont pas "bons" du point de vue de ce cours.

class GildedRose {
    Item[] items;
    static final String agedbrie = "Aged Brie";
    static final String backstage = "Backstage passes to a TAFKAL80ETC concert";
    static final String sulfuras = "Sulfuras, Hand of Ragnaros";
    static final String conjured = "Conjured";

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for(Item item : items) {
            switch (item.name) {

                case sulfuras :          //Sulfuras étant un objet légendaire il n'interagit pas avec l'e-shop
                    break;

                case agedbrie :         //On a remarqué un comportement particulier a AgedBrie qui contrairement
                                        // ,aux autres items, gagne de la qualité avec les jours de vente
                    addQuality(item);
                    subSellIn(item);
                    if (item.sellIn < 0) {
                        addQuality(item);
                    }
                    break;

                case backstage :         //Les tickets de concerts gagnent de la valeur a l'approche du concert puis
                                        // ne valent plus rien après, c'est un comportement particulier qu'on donc isolé
                    addQuality(item);
                    if (item.sellIn < 11) {
                        addQuality(item);
                    }
                    if (item.sellIn < 6) {
                        addQuality(item);
                    }
                    subSellIn(item);
                    if (item.sellIn < 0) {
                        item.quality = 0;
                    }
                    break;

                case conjured :         //Ici on a ajouté le dernier cas particulier qui est pour les items conjurés
                                        // qui perdent deux fois plus de qualité (consigne du readme)
                    addQuality(item);
                    subSellIn(item);
                    if(item.sellIn < 0) {
                        subQualityConjured(item);
                    }
                    break;

                default :                   //Comportement général pour tous les items restants
                    subQuality(item);
                    subSellIn(item);
                    if(item.sellIn < 0) {
                        subQuality(item);
                    }
                    break;
            }
        }
    }

    protected void addQuality(Item item) {      //Fonction qui ajoute 1 points de qualité a un item
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    protected void subQuality(Item item) {      //Fonction inverse de celle du dessus
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    protected void subQualityConjured(Item item) {//Fonction pour les objets conjurés qui enlève 2 de qualité
        if (item.quality > 0) {
            item.quality = item.quality - 2;
        }
    }

    protected void subSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    } //Fonction qui enlève 1 jour de vente
}