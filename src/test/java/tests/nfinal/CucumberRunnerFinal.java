package tests.nfinal;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        glue = {"nfinal\\framework\\steps"},
        features = {"src\\test\\resources"},
        tags = {"@paramScenario"}
)

public class CucumberRunnerFinal {

}