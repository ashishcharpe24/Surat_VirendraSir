package com.qa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.BaseClass;

public class Surat_registration_form_locators extends BaseClass {
	
	WebDriver dr;
	
	public Surat_registration_form_locators(WebDriver dr) {
	
	this.dr=dr;
	}
	
	@FindBy(how=How.NAME,using="Country")
	@CacheLookup
	WebElement country;
	@FindBy(how=How.NAME,using="Campus")
	@CacheLookup
	WebElement campus;
	@FindBy(how=How.NAME,using="AdmissionFor")
	@CacheLookup
	WebElement session;
	@FindBy(how=How.ID,using="FatherFirstName")
	@CacheLookup
	WebElement f_name;
	@FindBy(how=How.NAME,using="FatherLastName")
	@CacheLookup
	WebElement l_name;
	@FindBy(how=How.NAME,using="FatherEmailAddress")
	@CacheLookup
	WebElement email;
	@FindBy(how=How.NAME,using="FatherhMobileNumber")
	@CacheLookup
	WebElement m_number;
	@FindBy(how=How.XPATH,using="//input[@name='ParentPriority'][@value='Father']")
	@CacheLookup
	WebElement relation;
	@FindBy(how=How.ID,using="SaveAndContinueButtonPageOne")
	@CacheLookup
	WebElement Save1;
	
	// Parent section locators
	By f_cal_click=By.xpath("//*[@id='admissionPartOne']/div[10]/div[3]/div/p/span/button");
	By f_cal_navigate_1=By.xpath("//button[starts-with(@id,'datepicker-1')]");
	By f_cal_navigate_2=By.xpath("//button[@ng-click='move(-1)']");
	By f_dob_year=By.xpath("//span[text()='1984']");
	By f_dob_month=By.xpath("//span[text()='June']");
	By f_dob_day=By.xpath("//span[text()='11']");
	By f_nat=By.name("FatherNationality");
	By f_id_type=By.name("FatherIdentification");
	By f_id_no=By.name("FatherIdentificationNumber");
	By f_edu=By.name("FatherEducation");
	By f_anu_income=By.name("FatherAnnualIncome");
	By f_emp_name = By.id("FatherEmployerName");
	By f_exp = By.id("FthExp");
	By f_desig = By.name("FatherCurrentPosition");
	By f_home_phone = By.name("FatherhHomeNumber");
	By f_socio = By.name("FthSocioEconomic");
	
	//Mother Information
	By m_f_name= By.name("MotherFirstName");
	By m_l_name = By.name("MotherLastName");
	By m_cal_click=By.xpath("//*[@id='admissionPartOne']/div[18]/div[3]/div/p/span/button");
	By m_cal_navigate_1=By.xpath("//button[starts-with(@id,'datepicker-1')]");
	By m_cal_navigate_2=By.xpath("//button[@ng-click='move(-1)']");
	By m_dob_year=By.xpath("//span[text()='1987']");
	By m_dob_month=By.xpath("//span[text()='July']");
	By m_dob_day=By.xpath("//span[text()='15']");
	By m_nat = By.name("MotherNationality");
	By m_id_type = By.name("MotherIdentification");
	By m_id_num = By.name("MotherIdentificationNumber");
	By m_edu = By.name("MotherEducation");
	By m_anu_income = By.name("MotherAnnualIncome");
	By m_emp_name = By.name("MotherEmployerName");
	By m_exp = By.name("MthExp");
	By m_desig = By.name("MotherCurrentPosition");
	By m_email = By.name("MotherEmailAddress");
	By m_mobile = By.name("MotherhMobileNumber");
	By m_socio = By.name("MthSocioEconomic");
	By Save2=By.xpath("//*[@ng-click='submitPartOne(admissionPartOne)']");
	
	//Student section locators
		By s_fname=By.id("FirstName");
		By s_lname=By.id("LastName");
		By s_dob_cal=By.xpath("//*[@id='admissionPartTwo']/div[5]/div[3]/div/p/span/button");
		By s_dob_y1=By.xpath("//button[starts-with(@id,'datepicker-1')]");
		By s_dob_y2=By.xpath("//button[@ng-click='move(-1)']");
		By s_dob_y3=By.xpath("//span[text()='2019']");
		By s_dob_m=By.xpath("//span[text()='June']");
		By s_dob_d=By.xpath("//span[text()='12']");
		By s_gender=By.xpath("//input[@name='Gender'][@value='Male']");
		By s_id_type=By.name("Identification");
		By s_id_no=By.name("IdentificationNumber");
		By s_nat=By.name("Nationality");
		By s_passport_no = By.name("StudPassportNo");
		By s_seeking_grade = By.name("ClassStuding");
		By s_sch_name= By.name("PresentSchoolName");
		By s_sch_sity = By.name("PresentSchoolCity");
		By s_res_status = By.name("ResidentialStatus");
		By s_block = By.name("Block");
		By s_add1 = By.name("AddressLine1");
		By s_add2 = By.name("AddressLine2");
		By s_lmark = By.name("FlatNo");
		By s_city = By.name("City");
		By s_country = By.name("CurrentHomeCountry");
		By s_zip = By.name("PostalCode");
		By Save3=By.xpath("//button[@ng-click='submitPartTwo(admissionPartTwo)']");
		
		//Health Info & Documents
		By s_pickup = By.xpath("//input[@name='ConvenceType'][@value='Father']");
		By s_scale = By.xpath("//input[@name='SatisfactionLevel'][@value='4']");
		By feedback = By.name("AdditionalFeedback");
		By Save4 = By.xpath("//*[@id='admissionPartThree']/div[11]/div/div/button[4]");

	public void fill_registration_form_info() throws Throwable {
		Select co = new Select(country);
		co.selectByValue("India");
		Thread.sleep(500);
		Select cm = new Select(campus);
		cm.selectByValue("Surat");
		Thread.sleep(500);
		Select se = new Select(session);
		se.selectByValue(p.getProperty("admission_for"));
		Thread.sleep(500);
		f_name.sendKeys(p.getProperty("name"));
		l_name.sendKeys("Father");
		email.sendKeys("virendra@giftechnologies.com");
		m_number.sendKeys("9876543210", Keys.TAB);
		Thread.sleep(500);
		relation.click();
		Thread.sleep(500);
		Save1.click();
		Thread.sleep(15000);
		
		//Parent Information
				dr.findElement(f_cal_click).click();
				Thread.sleep(500);
				dr.findElement(f_cal_navigate_1).click();
				Thread.sleep(500);
				dr.findElement(f_cal_navigate_1).click();
				Thread.sleep(500);
				dr.findElement(f_cal_navigate_2).click();
				Thread.sleep(500);
				dr.findElement(f_cal_navigate_2).click();
				Thread.sleep(500);
				dr.findElement(f_dob_year).click();
				Thread.sleep(500);
				dr.findElement(f_dob_month).click();
				Thread.sleep(500);
				dr.findElement(f_dob_day).click();
				Thread.sleep(500);
				Select fn = new Select(dr.findElement(f_nat));
				fn.selectByValue("Indian");
				Thread.sleep(500);
				Select fid=new Select(dr.findElement(f_id_type));
				fid.selectByValue("Other");
				Thread.sleep(500);
				dr.findElement(f_id_no).sendKeys("1111111");
				Thread.sleep(500);
				Select fms=new Select(dr.findElement(f_edu));
				fms.selectByValue("Post Graduate - Commerce");
				Thread.sleep(500);
				Select fai = new Select(dr.findElement(f_anu_income));
				fai.selectByValue("500000 to 1000000");
				Thread.sleep(500);
				dr.findElement(f_emp_name).sendKeys("OWNER");
				Thread.sleep(500);
				dr.findElement(f_exp).sendKeys("8");
				Thread.sleep(500);
				Select f_curr_desig = new Select(dr.findElement(f_desig));
				f_curr_desig.selectByValue("Other");
				Thread.sleep(500);
				dr.findElement(f_home_phone).sendKeys("9876543210");
				Thread.sleep(500);
				Select fse = new Select(dr.findElement(f_socio));
				fse.selectByValue("7");
				Thread.sleep(500);
				dr.findElement(m_f_name).sendKeys(p.getProperty("name"));
				Thread.sleep(500);
				dr.findElement(m_l_name).sendKeys("Mother");
				Thread.sleep(500);
				dr.findElement(m_cal_click).click();
				Thread.sleep(500);
				dr.findElement(m_cal_navigate_1).click();
				Thread.sleep(500);
				dr.findElement(m_cal_navigate_1).click();
				Thread.sleep(500);
				dr.findElement(m_cal_navigate_2).click();
				Thread.sleep(500);
				dr.findElement(m_cal_navigate_2).click();
				Thread.sleep(500);
				dr.findElement(m_dob_year).click();
				Thread.sleep(500);
				dr.findElement(m_dob_month).click();
				Thread.sleep(500);
				dr.findElement(m_dob_day).click();
				Thread.sleep(500);
				Select mnat = new Select(dr.findElement(m_nat));
				mnat.selectByValue("Indian");
				Thread.sleep(500);
				Select midtype = new Select(dr.findElement(m_id_type));
				midtype.selectByValue("Other");
				Thread.sleep(500);
				dr.findElement(m_id_num).sendKeys("2222222");
				Thread.sleep(500);
				Select medu = new Select(dr.findElement(m_edu));
				medu.selectByValue("Post Graduate – Science");
				Thread.sleep(500);
				Select mai = new Select(dr.findElement(m_anu_income));
				mai.selectByValue("100000 to 500000");
				Thread.sleep(500);
				dr.findElement(m_emp_name).sendKeys("OWNER");
				Thread.sleep(500);
				dr.findElement(m_exp).sendKeys("6");
				Select mdesig = new Select(dr.findElement(m_desig));
				mdesig.selectByValue("Other");
				dr.findElement(m_email).sendKeys("gifte459@gmail.com");
				Thread.sleep(500);
				dr.findElement(m_mobile).sendKeys("9876543210");
				Thread.sleep(500);
				Select mse = new Select(dr.findElement(m_socio));
				mse.selectByValue("7");
				Thread.sleep(500);
				dr.findElement(Save2).click();
				Thread.sleep(10000);
				
				//Student Information
				dr.findElement(s_fname).sendKeys(p.getProperty("name"));
				Thread.sleep(500);
				dr.findElement(s_lname).sendKeys("Student");
				Thread.sleep(500);
				dr.findElement(s_dob_cal).click();
				Thread.sleep(500);
				dr.findElement(s_dob_y1).click();
				Thread.sleep(500);
				dr.findElement(s_dob_y1).click();
				Thread.sleep(500);
				dr.findElement(s_dob_y2).click();
				Thread.sleep(500);
				dr.findElement(s_dob_y3).click();
				Thread.sleep(500);
				dr.findElement(s_dob_m).click();
				Thread.sleep(500);
				dr.findElement(s_dob_d).click();
				Thread.sleep(500);
				dr.findElement(s_gender).click();
				Thread.sleep(500);
				Select id_tp = new Select(dr.findElement(s_id_type));
				id_tp.selectByValue("Other");
				Thread.sleep(500);
				dr.findElement(s_id_no).sendKeys("3333333");
				Thread.sleep(500);
				Select snat = new Select(dr.findElement(s_nat));
				snat.selectByValue("Indian");
				Thread.sleep(500);
				dr.findElement(s_passport_no).sendKeys("34234234");
				Thread.sleep(500);
				Select s_grade = new Select(dr.findElement(s_seeking_grade));
				s_grade.selectByValue("15");//15//1,2 available
				Thread.sleep(500);
				dr.findElement(s_sch_name).sendKeys("DPS");
				Thread.sleep(500);
				dr.findElement(s_sch_sity).sendKeys("Nagpur");
				Thread.sleep(500);
				Select s_res_stat = new Select(dr.findElement(s_res_status));
				s_res_stat.selectByValue("Own");
				Thread.sleep(500);
				dr.findElement(s_block).sendKeys("926");
				Thread.sleep(500);
				dr.findElement(s_add1).sendKeys("1st Floor Esatate Building");
				Thread.sleep(500);
				dr.findElement(s_add2).sendKeys("SP Infinity");
				Thread.sleep(500);
				dr.findElement(s_lmark).sendKeys("Near Infocept");
				Thread.sleep(500);
				dr.findElement(s_city).sendKeys("Nagpur");
				Thread.sleep(500);
				Select s_cou = new Select(dr.findElement(s_country));
				s_cou.selectByValue("India");
				Thread.sleep(500);
				dr.findElement(s_zip).sendKeys("441108");
				Thread.sleep(500);
				dr.findElement(Save3).click();
				Thread.sleep(10000);
				
				//Health Info & Document
				dr.findElement(s_pickup).click();
				Thread.sleep(500);
				dr.findElement(s_scale).click();
				Thread.sleep(500);
				dr.findElement(feedback).sendKeys("NA");
				Thread.sleep(500);
				dr.findElement(Save4).click();
				Thread.sleep(10000);
				
	}

}
