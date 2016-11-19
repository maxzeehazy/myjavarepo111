package com.javaonlinecourse.b2lesson4.classwork;

import com.javaonlinecourse.b2lesson4.classwork.clients.Client;
import com.javaonlinecourse.b2lesson4.classwork.clients.OrdinaryClient;
import com.javaonlinecourse.b2lesson4.classwork.items.ShopItem;
import com.javaonlinecourse.b2lesson4.classwork.shop.ListOfItems;
import com.javaonlinecourse.b2lesson4.classwork.shop.ShopHelper;
import com.sun.deploy.util.SessionState;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author emitrohin
 * @version 1.0
 *          19.11.2016
 */
public class Main {
    public static void main(String[] args) {
        Client client = new OrdinaryClient();
        System.out.println("Добро пожаловать в инет магазин!");
        System.out.println("Ваше количество денег: " + client.getMoney());
        Scanner reader = new Scanner(System.in);
        ListOfItems listOfItems = new ListOfItems(10);
        ArrayList<ShopItem> basket = new ArrayList<>();

        while (true){
            String command = reader.next();

            if (command.equals("exit"))
            {
                break;
            }
            else if (command.equals("list"))
            {
                listOfItems.printList();
            }
            else if (command.equals("pick"))
            {
                System.out.println("Выберите товар");
                String pickItem = reader.next();

                for (int i = 0; i < listOfItems.getNotebooks().length; i++) {
                    if (pickItem.equals(listOfItems.getNotebooks()[i].getName()))
                    {
                        basket.add(listOfItems.getNotebooks()[i]);
                        break;
                    }
                }

                for (int i = 0; i < listOfItems.getPrinters().length; i++) {
                    if (pickItem.equals(listOfItems.getNotebooks()[i].getName()))
                    {
                        basket.add(listOfItems.getNotebooks()[i]);
                        break;
                    }
                }
            }
            else if (command.equals("basket"))
            {
                if (basket.size() == 0)
                {
                    System.out.println("Ваша корзина пуста");
                } else {
                    for (int i = 0; i < basket.size(); i++) {
                        System.out.println(basket.get(i).toString());
                    }
                }
            }
            else if (command.equals("buy"))
            {
                int sum = 0;

                for (int i = 0; i < basket.size(); i++) {
                    sum += basket.get(i).getPrice();
                }

                if (sum == 0)
                {
                    System.out.println("Вы ничего не выбрали");
                } else {
                    if (sum > client.getMoney())
                    {
                        System.out.println("Вы не можете себе этого позволить");
                    } else {
                        client.setMoney( client.getMoney() - sum );
                    }
                }
            }
            else {
                System.out.println("Неизвестная команда");
            }
        }

        System.out.println("Приходите к нам еще");

    }
}
