package com.javaonlinecourse.b2lesson4.classwork.shop;

import com.javaonlinecourse.b2lesson3.classwork.cw04.Robot;
import com.javaonlinecourse.b2lesson4.classwork.items.Notebook;
import com.javaonlinecourse.b2lesson4.classwork.items.Printer;

import java.util.Random;

/**
 * @author emitrohin
 * @version 1.0
 *          19.11.2016
 */
public class ListOfItems {

    private Printer[] printers;
    private Notebook[] notebooks;

    public ListOfItems(int i) {

        Random r = new Random();
        String printerName = "printerName ";
        String notebookName = "notebookName ";

        this.printers = new Printer[i];
        this.notebooks = new Notebook[i];

        for (int j = 0; j < i; j++) {
            printers[j] = new Printer(printerName + j, "", r.nextInt(16000));
            notebooks[j] = new Notebook(notebookName + j, "", r.nextInt(50000));
        }
    }

    public void printList()
    {
        System.out.println("Сегодняшний ассортимент");

        System.out.println("Ноутбуки");
        for (int i = 0; i < getNotebooks().length; i++) {
            System.out.println(getNotebooks()[i].toString());
        }

        System.out.println("Принтеры");
        for (int i = 0; i < getPrinters().length; i++) {
            System.out.println(getPrinters()[i].toString());
        }
    }


    public Printer[] getPrinters() {
        return printers;
    }

    public void setPrinters(Printer[] printers) {
        this.printers = printers;
    }

    public Notebook[] getNotebooks() {
        return notebooks;
    }

    public void setNotebooks(Notebook[] notebooks) {
        this.notebooks = notebooks;
    }
}
