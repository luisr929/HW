package GroupProject2;

public interface WebDriver {
    void open();
    void close();

    String getTitle();

}
interface RemoteWebdriver extends WebDriver {
    void navigate();

}
interface TakesScreenshot extends RemoteWebdriver{
    void getScreenshot();
}
class Chromedriver implements RemoteWebdriver{

    @Override
    public void open() {
        System.out.println("chrome opens");
    }

    @Override
    public void close() {
        System.out.println("chrome closes");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("chrome navigating");
    }
}
class FireFoxDriver implements RemoteWebdriver{

    @Override
    public void open() {
        System.out.println("firefox opens");
    }

    @Override
    public void close() {
        System.out.println("firefox closes");
    }

    @Override
    public String getTitle() {
        return "Firefox";
    }

    @Override
    public void navigate() {
        System.out.println("firefox navigating");
    }
}
class SafariDriver implements RemoteWebdriver{

    @Override
    public void open() {
        System.out.println("safari opens");
    }

    @Override
    public void close() {
        System.out.println("safari closes");
    }

    @Override
    public String getTitle() {
        return "safari";
    }

    @Override
    public void navigate() {
        System.out.println("safari navigating");
    }
}
class WebDriverTester {
    public static void main(String[] args) {

        RemoteWebdriver [] drivers={new Chromedriver(),new FireFoxDriver(),new SafariDriver()};
        for (RemoteWebdriver driver : drivers) {
            driver.close();
            driver.open();
            driver.getTitle();
            driver.navigate();

        }
       /*
        Chromedriver driver = new Chromedriver();
        driver.close();
        driver.getTitle();
        driver.open();
        driver.navigate();

        FireFoxDriver driver1=new FireFoxDriver();
        driver1.close();
        driver1.open();
        driver1.getTitle();
        driver1.navigate();

        SafariDriver driver2=
        */
    }
}