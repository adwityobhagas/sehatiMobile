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

Mobile.tap(findTestObject('orderPage/editOrderPage/buttonDataLAS_EditOrder'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/orderPage/formDataLAS/fieldTextNama (1)'), 0)

Mobile.sendKeys(findTestObject('orderPage/formDataLAS/fieldTextNama (1)'), 'TEST NAMA \\n')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/orderPage/formDataLAS/fieldTextAlamat'), 0)

Mobile.sendKeys(findTestObject('Object Repository/orderPage/formDataLAS/fieldTextAlamat'), 'ALAMAT TEST \\n')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/orderPage/formDataLAS/fieldTextRT'), 0)

Mobile.sendKeys(findTestObject('Object Repository/orderPage/formDataLAS/fieldTextRT'), '08 \\n')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/orderPage/formDataLAS/fieldTextRW'), 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.getKeyboard().sendKeys('08\n')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/orderPage/formDataLAS/fieldTextKelurahan'), 0)

driver.getKeyboard().sendKeys('KELURAHAN\n')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(520, 1930, 520, 1595)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataLAS/buttonProvinsiDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataLAS/buttonKabKotaDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataLAS/buttonKecamatanDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataLAS/fieldTextKodePos'), 0)

driver.getKeyboard().sendKeys('17111\n')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(520, 1930, 520, 1590)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataLAS/fieldTextTelpSeluler'), 0)

driver.getKeyboard().sendKeys('0831082023\n')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataLAS/buttonCallTelpSeluler'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('buttonRejectCall'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataLAS/fieldTextNamaRekening'), 0)

driver.getKeyboard().sendKeys('Nama Rek\n')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataLAS/fieldTextNomorRekening'), 0)

driver.getKeyboard().sendKeys('52315231\n')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

submitButtonTapAtPosition(545, 2123)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataLAS/buttonHubunganDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataLAS/fieldTextNama (2)'), 0)

driver.getKeyboard().sendKeys('NAMA LAS\n')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataLAS/fieldTextPekerjaan'), 0)

driver.getKeyboard().sendKeys('PEKERJA SWASTA\n')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataLAS/fieldTextNoKTP'), 0)

driver.getKeyboard().sendKeys('3275050505231224\n')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataLAS/fieldTextAlamat (1)'), 0)

driver.getKeyboard().sendKeys('ALAMAT LAS\n')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(500, 1500, 500, 1178)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataLAS/buttonProvinsiDDLNPWP'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataLAS/buttonProvinsiKotaKabDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataLAS/buttonKecamatanDDLNPWP'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataLAS/fieldTextKelurahanNPWP'), 0)

driver.getKeyboard().sendKeys('Kelurahan LAS\n')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataLAS/fieldTextRWNpwp'), 0)

driver.getKeyboard().sendKeys('08\n')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataLAS/fieldTextRTNpwp'), 0)

driver.getKeyboard().sendKeys('08\n')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataLAS/fieldTextKodePosNPWP'), 0)

driver.getKeyboard().sendKeys('17713\n')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataLAS/fieldTextNoHpNPWP'), 0)

driver.getKeyboard().sendKeys('0831234232\n')

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataLAS/buttonCallNoHpNPWP'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('buttonRejectCall'), 0)

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

