package com.design.pattern.command;

public class LightOnCommand  implements ICommand{
    Light light;



    public LightOnCommand(Light light) {
    this.light=light;
    }

    public void execute() {
        light.on();

    }

    public void undo() {
        light.off();

    }

    @Override
    public String toString() {
        return "LightOnCommand{" +
                "light=" + light +
                '}';
    }
}
