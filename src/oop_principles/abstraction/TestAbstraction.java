package oop_principles.abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
        // Phone phone1 = new Phone(); //Abstract class cannot be instantiated

        Samsung s1 = new Samsung();
        IPhone i1 = new IPhone();
        Nokia n1 = new Nokia();

        s1.call();//Samsung calls
        i1.call();//iPhone calls
        n1.call();//Nokia calls

        s1.text();//Samsung texts
        i1.text();//iPhone texts
        n1.text();//Nokia texts

        s1.ring();//Phone rings
        i1.ring();//iPhone rings
        n1.ring();//Phone rings

        s1.connectWiFi();//Samsung connects WiFi
        i1.connectWiFi();//iPhone connects WiFi

        s1.recordVideo();//Samsung records a video
        s1.takePhoto();//Samsung takes photo
        i1.recordVideo();//iPhone records a video
        i1.takePhoto();//iPhone takes photo

        s1.connectBluetooth();//Samsung connects Bluetooth
        i1.connectBluetooth();//iPhone connects Bluetooth




    }
}
