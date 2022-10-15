package nfinal.framework.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import nfinal.framework.managers.DriverManager;
import nfinal.framework.managers.InitManager;
import nfinal.framework.managers.PropManager;
import nfinal.framework.utils.PropsConsts;

public class Hooks {

    private DriverManager driverManager = DriverManager.getInstance();
    private PropManager propManager = PropManager.getInstance();

    @Before
    public void before() {
        InitManager.initFramework();
        driverManager.getDriver().get(propManager.getProperty(PropsConsts.BASE_URL));
    }

//    @After
//    public void after() {
//        InitManager.quitFramework();
//    }
}
