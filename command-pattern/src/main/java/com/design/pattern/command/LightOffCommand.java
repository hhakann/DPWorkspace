package com.design.pattern.command;


import jdk.nashorn.internal.objects.annotations.Setter;


public class LightOffCommand implements ICommand {
   private Light light;


    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.off();

    }

    public void undo() {
        this.light.on();

    }
    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public String toString() {
        return "LightOffCommand{" +
                "light=" + light +
                '}';
    }
}
