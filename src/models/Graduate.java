/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import enums.Operation;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author vmascareno
 */
public class Graduate extends Client {

    private int controlNumber;
    private String name;
    private String career;
    private String egresedAt;
    private String sex;
    private boolean isWorking;
    private String workType;
    private String phoneNumber;
    private String email;
    private String address;

    public Graduate() throws IOException {
        super();
    }

    public Graduate(
            int controlNumber,
            String name,
            String career,
            String egresedAt,
            String sex,
            boolean isWorking,
            String workType,
            String phoneNumber,
            String email,
            String address
    ) throws IOException {
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

    public String getEgresedAt() {
        return egresedAt;
    }

    public void setEgresedAt(String egresedAt) {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
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

    public boolean save() throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        Transaction transaction = new Transaction(Operation.ADD, toString());
        outputStream.writeObject(transaction);

        ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
        return inputStream.readBoolean();
    }

    public boolean update() throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        Transaction transaction = new Transaction(Operation.UPDATE, toString());
        outputStream.writeObject(transaction);

        ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
        return inputStream.readBoolean();
    }

    public void get() throws IOException, ClassNotFoundException {
        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        Transaction transaction = new Transaction(Operation.GET, toString());
        outputStream.writeObject(transaction);

        ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
        String object = inputStream.readUTF();

        if (object.equalsIgnoreCase("")) {
            this.controlNumber = -1;
        } else {
            String[] paramsGraduate = object.split("\t");

            this.name = paramsGraduate[1];
            this.career = paramsGraduate[2];
            this.egresedAt = paramsGraduate[3];
            this.sex = paramsGraduate[4];
            this.isWorking = Boolean.valueOf(paramsGraduate[5]);
            this.workType = paramsGraduate[6];
            this.phoneNumber = paramsGraduate[7];
            this.email = paramsGraduate[8];
            this.address = paramsGraduate[9];
        }
    }

    public boolean delete() throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        Transaction transaction = new Transaction(Operation.DELETE, toString());
        outputStream.writeObject(transaction);

        ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
        return inputStream.readBoolean();
    }

    @Override
    public String toString() {
        return controlNumber + "\t" + name + "\t" + career + "\t" + egresedAt + "\t" + sex + "\t" + isWorking + "\t" + workType + "\t" + phoneNumber + "\t" + email + "\t" + address;
    }
}
