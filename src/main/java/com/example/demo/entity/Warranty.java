package com.example.semo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GeneratedType;
import java.time.LocalDate;
@Entity
public class Warranty{
    @id
   @GeneratedValue(stategy=GenerationType.IDENTITY)
private Long id;
private String  user;
private String product;
private String purchaseDate;
private String expiryDate;
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
public LocalDate getpurchaseDate(){
 return purchaseDate;

}
public void setpurchaseDate(LocalDate purchaseDate){
    this.purchaseDate=purchaseDate;
    
}public LocalDate getexpiryDate(){
 return expiryDate;

}
public void setexpiryDate(LocalDate expiryDate){
    this.expiryDate=expiryDate;
}
public String getserialNumber(){
 return serialNumber;

}
public void setserialNumber(String serialNumber){
    this.serialNumber=serialNumber;

}

}













