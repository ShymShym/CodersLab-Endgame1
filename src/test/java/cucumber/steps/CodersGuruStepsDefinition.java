package cucumber.steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CodersGuruStepsDefinition {
    WebDriver driver;

    @Given("website (.*) is open")
    public void openWebsite(String website) {
        System.setProperty("webdriver.gecko.driver",
                "src/test/resources/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(website);
    }

    @When("^user enters email \"([^\"]*)\"$")
    public void userEntersEmail(String arg0) {
        WebElement emailElement = driver.findElement(By.name("email"));
        emailElement.clear();
        emailElement.sendKeys(arg0);
    }

    @And("^user submits$")
    public void userSubmits() {
        driver.findElement(By.cssSelector("input.link")).click();
    }

    @And("^user enters Imię \"([^\"]*)\"$")
    public void userEntersImie(String arg0) {
        WebElement ImieElement = driver.findElement(By.id("fos_user_registration_form_name"));
        ImieElement.clear();
        ImieElement.sendKeys(arg0);
    }

    @And("^user enters Nazwisko \"([^\"]*)\"$")
    public void userEntersNazwisko(String arg0) {
        WebElement NazwiskoElement = driver.findElement(By.id("fos_user_registration_form_lastname"));
        NazwiskoElement.clear();
        NazwiskoElement.sendKeys(arg0);
    }

    @And("^user enters Hasło \"([^\"]*)\"$")
    public void userEntersHaslo(String arg0) {
        WebElement HasloElement = driver.findElement(By.id("fos_user_registration_form_plainPassword_first"));
        HasloElement.clear();
        HasloElement.sendKeys(arg0);
    }

    @And("^user repeats Hasło \"([^\"]*)\"$")
    public void userRepeatsHaslo(String arg0) {
        WebElement HasloRepeatElement = driver.findElement(By.id("fos_user_registration_form_plainPassword_second"));
        HasloRepeatElement.clear();
        HasloRepeatElement.sendKeys(arg0);
    }

    @And("^user enters Miasto \"([^\"]*)\"$")
    public void userEntersMiasto(String arg0) {
        WebElement MiastoElement = driver.findElement(By.id("form_city"));
        MiastoElement.clear();
        MiastoElement.sendKeys(arg0);
    }

    @And("^user enters Kod pocztowy \"([^\"]*)\"$")
    public void userEntersKodP(String arg0)  {
        WebElement KodPElement = driver.findElement(By.id("form_postal_code"));
        KodPElement.clear();
        KodPElement.sendKeys(arg0);
    }

    @And("^user enters Ulica \"([^\"]*)\"$")
    public void userEntersUlica(String arg0)  {
        WebElement UlicaElement = driver.findElement(By.id("form_street"));
        UlicaElement.clear();
        UlicaElement.sendKeys(arg0);
    }

    @And("^user enters Numer domu/lokalu \"([^\"]*)\"$")
    public void userEntersNumerDomuLokalu(String arg0)  {
        WebElement NumerDomuLokaluElement = driver.findElement(By.id("form_number"));
        NumerDomuLokaluElement.clear();
        NumerDomuLokaluElement.sendKeys(arg0);
    }

    @And("^user checks box$")
    public void userChecksBox() {
        driver.findElement(By.xpath("//form/div[12]/input")).click();
    }

    @And("^user submits the whole form$")
    public void userSubmitsForm() {
        driver.findElement(By.id("register-submit-btn")).click();
    }

    @Then("^user is successfully registered$")
    public void userIsSuccessfullyRegistered() {
        //Assert
        Assert.assertEquals(driver.findElement(By.id("user-name")).getText(), "Jadwiga");
    driver.quit();
    }
}

