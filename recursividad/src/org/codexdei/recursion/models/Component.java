package org.codexdei.recursion.models;

import java.util.ArrayList;
import java.util.List;

public class Component {

    private String name;
    private int level;
    private List<Component> sons;

    public Component(String name){

        this.name = name;
        this.sons = new ArrayList<>();
    }

    public String getName(){

        return this.name;
    }

    public void setName(String name){

        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Component> getSons() {
        return sons;
    }

    public void setSons(List<Component> sons) {
        this.sons = sons;
    }

    public Component addComponent(Component c){

        this.sons.add(c);

        return this;
    }

    public boolean hasSons(){

        return !this.sons.isEmpty();
    }


}
