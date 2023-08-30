import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('id.pkp.sehati.uat', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('homePage/buttonAcquisition'), 0)

Mobile.tap(findTestObject('acquisitionPage/buttonOrder'), 0 //START FUNCTION
    )

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/orderCard1'), 0 //START FUNCTION
    )

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1800, 0, 1300)

Mobile.tap(findTestObject('orderPage/editOrderPage/buttonDataCustomer_EditOrder'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataCustomer/buttonPekerjaanDDL'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360) //radioButton1TapAtPosition(970, 1360)
//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)

Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataCustomer/buttonAgamaDDL'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360 //radioButton1TapAtPosition(970, 1360)
    )

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataCustomer/buttonPendidikanTerDDL'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360 //radioButton1TapAtPosition(970, 1360)
    )

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataCustomer/fieldTextPekerjaanDi-ID'), 0)

Mobile.clearText(findTestObject('orderPage/formDataCustomer/fieldTextPekerjaanDi-ID'), 0)

Mobile.sendKeys(findTestObject('orderPage/formDataCustomer/fieldTextPekerjaanDi-ID'), 'PEKERJA SWASTA\\n')

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 2045, 0, 1535)

def submitButtonTapAtPosition(int x, int y) {
    Mobile.tapAtPosition(x, y)
}

def searchButtonTapAtPosition(int x, int y) {
    Mobile.tapAtPosition(x, y)
}

def radioButton1TapAtPosition(int x, int y) {
    Mobile.tapAtPosition(x, y)
}

def radioButton2TapAtPosition(int x, int y) {
    Mobile.tapAtPosition(x, y)
}

def radioButton3TapAtPosition(int x, int y) {
    Mobile.tapAtPosition(x, y)
}

//END FUNCTION