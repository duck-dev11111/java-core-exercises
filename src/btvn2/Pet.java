package btvn2;

public class Pet {
    
    String name;
    String species;
    int hunger;

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
        this.hunger = 50;
    }

    public void eat(String food) {
        if (food.equals("Xương") || food.equals("Cá")) {
            hunger -= 20;
        } else {
            hunger -= 10;
        }
        
        if (hunger < 0) {
            hunger = 0;
        }
    }

    public void play() {
        hunger += 15;
        
        if (hunger > 100) {
            hunger = 100;
        }
    }

    public void checkStatus() {
        System.out.println("Thú cưng: " + name + " | Loài: " + species + " | Độ đói: " + hunger);
        if (hunger > 80) {
            System.out.println("Đang rất đói, hãy cho ăn!");
        }
    }

    public static void main(String[] args) {
        Pet myPet = new Pet("cậu vàng", "Chó");
        
        myPet.play();
        myPet.play();
        
        myPet.eat("Xương");
        
        myPet.checkStatus();
    }
}