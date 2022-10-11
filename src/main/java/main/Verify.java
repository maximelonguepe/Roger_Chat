package main;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Verify {

    public boolean verify(String message, String avaibleLetters) {
        List<Character> messageList = message.chars().mapToObj(c -> (char) c).toList();
        List<Character> avaibleLettersList = new ArrayList<>(avaibleLetters.chars().mapToObj(c -> (char) c).toList());
        AtomicInteger compteur = new AtomicInteger(0);
        messageList.forEach(car -> {
            int index = inLettersArray(avaibleLettersList, car);
            if (car != ' ') {
                if (index != -1) {
                    avaibleLettersList.remove(index);
                    compteur.getAndIncrement();

                } else {
                    return;
                }
            } else {
                compteur.getAndIncrement();
            }
        });
        return compteur.get()==messageList.size();
    }

    private int inLettersArray(List<Character> avaibleLettersList, Character car) {
        return avaibleLettersList.indexOf(car);
    }



}
