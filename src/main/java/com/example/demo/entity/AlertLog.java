package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GeneratedType;
import java.time.LocalDateTime;
@Entity
public class AlertLog{
    @id
@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String warranty;
    private LocalDateTime sentAt;
    private String message;
 

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
public LocalDateTime getsentAt(){
    return sentAt ;
}
public void setsentAt(String sentAt){
    this.sentAt=sentAt;
}
public String getmessage(){
    return id;
}
public void setmessage(String message){
    this.message=message;
}

public AlertLog(Long id, String warranty,LocalDateTime sentAt,String message){
this.id=id;
this.warranty=warranty;
this.sentAt=sentAt;
this.message=message;
}

public AlertLog(){

}
}
