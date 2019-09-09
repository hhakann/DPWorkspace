package com.design.pattern.command;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class RemoteControlTest {
    private RemoteControl remoteControl;
    private ICommand lightOncommand,lightOffCommand;
    private Light light;

    @Before
    public void setUp() throws Exception {
        remoteControl=new RemoteControl(1);
        light=new Light("Living Room");
        lightOncommand=new LightOnCommand(light);
        lightOffCommand=new LightOffCommand(light);


    }

    @Test
    public void setCommands() {
        remoteControl.setCommands(0,lightOncommand,lightOffCommand);
       // System.out.println(remoteControl.toString());
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl.toString());
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl.toString());

    }


    @Test
    public void onButtonWasPushed() {
    }

    @Test
    public void offButtonWasPushed() {
    }

    @Test
    public void undoButtonWasPushed() {
    }

    @Test
    public void toZtring() {
    }
}
