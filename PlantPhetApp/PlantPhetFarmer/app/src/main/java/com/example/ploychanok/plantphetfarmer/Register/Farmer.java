package com.example.msiraider.newproject.Register;

/**
 * Created by PC on 6/19/2018.
 */

public class Farmer {
    public String inputemail, inputpassword, inputfirstname, inputlastname, address, district, zipcode, province, phone, product, area, harvest;

    public Farmer(){

    }

    public Farmer(String inputemail, String inputpassword, String inputfirstname, String inputlastname, String address, String district, String zipcode, String province, String phone, String product, String area, String harvest) {
        this.inputemail = inputemail;
        this.inputpassword = inputpassword;
        this.inputfirstname = inputfirstname;
        this.inputlastname = inputlastname;
        this.address = address;
        this.district = district;
        this.zipcode = zipcode;
        this.province = province;
        this.phone = phone;
        this.product = product;
        this.area = area;
        this.harvest = harvest;
    }

    public String getInputemail() {
        return inputemail;
    }

    public void setInputemail(String inputemail) {
        this.inputemail = inputemail;
    }

    public String getInputpassword() {
        return inputpassword;
    }

    public void setInputpassword(String inputpassword) {
        this.inputpassword = inputpassword;
    }

    public String getInputfirstname() {
        return inputfirstname;
    }

    public void setInputfirstname(String inputfirstname) {
        this.inputfirstname = inputfirstname;
    }

    public String getInputlastname() {
        return inputlastname;
    }

    public void setInputlastname(String inputlastname) {
        this.inputlastname = inputlastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getHarvest() {
        return harvest;
    }

    public void setHarvest(String harvest) {
        this.harvest = harvest;
    }
}
