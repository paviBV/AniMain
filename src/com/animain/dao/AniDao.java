package com.animain.dao;

import com.animain.datastore.AniDataStore;
import com.animain.entities.AniMain;

import java.util.List;

public class AniDao {
    AniDataStore aniDataStore = new AniDataStore();

    public void setAniMain(String id, String name, int cost) {
        aniDataStore.setAniMain(id,name,cost);
    }
//    public void printAniMain(){
//        aniDataStore.printAniMain();
//    }

    public List<AniMain> aniMainList(){
        return aniDataStore.aniMainList();
    }
}
