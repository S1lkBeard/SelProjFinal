package nfinal.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketPage extends BasePage {

    @FindBy(xpath = "//a[@title='Все сервисы']")
    public WebElement services;

    @FindBy(xpath = "//div[contains (text(), 'Маркет')]")
    public WebElement market;

    @FindBy(xpath = "//span[contains (text(), 'Электроника')]")
    public WebElement electronics;

    @FindBy(xpath = "//a[@href='https://market.yandex.ru/catalog--televizory-i-aksessuary/26960170']")
    public WebElement tvAndAcc;

    @FindBy(xpath = "//a[@href='https://market.yandex.ru/catalog--naushniki-i-audiotekhnika/26992071']")
    public WebElement headfonesAndAudio;
    @FindBy(xpath = "//span[contains (text(), 'Все фильтры')]")
    public WebElement allFilters;

    @FindBy(xpath = "/html/body/div[4]/section/div[2]/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/input")
    public WebElement startPrice;

    @FindBy(xpath = "//label[@id='153061']")
    public WebElement makerSamsung;

    @FindBy(xpath = "//input[@value='LG']")
    public WebElement makerLG;

    @FindBy(xpath = "//a[contains (text(), 'Показать')]")
    public WebElement showResults;

    @FindBy(xpath = "//img[@class='_2UO7K']")
    public WebElement firstResult;

    @FindBy(xpath = "//input[@id='header-search']")
    public WebElement searchBar;

    @FindBy(xpath = "//button[@data-r='search-button']")
    public WebElement buttonFind;

    @FindBy(xpath = "//img[@class='_2UO7K']")
    public WebElement resultForComparison;

    public String resultFirst;
    public String resultSecond;

    public MarketPage clickServices() {
        services.click();
        market.click();
        return pageManager.getMarketPage();
    }

    public MarketPage choiseElectronics() {
        for (String newWindow : driverManager.getDriver().getWindowHandles()) {
            driverManager.getDriver().switchTo().window(newWindow);
        }
        electronics.click();
        return pageManager.getMarketPage();
    }

    public MarketPage choiseCat(String name) {
        switch (name) {
            case "Телевизоры и аксессуары":
                tvAndAcc.click();
                break;
            case "Наушники и аудиотехника":
                headfonesAndAudio.click();
                break;
        }
        return pageManager.getMarketPage();
    }

    public MarketPage choiseSubCat(String name) {
        WebElement element = driverManager.getDriver().findElement(By.partialLinkText(name));
        element.click();
        return pageManager.getMarketPage();
    }

    public MarketPage clickAllFilters() {
        allFilters.click();
        return pageManager.getMarketPage();
    }

    public MarketPage setStartPrice(String price) {
        startPrice.clear();
        startPrice.click();
        startPrice.sendKeys(price);
        return pageManager.getMarketPage();
    }

    public MarketPage setMakers(String makers) {
        switch (makers) {
            case "Samsung и LG":
                js.executeScript("arguments[0].click()", makerSamsung);
                js.executeScript("arguments[0].click()", makerLG);
                break;
            case "JBL":
                WebElement element = driverManager.getDriver().findElement
                        (By.xpath("//input[@value='"+makers+"']"));
                js.executeScript("arguments[0].click()", element);
                break;
        }
        return pageManager.getMarketPage();
    }

    public MarketPage clickShowResults() {
        showResults.click();
        return pageManager.getMarketPage();
    }

    public MarketPage choiseFirstResult() {
        resultFirst = firstResult.getAttribute("alt");
        return pageManager.getMarketPage();
    }

    public MarketPage clickSearchBar() {
        searchBar.click();
        searchBar.sendKeys(resultFirst);
        buttonFind.click();
        return pageManager.getMarketPage();
    }

    public MarketPage checkFoundResult() {
        resultSecond = resultForComparison.getAttribute("alt");
        Assert.assertTrue("Результат поиска не совпал", resultSecond.equals(resultFirst));
        return pageManager.getMarketPage();
    }
}