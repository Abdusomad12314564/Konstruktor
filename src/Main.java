public class Main {
    public static void main(String[] args) {
        Lion lion =  new Lion(150,2,"Эт жейт");
        Parrot parrot = new Parrot(300, "pipo","Курт кумурскаларды жейт, жем жейт");
        Shark shark=new Shark(1500,6,"Балык жейт");

        System.out.println(lion.getKg()+"кг\n"
        +" Узундугу = "+lion.getLength()
        +" Тамангы = "+lion.getAet());

        System.out.println(shark.getKg()+"кг\n"
                +" Узундугу = "+shark.getLength()
                +" Тамангы = "+shark.getAet());

        System.out.println(parrot.getKg()+"кг\n"
                +" Парода = "+parrot.getParoda()
                +" Тамангы = "+parrot.getAet());
    }
}