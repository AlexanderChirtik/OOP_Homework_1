package org.example;


public class Main {
    public static void main(String[] args) {

        Categoryes sport = new Categoryes("Спорт товары" , 3);
        Categoryes food = new Categoryes("Еда", 3);
        Categoryes appliances = new Categoryes("Бытовая техника", 3);

        User user1 = new User(3,sport,1,0);
        User user2 = new User(1, food, 1, 1);
        User user3 = new User(2, appliances, 0, 0);

        sport.ProductsInfo();
        food.ProductsInfo();
        appliances.ProductsInfo();
    }
}