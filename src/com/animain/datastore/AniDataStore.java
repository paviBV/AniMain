package com.animain.datastore;

import com.animain.entities.AniMain;

import java.util.ArrayList;
import java.util.List;

public class AniDataStore {
    List<AniMain> aniMainList = new ArrayList<>();
    public void setAniMain(String id, String name, int cost) {
        AniMain aniMain = new AniMain();
        aniMain.setaId(id);
        aniMain.setaName(name);
        aniMain.setaCost(cost);
        aniMainList.add(aniMain);
    }

//    public void printAniMain(){
//        setAniMain("A001","Pinky", 3000);
//        setAniMain("A002", "Dinku", 4000);
//        setAniMain("A003", "Rocky", 5000);
//    }
    public List<AniMain> aniMainList(){
        return aniMainList;
    }
}
