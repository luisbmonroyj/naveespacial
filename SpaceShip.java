//package naveespacial;

public abstract class SpaceShip implements Movement{
    //properties variables
    double masa;
    double capacidad;
    double empuje;
    int motores;

    //position variables
    //in km
    double xLocation;
    double yLocation;
    double zLocation;
    //in radians
    double xRotation;
    double yRotation;
    double zRotation;

    //setters
    //mass must be in kilograms
    void setMass (double mass){
        masa = mass;
    }
    //capacity must be in kilograms
    void setCapacity (double capacity){
        capacidad = capacity;
    }
    //thrust must be in kilograms
    void setThrust (double thrust){
        empuje = thrust;
    }
    //engines must be integer
    void setEngines (int engines){
        motores = engines;
    }
    //getters
    double getMass (){
        return masa;
    }
    double getCapacity (){
        return capacidad;
    }
    double getThrust (){
        return empuje;
    }
    int getEngines (){
        return motores;
    }
    
    //marks the relative movement in X,Y,Z coordinates, in km
    public void move(double x, double y, double z){    
        xLocation += x;
        yLocation += y;
        zLocation += z;
    }
    //rotates n radians along X, Y or Z axis
    public void rotate(double twist, char axis){
            switch (axis){
            case 'X':
                xRotation+=twist;
                break;
            case 'Y':
                yRotation+=twist;
                break;
            case 'Z':
                zRotation+=twist;
                break;
        }
    }

    /*
    abstract void setMass (double masa);
    //masa must be in kilograms
    abstract void setCapacity (double capacidad);
    //capacidad must be in kilograms
    abstract void setThrust (double empuje);
    //empuje must be in kilograms
    abstract void setEngines (int motores);
    //motores must be integer
    abstract double getMass ();
    abstract double getCapacity ();
    abstract double getThrust ();
    abstract int getEngines ();
    */
}