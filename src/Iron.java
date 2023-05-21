public class Iron extends Metal {

    Iron(){
        System.out.println("Вы создали железо невероятно\n");
    }

    @Override
    public int getEndurance() {
        return 30;
    }
}
