package org.example;

import java.util.Scanner;

public class User {
    /**
     *
     * @param size Количество товаров, которое будет лежать в корзине
     */
    public User(int size, Categoryes name, int number, int index){
        quantityOfProducts = size;
        bascet.FillBasket(name, number, index);
    }

    public User(){};

    private String login;
    private String password;
    private int quantityOfProducts;
    Basket bascet = new Basket(quantityOfProducts);

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
