package Sudoku;//package com.company;

import java.util.Scanner;
import Memento.SudokuMemento;


public class Main
{

    public static void main(String[] args)
    {

        Sudoku sudoku = new Sudoku();
        SudokuMemento memento = new SudokuMemento(sudoku);
            Scanner scan = new Scanner(System.in);
            boolean flag = true;

            while (flag)
            {
                System.out.println("Menu: ");
                System.out.println("1 - Add number to a table\n" +
                        "2 - Back to the previous\n" +
                        "3 - Show a table\n" +
                        "4 - Checking\n" +
                        "5 - Quit\n");
                int x = scan.nextInt();
                switch (x)
                {
                    case 1:
                    {
                        sudoku.save(memento);
                        System.out.println("Enter a row: ");
                        int row = scan.nextInt();
                        System.out.println("Enter a column: ");
                        int column = scan.nextInt();
                        System.out.println("Enter a number: ");
                        sudoku.setElement(row, column, scan.nextInt());
                        break;
                    }

                    case 2:
                    {
                        sudoku.restore(memento);
                        break;
                    }

                    case 3:
                    {
                        sudoku.output();
                        break;
                    }

                    case 4:
                    {
                        sudoku.checking();
                        break;
                    }

                    case 5:
                    {
                        flag = false;
                        break;
                    }
                }

            }

    }
}