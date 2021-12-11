package by.bsuir.Mukhliada.task8.runner;

import by.bsuir.Mukhliada.Input;
import by.bsuir.Mukhliada.Print;
import by.bsuir.Mukhliada.task8.util.Sequences;

public class task8 {
    public static void main(String[] args) {
        double[] firstSequence = Input.arrayDouble();
        double[] secSequence = Input.arrayDouble();


        Print.array(Sequences.getPlacesToInsert(firstSequence, secSequence));
    }
}
