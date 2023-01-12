public interface Movement {
    //this interface gathers the common methods of spaceships

    public void move(int x, int y, int z); //marks the relative movement in X,Y,Z coordinates, in mm
    public void stop(); //stops engines
    public void rotate(double twist, String axis); //rotates n radians along X, Y or Z axis
    //public void couple(); //couples with another ship or station to make repairs
    
}
