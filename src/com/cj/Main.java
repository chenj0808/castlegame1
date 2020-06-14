package com.cj;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scene scene=new Scene();
        scene.initScene();

        Ui.printWelcome(scene.getPerson());

        Scanner in=new Scanner(System.in);
        while (true) {

            String command=in.nextLine();

            String[] words=command.split(" ");

            if (words[0].equals("help")) {
                Ui.printHelp();
            } else if (words[0].equals("go")) {
                scene.getPerson().go(words[1]);
            } else if (words[0].equals("bye")) {
                System.out.println("感谢您的光临。再见！");
                break;
            } else {
                Ui.printErrorCommand();
            }
        }
    }
}
