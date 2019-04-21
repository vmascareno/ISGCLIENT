/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.IOException;
import java.util.Date;

/**
 *
 * @author vmascareno
 */
public class Graduate extends Client {

    private int controlNumber;
    private String name;
    private String career;
    private Date egresedAt;
    private String sex;
    private boolean isWorking;
    private String workType;
    private int phoneNumber;
    private String email;
    private String address;

    public Graduate(int controlNumber, String name, String career, Date egresedAt, String sex, boolean isWorking, String workType, int phoneNumber, String email, String address) throws IOException {
        super();
        this.controlNumber = controlNumber;
        this.name = name;
        this.career = career;
        this.egresedAt = egresedAt;
        this.sex = sex;
        this.isWorking = isWorking;
        this.workType = workType;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public int getControlNumber() {
        return controlNumber;
    }

    public void setControlNumber(int controlNumber) {
        this.controlNumber = controlNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public Date getEgresedAt() {
        return egresedAt;
    }

    public void setEgresedAt(Date egresedAt) {
        this.egresedAt = egresedAt;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isIsWorking() {
        return isWorking;
    }

    public void setIsWorking(boolean isWorking) {
        this.isWorking = isWorking;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return controlNumber + "\t" + name + "\t" + career + "\t" + egresedAt + "\t" + sex + "\t" + isWorking + "\t" + workType + "\t" + phoneNumber + "\t" + email + "\t" + address;
    }

}
