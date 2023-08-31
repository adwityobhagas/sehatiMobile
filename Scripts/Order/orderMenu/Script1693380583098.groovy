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

Mobile.tap(findTestObject('acquisitionPage/buttonOrder'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/orderCard1'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1800, 0, 1325)

Mobile.tap(findTestObject('orderPage/editOrderPage/buttonDataCustomer_EditOrder'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataCustomer/buttonPekerjaanDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataCustomer/buttonAgamaDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataCustomer/buttonPendidikanTerDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataCustomer/fieldTextPekerjaanDi-ID'), 0)

Mobile.clearText(findTestObject('orderPage/formDataCustomer/fieldTextPekerjaanDi-ID'), 0)

Mobile.sendKeys(findTestObject('orderPage/formDataCustomer/fieldTextPekerjaanDi-ID'), 'PEKERJA SWASTA\\n')

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 2040, 0, 1550)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataCustomer/buttonStatusRumahDDL'), 0)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataCustomer/buttonCallNoHp1'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('buttonRejectCall'), 0)

Mobile.tap(findTestObject('orderPage/formDataCustomer/fieldTextNoHp2'), 0)

Mobile.clearText(findTestObject('orderPage/formDataCustomer/fieldTextNoHp2'), 0)

Mobile.sendKeys(findTestObject('orderPage/formDataCustomer/fieldTextNoHp2'), '0831082023\\n')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('orderPage/formDataCustomer/buttonCallNoHp2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('buttonRejectCall'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataCustomer/fieldTextRT'), 0)

Mobile.clearText(findTestObject('orderPage/formDataCustomer/fieldTextRT'), 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.getKeyboard().sendKeys('08')

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1640, 0, 1305)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataCustomer/buttonProvinsiDDL'), 0)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DDL_Pop-Up/fieldTextSearchDDL'), 0)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DDL_Pop-Up/fieldTextSearchDDL'), 0)

Mobile.sendKeys(findTestObject('DDL_Pop-Up/fieldTextSearchDDL'), 'JAWA BARAT')

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

radioButton1AfterSearch(970, 520)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataCustomer/buttonKab-KotaDDL'), 0)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DDL_Pop-Up/fieldTextSearchDDL'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DDL_Pop-Up/fieldTextSearchDDL'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DDL_Pop-Up/fieldTextSearchDDL'), 0)

Mobile.sendKeys(findTestObject('DDL_Pop-Up/fieldTextSearchDDL'), 'KOTA BEKASi')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

radioButton1AfterSearch(970, 520)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataCustomer/buttonKecamatanDDL'), 0)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DDL_Pop-Up/fieldTextSearchDDL'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DDL_Pop-Up/fieldTextSearchDDL'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DDL_Pop-Up/fieldTextSearchDDL'), 0)

Mobile.sendKeys(findTestObject('DDL_Pop-Up/fieldTextSearchDDL'), 'JATI SAMPURNA')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

radioButton1AfterSearch(970, 520)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataCustomer/fieldTextRW'), 0)

Mobile.clearText(findTestObject('orderPage/formDataCustomer/fieldTextRW'), 0)

driver.getKeyboard().sendKeys('08')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataCustomer/fieldTextDesa-Kel'), 0)

Mobile.clearText(findTestObject('orderPage/formDataCustomer/fieldTextDesa-Kel'), 0)

driver.getKeyboard().sendKeys('08')

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1640, 0, 1040)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataCustomer/buttonKodePosDDL'), 0)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DDL_Pop-Up/fieldTextSearchDDL'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DDL_Pop-Up/fieldTextSearchDDL'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('DDL_Pop-Up/fieldTextSearchDDL'), 0)

Mobile.sendKeys(findTestObject('DDL_Pop-Up/fieldTextSearchDDL'), '17435')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

radioButton1AfterSearch(970, 520)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataCustomer/buttonAlamatTagihDDL'), 0)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

//radioButton2TapAtPosition(970, 1500)
//radioButton3TapAtPosition(970, 1640)
Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1640, 0, 1040)

Mobile.tap(findTestObject('orderPage/formDataCustomer/buttonSubKodePosDDL'), 0)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

radioButton1TapAtPosition(970, 1360)

Mobile.tap(findTestObject('DDL_Pop-Up/buttonOkDDL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('orderPage/formDataCustomer/buttonMapGeotag'), 0)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

submitButtonTapAtPosition(545, 2123)

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