package com.zuche;

public class Zaihuo extends zuche{  
    
    private double goodCapacity;  
      
    public Zaihuo(int number, String brand, double fee, double goodCapacity) {  
          
        super(number, brand, fee);  
        this.goodCapacity = goodCapacity;  
          
    }  
      
    public double getGoodCapacity(){  
        return goodCapacity;  
    }  
      
    public String toString() {  
        return number +  "\t" + brand + "\t" + fee + "ิช/ฬ์\t" + goodCapacity + "ถึ" + "\n";  
    }  
      
}  
