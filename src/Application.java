import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Aplication{
    private String name;
    private String version;
    private double price;

    public Application(String name, String version, double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public double getPrice() {
        return price;
    }
}

class Phone {
    private String owner;
    private double balance;
    private List<Application> apps;

    public Phone(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.apps = new ArrayList<Application>();
    }

    public void installApp(Application app) {
        if (balance >= app.getPrice()) {
            apps.add(app);
            balance -= app.getPrice();
            System.out.println(app.getName() + " została zainstalowana.");
        } else {
            System.out.println("Nie masz wystarczającej ilości środków, aby zainstalować " + app.getName() + ".");
        }
    }

    public boolean isAppInstalled(Application app) {
        return apps.contains(app);
    }

    public boolean isAppInstalled(String appName) {
        for (Application app : apps) {
            if (app.getName().equals(appName)) {
                return true;
            }
        }
        return false;
    }

    public void printFreeApps() {
        for (Application app : apps) {
            if (app.getPrice() == 0) {
                System.out.println(app.getName());
            }
        }
    }

    public double getAppsValue() {
        double value = 0;
        for (Application app : apps) {
            value += app.getPrice();
        }
        return value;
    }

    public void printInstalledApps() {
        List<String> appNames = new ArrayList<String>();
        for (Application app : apps) {
            appNames.add(app.getName());
        }
        Collections.sort(appNames);
        for (String name : appNames) {
            System.out.println(name);
        }
    }

    public void printInstalledAppsByPrice() {
        List<Application> appList = new ArrayList<Application>(apps);
        Collections.sort(appList, new Comparator<Application>() {
            public int compare(Application app1, Application app2) {
                return Double.compare(app1.getPrice(), app2.getPrice());
            }
        });
        for (Application app : appList) {
            System.out.println(app.getName());
        }
    }

    private class Application {
        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public boolean getName() {
            return false;
        }
    }
}
