package com.TryCloud.step_definitions;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Hook {

    private static Date date = null;

    @Before
    public void setup(){

    }

    @After
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }

   // @AfterStep

    public static void scrFolder() {
        try {
            Robot robot = new Robot();
            //downcast the driver to access TakesScreenshot method
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage bufferedImage = robot.createScreenCapture(rectangle);
            //capture screenshot as output type FILE
            File file = ts.getScreenshotAs(OutputType.FILE);

            date = new Date();
            DateFormat dateFormat = new SimpleDateFormat("_yyMMdd_HHmmss");
            //save the screenshot taken in destination path
            //C:\Users\BitFenix\Desktop


            FileUtils.copyFile(file, new File("C:\\Users\\12027\\Desktop\\Screenshots\\" + dateFormat.format(date) + ".png"));

        } catch (AWTException | IOException e) {
            e.printStackTrace();
        }
    }

}
