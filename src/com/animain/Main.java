package com.animain;


import com.animain.manager.AniManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AniManager aniManager = new AniManager();

//        aniManager.printAniMain();
//        aniManager.aniMainList();
//        aniManager.updateAniMain();
//        aniManager.serachAniMain();
//        aniManager.deleteAniMain();
//        aniManager.aniMainList();

        Scanner sc = new Scanner(System.in);
        int Choice = 0;

        do {
                System.out.println("Please enter your choice");
                System.out.println("1 : Add");
                System.out.println("2 : Display");
                System.out.println("3 : Update");
                System.out.println("4 : Search");
                System.out.println("5 : Delete");
                Choice = sc.nextInt();

            if (Choice==1){
                System.out.println("Please enter the credentials");
                System.out.println("Enter String Id (Ex:S1, D1)");
                String id = sc.next();
                System.out.println("Enter Name");
                String name = sc.next();
                System.out.println("Enter Cost");
                int cost = sc.nextInt();
                aniManager.setAniMain(id,name,cost);
            }

            if (Choice==2){
                System.out.println("Records available in table");
                aniManager.aniMainList();
            }

            if (Choice==3){
                System.out.println("Please enter the credentials");
                System.out.println("Enter String Id");
                String id = sc.next();
                System.out.println("Enter Name");
                String name = sc.next();
                System.out.println("Enter Cost");
                int cost = sc.nextInt();
                aniManager.updateAniMain(id,name,cost);
            }

            if (Choice==4){
                System.out.println("Enter String Id");
                String id = sc.next();
                System.out.println("Record your looking for");
                aniManager.serachAniMain(id);
            }

            if (Choice==5){
                System.out.println("Enter String Id");
                String id = sc.next();
                aniManager.deleteAniMain(id);
                aniManager.aniMainList();
            }

        }while (Choice!=6);

    }
}
