package com.design.pattern.command;

public class Light {
    String location;
    int level;
    public Light(String location) {
        this.location=location;

    }
    public void on(){
        this.level=100;
        System.out.println("Light is on");

    }
    public void off(){
        this.level=0;
        System.out.println("Light is off");
    }
    public  void dim(int level){
        if (level==0){
            off();
        }else {
            System.out.println("Light is dimmed to " + level + "%");
        }

    }

    @Override
    public String toString() {
        return "Light{" +
                "location='" + location + '\'' +
                ", level=" + level +
                '}';
    }
}
