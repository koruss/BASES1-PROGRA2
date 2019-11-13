/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Connect.connect;
import static Connect.connect.con;
import static Connect.connect.getConnection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;       

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author steve
 */
public class Funcion {
    private String preivateKey="ILOVEBD1";
    
    /*
        Procedimientos de tabla: 
        Username    
    */    
    public static ResultSet username_validateUser(String pUsername,String pPassword) throws SQLException, ClassNotFoundException {
        return connect.username_validateUser(pUsername,pPassword);
    }
    
    public static void username_changePassword(String pIdentification,String pNewPassword) throws SQLException, ClassNotFoundException {
        connect.username_changePassword(pIdentification,pNewPassword);
    } 
    
    /*
        Procedimientos de tabla: 
        Person    
    */ 
    public static void person_insertPerson(String pIdentification,String pName, String pFirstLastName, String pSecondLastName,String pEmail,String pTelephone,String pBirthDate,String pUsername,String pPassword,int pIdKindPerson) throws SQLException, ClassNotFoundException {
        connect.person_insertPerson(pIdentification,pName,pFirstLastName,pSecondLastName,pEmail,pTelephone,pBirthDate,pUsername,pPassword,pIdKindPerson);
    }
    
    public static ResultSet person_getPerson(String pIdentification) throws SQLException, ClassNotFoundException {
        return connect.person_getPerson(pIdentification);
    }
    
    public static void person_setPersonalData(String pIdentification,int pIdKindPerson,String pName,String pFirstLastName,String pSecondLastName,String pTelephone,String pEmail) throws SQLException, ClassNotFoundException {
        connect.person_setPersonalData(pIdentification,pIdKindPerson,pName,pFirstLastName,pSecondLastName,pTelephone,pEmail);
    }
    
    public static void person_setBirthDate(String pIdentification,String pBirthDate) throws SQLException, ClassNotFoundException {
        connect.person_setBirthDate(pIdentification,pBirthDate);
    }
    
    public static void person_assistToEvent(int pIdEvent, String pIdentification,int pStatus) throws SQLException, ClassNotFoundException{
        connect.person_assistToEvent(pIdEvent, pIdentification, pStatus);
    } 
    
    public static void person_changeEventStatus(int pIdEvent, String pIdentification,int pStatus) throws SQLException, ClassNotFoundException{
        connect.person_changeEventStatus(pIdEvent, pIdentification, pStatus);
    } 
    
    /*
        Procedimientos de la tabla 
        Event    
    */
    public static void event_insertEvent(String pIdentification,String pEventName,String pDescription, int pIdClassification, int pIdCommunity,String pPlace,String pDate,String pHour,int pIsPublic) throws SQLException, ClassNotFoundException{
        connect.event_insertEvent(pIdentification,pEventName,pDescription,pIdClassification,pIdCommunity,pPlace,pDate,pHour,pIsPublic);
    } 
    
    public static ResultSet event_getEvent(int pIdEvent) throws SQLException, ClassNotFoundException{
        return connect.event_getEvent(pIdEvent);
    }    

     public static void event_setEventData(int pIdEvent, String pName, String pDescription, String pPlace, int pIdClassification) throws SQLException, ClassNotFoundException{
         connect.event_setEventData(pIdEvent, pName, pDescription, pPlace, pIdClassification);
    } 
     
    public static void event_setDate(int pIdEvent, String pNewDate) throws SQLException, ClassNotFoundException{
        connect.event_setDate(pIdEvent, pNewDate);
    } 
    
    public static void event_changePrivacity(int pIdEvent, int pNewDate) throws SQLException, ClassNotFoundException{
        connect.event_changePrivacity(pIdEvent, pNewDate);
    } 
    
    public static void event_inactiveEvent(int pIdEvent) throws SQLException, ClassNotFoundException{
        connect.event_inactiveEvent(pIdEvent);
    }
    
    /*
        Procedimientos de tabla: 
        Classification    
    */ 
    
    public static void classification_insertClassification(String pClassification) throws SQLException, ClassNotFoundException {
        connect.classification_insertClassification(pClassification);
    }

    public ResultSet classification_getClassification(int pClassification) throws SQLException, ClassNotFoundException {
        return connect.classification_getClassification(pClassification);
    }
    
    public static void classification_inactiveClassification(int pIdClassification) throws SQLException, ClassNotFoundException {
        connect.classification_inactiveClassification(pIdClassification);
    }
 
    public static void classification_setName(int pIdClassification, String pClassification) throws SQLException, ClassNotFoundException {
        connect.classification_setName(pIdClassification,pClassification);
    }
    
   /*
    Procedimientos de tabla: 
        Favorite    
    */
    

    public static void person_registerFavoriteClassification(String pIdentification, int pIdClassification) throws SQLException, ClassNotFoundException{
        connect.person_registerFavoriteClassification(pIdentification, pIdClassification);
    }
    
    /*
        Procedimientos de tabla: 
        Status    
    */     
    public static void status_insertStatus(String pStatus) throws SQLException, ClassNotFoundException {
        connect.status_insertStatus(pStatus);
    }
    
    public ResultSet status_getStatus(int pStatus) throws SQLException, ClassNotFoundException {
        return connect.status_getStatus(pStatus);
    }
    
    public static void status_inactiveStatus(int pIdStatus) throws SQLException, ClassNotFoundException {
        connect.status_inactiveStatus(pIdStatus);
    }
 
    public static void status_setName(int pIdStatus, String pStatus) throws SQLException, ClassNotFoundException {
        connect.status_setName(pIdStatus,pStatus);
    }
    
    /*
        Procedimientos de tabla: 
        Usertype    
    */     
    public static void usertype_insertUsertype(String pUsertype) throws SQLException, ClassNotFoundException {
        connect.usertype_insertUsertype(pUsertype);
    }

    public ResultSet usertype_getUsertype(int pUserType) throws SQLException, ClassNotFoundException {
        return connect.usertype_getUserType(pUserType);
    }
    
    public static void usertype_inactiveUsertype(int pIdUsertype) throws SQLException, ClassNotFoundException {
        connect.usertype_inactiveUsertype(pIdUsertype);
    }
 
    public static void usertype_setName(int pIdUsertype, String pUsertype) throws SQLException, ClassNotFoundException {
        connect.usertype_setName(pIdUsertype,pUsertype);
    }

    /*
        Procedimientos de tabla: 
        KindPerson    
    */     
    public static void kindperson_insertKindPerson(String pKindPerson) throws SQLException, ClassNotFoundException {
        connect.kindperson_insertKindPerson(pKindPerson);
    }

    public ResultSet kindperson_getKindPerson(int pKindPerson) throws SQLException, ClassNotFoundException {
        return connect.kindperson_getKindPerson(pKindPerson);
    }
    
    public static void kindperson_inactiveKindPerson(int pIdKindPerson) throws SQLException, ClassNotFoundException {
        connect.kindperson_inactiveKindPerson(pIdKindPerson);
    }
 
    public static void kindperson_setName(int pIdKindPerson, String pKindPerson) throws SQLException, ClassNotFoundException {
        connect.kindperson_setName(pIdKindPerson,pKindPerson);
    }
    
   /*
    Procedimientos de tabla: 
        Comment   
    */
    

    public static void comment_insertEventComment(String pDescription,int pIdEvent) throws SQLException, ClassNotFoundException{
        connect.comment_insertEventComment(pDescription, pIdEvent);
    }
    
    public static void comment_setComment(int pIdComment,String pNewValue) throws SQLException, ClassNotFoundException{
        connect.comment_setComment(pIdComment, pNewValue);
    }

    /*
        Procedimientos de tabla: 
        Country    
    */
    public static void country_insertCountry(String pCountry) throws SQLException, ClassNotFoundException {
        connect.country_insertCountry(pCountry);
    }
    
    public ResultSet country_getCountry(int pCountry) throws SQLException, ClassNotFoundException {
        return connect.country_getCountry(pCountry);
    }
    
    public static void country_inactiveCountry(int pIdCountry) throws SQLException, ClassNotFoundException {
        connect.country_inactiveCountry(pIdCountry);
    }
    
    public static void country_setName(int pIdCountry, String pCountryName) throws SQLException, ClassNotFoundException {
        connect.country_setNameCountry(pIdCountry,pCountryName);
    } 
    
    public static String country_getCountryName(int pIdCountry) throws SQLException, ClassNotFoundException {
        return connect.country_getCountryName(pIdCountry);
    } 
    
    public static int country_getCountryId(String pCountryName) throws SQLException, ClassNotFoundException {
        return connect.country_getCountryId(pCountryName);
    }
    
    /*
        Procedimientos de tabla: 
        Province    
    */
    
    public static void province_insertProvince(String pProvince) throws SQLException, ClassNotFoundException {
        connect.province_insertProvince(pProvince);
    }
    
    public ResultSet province_getProvince(int pProvince) throws SQLException, ClassNotFoundException {
        return connect.province_getProvince(pProvince);
    }
    
    public static void province_inactiveProvince(int pIdProvince) throws SQLException, ClassNotFoundException {
        connect.province_inactiveProvince(pIdProvince);
    }
    
    public static void province_setName(int pIdProvince, String pProvinceName) throws SQLException, ClassNotFoundException {
        connect.province_setNameProvince(pIdProvince,pProvinceName);
    } 
    
    public static String province_getProvinceName(int pIdProvince) throws SQLException, ClassNotFoundException {
        return connect.province_getProvinceName(pIdProvince);
    } 
    
    public static int province_getProvinceId(String pProvinceName) throws SQLException, ClassNotFoundException {
        return connect.province_getProvinceId(pProvinceName);
    } 
    
    public static int province_getCountryId(int pProvinceId) throws SQLException, ClassNotFoundException {
        return connect.province_getCountryId(pProvinceId);
    } 
    
    /*
        Procedimientos de tabla: 
        Province    
    */
    
    public static void canton_insertCanton(String pCanton) throws SQLException, ClassNotFoundException {
        connect.canton_insertCanton(pCanton);
    }
    
    public ResultSet canton_getCanton(int pCanton) throws SQLException, ClassNotFoundException {
        return connect.canton_getCanton(pCanton);
    }
    
    public static void canton_inactiveCanton(int pIdCanton) throws SQLException, ClassNotFoundException {
        connect.canton_inactiveCanton(pIdCanton);
    }
    
    public static void canton_setName(int pIdCanton, String pCantonName) throws SQLException, ClassNotFoundException {
        connect.canton_setNameCanton(pIdCanton,pCantonName);
    } 
    
    public static String canton_getCantonName(int pIdCanton) throws SQLException, ClassNotFoundException {
        return connect.canton_getCantonName(pIdCanton);
    } 
    
    public static int canton_getCantonId(String pCantonName) throws SQLException, ClassNotFoundException {
        return connect.canton_getCantonId(pCantonName);
    } 
    
    public static int canton_getProvinceId(int pCantonId) throws SQLException, ClassNotFoundException {
        return connect.canton_getProvinceId(pCantonId);
    } 
    
    /*
        Procedimientos de tabla: 
        Community    
    */
    
    public static void community_insertCommunity(String pCommunity) throws SQLException, ClassNotFoundException {
        connect.community_insertCommunity(pCommunity);
    }
    
    public ResultSet community_getCommunity(int pCommunity) throws SQLException, ClassNotFoundException {
        return connect.community_getCommunity(pCommunity);
    }
    
    public static void community_inactiveCommunity(int pIdCommunity) throws SQLException, ClassNotFoundException {
        connect.community_inactiveCommunity(pIdCommunity);
    }
    
    public static void community_setName(int pIdCommunity, String pCommunityName) throws SQLException, ClassNotFoundException {
        connect.community_setNameCommunity(pIdCommunity,pCommunityName);
    } 
    
    public static String community_getCommunityName(int pIdCommunity) throws SQLException, ClassNotFoundException {
        return connect.community_getCommunityName(pIdCommunity);
    } 
    
    public static int community_getCommunityId(String pCommunityName) throws SQLException, ClassNotFoundException {
        return connect.community_getCommunityId(pCommunityName);
    } 
    
    public static int community_getCantonId(int pCommunityId) throws SQLException, ClassNotFoundException {
        return connect.community_getCantonId(pCommunityId);
    } 
    
    /*
        Funciones
            Consultas y
                Estadísticas    
    */
    public static ResultSet adminConsultNextEvent(String pEventDate) throws SQLException, ClassNotFoundException{
        return connect.admin_consult_Next_Event(pEventDate);
    } 
    
    public static ResultSet adminConsultPastEvent(String pEventDate) throws SQLException, ClassNotFoundException{
        return connect.admin_consult_Past_Event(pEventDate);
    } 

    public static ResultSet adminConsultCReviewXEvent() throws SQLException, ClassNotFoundException{
        return connect.admin_Consult_c_ReviewXEvent();
    }  
    
    public static ResultSet User_Consults_a_PrivateEvent(String pIdentification, String pIdClassification) throws SQLException, ClassNotFoundException{
        return connect.User_Consults_a_PrivateEvent(pIdentification, pIdClassification);
    }    
    public static ResultSet user_Consults_b_nextEvents() throws SQLException, ClassNotFoundException{
        return connect.user_Consults_b_nextEvents();
    }
    public static ResultSet User_Consults_c_ListEvents(String pIdentification) throws SQLException, ClassNotFoundException{
        return connect.User_Consults_c_ListEvents(pIdentification);
    }  
    
    public static ResultSet Normal_Consults_CommentsXEvent(int pIdEvent) throws SQLException, ClassNotFoundException{
        return connect.Normal_Consults_CommentsXEvent(pIdEvent);
    } 
    public static ResultSet statisticsTopWorstReview(int pNumberTop) throws SQLException, ClassNotFoundException{
        return connect.Statistics_Top_Worst_Review(pNumberTop);
    }
    
    public static ResultSet statisticsAgeRange() throws SQLException, ClassNotFoundException{
        return connect.Statistics_Age_Range();
    }    
    
    
    public static ResultSet statisticsEventXClassification() throws SQLException, ClassNotFoundException{
        return connect.Statistics_EventXClassification();
    }
 
    public static ResultSet statisticsPersonXClassification() throws SQLException, ClassNotFoundException{
        return connect.Statistics_PersonXClassification();
    }
    
    public static ResultSet statisticsReviewXClassification() throws SQLException, ClassNotFoundException{
        return connect.Statistics_ReviewXClassification();
    }
    
    public static ResultSet statisticsTopBestReview(int pNumberTop) throws SQLException, ClassNotFoundException{
        return connect.Statistics_Top_Best_Review(pNumberTop);
    }
    
    public static ResultSet statisticsTopMoreAttendees(int pNumberTop) throws SQLException, ClassNotFoundException{
        return connect.Statistics_Top_More_Attendees(pNumberTop);
    }
    
    public static ResultSet statisticsEventXDateByDay(int pDayToChoose) throws SQLException, ClassNotFoundException{
        return connect.Statistics_EventXDate_Day(pDayToChoose);
    }
    
    public static ResultSet statisticsEventXDateByWeek(int pDayToChoose) throws SQLException, ClassNotFoundException{
        return connect.Statistics_EventXDate_Week(pDayToChoose);
       
    }
    
    public static ResultSet statisticsEventXDateByMonth(int pDayToChoose) throws SQLException, ClassNotFoundException{
        return connect.Statistics_EventXDate_Month(pDayToChoose);    
    }
    
    public static ResultSet statisticsEventXDateByYear(int pDayToChoose) throws SQLException, ClassNotFoundException{
        return connect.Statistics_EventXDate_Year(pDayToChoose);       
    }
    
    
    /*
        Funciones
        Auxiliares    
    */
    
    public static boolean passwordVerificator(String password){
        boolean lowerFlag=false,upperFlag=false,numberFlag=false,specialFlag=false;
        String numbers="1234567890";
        String capitalLetters = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnñopqrstuvwxyz";
 	String specialLetters = "|°!\"#$%&/()=?'¿¡+*";
        if(password.length()<8) return false;
        else {
            for(int i=0;i<password.length();i++){
                char c = password.charAt (i);
                String aux= String.valueOf(c);
                if(numbers.contains(aux)) numberFlag=true;
                if(capitalLetters.contains(aux)) upperFlag=true;
                if(lowerCaseLetters.contains(aux)) lowerFlag=true;
                if(specialLetters.contains(aux)) specialFlag=true;
                if(numberFlag && upperFlag && lowerFlag && specialFlag) return true;
            }
        return false;
        }
    }   
}
