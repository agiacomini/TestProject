package com.giacomini.andrea.MyExample;

public class SettingDate {

    /**
    * @param args
    */
    public static void main(String[] args) {
    	
                   String date = "2017-11-24T14:11:39";
                   
                   String acceptanceDate = date.replace("T", " ");
                   
                   // Query - per settare un campo DATE sul DB
                   // to_date('2017-11-24 14:11:39','yyyy-mm-dd hh24:mi:ss')
    }
}