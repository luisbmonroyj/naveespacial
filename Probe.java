public class Probe extends SpaceShip implements Movement {
    public void move(){}
    public void stop(){} 
    public void rotate(){} 
    public void couple(){} 
    
    public void move(int x, int y, int z){    
        xLocation += x;
        yLocation += y;
        zLocation += z;
    }
    //stops engines
    
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
    public Probe(){}
    public Probe (double mass,double capacity,double thrust,int engines){
        setMass(mass);
        setCapacity(capacity);
        setThrust(thrust);
        setEngines(engines);
    }


}
