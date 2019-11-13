/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

/**
 *
 * @author steve
 */
public class connect {

    /**
     *
     */
    public static Connection con=null;    

    /**
     *
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static void getConnection() throws ClassNotFoundException, SQLException{
       Class.forName("com.mysql.jdbc.Driver");
       con=DriverManager.getConnection("jdbc:mysql://localhost/event_manager?autoReconnect=true&useSSL=false","root","marianela1234.");
    }
    
    /*
        Procedimientos de tabla: 
        Username    
    */
    
    public static ResultSet username_validateUser(String pUsername,String pPassword) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.username_validateUser(?,?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        stmt.setString(1,pUsername);
        stmt.setString(2,pPassword);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    }  
    
    public static void username_changePassword(String pIdentification,String pNewPassword) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.username_changePassword(?,?)}");
        stmt.setString(1,pIdentification);
        stmt.setString(2,pNewPassword);
        stmt.executeQuery();     
    } 
    
    /*
    Procedimientos de tabla: 
        Person    
    */
    

    public static void person_insertPerson(String pIdentification,String pName, String pFirstLastName, String pSecondLastName,String pEmail,String pTelephone,String pBirthDate,String pUsername,String pPassword, int pIdKindPerson) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.person_insertPerson(?,?,?,?,?,?,?,?,?,?)}");   
        stmt.setString(1,pIdentification);
        stmt.setString(2,pName);
        stmt.setString(3,pFirstLastName);
        stmt.setString(4,pSecondLastName);
        stmt.setString(5,pEmail);
        stmt.setString(6,pTelephone);
        stmt.setString(7,pBirthDate);
        stmt.setString(8,pUsername);
        stmt.setString(9,pPassword);
        stmt.setInt(10,pIdKindPerson);
        stmt.execute();         
    } 
    
    public static ResultSet person_getPerson(String pIdentification) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.person_getPerson(?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        if(pIdentification == "") stmt.setNull(1,java.sql.Types.BIGINT);
        else stmt.setString(1,pIdentification);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    }    

     public static void person_setPersonalData(String pIdentification, int pIdKindPerson, String pName, String pFirstLastName, String pSecondLastName,String pTelephone,String pEmail) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.person_setName(?,?,?,?,?,?,?)}");   
        stmt.setString(1,pIdentification);
        if(pIdKindPerson==-1) stmt.setNull(2,java.sql.Types.BIGINT);
        else stmt.setInt(2,pIdKindPerson);
        if(pName=="") stmt.setNull(3,java.sql.Types.BIGINT);
        else stmt.setString(3,pName);
        if(pFirstLastName=="") stmt.setNull(4,java.sql.Types.BIGINT);
        else stmt.setString(4,pFirstLastName);
        if(pSecondLastName=="") stmt.setNull(5,java.sql.Types.BIGINT);
        else stmt.setString(5,pSecondLastName);
        if(pTelephone=="") stmt.setNull(6,java.sql.Types.BIGINT);
        else stmt.setString(6,pTelephone);
        if(pEmail=="") stmt.setNull(7,java.sql.Types.BIGINT);
        else stmt.setString(7,pEmail);
        stmt.execute();         
    } 
     
    public static void person_setBirthDate(String pIdentification, String pBirthDate) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.person_setBirthDate(?,?)}");   
        stmt.setString(1,pIdentification);
        stmt.setString(2,pBirthDate);
        stmt.execute();         
    } 
    
    public static void person_assistToEvent(int pIdEvent, String pIdentification,int pStatus) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.person_assistToEvent(?,?,?)}");   
        stmt.setInt(1,pIdEvent);
        stmt.setString(2,pIdentification);
        stmt.setInt(3,pStatus);
        stmt.execute();         
    } 
    
    public static void person_changeEventStatus(int pIdEvent, String pIdentification,int pStatus) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.person_changeEventStatus(?,?,?)}");   
        stmt.setInt(1,pIdEvent);
        stmt.setString(2,pIdentification);
        stmt.setInt(3,pStatus);
        stmt.execute();         
    } 

        /*
    Procedimientos de tabla: 
        Event    
    */
    

    public static void event_insertEvent(String pIdentification,String pEventName,String pDescription, int pIdClassification, int pIdCommunity,String pPlace,String pDate,String pHour,int pIsPublic) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.event_insertEvent(?,?,?,?,?,?,?,?,?)}");   
        stmt.setString(1,pIdentification);
        stmt.setString(2,pEventName);
        stmt.setString(3,pDescription);
        stmt.setInt(4,pIdClassification);
        stmt.setInt(5,pIdCommunity);
        stmt.setString(6,pPlace);
        stmt.setString(7,pDate);
        stmt.setString(8,pHour);
        stmt.setInt(9,pIsPublic);
        stmt.execute();         
    } 
    
    public static ResultSet event_getEvent(int pIdEvent) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.event_getEvent(?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        if(pIdEvent == -1) stmt.setNull(1,java.sql.Types.BIGINT);
        else stmt.setInt(1,pIdEvent);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    }    

     public static void event_setEventData(int pIdEvent, String pName, String pDescription, String pPlace, int pIdClassification) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.event_setName(?,?,?,?,?)}");   
        stmt.setInt(1,pIdEvent);
        if(pName=="") stmt.setNull(2,java.sql.Types.BIGINT);
        else stmt.setString(2,pName);
        if(pDescription=="") stmt.setNull(3,java.sql.Types.BIGINT);
        else stmt.setString(3,pDescription);
        if(pPlace=="") stmt.setNull(4,java.sql.Types.BIGINT);
        else stmt.setString(4,pPlace);
        if(pIdClassification==-1) stmt.setNull(5,java.sql.Types.BIGINT);
        else stmt.setInt(5,pIdClassification);
        stmt.execute();         
    } 
     
    public static void event_setDate(int pIdEvent, String pNewDate) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.event_setDate(?,?)}");   
        stmt.setInt(1,pIdEvent);
        stmt.setString(2,pNewDate);
        stmt.execute();         
    } 
    
    public static void event_changePrivacity(int pIdEvent, int pNewDate) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.event_changePrivacity(?,?)}");   
        stmt.setInt(1,pIdEvent);
        stmt.setInt(2,pNewDate);
        stmt.execute();         
    } 
    
    public static void event_inactiveEvent(int pIdEvent) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.event_inactiveEvent(?)}");   
        stmt.setInt(1,pIdEvent);
        stmt.execute();         
    }
    
   /*
    Procedimientos de tabla: 
        Classification    
    */
    

    public static void classification_insertClassification(String pClassification) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.classification_insertClassification(?)}");   
        stmt.setString(1,pClassification);
        stmt.execute();         
    }
    
    public static ResultSet classification_getClassification(int pIdClassification) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.kindPerson_getKindPerson(?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        if(pIdClassification == -1) stmt.setNull(1,java.sql.Types.BIGINT);
        else stmt.setInt(1,pIdClassification);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    } 
    
    public static void classification_inactiveClassification(int pIdClassification) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.classification_inactiveClassification(?)}");   
        stmt.setInt(1,pIdClassification);
        stmt.execute();         
    }
    
    public static void classification_setName(int pIdClassification,String pNewName) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.classification_setName(?,?)}");   
        stmt.setInt(1,pIdClassification);
        stmt.setString(2,pNewName);
        stmt.execute();         
    }
    
   /*
    Procedimientos de tabla: 
        Favorite    
    */
    

    public static void person_registerFavoriteClassification(String pIdentification, int pIdClassification) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.person_registerFavoriteClassification(?,?)}");   
        stmt.setString(1,pIdentification);
        stmt.setInt(2,pIdClassification);
        stmt.execute();         
    }
    
   /*
    Procedimientos de tabla: 
        Status   
    */
    

    public static void status_insertStatus(String pStatus) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.status_insertStatus(?)}");   
        stmt.setString(1,pStatus);
        stmt.execute();         
    }

    public static ResultSet status_getStatus(int pIdStatus) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.status_getStatus(?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        if(pIdStatus == -1) stmt.setNull(1,java.sql.Types.BIGINT);
        else stmt.setInt(1,pIdStatus);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    } 
    
    public static void status_inactiveStatus(int pIdStatus) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.status_inactiveStatus(?)}");   
        stmt.setInt(1,pIdStatus);
        stmt.execute();         
    }
    
    public static void status_setName(int pIdStatus,String pNewName) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.status_setName(?,?)}");   
        stmt.setInt(1,pIdStatus);
        stmt.setString(2,pNewName);
        stmt.execute();         
    }
    
   /*
    Procedimientos de tabla: 
        userType   
    */
    

    public static void usertype_insertUsertype(String pUsertype) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.usertype_insertUsertype(?)}");   
        stmt.setString(1,pUsertype);
        stmt.execute();         
    }

    public static ResultSet usertype_getUserType(int pIdUserType) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.usertype_getUserType(?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        if(pIdUserType == -1) stmt.setNull(1,java.sql.Types.BIGINT);
        else stmt.setInt(1,pIdUserType);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    } 
    
    public static void usertype_inactiveUsertype(int pIdUsertype) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.usertype_inactiveUsertype(?)}");   
        stmt.setInt(1,pIdUsertype);
        stmt.execute();         
    }
    
    public static void usertype_setName(int pIdUsertype,String pNewName) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.usertype_setName(?,?)}");   
        stmt.setInt(1,pIdUsertype);
        stmt.setString(2,pNewName);
        stmt.execute();         
    }
  
   /*
    Procedimientos de tabla: 
        kindPerson   
    */
    

    public static void kindperson_insertKindPerson(String pKindperson) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.kindperson_insertKindPerson(?)}");   
        stmt.setString(1,pKindperson);
        stmt.execute();         
    }

    public static ResultSet kindperson_getKindPerson(int pIdKindPerson) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.kindperson_getKindPersone(?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        if(pIdKindPerson == -1) stmt.setNull(1,java.sql.Types.BIGINT);
        else stmt.setInt(1,pIdKindPerson);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    } 
    
    public static void kindperson_inactiveKindPerson(int pIdKindPerson) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.kindperson_inactiveKindPerson(?)}");   
        stmt.setInt(1,pIdKindPerson);
        stmt.execute();         
    }
    
    public static void kindperson_setName(int pIdKindPerson,String pNewName) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.kindperson_setName(?,?)}");   
        stmt.setInt(1,pIdKindPerson);
        stmt.setString(2,pNewName);
        stmt.execute();         
    }

   /*
    Procedimientos de tabla: 
        Comment   
    */
    

    public static void comment_insertEventComment(String pDescription,int pIdEvent) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.comment_insertEventComment(?,?)}");   
        stmt.setString(1,pDescription);
        stmt.setInt(1,pIdEvent);
        stmt.execute();         
    }
    
    public static void comment_setComment(int pIdComment,String pNewValue) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.comment_setComment(?,?)}");   
        stmt.setInt(1,pIdComment);
        stmt.setString(1,pNewValue);
        stmt.execute();         
    }
    
   /*
    Procedimientos de tabla: 
        Country   
    */    

    public static void country_insertCountry(String pCountry) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.country_insertCountry(?)}");   
        stmt.setString(1,pCountry);
        stmt.execute();         
    }

    public static ResultSet country_getCountry(int pIdCountry) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.country_getAllCountry(?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        if(pIdCountry == -1) stmt.setNull(1,java.sql.Types.BIGINT);
        else stmt.setInt(1,pIdCountry);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    } 
    
    public static void country_inactiveCountry(int pIdCountry) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.country_inactiveCountry(?)}");   
        stmt.setInt(1,pIdCountry);
        stmt.execute();         
    }
    
    public static void country_setNameCountry(int pIdCountry,String pNewName) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.country_setNameCountry(?,?)}");   
        stmt.setInt(1,pIdCountry);
        stmt.setString(2,pNewName);
        stmt.execute();         
    }

    public static String country_getCountryName(int pIdCountry) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{? = call event_manager.country_getCountryName(?)}");   
        stmt.setInt(2,pIdCountry);
        stmt.registerOutParameter(1,Types.VARCHAR);
        stmt.execute();   
        String result=stmt.getString(1);   
        return result;
    }   
    
    public static int country_getCountryId(String pProvinceName) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{? = call event_manager.country_getCountryId(?)}");   
        stmt.setString(2,pProvinceName);
        stmt.registerOutParameter(1,Types.NUMERIC);
        stmt.execute();   
        int result=stmt.getInt(1);   
        return result;
    }
   /*
    Procedimientos de tabla: 
        Province   
    */    

    public static void province_insertProvince(String pProvince) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.province_insertProvince(?)}");   
        stmt.setString(1,pProvince);
        stmt.execute();         
    }

    public static ResultSet province_getProvince(int pIdProvince) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.province_getAllProvince(?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        if(pIdProvince == -1) stmt.setNull(1,java.sql.Types.BIGINT);
        else stmt.setInt(1,pIdProvince);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    } 
    
    public static void province_inactiveProvince(int pIdProvince) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.province_inactiveProvince(?)}");   
        stmt.setInt(1,pIdProvince);
        stmt.execute();         
    }
    
    public static void province_setNameProvince(int pIdProvince,String pNewName) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.province_setNameProvince(?,?)}");   
        stmt.setInt(1,pIdProvince);
        stmt.setString(2,pNewName);
        stmt.execute();         
    }
    
    public static int province_getProvinceId(String pProvinceName) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{? = call event_manager.province_getProvinceId(?)}");   
        stmt.setString(2,pProvinceName);
        stmt.registerOutParameter(1,Types.NUMERIC);
        stmt.execute();   
        int result=stmt.getInt(1);   
        return result;
    }
    
    public static int province_getCountryId(int pProvinceId) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{? = call event_manager.province_getCountryId(?)}");   
        stmt.setInt(2,pProvinceId);
        stmt.registerOutParameter(1,Types.NUMERIC);
        stmt.execute();   
        int result=stmt.getInt(1);   
        return result;
    }
    
    public static String province_getProvinceName(int pIdProvince) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{? = call event_manager.province_getProvinceName(?)}");   
        stmt.setInt(2,pIdProvince);
        stmt.registerOutParameter(1,Types.VARCHAR);
        stmt.execute();   
        String result=stmt.getString(1);   
        return result;
    }
    
   /*
    Procedimientos de tabla: 
        Canton   
    */    

    public static void canton_insertCanton(String pCanton) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.canton_insertCanton(?)}");   
        stmt.setString(1,pCanton);
        stmt.execute();         
    }

    public static ResultSet canton_getCanton(int pIdCanton) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.canton_getAllCanton(?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        if(pIdCanton == -1) stmt.setNull(1,java.sql.Types.BIGINT);
        else stmt.setInt(1,pIdCanton);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    } 
    
    public static void canton_inactiveCanton(int pIdCanton) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.canton_inactiveCanton(?)}");   
        stmt.setInt(1,pIdCanton);
        stmt.execute();         
    }
    
    public static void canton_setNameCanton(int pIdCanton,String pNewName) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.canton_setNameCanton(?,?)}");   
        stmt.setInt(1,pIdCanton);
        stmt.setString(2,pNewName);
        stmt.execute();         
    }
    
    public static int canton_getCantonId(String pCantonName) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{? = call event_manager.canton_getCantonId(?)}");   
        stmt.setString(2,pCantonName);
        stmt.registerOutParameter(1,Types.NUMERIC);
        stmt.execute();   
        int result=stmt.getInt(1);   
        return result;
    }
    
    public static int canton_getProvinceId(int pCantonId) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{? = call event_manager.canton_getProvinceId(?)}");   
        stmt.setInt(2,pCantonId);
        stmt.registerOutParameter(1,Types.NUMERIC);
        stmt.execute();   
        int result=stmt.getInt(1);   
        return result;
    }
    
    public static String canton_getCantonName(int pIdCanton) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{? call event_manager.canton_getCantonName(?)}");   
        stmt.setInt(2,pIdCanton);
        stmt.registerOutParameter(1,Types.VARCHAR);
        stmt.execute();   
        String result=stmt.getString(1);   
        return result;
    }
    
   /*
    Procedimientos de tabla: 
        Community   
    */    

    public static void community_insertCommunity(String pCommunity) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.community_insertCommunity(?)}");   
        stmt.setString(1,pCommunity);
        stmt.execute();         
    }

    public static ResultSet community_getCommunity(int pIdCanton) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.community_getAllCommunity(?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        if(pIdCanton == -1) stmt.setNull(1,java.sql.Types.BIGINT);
        else stmt.setInt(1,pIdCanton);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    } 
    
    public static void community_inactiveCommunity(int pIdCommunity) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.community_inactiveCommunity(?)}");   
        stmt.setInt(1,pIdCommunity);
        stmt.execute();         
    }
    
    public static void community_setNameCommunity(int pIdCommunity,String pNewName) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.community_setNameCommunity(?,?)}");   
        stmt.setInt(1,pIdCommunity);
        stmt.setString(2,pNewName);
        stmt.execute();         
    }
    
    public static int community_getCommunityId(String pCommunityName) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{? = call event_manager.community_getCommunityId(?)}");   
        stmt.setString(2,pCommunityName);
        stmt.registerOutParameter(1,Types.NUMERIC);
        stmt.execute();   
        int result=stmt.getInt(1);   
        return result;
    }
    
    public static int community_getCantonId(int pIdCommunity) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{? = call event_manager.community_getCantonId(?)}");   
        stmt.setInt(2,pIdCommunity);
        stmt.registerOutParameter(1,Types.NUMERIC);
        stmt.execute();   
        int result=stmt.getInt(1);   
        return result;
    }
    
    public static String community_getCommunityName(int pIdCanton) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{? = call event_manager.community_getCommunityName(?)}");   
        stmt.setInt(2,pIdCanton);
        stmt.registerOutParameter(1,Types.VARCHAR);
        stmt.execute();   
        String result=stmt.getString(1);   
        return result;
    }
    
    
    
    /*
        Procedimientos
            Consultas y
                Estadísticas    
    */
    public static ResultSet admin_consult_Next_Event(String pEventDate) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.Admin_Consult_Next_Event(?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        stmt.setString(1,pEventDate);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    }

    public static ResultSet admin_consult_Past_Event(String pEventDate) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.Admin_consult_Past_Event(?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        stmt.setString(1,pEventDate);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    }   
    
    public static ResultSet admin_Consult_c_ReviewXEvent() throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.admin_Consult_c_ReviewXEvent()}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    }  

    public static ResultSet User_Consults_a_PrivateEvent(String pIdentification, String pIdClassification) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.User_Consults_a_PrivateEvent(?,?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        stmt.setString(1,pIdentification);
        stmt.setString(2,pIdClassification);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    }     
    public static ResultSet user_Consults_b_nextEvents() throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.User_Consults_b_nextEvents()}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    }    
    public static ResultSet User_Consults_c_ListEvents(String pIdentification) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.User_Consults_c_ListEvents(?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        stmt.setString(1,pIdentification);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    }  
    
    public static ResultSet Normal_Consults_CommentsXEvent(int pIdEvent) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.Normal_Consults_CommentsXEvent(?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        stmt.setInt(1,pIdEvent);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    } 
    
    public static ResultSet Statistics_Top_Worst_Review(int pNumberTop) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.Statistics_Top_Worst_Review(?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        stmt.setInt(1,pNumberTop);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    }
    
    public static ResultSet Statistics_Age_Range() throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.Statistics_Age_Range()}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    }
    
    public static ResultSet Statistics_EventXClassification() throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.Statistics_EventXClassification()}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    }
 
    public static ResultSet Statistics_PersonXClassification() throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.Statistics_PersonXClassification()}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    }
    
    public static ResultSet Statistics_ReviewXClassification() throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.Statistics_ReviewXClassification()}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    }
    
    public static ResultSet Statistics_Top_Best_Review(int pNumberTop) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.Statistics_Top_Best_Review(?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        stmt.setInt(1,pNumberTop);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    }
    
    public static ResultSet Statistics_Top_More_Attendees(int pNumberTop) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.Statistics_Top_More_Attendees(?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        stmt.setInt(1,pNumberTop);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    }
    
    public static ResultSet Statistics_EventXDate_Day(int pDayToChoose) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.Statistics_EventXDate_Day(?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        stmt.setInt(1,pDayToChoose);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    }
    
    public static ResultSet Statistics_EventXDate_Week(int pDayToChoose) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.Statistics_EventXDate_Week(?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        stmt.setInt(1,pDayToChoose);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    }
    
    public static ResultSet Statistics_EventXDate_Month(int pDayToChoose) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.Statistics_EventXDate_Month(?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        stmt.setInt(1,pDayToChoose);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    }
    
    public static ResultSet Statistics_EventXDate_Year(int pDayToChoose) throws SQLException, ClassNotFoundException{
        getConnection();
        CallableStatement stmt= con.prepareCall("{ call event_manager.Statistics_EventXDate_Year(?)}",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        stmt.setInt(1,pDayToChoose);
        ResultSet rs=stmt.executeQuery();
        return rs;        
    }
    

}
