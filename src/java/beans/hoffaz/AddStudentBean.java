/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.hoffaz;

import daos.hoffaz.AddStudentDao;
import daos.hoffaz.NationalityDao;
import daos.hoffaz.TripDao;
import daos.hoffaz.TripDetailDao;
import java.io.Serializable;
import java.util.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import models.hoffaz.Nationality;
import models.hoffaz.Student;
import models.hoffaz.Trip;
import models.hoffaz.TripDetail;

/**
 *
 * @author khaled
 */
@Named(value = "addStudentBean")
@ViewScoped
public class AddStudentBean implements Serializable{
    
    private final AddStudentDao addStudentDao = new AddStudentDao();
    private final NationalityDao nationalityDao = new NationalityDao();
    private final TripDao tripDao = new TripDao();
    private final TripDetailDao tripDetailDao = new TripDetailDao();
    
    private ArrayList<Nationality> nationalityList = new ArrayList<>();
    private ArrayList<Trip> tripList = new ArrayList<>();
    private ArrayList<TripDetail> tripDetailList = new ArrayList<>();
    
    private int studentId;
    private String firstName;
    private String secondName;
    private String thirdName;
    private String familyName;
    private Timestamp birthDate;
    private int sexId;
    private String sexDescription;
    private Timestamp dateOfJoin;
    private int nationality;
    private String nationalityDesc;
    private int nationalityNumber;
    private String phone;
    private String whatsup;
    private int branchId;
    private String branchName;
    private int centerId;
    private String centerName;
    private int tripId;
    private String tripDesc;
    private int stopId;
    private String stopDesc;
    private String addressDetails;
    private boolean transportation;
    private String transportationDesc; 
    private int insertEmployeeId;
    private String insertHostIp;    
    private Timestamp insertDate;      
    private String insertHostOS;    
    private int updatEmployeeId; 
    private Timestamp updateDate;      
    private String updateHostIp;    
    private String updateHostOS;
    private Date date;

        @Inject
    private SessionBean sessionBean;
        
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Timestamp getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }

    public int getSexId() {
        return sexId;
    }

    public void setSexId(int sexId) {
        this.sexId = sexId;
    }

    public String getSexDescription() {
        return sexDescription;
    }

    public void setSexDescription(String sexDescription) {
        this.sexDescription = sexDescription;
    }

    public Timestamp getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(Timestamp dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    public int getNationality() {
        return nationality;
    }

    public void setNationality(int nationalityId) {
        this.nationality = nationalityId;
    }

    public String getNationalityDesc() {
        return nationalityDesc;
    }

    public void setNationalityDesc(String nationalityDesc) {
        this.nationalityDesc = nationalityDesc;
    }

    public int getNationalityNumber() {
        return nationalityNumber;
    }

    public void setNationalityNumber(int nationalityNumber) {
        this.nationalityNumber = nationalityNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWhatsup() {
        return whatsup;
    }

    public void setWhatsup(String whatsup) {
        this.whatsup = whatsup;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public int getCenterId() {
        return centerId;
    }

    public void setCenterId(int centerId) {
        this.centerId = centerId;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public String getTripDesc() {
        return tripDesc;
    }

    public void setTripDesc(String tripDesc) {
        this.tripDesc = tripDesc;
    }

    public int getStopId() {
        return stopId;
    }

    public void setStopId(int stopId) {
        this.stopId = stopId;
    }

    public String getStopDesc() {
        return stopDesc;
    }

    public void setStopDesc(String stopDesc) {
        this.stopDesc = stopDesc;
    }

    public String getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(String addressDetails) {
        this.addressDetails = addressDetails;
    }

    public boolean getTransportation() {
        return transportation;
    }

    public void setTransportation(boolean transportation) {
        this.transportation = transportation;
    }

    public String getTransportationDesc() {
        return transportationDesc;
    }

    public void setTransportationDesc(String transportationDesc) {
        this.transportationDesc = transportationDesc;
    }

    public int getInsertEmployeeId() {
        return insertEmployeeId;
    }

    public void setInsertEmployeeId(int insertEmployeeId) {
        this.insertEmployeeId = insertEmployeeId;
    }

    public String getInsertHostIp() {
        return insertHostIp;
    }

    public void setInsertHostIp(String insertHostIp) {
        this.insertHostIp = insertHostIp;
    }

    public Timestamp getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Timestamp insertDate) {
        this.insertDate = insertDate;
    }

    public String getInsertHostOS() {
        return insertHostOS;
    }

    public void setInsertHostOS(String insertHostOS) {
        this.insertHostOS = insertHostOS;
    }

    public int getUpdatEmployeeId() {
        return updatEmployeeId;
    }

    public void setUpdatEmployeeId(int updatEmployeeId) {
        this.updatEmployeeId = updatEmployeeId;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateHostIp() {
        return updateHostIp;
    }

    public void setUpdateHostIp(String updateHostIp) {
        this.updateHostIp = updateHostIp;
    }

    public String getUpdateHostOS() {
        return updateHostOS;
    }

    public void setUpdateHostOS(String updateHostOS) {
        this.updateHostOS = updateHostOS;
    }

    public ArrayList<Nationality> getNationalityList() {
        return nationalityList;
    }

    public void setNationalityList(ArrayList<Nationality> nationalityList) {
        this.nationalityList = nationalityList;
    }

    public ArrayList<Trip> getTripList() {
        return tripList;
    }

    public void setTripList(ArrayList<Trip> tripList) {
        this.tripList = tripList;
    }

    public ArrayList<TripDetail> getTripDetailList() {
        return tripDetailList;
    }

    public void setTripDetailList(ArrayList<TripDetail> tripDetailList) {
        this.tripDetailList = tripDetailList;
    }
    
    
    
    /**
     * Creates a new instance of AddStudentBean
     */
    public AddStudentBean() {
    }
    
    @PostConstruct
    public void init(){   
        
        branchId = sessionBean.getBranchId();
        centerId = sessionBean.getCenterId();
        insertEmployeeId = Integer.parseInt(sessionBean.getUsername());
        
        
        try {
             nationalityList = nationalityDao.getNationalityList();
             tripList = tripDao.getTripList(branchId, centerId);
             tripDetailList = tripDetailDao.getTripList(branchId, centerId, tripId);
             
            } catch (Exception ex) {
            Logger.getLogger(AddStudentBean.class.getName()).log(Level.SEVERE, null, ex);
           }
        } 
    
    public void saveStudent() {
        
        insertEmployeeId = Integer.parseInt(sessionBean.getUsername());
       
        //insertDate = new Timestamp(System.currentTimeMillis());//new Timestamp(date.getTime());
        //new Timestamp(System.currentTimeMillis());
        insertHostIp = sessionBean.getRemoteAddress();
        insertHostOS = sessionBean.getRemoteHost();
        Student student = new Student();
        
        try {
            student.setFirstName(firstName);
            student.setSecondName(secondName);
            student.setThirdName(thirdName);
            student.setFamilyName(familyName);
            student.setBirthDate(birthDate);
            student.setSexId(sexId);
            student.setDateOfJoin(dateOfJoin);
            student.setNationality(nationality);
            student.setNationalityNumber(nationalityNumber);
            student.setPhone(phone);
            student.setWhatsup(whatsup);
            student.setBranchId(branchId);
            student.setCenterId(centerId);
            student.setTripId(tripId);
            student.setStopId(stopId);
            student.setAddressDetails(addressDetails);
            student.setTransportation(transportation);
            student.setInsertEmployeeId(insertEmployeeId);
            student.setInsertDate(insertDate);
            student.setInsertHostIp(insertHostIp);
            student.setInsertHostOS(insertHostOS);
            student.setUpdatEmployeeId(updatEmployeeId);
            student.setUpdateDate(updateDate);
            student.setUpdateHostIp(updateHostIp);
            student.setUpdateHostOS(updateHostOS);
            
            
                addStudentDao.insertStudent(student);
            
        } catch (Exception ex) {
            Logger.getLogger(AddStudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        sessionBean.navigate("/hoffaz/registrar/insertSuccess");
    }
}
