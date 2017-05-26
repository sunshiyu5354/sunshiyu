package com.zuche;

public class Manned extends zuche{  
    
    private int personCapacity;  
  
    public Manned(int number, String brand, double fee, int personCapacity) {  
          
        super(number, brand, fee);  
        this.personCapacity = personCapacity;  
    }  
      
    public int getPersonCapacity() {  
        return personCapacity;  
    }  
      
    @Override  
    public String toString() {  
        return number + "\t" + brand + "\t" + fee + "Ôª/Ìì\t" + personCapacity + "ÈË\n";  
    }  
      
}  

