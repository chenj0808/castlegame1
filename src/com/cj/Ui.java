package com.cj;

/**
 * @description:
 * @author:ASUS
 * @date: Created in 2020/6/14 21:52
 * @version: ${VERSION}
 * @modified By:
 */
public class Ui {

    public static void printWelcome (Person person) {
        System.out.println();
        System.out.println("欢迎来到城堡！");
        System.out.println("这是一个好玩的游戏。");
        System.out.println("如果需要帮助，请输入 'help' 。");
        System.out.println();

        displayReachableRooms(person);
    }


    public static void displayReachableRooms (Person person) {

        System.out.println("现在你在" + person.getCurrentRoom().getId() +"("+ person.getCurrentRoom().toString()+")");
        System.out.print("出口有：");
        for (String key : person.getCurrentRoom().getReachableRooms().keySet()
        ) {
            System.out.print(key + "(" + person.getCurrentRoom().getReachableRooms().get(key).getDescription() + ")" + " ");
        }
        System.out.println();
    }

    public static void printHelp () {
        System.out.print("迷路了吗？你可以做的命令有：go bye help");
        System.out.println("如：\tgo east");
    }

    public static void printNoRoom () {
        System.out.println("那里没有房间！");
    }
    public static void printErrorCommand () {
        System.out.println("输入错误命令，重新输入。");
    }
}
