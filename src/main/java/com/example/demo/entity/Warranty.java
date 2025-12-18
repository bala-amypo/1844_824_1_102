package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;
@Entity
public class Warranty{
    @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String  user;
private String product;
private LocalDateTime purchaseDate;
private LocalDateTime expiryDate;
private String serialNumber;

public Long getid(){
    return id;
}
public void setid(long id){
    this.id=id;
}
public String getuser(){
 return user;

}
public void setuser(String user){
    this.user=user;
}

public String getproduct(){
 return product;

}
public void setproduct(String product){
    this.product=product;

}
public LocalDateTime getpurchaseDate(){
 return purchaseDate;

}
public void setpurchaseDate(LocalDateTime purchaseDate){
    this.purchaseDate=purchaseDate;

}public LocalDateTime getexpiryDate(){
 return expiryDate;

}
public void setexpiryDate(LocalDateTime expiryDate){
    this.expiryDate=expiryDate;
}
public String getserialNumber(){
 return serialNumber;

}
public void setserialNumber(String serialNumber){
    this.serialNumber=serialNumber;

}

public  Warranty(Long id, String  user,String product,LocalDateTime purchaseDate, LocalDateTime expiryDate,String serialNumber){
this.id=id;
this.user=user;
this.product=product;
this.purchaseDate=purchaseDate;
this.serialNumber=serialNumber;
this.expiryDate=expiryDate;
}

public Warranty(){
}

}














