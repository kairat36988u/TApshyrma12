public class Main {
    public static void main(String[] args) {
       University university1 =new University();
       university1.setName("Manas");
       university1.setWhere("BIshkek");
       university1.setWhendidyouopen(2015);

        University university2 =new University();
        university2.setName("Oshtu");
        university2.setWhere("Osh");
        university2.setWhendidyouopen(2017);

        University university3 =new University();
        university3.setName("Batmu");
        university3.setWhere("Batken");
        university3.setWhendidyouopen(2020);

        University [] universities= {university1,university2,university3};

        for (University univer:universities) {
            System.out.println("        University     \n");
            System.out.println(" Name :  " + univer.getName() + "\n Where : " + univer.getWhere() + "\n Whendidyouopen : " + univer.getWhendidyouopen() + "  \n");
        }
        School school1 = new School();
            school1.setName("Sabir  Momunov");
            school1.setWhere("Batken");
            school1.setWhendidyouopen(1995);

            School school2 = new School();
            school2.setName("Lelin");
            school2.setWhere("Batken");
            school2.setWhendidyouopen(1880);

            School school3 = new School();
            school3.setName("Jomart");
            school3.setWhere("Batken");
            school3.setWhendidyouopen(1705);
            School [] schools={school1,school2,school3};

            for (School shcool:schools) {
                System.out.println("         School          ");
                System.out.println(" Name :  " + shcool.getName() + "\n Where : " + shcool.getWhere() + "\n Whendidyouopen : " + shcool.getWhendidyouopen() + "  \n");
            }


        Car car1 = new Car();
        car1.setName(" X 5 ");
        car1.setWhatfirm("BMW");
        car1.setSpeed(200);

        Car car2 = new Car();
        car2.setName(" G T R ");
        car2.setWhatfirm("Bugattui");
        car2.setSpeed(300);

        Car car3 = new Car();
        car3.setName(" Camaro ");
        car3.setWhatfirm(" Chevrolet");
        car3.setSpeed(250);
    Car [] car ={car1,car2,car3};
        for (Car car4:car) {
            System.out.println("         Car       ");
            System.out.println(" Name :  " + car4.getName() + "\n Whatfirm : " + car4.getWhatfirm() + "\n Speed : " + car4.getSpeed() + "  \n");
        }
        Person person1 = new Person();
        person1.setLastname("Nuridinov");
        person1.setName("Kairat");
        person1.setAge(18);
        person1.setGrowth(176);

        Person person2 = new Person();
        person2.setLastname("Altynbekov");
        person2.setName("Nuridin");
        person2.setAge(19);
        person2.setGrowth(180);

        Person person3 = new Person();
        person3.setLastname("Alisherov");
        person3.setName("Kutman");
        person3.setAge(20);
        person3.setGrowth(160);
      Person [] perso5 = {person1,person2,person3};
        for (Person person:perso5) {
            System.out.println("     Person    \n");
            System.out.println(" Lastname :  " + person.getLastname() + "\n Name : " +person.getName() + "\n Age : " + person.getAge()+"\n Growth : "+person.getGrowth());
        }
       }
    }
