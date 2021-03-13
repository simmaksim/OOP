package Sudoku;//package com.company;

import Memento.SudokuMemento;

public class Sudoku
{
    private int[][] array = {
            {0, 0, 8, 2, 0, 0, 9, 0, 3},
            {3, 4, 2, 0, 9, 5, 0, 0, 7},
            {1, 9, 7, 0, 0, 0, 0, 0, 4},
            {0, 0, 5, 3, 1, 2, 4, 7, 9},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {2, 0, 0, 0, 7, 4, 5, 0, 0},
            {0, 2, 0, 0, 0, 1, 0, 0, 5},
            {0, 7, 0, 0, 0, 6, 8, 9, 1},
            {8, 0, 0, 4, 3, 0, 7, 0, 6}};

    private int[][] solution = {
            {5, 6, 8, 2, 4, 7, 9, 1, 3},
            {3, 4, 2, 1, 9, 5, 6, 8, 7},
            {1, 9, 7, 8, 6, 3, 2, 5, 4},
            {6, 8, 5, 3, 1, 2, 4, 7, 9},
            {7, 3, 4, 9, 5, 8, 1, 6, 2},
            {2, 1, 9, 6, 7, 4, 5, 3, 8},
            {9, 2, 6, 7, 8, 1, 3, 4, 5},
            {4, 7, 3, 5, 2, 6, 8, 9, 1},
            {8, 5, 1, 4, 3, 9, 7, 2, 6}};

    public void setElement(int row, int col, int x)
    {
        array[row -1][col - 1] = x;
    }

    public int[][] getArray()
    {
        return array;
    }

    public void save(SudokuMemento memento)
    {
        memento.setArray(this.array);
    }

    public void restore(SudokuMemento memento)
    {
        array = memento.getArray();
    }

    public void output()
    {
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public void checking()
    {
        Boolean flag = false;
        for (int i = 0; i < 9 && flag; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                flag = (array[i][j] == solution[i][j]);
            }
        }
        if (flag)
        {
            System.out.print("Correct");
        }
        else
        {
            System.out.print("Incorrect");
        }
    }
}