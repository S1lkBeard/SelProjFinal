package nfinal.framework.steps;

import io.cucumber.java.ru.И;
import nfinal.framework.managers.PageManager;

public class MarketPageSteps {

    PageManager pageManager = PageManager.getPageManager();

    @И("Переход в маркет")
    public void clickServices() {
        pageManager.getMarketPage().clickServices();
    }

    @И("Переход в раздел 'Электроника'")
    public void choiseElectronics() {
        pageManager.getMarketPage().choiseElectronics();
    }

    @И("Переход в категорию 'Телевизоры и аксессуары'")
    public void choiseTvAndAccCat() {
        pageManager.getMarketPage().choiseTvAndAccCat();
    }

    @И("Переход в категорию 'Телевизоры'")
    public void choiseTvCat() {
        pageManager.getMarketPage().choiseTvCat();
    }

    @И("Переход в категорию 'Наушники и аудиотехника'")
    public void choiseHeadfonesAndAudio() {
        pageManager.getMarketPage().choiseHeadfonesAndAudio();
    }

    @И("Переход в категорию 'Наушники и Bluetooth-гарнитуры'")
    public void choiseHeadfonesAndBluetooth() {
        pageManager.getMarketPage().choiseHeadfonesAndBluetooth();
    }

    @И("Нажатие на кнопку 'Все фильтры'")
    public void clickAllFilters() {
        pageManager.getMarketPage().clickAllFilters();
    }

    @И("Ввод нижней границы стоимости")
    public void setStartPrice(String price) {
        pageManager.getMarketPage().setStartPrice(price);
    }

    @И("Выбор производителей: Samsung и LG")
    public void setMakers() {
        pageManager.getMarketPage().setMakers();
    }

    @И("Выбор производителей: JBL")
    public void setMakersJBL() {
        pageManager.getMarketPage().setMakersJBL();
    }

    @И("Нажатие на кнопку 'Показать результаты'")
    public void clickShowResults() {
        pageManager.getMarketPage().clickShowResults();
    }

    @И("Сохранение названия первого найденного товара")
    public void choiseFirstResult() {
        pageManager.getMarketPage().choiseFirstResult();
    }

    @И("Поиск по сохраненному наименованию")
    public void clickSearchBar() {
        pageManager.getMarketPage().clickSearchBar();
    }
}
