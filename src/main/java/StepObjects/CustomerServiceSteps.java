package StepObjects;

import PageObjects.CustomerServicePage;

import java.io.File;

public class CustomerServiceSteps {
    CustomerServicePage customerServicePage;

    public CustomerServiceSteps(){
        customerServicePage = new CustomerServicePage();
    }
    public void selectHeading(){

        customerServicePage.heading.selectOptionByValue("1");
    }
    public void selectOrder(){

        customerServicePage.order.selectOption(1);
    }

    public void sendMessage(String text){

        customerServicePage.message.sendKeys(text);
    }

    public void attachFile(){

        customerServicePage.attach.uploadFile(new File("src/main/resources/attachtext.txt"));
    }
    public void sendReport(){

        customerServicePage.sendBtn.click();
    }
}
