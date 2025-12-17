package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Unique;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class AlertSchedule{
    @id
@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String warranty;
    private Integer daysBeforeExpiry;
    private Boolean enabled;

public Long getid(){
    return id;
}
public void setid(long id){
    this.id=id;
}
public String getwarranty(){
 return warranty;

}
public void setwarranty(String warranty){
    this.warranty=warranty;
}

public Integer daysBeforeExpiry(){
 return daysBeforeExpiry;

}
public Integer setdaysBeforeExpiry(Integer daysBeforeExpiry){
    this.daysBeforeExpiry=daysBeforeExpiry;
}public  Boolean getenabled(){
 return enabled;
}
public void setenabled(Boolean enabled){
    this.enabled=enabled;
}

public AlertSchedule(Long id, String warranty,String dayBeforeExpiry,Boolean enabled){
this.id=id;
this.warranty=warranty;
this.daysBeforeExpiry=daysBeforeExpiry;
this.enabled=enabled;

}

public AlertSchedule(){

}
}









