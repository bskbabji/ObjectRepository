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

}
