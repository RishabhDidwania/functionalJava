//package com;
//
//public class CommandPatternOOStyle {
//
//    public static void main(String[] args) {
//        com.Commandpattern.fun.TV sony = new com.Commandpattern.fun.TV("Sony");
//        sony.increaseVolume();
//        sony.decreaseVolume();
//
//        com.Commandpattern.fun.IncreaseVolumeCommand incCommand = new com.Commandpattern.fun.IncreaseVolumeCommand(sony);
//        com.Commandpattern.fun.DecreaseVolumeCommand decCommand = new com.Commandpattern.fun.DecreaseVolumeCommand(sony);
//
//        com.Commandpattern.fun.Remote remote = new com.Commandpattern.fun.Remote();
//        remote.increaseVolumeCommand = incCommand;
//        remote.decreaseVolumeCommand = decCommand;
//
//        remote.increaseVolume();
//        remote.increaseVolume();
//        remote.increaseVolume();
//        remote.decreaseVolume();
//
//        com.Commandpattern.fun.TV lg = new com.Commandpattern.fun.TV("LG");
//        remote.increaseVolumeCommand = new com.Commandpattern.fun.IncreaseVolumeCommand(lg);
//        remote.decreaseVolumeCommand = new com.Commandpattern.fun.DecreaseVolumeCommand(lg);
//        remote.increaseVolume();
//        remote.increaseVolume();
//        remote.increaseVolume();
//    }
//
//}
//
//class TV {
//    private String model;
//    private int volume;
//    public TV(String model) {
//        this.model = model;
//    }
//    public void increaseVolume() {
//        volume++;
//        System.out.println("***Increasing volume in " + model + ": " + volume);
//    }
//    public void decreaseVolume() {
//        volume--;
//        System.out.println("***Decreasing volume in " + model + ": " + volume);
//    }
//}
//interface Command {
//    void operate();
//}
//
//class IncreaseVolumeCommand implements com.Commandpattern.fun.Command {
//    private com.Commandpattern.fun.TV tv;
//    public IncreaseVolumeCommand(com.Commandpattern.fun.TV tv) { this.tv = tv; }
//    public void operate() {
//        tv.increaseVolume();
//    }
//}
//
//class DecreaseVolumeCommand implements com.Commandpattern.fun.Command {
//    private com.Commandpattern.fun.TV tv;
//    public DecreaseVolumeCommand(com.Commandpattern.fun.TV tv) { this.tv = tv; }
//    public void operate() {
//        tv.decreaseVolume();
//    }
//}
//
//class Remote {
//    public com.Commandpattern.fun.IncreaseVolumeCommand increaseVolumeCommand;
//    public com.Commandpattern.fun.DecreaseVolumeCommand decreaseVolumeCommand;
//    public void increaseVolume() {
//        increaseVolumeCommand.operate();
//    }
//    public void decreaseVolume() {
//        decreaseVolumeCommand.operate();
//    }
//}
