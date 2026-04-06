package org.example;

public class Main {
    static int age = 36;
    public String name = "demo";
    private float percentage = 76.65f;
    protected char grade = 'b';

    public static void main(String[] args) {

        System.out.println("my age is " + age);
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
}
