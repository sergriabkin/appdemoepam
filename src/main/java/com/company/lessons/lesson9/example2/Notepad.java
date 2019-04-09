package com.company.lessons.lesson9.example2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Notepad {
    private List<String> notes = new ArrayList<>();
    private static int counter = 0;

    //Getters or/and setters

    public void addNote(String note) {
        counter++;
        notes.add(write(note));
    }

    private String write(String note) {
        return counter + " " + LocalDateTime.now().toString() + ": " + note;
    }

    public void delete(int index) {
        counter--;
        notes.remove(index);
    }

    @Override
    public String toString() {
        return Arrays.toString(notes.toArray());
    }

    //    public void saveToFile(String fileName){
//        //todo
//    }
//
//    public Notepad readFromFile(String fileName){
//        //todo
//        return null;
//    }


}
