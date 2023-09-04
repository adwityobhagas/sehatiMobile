import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import org.openqa.selenium.WebDriver as WebDriver

Mobile.startExistingApplication('id.pkp.sehati.uat', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/editOrderPage/buttonKondisiUnit_EditOrder'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formKondisiUnit/buttonKondisiMesinDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formKondisiUnit/buttonSuaraMesinDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formKondisiUnit/buttonSayapBodyDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formKondisiUnit/buttonCoverBodyDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formKondisiUnit/buttonKnalpotDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(500, 2040, 500, 1529)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formKondisiUnit/buttonAccu-AkiDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formKondisiUnit/buttonCakramDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formKondisiUnit/buttonSpeedoMeterDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formKondisiUnit/buttonKickStarterDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formKondisiUnit/buttonVelgDanBanDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(500, 2040, 500, 1527)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formKondisiUnit/buttonShockBreakerDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formKondisiUnit/buttonSpionDDL (1)'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formKondisiUnit/buttonStandarDDL (1)'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formKondisiUnit/buttonJokDDL (1)'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formKondisiUnit/buttonLampuSignDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(500, 2040, 500, 1440)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formKondisiUnit/buttonBPKBDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formKondisiUnit/fieldTextKronologis (1)'), 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.getKeyboard().sendKeys('Milik Pribadi')

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formKondisiUnit/buttonFakturDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formKondisiUnit/buttonSuratJualBeliDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formKondisiUnit/buttonJatuhTempoStnkDP'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('poolingOrderPage/datePicker/buttonInputDatePicker'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('poolingOrderPage/datePicker/fieldTextEnterDate_XPATH'), 0)

Mobile.clearText(findTestObject('poolingOrderPage/datePicker/fieldTextEnterDate_XPATH'), 0)

Mobile.sendKeys(findTestObject('poolingOrderPage/datePicker/fieldTextEnterDate_XPATH'), '09/09/2001')

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('poolingOrderPage/datePicker/buttonInputOkDatePicker'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

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

def radioButton1AfterSearch(int x, int y) {
    Mobile.tapAtPosition(x, y)
}

