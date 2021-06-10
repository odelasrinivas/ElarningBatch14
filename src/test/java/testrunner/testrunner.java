package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/feature/elarning.feature" , 
glue ={"stepdefination","utilities"}, 
monochrome = true, 
//dryRun=true,

plugin ={"pretty", "html:reports/htmlreport" })

//json:reports/jsonreport.json", 
//"junit:reports/xmlreport.xml"
//"html:reports/"
public class testrunner {

	
	
}


