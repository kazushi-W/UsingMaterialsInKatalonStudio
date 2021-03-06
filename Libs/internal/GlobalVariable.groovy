package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : Method annotated with @BeforeTestCase in TestListener should set the value
Profile webu_production_environment : Method annotated with @BeforeTestCase in TestListener should set the value
Profile webui_development_environment : Method annotated with @BeforeTestCase in TestListener should set the value</p>
     */
    public static Object CURRENT_TESTCASE_ID
     
    /**
     * <p>Profile default : instance of com.kazurayam.materials.MaterialRepository
Profile webu_production_environment : instance of com.kazurayam.materials.MaterialRepository
Profile webui_development_environment : instance of com.kazurayam.materials.MaterialRepository</p>
     */
    public static Object MATERIAL_REPOSITORY
     
    /**
     * <p></p>
     */
    public static Object Hostname
     
    /**
     * <p></p>
     */
    public static Object Username
     
    /**
     * <p></p>
     */
    public static Object Password
     
    /**
     * <p></p>
     */
    public static Object dataPath
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            CURRENT_TESTCASE_ID = selectedVariables['CURRENT_TESTCASE_ID']
            MATERIAL_REPOSITORY = selectedVariables['MATERIAL_REPOSITORY']
            Hostname = selectedVariables['Hostname']
            Username = selectedVariables['Username']
            Password = selectedVariables['Password']
            dataPath = selectedVariables['dataPath']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
