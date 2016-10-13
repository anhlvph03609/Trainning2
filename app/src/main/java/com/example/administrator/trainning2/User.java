package com.example.administrator.trainning2;

/**
 * Created by Administrator on 12/10/2016.
 */
public class User {
  public   int img;
  public  String name;
    public String country;
    User(){

    }
    User(int img, String name,String country){
        this.img = img;
        this.name = name;
        this.country = country;
    }
   public String getName(){
        return this.name;
    }
    public int getImg(){
        return this.img;

    }
}
