package oop_principles.abstraction;

public class Samsung extends Phone implements WiFi, Camera, Bluetooth{

    public Samsung(){}

    public Samsung(String color){
        super(color);
    }

    @Override
    public void call() {
        System.out.println("Samsung calls");
    }

    @Override
    public void text() {
        System.out.println("Samsung texts");
    }

    @Override
    public void connectWiFi() {
        System.out.println("Samsung connects WiFi");
    }

    @Override
    public void takePhoto() {
        System.out.println("Samsung takes photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("Samsung records a video");
    }

    @Override
    public void connectBluetooth() {
        System.out.println("Samsung connects Bluetooth");
    }
}
