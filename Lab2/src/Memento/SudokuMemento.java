package Memento;

import Sudoku.Sudoku;
import Memento.SudokuMemento;

public class SudokuMemento {
    private int[][] array;

    public SudokuMemento(Sudoku sudoku) {
        setArray(sudoku.getArray());
    }

    public void setArray(int[][] arr) {
        this.array = new int[arr.length][arr.length];
        for(int i = 0; i < array.length; i++)
        {
            System.arraycopy(arr[i], 0,array[i], 0, arr[i].length);
        }
    }

    public int[][] getArray()
    {
        return array;
    }
}