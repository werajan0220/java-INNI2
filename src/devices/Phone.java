package devices;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device {
    final String producer;
   final String mark;
    Double millage;
    Integer yearOfProduction;
    Double power;
    String color;
    public Phone (String producer,String mark, Integer yearOfProduction){
        super(producer, mark);
        this.producer = producer;
        this.mark = mark;
    }
    public void turnOn() {
        System.out.println("wciskam guzik");
        System.out.println("działa");
    }
    public String toString(){
        return mark+ " "+power;
    }

}
class phone{

    // pola klasy Phone
    private String model;
    private String manufacturer;

    // stałe z domyślnymi wartościami
    public static final String DEFAULT_APP_SERVER = "http://app-server.jankowska.com";
    public static final String DEFAULT_PROTOCOL = "https";
    public static final String DEFAULT_VERSION = "1.0";

    public phone(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    // nazwą aplikacji do zainstalowania
    public void installAnnApp(String appName) {
        System.out.println("Instalowanie aplikacji " + appName + " na telefonie " + model + " producenta " + manufacturer);
    }

    //nazwą i wersją aplikacji do zainstalowania
    public void installAnnApp(String appName, String appVersion) {
        System.out.println("Instalowanie wersji " + appVersion + " aplikacji " + appName + " na telefonie " + model + " producenta " + manufacturer);
    }

    //nazwą, wersją, adresem serwera i protokołem
    public void installAnnApp(String appName, String appVersion, String serverAddress, String protocol) {
        System.out.println("Instalowanie wersji " + appVersion + " aplikacji " + appName + " z serwera " + serverAddress + " przy użyciu protokołu " + protocol + " na telefonie " + model + " producenta " + manufacturer);
    }

    //  listą nazw aplikacji do zainstalowania
    public void installAnnApp(List<String> appNames) {
        try {
            URL url = new URL("https");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Instalowanie aplikacji na telefonie " + model + " producenta " + manufacturer);
        for (String appName : appNames) {
            System.out.println("- Instalowanie aplikacji " + appName);
        }
    }
//obiekt URL
    public void installAnnApp(URL appUrl) {
        System.out.println("Instalowanie aplikacji z adresu " + appUrl + " na telefonie " + model + " producenta " + manufacturer);
    }

}
