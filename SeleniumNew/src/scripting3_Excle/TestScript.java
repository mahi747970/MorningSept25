package scripting3_Excle;


import org.openqa.selenium.WebDriver;

import java.util.Map;

public class TestScript extends ReusableMethods {
    public static void main(String[] args) {
        TS_LoginLogout();
        TS_CreatDeleteUser();
    }

    public static void TS_LoginLogout() {
        WebDriver oBrowser = null;
        Map<String, String> data = null;
        try {
            data = getExcelData("TestData","TestData","TC_ID_001");
            oBrowser = launchBrowser(data.get("browserName"));
            boolean blnRes = navigateURL(oBrowser, data.get("url"));
            blnRes = loginToApplication(oBrowser, data.get("userName"), data.get("password"));
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
        Map<String, String> data = null;
        try {
            data = getExcelData("TestData","TestData","TC_ID_001");
            oBrowser = launchBrowser(data.get("browserName"));
            boolean blnRes = navigateURL(oBrowser, data.get("url"));
            blnRes = loginToApplication(oBrowser, data.get("userName"), data.get("password"));
            String str = createUser(oBrowser,data);
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



