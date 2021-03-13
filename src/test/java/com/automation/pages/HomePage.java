package com.automation.pages;

import com.automation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath="(//span[.='Quick view'])[1]")
    public WebElement quickView;

    @FindBy(xpath="//a[normalize-space()='Sign in']")
    public WebElement signIn;

    @FindBy(xpath="(//a[@class='product_img_link']/img)[1]")
    public WebElement product1;







}
