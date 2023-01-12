public class Shuttle extends SpaceShip implements Movement{
    /*
    //setters
    void setMass (double mass){
        super.masa = mass;
    }
    void setCapacity (double capacity){
        super.capacidad = capacity;
    }
    void setThrust (double thrust){
        super.empuje = thrust;
    }
    void setEngines (int engines){
        super.motores = engines;
    }
    //getters
    double getMass (){
        return super.masa;
    }
    double getCapacity (){
        return super.capacidad;
    }
    double getThrust (){
        return super.empuje;
    }
    int getEngines (){
        return super.motores;
    }
     */
    //method overriding

    public void move(){}
    //shuttles don't couple
    public void couple(){}

    //a shuttle displaces only vertically
    public void move(int z){    
        zLocation += z;
    }
    //stops engines
    public void stop(){} 
    //the shuttles don't rotate
    public void rotate(){}
    
    //constructors
    public Shuttle(){}
    public Shuttle (double mass,double capacity,double thrust,int engines){
        setMass(mass);
        setCapacity(capacity);
        setThrust(thrust);
        setEngines(engines);
    }


}
