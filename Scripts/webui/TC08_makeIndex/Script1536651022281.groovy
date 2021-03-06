import com.kazurayam.materials.MaterialRepository
import internal.GlobalVariable
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

/**
 * webui/TC08_makeIndex
 */

// prepare instance of MaterialRepository
MaterialRepository mr = (MaterialRepository)GlobalVariable.MATERIAL_REPOSITORY
assert mr != null

// make ./Material/index.html file
mr.makeIndex()