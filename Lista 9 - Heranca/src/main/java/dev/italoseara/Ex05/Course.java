package dev.italoseara.Ex05;

public enum Course {
    COMPUTER_SCIENCE("Computer Science"),
    LETTERS("Letters"),
    BIOLOGY("Biology"),
    ENGINEERING("Engineering");

    private String name;

    Course(String name) {
        this.name = name;
    }
}
