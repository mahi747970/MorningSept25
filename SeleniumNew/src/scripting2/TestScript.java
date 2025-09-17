package scripting2;

import org.openqa.selenium.WebDriver;

public class TestScript extends ReusableMethods {
    public static void main(String[] args) {
        TS_LoginLogout();
        TS_CreatDeleteUser();
    }

    public static void TS_LoginLogout() {
        WebDriver oBrowser = null;
        try {
            oBrowser = launchBrowser("Chrome");
            boolean blnRes = navigateURL(oBrowser, "http://localhost/login.do");
            blnRes = loginToApplication(oBrowser, "admin", "manager");
            blnRes = logoutFromActiTime(oBrowser);

        } catch (Exception e) {
            System.out.println("Excption in 'TS_LoginLogout()'test script");
        } finally {
            oBrowser.close();
            oBrowser = null;
        }
    }

    public static void TS_CreatDeleteUser() {
        WebDriver oBrowser = null;
        try {
            oBrowser = launchBrowser("Chrome");
            boolean blnRes = navigateURL(oBrowser, "http://localhost/login.do");
            blnRes = loginToApplication(oBrowser, "admin", "manager");
            String str = createUser(oBrowser);
            blnRes = deleteUser(oBrowser, str);
            blnRes = logoutFromActiTime(oBrowser);

        } catch (Exception e) {
            System.out.println("Excption in 'TS_CreatDeleteUser()'test script");
        } finally {
            oBrowser.close();
            oBrowser = null;
        }
    }

}



