package chapter6.threads;

import java.util.concurrent.Semaphore;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: RestaurantCustomer
 * Date: 2017-06-12
 * Time: 오후 3:22
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Restaurant {
    private Semaphore tables;

    public Restaurant(int tablesCount) {
        // Create a semaphore using number of tables we have
        this.tables = new Semaphore(tablesCount);
    }

    public void getTable(int customerID) {
        try {
            System.out.println("Customer #" + customerID + " is trying to get a table.");
            // Acquire a permit for a table
            tables.acquire();
            System.out.println("Customer #" + customerID + " got a table.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void returnTable(int customerID) {
        System.out.println("Customer #" + customerID + " returned a table.");
        tables.release();
    }

    public static void main(String[] args) {
        // Create a restaurant with two dining tables
        Restaurant restaurant = new Restaurant(2);
        // Create five customers
        for (int i = 1; i <= 5; i++) {
            RestaurantCustomer c = new RestaurantCustomer(restaurant, i);
            c.start();
        }
    }


}
