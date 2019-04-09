package com.company.lessons.lesson9.example2;

public class Main {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        notepad.addNote("Hello!");
        notepad.addNote("Have a nice day");

        System.out.println(notepad);
        notepad.delete(0);

        notepad.addNote("a");

        System.out.println(notepad);

        DataTransfer dataTransferFile = new DataTransferFileImpl();
        DataTransfer dataTransferDB = new DataTransferOracleDBImpl();

        dataTransferFile.save(notepad, "path");

    }
}
