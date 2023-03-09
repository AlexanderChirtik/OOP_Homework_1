package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Basket {
    /**
     *
     * @param size - Количество товаров, которое планируется купить
     */
    public Basket(int size){
        quantity = size;
    }

    public Basket(){};

    private int quantity;
    private Product [] boughtProducts =  new Product[quantity];

    /**
     *
     * @param name - имя категории из которой будет выбран товар
     * @param number порядковый номер товара в перечне
     * @param i индекс продукта в массиве boughtProducts
     */
    public void FillBasket(Categoryes name, int number, int i){
            boughtProducts[i] = name.products[number];
            name.products[number] = null;
            System.out.println("Покупка совершена");
    }
}
