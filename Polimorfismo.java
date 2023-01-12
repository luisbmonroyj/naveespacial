public class Polimorfismo {
    public static void main(String[] args) {
        Shuttle saturnoV = new Shuttle();
        saturnoV.setCapacity(118000.0);
        saturnoV.setEngines(2);
        saturnoV.setThrust(3500000.0);
        saturnoV.setMass(2900000);

        Shuttle energia = new Shuttle (2400000.0, 100000, 3060000, 3);

        System.out.println(saturnoV.getCapacity());
        System.out.println(energia.getMass());
    }
}
