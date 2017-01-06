package com.cerner.pctorion.chart;

import com.cerner.pctorion.utility.DataTable;
/*
 * @uthor: rv042687 / roshan
 */
public class VisitListData {

	
	public static final String visitLstTxt="Visit List";
	public static final String futTxt ="Future";
	public static final String prevTxt="Previous";
	public static final String detTitleTxt="Encounter Details";
	
	public static final String noFutTxt = "No future visits for this patient";
	public static final String noPrevTxt = "No previous visits for this patient";
	
	
	
	/*
	 * Test Case Data for: ORN_VR_VISITLIST
	 * 
	 * */
	
	public static final String testName = "ORN_VR_VisitList";
	public static final String sheet = "Chart";
	public static DataTable dataTable = new DataTable(sheet, testName);
	
	
	public static final String URL = dataTable.getValue("URL");	
	public static String UserName = dataTable.getValue("UserName");
	public static String Password = dataTable.getValue("Password");
	
	public static final String PatientA = dataTable.getValue("PatientA");
	public static final String FIN_A = dataTable.getValue("FINA");
	public static final String PatientB = dataTable.getValue("PatientB");
	public static final String FIN_B = dataTable.getValue("FINB");
	
	
	/*
	 * Expected Data
	 * */
	
	public static final String PrvEnc1_Time = "Feb 2, 2016 4:56 PM";
	public static final String PrvEnc1_AttPhy = "Antonelli, Michael";
	public static final String PrvEnc1_Type = "Observation";
	public static final String PrvEnc1_Reason = "--";

	public static final String PrvEnc2_Time = "May 13, 2016 3:57 PM";  //  Admit Date & Time
	public static final String PrvEnc2_AttPhy = "--";
	public static final String PrvEnc2_Type = "Recurring";
	public static final String PrvEnc2_Reason = "--";   // Reason for Visit
	
	public static final String PrvEnc2_DiscDate = "--";
	public static final String PrvEnc2_Service = "--";
	public static final String PrvEnc2_Location = "Baseline East";
	public static final String PrvEnc2_RoomBed = "--";
	public static final String PrvEnc2_FIN="--";
	public static final String PrvEnc2_Status="Active";

	
	public static final String PrvEnc3_Time = "Jul 19, 2016 5:00 AM";
	public static final String PrvEnc3_AttPhy = "Raghuraman, Ashwin";
	public static final String PrvEnc3_Type = "--";
	public static final String PrvEnc3_Reason = "--";
	
	public static final String PrvEnc7_Time = "May 5, 2015 3:51 PM";
	public static final String PrvEnc7_AttPhy = "--";
	public static final String PrvEnc7_Type = "Preadmit";
	public static final String PrvEnc7_Reason = "--";
	
	public static final String FutEnc4_Time = "Jan 27, 2017 9:35 PM";
	public static final String FutEnc4_AttPhy = "--";
	public static final String FutEnc4_Type = "Office Visit";
	public static final String FutEnc4_Reason = "--";	
	
	
	
	
	public static final String FutEnc5_Time = "Jan 1, 2025 6:00 AM";
	public static final String FutEnc5_AttPhy = "--";
	public static final String FutEnc5_Type = "--";
	public static final String FutEnc5_Reason = "--";
	public static final String FutEnc5_DiscDate = "--";
	public static final String FutEnc5_Service = "--";
	public static final String FutEnc5_Location = "BU-BSC";
	public static final String FutEnc5_RoomBed = "--";
	public static final String FutEnc5_FIN="20002119";
	public static final String FutEnc5_Status="Active";
	
	
	public static final String FutEnc6_Time = "Sep 9, 2028 5:00 AM";
	public static final String FutEnc6_AttPhy = "--";
	public static final String FutEnc6_Type = "Inpatient";
	public static final String FutEnc6_Reason = "--";
	
	
}



