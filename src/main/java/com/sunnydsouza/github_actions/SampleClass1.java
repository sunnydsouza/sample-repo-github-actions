package com.sunnydsouza.github_actions;

public class SampleClass1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    void fix(int a, int b) {
        System.out.println("Dummy fix:"+a + b);
        System.out.println("Testing a fake fix wherein the commit message does not conform to semantic-release");
    }
}
