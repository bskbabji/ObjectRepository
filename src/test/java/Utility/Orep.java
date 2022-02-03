package Utility;



public class Orep {
	
	//public static final String EmailTextBox = Constants.ID+"&"+"email";
	//public static final String PwdTextBox = Constants.Name+"&"+"pass";
	//public static final String LoginButton = Constants.xpath+"&"+"//button[@name='login']";

	
	public static final String StartTrialButton = Constants.xpath+"&"+"//hgf-cta[@data-link-text='Start my free trial']";
	public static final String Slider = Constants.xpath+"&"+"//*[@id='slider']/span";
	public static final String Resizeable = Constants.xpath+"&"+"//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']";
	
	public static final String RightClickButton = Constants.xpath+"&"+"//span[text()='right click me']";
	public static final String RightClickButtonCopyOption = Constants.xpath+"&"+"//span[text()='Copy']";
	
	public static final String NumberOfEntries = Constants.xpath+"&"+"//*[@role='status']";
	public static final String FirstPage = Constants.xpath+"&"+"//a[contains(text(),'1')]";
	
	public static final String LastNameTableRow = Constants.xpath+"&"+"//table[@id='example']/tbody/tr[${i}]/td[3]";
	public static final String FirstNameTableRow = Constants.xpath+"&"+"//table[@id='example']/tbody/tr[${i}]/td[2]";
		
	public static final String NextPage = Constants.xpath+"&"+"//a[@id='example_next']";
	
	public static final String MaleRadioButton = Constants.ID+"&"+"malerb";
	public static final String FemaleRadioButton = Constants.ID+"&"+"femalerb";
	
	public static final String EnglishCheckBox = Constants.ID+"&"+"englishchbx";
	public static final String HindiCheckBox = Constants.ID+"&"+"hindichbx";
	public static final String ChineseCheckBox = Constants.ID+"&"+"chinesechbx";
	
	public static final String CourseDropDown = Constants.ID+"&"+"course";
	public static final String IDE_MultiDropDown = Constants.ID+"&"+"ide";
	
	//public static final String FileUploadBrowseButton = Constants.xpath+"&"+"//input[@id='input-4']/preceding-sibling::span";
	public static final String FileUploadBrowseButton = Constants.xpath+"&"+"//input[@id='input-4']";
	
	public static final String DocumentsBrowseButton = Constants.xpath+"&"+"//h3[text()='Documents']/following-sibling::a";
	//public static final String FileTypeToDownload = Constants.xpath+"&"+"//td[text()='DOC, DOCX']/following-sibling::td[2]/a";
	
	public static final String FileDownload500kb = Constants.xpath+"&"+"//a[@download='file-sample_500kB.doc']";
	public static final String DownloadZipFile = Constants.xpath+"&"+"//a[text()='chromedriver_linux64.zip']";
	
	public static final String DataDrivenFirstName = Constants.xpath+"&"+"//input[@placeholder='First Name']";
	public static final String DataDrivenLastName = Constants.xpath+"&"+"//input[@placeholder='Last Name']";
	public static final String DataDrivenAddress = Constants.xpath+"&"+"//textarea[@ng-model='Adress']";
	public static final String DataDrivenEmail = Constants.xpath+"&"+"//input[@ng-model='EmailAdress']";
	public static final String DataDrivenPhone = Constants.xpath+"&"+"//input[@ng-model='Phone']";
	public static final String DataDrivenGenderMale = Constants.xpath+"&"+"//input[@value='Male']";
	public static final String DataDrivenGenderFemale = Constants.xpath+"&"+"//input[@value='FeMale']";
	public static final String DataDrivenHobbiesCricket = Constants.ID+"&"+"checkbox1";
	public static final String DataDrivenHobbiesMovies = Constants.ID+"&"+"checkbox2";
	public static final String DataDrivenHobbiesHockey = Constants.ID+"&"+"checkbox3";
	public static final String DataDrivenLanguages = Constants.ID+"&"+"msdd";
	public static final String DataDrivenAllLanguages = Constants.xpath+"&"+"//div[@id='msdd']/following-sibling::div/ul/li/a";
	public static final String LanguageClose = Constants.xpath+"&"+"//span[@class='ui-icon ui-icon-close']";
	public static final String DataDrivenSkillsField = Constants.xpath+"&"+"//label[contains(text(),'Skills')]";
	public static final String DataDrivenSkillsDropDown = Constants.ID+"&"+"Skills";
	public static final String DataDrivenSelectCountryDropDown = Constants.ID+"&"+"country";
	public static final String DataDrivenYear = Constants.ID+"&"+"yearbox";
	public static final String DataDrivenMonth = Constants.xpath+"&"+"//select[@placeholder='Month']";
	public static final String DataDrivenDay = Constants.ID+"&"+"daybox";
	public static final String DataDrivenPassword = Constants.ID+"&"+"firstpassword";
	public static final String DataDrivenConfirmPassword = Constants.ID+"&"+"secondpassword";
	
	

}
