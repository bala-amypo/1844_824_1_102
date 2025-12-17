package com.example.semo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GeneratedType;

@Entity
public class Product{
    @idGeneratedValues(strategy=GenerationType.IDENTITY)
private Long id;
private String  name;
private String brand;
private String modelNumber;
private String category;

public void getid(){
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

public String getbrand(){
 return brand;

}
public void setbrand(String brand){
    this.brand=brand;
}public String getmodelNumber(){
 return modelNumber;

}
public void setmodelNumber(String modelNumber){
    this.modelNumber=modelNumber;
}public String getcategory(){
 return category;

}
public void setcategory(String category){
    this.category=category;
}


}