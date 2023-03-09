package org.example;

import java.util.Scanner;

public class Categoryes {

    /**
     *
     * @param name Задаем имя категории
     * @param quantity Определяем количество товаров в данной категории
     */
    public Categoryes(String name, int quantity){
        this.categoryName = name;
        this.quantity = quantity;
        products = CreateArray();
        ProductsInfo();
    }
    public Categoryes(){};
    private String categoryName;
    private int quantity;

    /**
     * Создаем массив с товарами
     */
    public Product[] products;
    /**
     *  Каждую категорию заполняем товарами согласно заданному количеству
     */
    private Product[] CreateArray(){
        Product[] tempProducts = new Product[quantity];
        for (int i = 0; i < quantity; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите имя товара");
            String name = sc.nextLine();
            System.out.println("Введите цену товара");
            float price = sc.nextFloat();
            System.out.println("Введите рейтинг товара");
            byte rating = sc.nextByte();
            tempProducts[i] = new Product(name, price, rating);
        }
        return tempProducts;
    }

    /**
     * Получение информации о товарах
     */
    public void ProductsInfo(){
        for (int i = 0; i < products.length; i++) {
            System.out.println("Имя товара - " + products[i].getName() + " Цена - " + products[i].getPrice() + " Рейтинг - " + products[i].getRating());
        }
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setName(String name) {
        this.categoryName = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
