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

    @И("^Переход в категорию '(.+)'$")
    public void choiseCat(String name) {
        pageManager.getMarketPage().choiseCat(name);
    }

    @И("^Переход в подкатегорию '(.+)'$")
    public void choiseSubCat(String name) {
        pageManager.getMarketPage().choiseSubCat(name);
    }

    @И("Нажатие на кнопку 'Все фильтры'")
    public void clickAllFilters() {
        pageManager.getMarketPage().clickAllFilters();
    }

    @И("^Заполнение фильтра: нижняя граница стоимости '(.+)'$")
    public void setStartPrice(String price) {
        pageManager.getMarketPage().setStartPrice(price);
    }

    @И("^Заполнение фильтра: производители '(.+)'$")
    public void setMakers(String makers) {
        pageManager.getMarketPage().setMakers(makers);
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

    @И("Сравнение названий")
    public void checkFoundResult() {
        pageManager.getMarketPage().checkFoundResult();
    }
}
