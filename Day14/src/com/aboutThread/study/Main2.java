package com.aboutThread.study;

public class Main2 {
    public static void main(String[] args) {

        Thread thread = new Thread(new HelloRunnable());

        thread.run();
    }
}
