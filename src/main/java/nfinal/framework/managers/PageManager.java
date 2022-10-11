package nfinal.framework.managers;

import nfinal.framework.pages.MarketPage;

public class PageManager {

    private static PageManager INSTANCE;

    private static PageManager pageManager;

    private MarketPage marketPage;

    private PageManager() {
    }

    public static PageManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PageManager();
        }
        return INSTANCE;
    }

    public static PageManager getPageManager() {
        if (pageManager == null) {
            pageManager = new PageManager();
        }
        return pageManager;
    }

    public MarketPage getMarketPage() {
        if (marketPage == null) {
            marketPage = new MarketPage();
        }
        return marketPage;
    }
}
