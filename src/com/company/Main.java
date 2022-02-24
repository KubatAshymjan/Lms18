package com.company;

public class Main {

    public static void main(String[] args) {


            Cow cow1= new Cow(" Cows1",1," Male",345);
            Cow cow2= new Cow(" Cows2",6," Male",453);
            Cow cow3= new Cow(" Cows3",4," Male",234);
            Cow cow4= new Cow(" Cows4",3," Male",234);
            Cow cow5= new Cow(" Cows5",2," Male",234);
            Cow[]cows= {cow1,cow2,cow3,cow4,cow5};


            Sheep sheep1= new Sheep(" Koy1 ",2," Famale",23);
            Sheep sheep2= new Sheep(" Koy2 ",3," Famale",54);
            Sheep sheep3= new Sheep(" Koy3 ",5," Famale",24);
            Sheep []sheeps= {sheep1,sheep2,sheep3};

            Horse hourse1= new Horse(" Horses1",8," Кара"," Male",550);
            Horse hourse2= new Horse(" Horses2",7,"  Ак"," Male",450);
            Horse []hourses={hourse1,hourse2};


            Farm farm1=new Farm(" восток - 5 ",cows,hourses,sheeps,"Кара кол ферма ");
            System.out.print(" Адресс фермы "  + farm1.getOwnerName() + farm1.getAddres() + cows.length + hourses.length  +sheeps.length);

            System.out.println(" Бул фермада 3 кой, 5 уй, 2ат бар");


            System.out.println(" Уйлар");
            for (Cow c:cows
            ) {
                System.out.println("Аты "  + c.getNickName() + " Жашы " + c.getAge() + " Жашта" + " Пол" + c.getGender() + " Салмагы " + c.getWheight() + "kг");
            }


            System.out.println(" Койлор");

            for (Sheep s:sheeps
            ) {
                System.out.println(" Аты"  + s.getNickName() + " Жашы " + s.getAge() + " Жашта" + " Пол" + s.getGender() + " Cалмагы" + s.getWheight() + "kг");
            }



            System.out.println(" Аттар");
            for (Horse h:hourses
            ) {
                System.out.println(" Аты" + h.getNickName() + " Жашы" + h.getAge() + " Жашта" + " Тусу" + h.getColor() + " Тусто " + "  " +
                        " Пол" + h.getGender() + " Салмагы " + h.getWheight() + " Кг");

            }
            System.out.println(" --------------------------------------------------------------------------------- ");

            System.out.println(" Бул экинчи ферма");
            Sheep sheep= new Sheep("Кой1 ",4,"Male ",124);
            Sheep []sheep44={sheep};
            Cow cow= new Cow("Кой2 ",8,"Male",354);
            Cow[]cows11= {cow};
            Horse hourse= new Horse("Кой3 ",8,"Кара "," Famale" ,954);
            Horse [] hourses11={hourse};
            Farm farm2= new Farm("Бишкекте",cows11,hourses11,sheep44," Токмокто");

            System.out.println("Адрес фермы "+farm2.getOwnerName()+ farm2.getAddres()+cows11.length+hourses11.length+sheep44.length);

            System.out.println(" Бул фермада 1кой, 1уй, 1 ат бар");

            System.out.println(" Уй ");
            for (Cow c1:cows11
            ) {
                System.out.println("Аты "  + c1.getNickName() + " Жашы" + c1.getAge() + " Жашта" + " Пол" + c1.getGender() + " Салмагы " + c1.getWheight() + "kг");
            }
            System.out.println(" Ат");
            for (Horse h1:hourses11
            ) {
                System.out.println(" Аты" + h1.getNickName() + " Жашы" + h1.getAge() + " Жашта" + " Цвет " + h1.getColor() + " Цвети" + "  " +
                        " Пол" + h1.getGender() + " Салмагы" + h1.getWheight() + " Kг");
            }
            System.out.println(" Кой ");

            for (Sheep s1:sheep44
            ) {
                System.out.println("Аты "  + s1.getNickName() + " Жашы" + s1.getAge() + " Жашта" + " Пол" + s1.getGender() + " Салмагы" + s1.getWheight() + "kг");
            }

        }
}


