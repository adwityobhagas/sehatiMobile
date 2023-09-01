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

Mobile.tap(findTestObject('orderPage/editOrderPage/buttonDataOrder_EditOrder'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 600, 0, 530)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataOrder/buttonMilikKendaraanDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataOrder/fieldTextLamaKerja(THN)'), 0)

Mobile.sendKeys(findTestObject('orderPage/formDataOrder/fieldTextLamaKerja(THN)'), '1')

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataOrder/fieldTextLamaKerja(BLN)'), 0)

Mobile.sendKeys(findTestObject('orderPage/formDataOrder/fieldTextLamaKerja(BLN)'), '12')

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataOrder/fieldTextPendapatan'), 0)

Mobile.sendKeys(findTestObject('orderPage/formDataOrder/fieldTextPendapatan'), '4500000')

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataOrder/fieldTextPendapatanPasangan'), 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.getKeyboard().sendKeys('4500000')

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataOrder/fieldTextPendapatanLain'), 0)

driver.getKeyboard().sendKeys('4500000')

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataOrder/fieldTextBiayaBulanan'), 0)

driver.getKeyboard().sendKeys('4500000')

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataOrder/buttonKeperluanDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 2030, 0, 1030)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataOrder/fieldTextCatatanKeperluan'), 0)

driver.getKeyboard().sendKeys('UANG PENDIDIKAN')

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataOrder/fieldTextCatatanSurvey'), 0)

driver.getKeyboard().sendKeys('CUSTOMER VALID')

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataOrder/buttonProgramRateDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

submitButtonTapAtPosition(545, 2123)

Mobile.delay(2.5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 600, 0, 530)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataOrder/buttonBarangTaksasiDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

//Mobile.tap(findTestObject('orderPage/formDataOrder/buttonKodeBarangDDL'), 0)
//
//Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)
//
//radioButton1TapAtPosition(970, 1360)
//
////radioButton2TapAtPosition(970, 1500)
////radioButton3TapAtPosition(970, 1640)
//Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)
//
//Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tap(findTestObject('orderPage/formDataOrder/buttonMerkDDL'), 0)
//
//Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)
//
//radioButton1TapAtPosition(970, 1360)
//
////radioButton2TapAtPosition(970, 1500)
////radioButton3TapAtPosition(970, 1640)
//Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)
//
//Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tap(findTestObject('orderPage/formDataOrder/fieldTextNamaVehicle'), 0)
//
//driver.getKeyboard().sendKeys('TEST MERK MOTOR')
//
//Mobile.hideKeyboard()
//
//Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

submitButtonTapAtPosition(545, 2123)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('buttonOkPopUpMessageDataInsert'), 0)

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

//END FUNCTION