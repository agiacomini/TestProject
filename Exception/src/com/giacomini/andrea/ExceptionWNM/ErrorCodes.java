package com.giacomini.andrea.ExceptionWNM;

public class ErrorCodes {

	public static final String TECH_ERROR="400";
	
	public static final String INVALID_PARAMETERS="205";

	public static final String INVALID_LOCATION="304";
	public static final String INVALID_CLI="306";
	public static final String INVALID_REQUEST_ID="310";
	public static final String INVALID_CONSTRAINTS="312";
	public static final String THE_NUMBER_IS_NOT_CONSISTENT_WITH_THE_LOCALITY="314";
	public static final String LOCAL_AREA_MISMATCH="325";
	
	public static final String GN_NOT_LOCKED="407";
	public static final String GN_STATUS_ERROR="410";
	public static final String GN_PORTABILITY_STATUS_ERROR="415";
	
	public static final String GN_NOT_FOUND="419"; // TO BE VERIFIED
	// from SA public static final String GN_EXCEPTION_NOT_FOUND="420"; // TO BE VERIFIED

	public static final String GN_DEACTIVATION_CODE_ERROR="423";
	public static final String ALREADY_LOCKED="435";
	public static final String GN_LOCKED="440";
	
	public static final String INVALID_NATIVE_FLAG="445";// TO BE VERIFIED
	
	public static final String GN_BELONGS_TO_AN_MN_GROUP="452"; // TO BE VERIFIED
	
	
	public static final String TEMPLATE_NOT_FOUND="473";
	public static final String OPERATOR_NOT_FOUND="474";
	public static final String SUBRANGE_NOT_FOUND="475";
	public static final String MORE_THAN_ONE_OPERATOR="476";
	public static final String MORE_THAN_ONE_SUBRANGE="477";	
	public static final String MORE_THAN_ONE_TEMPLATE="478";
	public static final String LOCAL_AREA_NOT_FOUND="479";
	public static final String NDC_NOT_FOUND="480";
	public static final String NATIVE_OPERATOR_NOT_FOUND="481";
	public static final String GN_ALREADY_RESERVED="482";
	public static final String GN_ALREADY_DEACTIVE="483";
		
	public static final String NO_FREE_GN="609";
}
