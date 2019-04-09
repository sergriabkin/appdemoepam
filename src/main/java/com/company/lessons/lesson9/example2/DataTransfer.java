package com.company.lessons.lesson9.example2;

public interface DataTransfer {
    void save(Notepad notepad, String path);

    Notepad read(String path);
}
