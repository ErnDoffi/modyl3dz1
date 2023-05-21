public class test {
    public static void main(String [] args){

        Steel steel = new Steel();

        Sword<Steel> SteelMech = new Sword<>(steel);

        SteelMech.Test();


        Copper copper = new Copper();

        Sword<Copper> CopperMech = new Sword<>(copper);

        CopperMech.Test();
    }
}