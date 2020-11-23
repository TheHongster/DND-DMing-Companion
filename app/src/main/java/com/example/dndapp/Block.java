package com.example.dndapp;

public class Block {
    public String Name;
    public int Hp , HpMax, Ac, type;

    public Block(String name,int hp, int ac, int type)
    {
        this.Name=name;
        this.Hp=hp;
        this.HpMax=hp;
        this.Ac=ac;
        this.type=type;
    }

    public String getName() {
        return Name;
    }

    public int getHp() {
        return Hp;
    }

    public int getHpMax() {
        return HpMax;
    }

    public int getAc() {
        return Ac;
    }

    public void setHp(int hp) {
        Hp = hp;
    }
}
