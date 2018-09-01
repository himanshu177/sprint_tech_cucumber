package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
//@Cucumber.Options(features="feature",glue={"stepDefinition"})
@CucumberOptions(
        features ="/home/luser/eclipse-workspace/assignment_squad/features/datatable_with_header.feature",
        glue= "home/luser/eclipse-workspace/assignment_squad/src/main/java/Step_defination/Datatable_with_header.java",
       format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
       monochrome= true,
       strict=true,
        dryRun =false  
        )
public class datatable_with_runner {

}


