package oop_principles.abstraction;

public class IPhone extends Phone implements WiFi, Camera, Bluetooth{

    @Override
    public void call() {
        System.out.println("iPhone calls");
    }

    @Override
    public void text() {
        System.out.println("iPhone texts");
    }

    @Override
    public void ring() {
        System.out.println("iPhone rings");
    }

    @Override
    public void connectWiFi() {
        System.out.println("iPhone connects WiFi");
    }

    @Override
    public void takePhoto() {
        System.out.println("iPhone takes photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("iPhone records a video");
    }

    @Override
    public void connectBluetooth() {
        System.out.println("iPhone connects Bluetooth");
    }
}
