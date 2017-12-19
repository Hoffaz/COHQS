/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.hoffaz;

import daos.ConnectionDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.hoffaz.Student;


/**
 *
 * @author khaled
 */
public class AddStudentDao extends ConnectionDao{
    
        public void insertStudent(Student student) throws Exception {   
            
            Connection conn = getConnection();
            
                 
            String sql = "INSERT INTO STUDENTS s (STUDENTID,FIRSTNAME,SECONDNAME,THIRDNAME,FAMILYNAME,"
                       + "BIRTHDATE,SEXID,DATEOFJOIN," +
                         "NATIONALITY,NATIONALITYNUMBER,"
                       + "PHONE,WHATSUP,BRANCHID,CENTERID,TRIPID,STOPID," +
                         "ADDRESSDETAILS,TRANSPORTATION,"
                       + "INSERTEMPLOYEEID,INSERTDATE,INSERTHOSTIP,INSERTHOSTOS," +
                         "UPDATEMPLOYEEID,UPDATEDATE,UPDATEHOSTIP,UPDATEHOSTOS) " +                   
                         "VALUES ((SELECT MAX(STUDENTID) FROM STUDENTS WHERE BRANCHID=? AND CENTERID=?)+1,"
                       + "?,?,?,?,?,"
                       + "?,?,?,?,?,"
                       + "?,?,?,?,?,"
                       + "?,?,?,?,?,"
                       + "?,?,?,?,?)";
            
        try {
            
            PreparedStatement ps = conn.prepareStatement(sql); 
            
            ps.setInt      (1, student.getBranchId());
            ps.setInt      (2, student.getCenterId());
            ps.setString   (3, student.getFirstName());
            ps.setString   (4, student.getSecondName());
            ps.setString   (5, student.getThirdName());
            ps.setString   (6, student.getFamilyName());
            ps.setTimestamp(7, student.getBirthDate());
            ps.setInt      (8, student.getSexId());
            ps.setTimestamp(9, student.getDateOfJoin());
            ps.setInt      (10, student.getNationality());
            ps.setInt      (11, student.getNationalityNumber());
            ps.setString   (12, student.getPhone());
            ps.setString   (13, student.getWhatsup());
            ps.setInt      (14, student.getBranchId());
            ps.setInt      (15, student.getCenterId());
            ps.setInt      (16, student.getTripId());
            ps.setInt      (17, student.getStopId());
            ps.setString   (18, student.getAddressDetails());
            ps.setBoolean(19, student.getTransportation());
            ps.setInt      (20, student.getInsertEmployeeId());
            ps.setTimestamp(21, student.getInsertDate());
            ps.setString   (22, student.getInsertHostIp());
            ps.setString   (23, student.getInsertHostOS());
            ps.setInt      (24, student.getUpdatEmployeeId());
            ps.setTimestamp(25, student.getUpdateDate());
            ps.setString   (26, student.getUpdateHostIp());
            ps.setString   (27, student.getUpdateHostOS());
            
            
            ps.executeUpdate();
            
            ps.close();
            
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
    }
    
}
