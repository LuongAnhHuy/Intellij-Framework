package automation.interfaces;

public class RegisterPageUI {
    public static final String EMAIL_TEXTBOX = "//input[@name='emailid']";
    public static final String SUBMIT_BUTTON = "//input[@name='btnLogin']";
    public static final String USER_ID_TEXTBOX = "//td[@class='accpage' and text() ='User ID :']//following-sibling::td";
    public static final String PASSWORD_ID_TEXTBOX = "//td[@class='accpage' and text() ='Password :']//following-sibling::td";

}
