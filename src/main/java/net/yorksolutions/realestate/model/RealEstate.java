package net.yorksolutions.realestate.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
//allows us to create the model to connect to the table and modify things in a java way
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties
public class RealEstate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty
    Long id;

    @JsonProperty
    String fname;

    @JsonProperty
    String lname;

    @JsonProperty
    String yrblt;

    @JsonProperty
    boolean isnew;

    @JsonProperty
    int sqft;

    @JsonProperty
    int baths;

    @JsonProperty
    int beds;

    @JsonProperty
    String street;

    @JsonProperty
    String city;

    @JsonProperty
    String State;

    @JsonProperty
    int zip;

    @JsonProperty
    int price;

    @JsonProperty
    int phone;

    @JsonProperty
    String listing;

    @JsonProperty
    String imgurl;



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public Long getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getYrblt() {
        return yrblt;
    }

    public void setYrblt(String yrblt) {
        this.yrblt = yrblt;
    }

    public boolean isIsnew() {
        return isnew;
    }

    public void setIsnew(boolean isnew) {
        this.isnew = isnew;
    }

    public int getSqft() {
        return sqft;
    }

    public void setSqft(int sqft) {
        this.sqft = sqft;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getBaths() {
        return baths;
    }

    public void setBaths(int baths) {
        this.baths = baths;
    }

    public String getListing() {
        return listing;
    }

    public void setListing(String listing) {
        this.listing = listing;
    }
}
