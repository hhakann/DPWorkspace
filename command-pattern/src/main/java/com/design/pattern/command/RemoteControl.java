package com.design.pattern.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoteControl {
    private ICommand[] onCommands;
    private ICommand[] offCommands;
    private int commandCount;
    private ICommand undoCommand;

    public RemoteControl(int commandCount ) {
        this.commandCount=commandCount;
        this.onCommands =new ICommand[this.commandCount];
        this.offCommands = new ICommand[this.commandCount];

    }


    public void setCommands(int slot,ICommand onCommands,ICommand offCommand) {
        this.onCommands[slot]=onCommands;
        this.offCommands[slot]=offCommand;


    }
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand=onCommands[slot];


    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand=offCommands[slot];


    }
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("-------Remote Control--------\n");

        for (int i=0;i<onCommands.length;i++){
            stringBuffer.append("[Slot : "+i+" ]"+onCommands[i]+ "       " +offCommands[i]+ "\n");

        }
        stringBuffer.append("[undo] " + undoCommand + "\n");

        return stringBuffer.toString();
    }
}
