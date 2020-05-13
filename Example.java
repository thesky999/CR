public class Example{

    public static void main(String[] args){
        //objects interaction

        User Trevor = new User("Trevor",32);
        User Nora = new User("Nora",20);
        //second object

        //display the object
        Trevor.printUser();
        Nora.printUser();
        //display the second object

        Student Christian = new Student("Christian",30,9);
        Student Unknown = new Student("X",1,9);

        Christian.printStudent();
        Unknown.printStudent();
        
        Animal Shark = new Animal("Baby","Shark");
        Animal Bear = new Animal("Black Bear", "Cub");

        Shark.printAnimal();
        Bear.printAnimal();

        Shark.attacks(Christian);
        Shark.attacks(Unknown);
    }
}