package com.animain.entities;

public class AniMain {
    String aId;
    String aName;
    int aCost;

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public int getaCost() {
        return aCost;
    }

    public void setaCost(int aCost) {
        this.aCost = aCost;
    }

    @Override
    public String toString() {
        return "AniMain{" +
                "aId='" + aId + '\'' +
                ", aName='" + aName + '\'' +
                ", aCost=" + aCost +
                '}';
    }
}
