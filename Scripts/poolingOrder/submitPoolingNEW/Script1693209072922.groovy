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

Mobile.tap(findTestObject('acquisitionPage/buttonPoolingOrder'), 0)

Mobile.tap(findTestObject('poolingOrderPage/buttonUnitBisnisDDL'), 0)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(970, 1360)

//Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tapAtPosition(970, 1500)
//
//Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tapAtPosition(970, 1640)
Mobile.tap(findTestObject('poolingOrderPage/buttonOkDDL'), 0)

Mobile.tap(findTestObject('poolingOrderPage/buttonCA_AnggotaDDL'), 0)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(970, 1360)

Mobile.tap(findTestObject('poolingOrderPage/buttonOkDDL'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1600, 0, 1087)

