package nfinal.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketPage extends BasePage {

    @FindBy(xpath = "//a[@title='Все сервисы']")
    public WebElement services;

    @FindBy(xpath = "//div[contains (text(), 'Маркет')]")
    public WebElement market;
    
    @FindBy(xpath = "//li[@data-node-id='6n2ld']")
    public WebElement electronics;

    @FindBy(xpath = "//a[@href='https://market.yandex.ru/catalog--televizory-i-aksessuary/26960170']")
    public WebElement tvAndAcc;

    @FindBy(xpath = "//a[@href='https://mark']")
    public WebElement headfonesAndAudio;

    @FindBy(xpath = "//a[contains (text(), 'Телевизоры')]")
    public WebElement tv;

    @FindBy(xpath = "//a[contains (text(), 'Наушники')]")
    public WebElement headfonesAndBluetooth;

    @FindBy(xpath = "//span[contains (text(), 'Все фильтры')]")
    public WebElement allFilters;

    @FindBy(xpath = "/html/body/div[4]/section/div[2]/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/input")
    public WebElement startPrice;

    @FindBy(xpath = "//input[@value='Samsung']")
    public WebElement makerSamsung;

    @FindBy(xpath = "//input[@value='LG']")
    public WebElement makerLG;

    @FindBy(xpath = "//input[@value='JBL']")
    public WebElement makerJBL;

    @FindBy(xpath = "//a[contains (text(), 'Показать')]")
    public WebElement showResults;

    @FindBy(xpath = "//div/div[@class='_2im8- _2S9MU _2jRxX']")
    public WebElement firstResult;

    @FindBy(xpath = "//input[@id='header-search']")
    public WebElement searchBar;

    @FindBy(xpath = "//button[@data-r='search-button']")
    public WebElement buttonFind;

    public String result;

    public MarketPage clickServices() {
        services.click();
        market.click();
        return pageManager.getMarketPage();
    }

    public MarketPage choiseElectronics() {
        electronics.click();
        return pageManager.getMarketPage();
    }

    public MarketPage choiseTvAndAccCat() {
        tvAndAcc.click();
        return pageManager.getMarketPage();
    }

    public MarketPage choiseTvCat() {
        tv.click();
        return pageManager.getMarketPage();
    }

    public MarketPage choiseHeadfonesAndAudio() {
        headfonesAndAudio.click();
        return pageManager.getMarketPage();
    }

    public MarketPage choiseHeadfonesAndBluetooth() {
        headfonesAndBluetooth.click();
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

    public MarketPage setMakers() {
        makerSamsung.click();
        makerLG.click();
        return pageManager.getMarketPage();
    }

    public MarketPage setMakersJBL() {
        makerJBL.click();
        return pageManager.getMarketPage();
    }

    public MarketPage clickShowResults() {
        showResults.click();
        return pageManager.getMarketPage();
    }

    public MarketPage choiseFirstResult() {
        result = firstResult.getText();
        return pageManager.getMarketPage();
    }

    public MarketPage clickSearchBar() {
        searchBar.click();
        searchBar.sendKeys(result);
        buttonFind.click();
        return pageManager.getMarketPage();
    }
}
