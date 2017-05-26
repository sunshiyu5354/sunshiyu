package com.zuche;

public class Zairh extends zuche{  
	  
    private int personCapacity;  
    private double goodCapacity;  
      
    public Zairh(int number, String brand, double fee, int personCapacity, double goodCapacity) {  
          
        super(number, brand, fee);  
        this.personCapacity = personCapacity;  
        this.goodCapacity = goodCapacity;  
          
    }  
      
    public int getPersonCapacity() {  
        return personCapacity;  
    }  
      
    public double getGoodCapacity(){  
        return goodCapacity;  
    }  
      
    @Override  
    public String toString() {  
        return number +  "\t" + brand + "\t" + fee + "Ôª/Ìì\t" +  
    personCapacity + "ÈË\t" + goodCapacity + "¶Ö\n";  
    }  
}  