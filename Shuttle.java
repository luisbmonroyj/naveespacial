public class Shuttle extends SpaceShip implements Movement{
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
    //method overriding
    
    //moves the ship this relative coordinates
    public void move(int x, int y, int z){    
        xLocation += x;
        yLocation += y;
        zLocation += z;
    }
    //stops engines
    public void stop(){} 
    //rotates n radians along X, Y or Z axis
    public void rotate(double twist, String axis){
            switch (axis){
            case "X":
                xRotation+=twist;
                break;
            case "Y":
                yRotation+=twist;
                break;
            case "Z":
                zRotation+=twist;
                break;
        }
    }

    //constructors
    public Shuttle(){}
    public Shuttle (double mass,double capacity,double thrust,int engines){
        setMass(mass);
        setCapacity(capacity);
        setThrust(thrust);
        setEngines(engines);
    }


}
