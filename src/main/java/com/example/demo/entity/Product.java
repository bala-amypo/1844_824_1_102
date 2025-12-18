// package com.example.semo.entity;
// import jakarta.persistence.Entity;
// import jakarta.persistence.Id;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;

// @Entity
// public class Product{
//     @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
// private Long id;
// private String  name;
// private String brand;
// private String modelNumber;
// private String category;

// public Long getid(){
//     return id;
// }
// public void setid(long id){
//     this.id=id;
// }
// public String getname(){
//  return name;

// }
// public void setname(String name){
//     this.name=name;
// }

// public String getbrand(){
//  return brand;

// }
// public void setbrand(String brand){
//     this.brand=brand;
// }public String getmodelNumber(){
//  return modelNumber;

// }
// public void setmodelNumber(String modelNumber){
//     this.modelNumber=modelNumber;
// }public String getcategory(){
//  return category;

// }
// public void setcategory(String category){
//     this.category=category;
// }

// public Product(Long id, String name,String brand,String modelNumber, String category){
// this.id=id;
// this.name=name;
// this.brand=brand;
// this.modelNumber=modelNumber;
// this.category=category;

// }

// public Product(){

// }
// }