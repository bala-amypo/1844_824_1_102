package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GeneratedType;

@Entity
public class User{
    @id
@GeneratedValue(stategy=GenerationType.IDENTITY)
    private long id;
    private String name;
@Column(unique=true)
    private String email;
    private String password;
    private String role;

public Long getid(){
    return id;
}
public void setid(long id){
    this.id=id;
}
public String getname(){
 return name;

}
public void setname(String name){
    this.name=name;
}

public String getemail(){
 return email;

}
public void setemail(String email){
    this.email=email;
}public String getpassword(){
 return password;

}
public void setpassword(String password){
    this.password=password;
}public String getrole(){
 return role;

}
public void setrole(String role){
    this.role=role;
}
public  warranty(Long id, String  user,String product,String purchaseDate, String expiryDate,String serialNumber){
this.id=id;
this.name=name;
this.email.email;
this.purchaseDate=purchaseDate;
this.serialNumber=serialNumber;
this.expiryDate=expiryDate;
}

public warranty(){

}


}