public class Sword<T extends Metal> {
    T Material;


    Sword (T m) {
        Material = m;
        System.out.println("Вы создали меч из " + Material.getEndurance() + " да вы чёртов ремесленник!\n");
    }

    public void Test() {
        if (Material.getEndurance() < 49) System.out.println("Меч сломался в бою с охотником на пиратов Зоро... \n" +
                "Из чего ты его вообще делал???\n");
        else System.out.println("Нуууууу... \nМожно и колбасу порезать)\n");
    }
}