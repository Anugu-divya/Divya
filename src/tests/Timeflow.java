package tests;

import java.io.IOException;
import java.text.ParseException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageElements.Attendance;
import pageElements.Attendancesummary;
import pageElements.Configuration;
import pageElements.Customers;
import pageElements.EmployeeTimesheetspage;
import pageElements.Employeerecords;
import pageElements.Employeereports;
import pageElements.LoginPage;
import pageElements.MyTimesheetspage;
import pageElements.ProjectInfo;
import pageElements.Projectadding;
import pageElements.Projectreports;
import pageElements.Projects;
import pageElements.TimePage;
import pageElements.Timesheets;
import pageElements.myrecords;
import pageElements.punchinorout;
import utilities.Basetest;
import utilities.ExcelUtility1;

public class Timeflow extends Basetest {

	LoginPage lp;
	TimePage tp;

	@Test
	public void tileflowmethod() throws IOException, InterruptedException {
		Thread.sleep(3000);
		lp = LaunchApplication();
		ExcelUtility1 xs = new ExcelUtility1();
		// login
		String username = xs.Get_Username(1, 0).toString();
		String password = xs.Get_password(1, 1).toString();
		tp = lp.enterlogindetails(username, password);
	}

	Timesheets te;
	MyTimesheetspage tss;

	@Test(dependsOnMethods = { "tileflowmethod" })
	public void time1() throws InterruptedException {

		te = tp.clicktime();
//		//	timesheets
		tss = te.sheetstime();
		// my timesheets
		emp = tss.timesheets();

		SoftAssert sa = new SoftAssert();
		System.out.println("Apache Software Foundation - ASF - Phase 1");
		String Expectedtittle = "Select a Project ";
		String runtimetitle = driver.getTitle();
		System.out.println(runtimetitle);
		sa.assertEquals(runtimetitle, Expectedtittle);
	}

	EmployeeTimesheetspage emp;
	Attendance ad;

	@Test(dependsOnMethods = { "tileflowmethod","time1" })
	public void time2() throws InterruptedException {
		// employeetime sheets
		ad = emp.employeetimesheets();

//		SoftAssert sa = new SoftAssert();
//		System.out.println("Peter Mac Anderson");
//		String Expectedtittle = "Invalid";
//		String runtimetitle = driver.getTitle();
//		System.out.println(runtimetitle);
//		sa.assertEquals(runtimetitle, Expectedtittle);

	}

	myrecords mr;
	punchinorout pi;
	@Test(dependsOnMethods = { "tileflowmethod","time1", "time2"})
	public void time21() throws InterruptedException {
		mr = ad.attendanceclick();
		pi = mr.myrecd();
	}
	Employeerecords empr;
	
	@Test(dependsOnMethods = { "tileflowmethod","time1", "time2","time21"})
		public void time22() throws InterruptedException {
			empr = pi.punchtime();
		}

		Configuration cf;
		@Test(dependsOnMethods = { "tileflowmethod","time1", "time2","time21","time22"})
		public void time23() throws InterruptedException {
			cf = empr.emprec();
			}
		
		Projects pj;
		@Test(dependsOnMethods = { "tileflowmethod","time1", "time2","time21","time22","time23"})
		public void time24() throws InterruptedException {
			pj = cf.configurates();

		}
		
		
		Projectreports pr;
		@Test(dependsOnMethods = { "tileflowmethod","time1", "time2","time21","time22","time23","time24"})
	public void time3() throws InterruptedException {
		pr=pj.projectdropdown();
		emr = pr.repotrs();
	}

	Employeereports emr;
@Test(dependsOnMethods = { "tileflowmethod","time1", "time2","time21","time22","time23","time24","time3"})
	public void time31() throws InterruptedException {
		as = emr.reportsofemployee();
		}
	
	Attendancesummary as;
	@Test(dependsOnMethods = { "tileflowmethod","time1", "time2","time21","time22","time23","time24","time3","time31"})
	public void time32() throws InterruptedException {
		pij = as.attendance();

	}

ProjectInfo pij;
@Test(dependsOnMethods = { "tileflowmethod","time1", "time2","time21","time22","time23","time24","time3","time31","time32"})
public void time4() throws InterruptedException {
	cu = pij.projectinfodropdown();
}
	Customers cu;
	Projectadding pag;
	@Test(dependsOnMethods = { "tileflowmethod","time1", "time2","time21","time22","time23","time24","time3","time31","time32","time4"})
	
	public void time5() throws InterruptedException {
		pag = cu.customerclick();
		pag.adding();

	}
}
