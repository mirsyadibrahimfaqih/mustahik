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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mustahikdev.petikjombang.com/backend/web/index.php?r=site%2Flogin')

WebUI.setText(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/input_PeTIK MUSTAHIK_LoginFormusername (10)'), 'adminprogram@ybmpln.org')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/input_PeTIK MUSTAHIK_LoginFormpassword (10)'), 
    'U54oLL1U6TIkPGb6YLpL4w==')

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/button_Masuk (10)'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Profil_toggle-sidebar (9)'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Mustahik (6)'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Data Mustahik (6)'))

WebUI.clickOffset(findTestObject('Object Repository/Page_Mustahik/a_Tambah Mustahik'), 0, 0)

WebUI.setText(findTestObject('Object Repository/Page_Tambah Mustahik/input_Mustahik_Mustahiknama'), 'tes')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Mustahik/input_NIK_Mustahiknik'), '3131331')

WebUI.click(findTestObject('Object Repository/Page_Tambah Mustahik/input_NIK_Mustahiknik'))

WebUI.setText(findTestObject('Object Repository/Page_Tambah Mustahik/input_Tempat Lahir_Mustahiktempat_lahir'), 'tes')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Mustahik/input_Tanggal Lahir_Mustahiktanggal_lahir'), '')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Tambah Mustahik/input_Tanggal Lahir_Mustahiktanggal_lahir'))

WebUI.click(findTestObject('Object Repository/Page_Tambah Mustahik/td_1'))

WebUI.setText(findTestObject('Object Repository/Page_Tambah Mustahik/input_NO KK_Mustahikno_kk'), '34223442')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Mustahik/input_Telepon_Mustahiktelepon'), '423432432')

WebUI.clickOffset(findTestObject('Object Repository/Page_Tambah Mustahik/select_-- Pilih Jenis Kelamin --Laki-lakiPerempuan'), 
    0, 0)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Tambah Mustahik/select_-- Pilih Jenis Kelamin --Laki-lakiPerempuan'))

WebUI.click(findTestObject('Object Repository/Page_Tambah Mustahik/select_-- Pilih Jenis Pelanggan --PLNNONPELANGGAN'))

WebUI.click(findTestObject('Object Repository/Page_Tambah Mustahik/input_Tanggal Daftar_Mustahiktanggal_daftar'))

WebUI.clickOffset(findTestObject('Object Repository/Page_Tambah Mustahik/td_1'), 0, 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tambah Mustahik/select_-- Pilih Provinsi --ACEHSUMATERA UTA_b8d456'), 
    '35', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tambah Mustahik/select_-- Pilih KabupatenKota --KABUPATEN B_d49847'), 
    '3517', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tambah Mustahik/select_-- Pilih Kecamatan --BANDAR KEDUNG M_70a2e7'), 
    '3517100', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tambah Mustahik/select_-- Pilih KelurahanDesa --BADASBAKALA_243d93'), 
    '3517100006', true)

WebUI.setText(findTestObject('Object Repository/Page_Tambah Mustahik/textarea_Alamat Rumah_Mustahikalamat'), 'tes')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tambah Mustahik/select_-- Pilih Provinsi --ACEHSUMATERA UTA_b8d456_1'), 
    '35', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tambah Mustahik/select_-- Pilih KabupatenKota --KABUPATEN B_d49847_1'), 
    '3517', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tambah Mustahik/select_-- Pilih Kecamatan --BANDAR KEDUNG M_70a2e7_1'), 
    '3517040', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tambah Mustahik/select_-- Pilih KelurahanDesa --BALONG BESU_b58b8d'), 
    '3517040016', true)

WebUI.setText(findTestObject('Object Repository/Page_Tambah Mustahik/textarea_Alamat Domisili_Mustahikalamat_domisili'), 
    'tes')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Mustahik/input_Latitude Domisili_Mustahiklatitude'), 'tes')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Mustahik/input_Longitude Domisili_Mustahiklongitude'), 'tes')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Tambah Mustahik/button_Simpan'))

WebUI.closeBrowser()

