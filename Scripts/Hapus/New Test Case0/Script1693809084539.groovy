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

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/orderPage/formDataLAS/fieldTextNama (1)'), 0)

Mobile.sendKeys(findTestObject(''), 'TEST NAMA \\n')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/orderPage/formDataLAS/fieldTextAlamat'), 0)

Mobile.sendKeys(findTestObject('Object Repository/orderPage/formDataLAS/fieldTextAlamat'), 'ALAMAT TEST \\n')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/orderPage/formDataLAS/fieldTextRT'), 0)

Mobile.sendKeys(findTestObject('Object Repository/orderPage/formDataLAS/fieldTextRT'), '08 \\n')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/orderPage/formDataLAS/fieldTextRW'), 0)

Mobile.sendKeys(findTestObject('Object Repository/orderPage/formDataLAS/fieldTextRW'), '08\\n')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/orderPage/formDataLAS/fieldTextKelurahan'), 0)

Mobile.sendKeys(findTestObject(''), 'KELURAHAN\\n')

Mobile.closeApplication()
