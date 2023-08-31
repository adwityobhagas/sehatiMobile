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

Mobile.tap(findTestObject('homePage/buttonAcquisition'), 0)

Mobile.tap(findTestObject('acquisitionPage/buttonPoolingOrder'), 0)

Mobile.tap(findTestObject('poolingOrderPage/buttonUnitBisnisDDL'), 0)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

// Call the function with desired coordinates
radioButton1TapAtPosition(970, 1360)

Mobile.tap(findTestObject('poolingOrderPage/buttonOkDDL'), 0)

Mobile.tap(findTestObject('poolingOrderPage/buttonCA_AnggotaDDL'), 0)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

Mobile.tap(findTestObject('poolingOrderPage/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('poolingOrderPage/buttonKonsumenNewDDL'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

searchButtonTapAtPosition(970, 325)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('poolingOrderPage/cardNumber01'), 0)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('poolingOrderPage/fieldTextTempatLahir'), 0)

Mobile.sendKeys(findTestObject('poolingOrderPage/fieldTextTempatLahir'), 'JKT\\n')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1268, 0, 900)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('poolingOrderPage/buttonDatePicker_TglLahir'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('poolingOrderPage/datePicker/buttonInputDatePicker'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('poolingOrderPage/datePicker/fieldTextEnterDate_XPATH'), 0)

Mobile.clearText(findTestObject('poolingOrderPage/datePicker/fieldTextEnterDate_XPATH'), 0)

Mobile.sendKeys(findTestObject('poolingOrderPage/datePicker/fieldTextEnterDate_XPATH'), '09/09/2001')

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('poolingOrderPage/datePicker/buttonInputOkDatePicker'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

// Call the function with desired coordinates
Mobile.tap(findTestObject('poolingOrderPage/fieldTextNamaIbu'), 0)

Mobile.sendKeys(findTestObject('poolingOrderPage/fieldTextNamaIbu'), 'TEST IBU\\n')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('poolingOrderPage/buttonJenisKelaminDDL'), 0)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

// Call the function with desired coordinates
radioButton1TapAtPosition(970, 1360)

Mobile.tap(findTestObject('poolingOrderPage/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('poolingOrderPage/buttonStatusPernikahanDDL'), 0)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

// Call the function with desired coordinates
radioButton1TapAtPosition(970, 1360)

Mobile.tap(findTestObject('poolingOrderPage/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('poolingOrderPage/buttonTypeIdentitasDDL'), 0)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

// Call the function with desired coordinates
radioButton1TapAtPosition(970, 1360)

Mobile.tap(findTestObject('poolingOrderPage/buttonOkDDL'), 0)

Mobile.swipe(0, 1600, 0, 1083)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('poolingOrderPage/buttonCallNoTelepon'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('buttonRejectCall'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('poolingOrderPage/fieldTextNoIdentitas'), 0)

Mobile.sendKeys(findTestObject('poolingOrderPage/fieldTextNoIdentitas'), '312125125122\\n')

Mobile.hideKeyboard()

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

// Call the function with desired coordinates
Mobile.tap(findTestObject('poolingOrderPage/fieldTextNoPolisi'), 0)

Mobile.sendKeys(findTestObject('poolingOrderPage/fieldTextNoPolisi'), '31082023\\n')

Mobile.hideKeyboard()

// Call the function with desired coordinates
Mobile.tap(findTestObject('poolingOrderPage/fieldTextNoMesin (1)'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.getKeyboard().sendKeys('31082023')

Mobile.hideKeyboard()

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

submitButtonTapAtPosition(545, 2123)

Mobile.delay(2.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('poolingOrderPage/buttonAjukanPollOrder'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('poolingOrderPage/buttonOkPopUpMessageDataInsert'), 0) 

//START FUNCTION

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