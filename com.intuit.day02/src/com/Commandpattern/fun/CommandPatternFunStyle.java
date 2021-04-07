package com.Commandpattern.fun;

public class CommandPatternFunStyle {

    public static void main(String[] args) {

        TV sony = new TV("Sony");
        TV lg = new TV("Lg");

        Command incVolCmd = TV::increaseVolume;
        Command decVolCmd = TV::decreaseVolume;

        Remote incRemoteVol = incVolCmd::operate;
        Remote incRemoteVol = decVolCmd::operate;


        incVolCmd.operate(sony);
        decVolCmd.operate(lg);

//
//
//        IncreaseVolumeCommand incCommand = new IncreaseVolumeCommand(sony);
//        DecreaseVolumeCommand decCommand = new DecreaseVolumeCommand(sony);
//
//        Remote remote = new Remote();
//        remote.increaseVolumeCommand = incCommand;
//        remote.decreaseVolumeCommand = decCommand;
//
//        remote.increaseVolume();
//        remote.increaseVolume();
//        remote.increaseVolume();
//        remote.decreaseVolume();
//
//        TV lg = new TV("LG");
//        remote.increaseVolumeCommand = new IncreaseVolumeCommand(lg);
//        remote.decreaseVolumeCommand = new DecreaseVolumeCommand(lg);
//        remote.increaseVolume();
//        remote.increaseVolume();
//        remote.increaseVolume();
    }

}

class TV {
    private String model;
    private int volume;
    public TV(String model) {
        this.model = model;
    }
    public void increaseVolume() {
        volume++;
        System.out.println("***Increasing volume in " + model + ": " + volume);
    }
    public void decreaseVolume() {
        volume--;
        System.out.println("***Decreasing volume in " + model + ": " + volume);
    }
}

interface Command {
    void operate(TV tv);
}

interface Remote {
    void action(Command cmd);
}

//class IncreaseVolumeCommand implements Command {
//    private TV tv;
//    public IncreaseVolumeCommand(TV tv) { this.tv = tv; }
//    public void operate() {
//        tv.increaseVolume();
//    }
//}
//
//class DecreaseVolumeCommand implements Command {
//    private TV tv;
//    public DecreaseVolumeCommand(TV tv) { this.tv = tv; }
//    public void operate() {
//        tv.decreaseVolume();
//    }
//}

//class Remote {
//    public IncreaseVolumeCommand increaseVolumeCommand;
//    public DecreaseVolumeCommand decreaseVolumeCommand;
//    public void increaseVolume() {
//        increaseVolumeCommand.operate();
//    }
//    public void decreaseVolume() {
//        decreaseVolumeCommand.operate();
//    }
//}
