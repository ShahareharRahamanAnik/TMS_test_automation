package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src/test/resources/Feature/TMSTest.feature"},
        glue = {"StepDefinition"},   monochrome = true,
        dryRun = false,
        plugin ={ "pretty","html:build/Addition&Edition.html"
        })
@Test
class CucomberRunner extends AbstractTestNGCucumberTests{
}