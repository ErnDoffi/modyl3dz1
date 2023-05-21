public class Steel extends Metal{

    Steel(){
        System.out.println("Вы создали сталь, молодец!\n");
    }
    @Override
    public int getEndurance() {
        return 50;
    }
}