package com.animain.manager;

import com.animain.dao.AniDao;
import com.animain.entities.AniMain;

import java.util.List;

public class AniManager {
    AniDao aniDao = new AniDao();
    List<AniMain> list = aniDao.aniMainList();

//    public void printAniMain(){
//        aniDao.printAniMain();
//    }
    public void setAniMain(String id, String name, int cost) {
        aniDao.setAniMain(id,name,cost);
    }

    public void aniMainList(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


    public void serachAniMain(String id) {

        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).getaId()).equals(id)) {
                System.out.println("Search a record");
                System.out.println(list.get(i));
            }
        }
    }
    public void updateAniMain(String id, String name, int cost){

        for (int i = 0; i < list.size(); i++) {
            System.out.println("for");
            if ((list.get(i).getaId()).equals(id)){
                list.get(i).setaName(name);
                list.get(i).setaCost(cost);
                System.out.println(list.get(i));
            }
        }
    }

    public void deleteAniMain(String id){
        System.out.println(" ");
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).getaId()).equals(id)) {
                list.remove(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getaId()!=id) {
                System.out.println("File deleted");
                break;
            }
        }
    }


}
