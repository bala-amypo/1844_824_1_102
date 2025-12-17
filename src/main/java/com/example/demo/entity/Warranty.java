package com.example.semo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GeneratedType;
import java.time.LocalDate;

@Entity
public class Warranty{
    @idGeneratedValues(strategy=GenerationType.IDENTITY)
private Long id;
private String  user;
private String product;
private String purchaseDate;
private String expiryDate;
private String serialNumber;

public void getid(){
    return id;
}
public void setid(long id){
    this.id=id;
}
public String getuser(){
 return user;

}
public void setuser(String user){
    this.user.user;
}

public String getproduct(){
 return brand;

}
public void setproduct(String product){
    this.product=product;
}public LocalDate getpurchaseDate(){
 return purchaseDate;

}
public void setpurchaseDate(String purchaseDate){
    this.purchaseDate=purchaseDate;
}public String getexpiryDate(){
 return expiryDate;

}
public void setexpiryDate(Local expiryDate){
    this.expiryDate=expiryDate;
}


}













