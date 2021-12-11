package by.bsuir.Mukhliada.task5.runner;

import by.bsuir.Mukhliada.Input;
import by.bsuir.Mukhliada.task5.util.Sequence;

public class task5 {
    public static void main(String[] args){
        int numbers[] = Input.arrayInt();
        int answer = Sequence.getMinElementsForDel(numbers);

        System.out.format("Delete %d elements.", answer);
    }
}
