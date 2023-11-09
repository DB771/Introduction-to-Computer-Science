public class Dog {

    private int age;
    private String breed;

    public Dog(int age, String breed) {
        this.age = age;
        this.breed = breed;
    }

    public int getAge() {
        return this.age;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String toString() {
        return "The dog's breed is " + breed + " and its age is " + age;
    }

    public boolean equals(String breed) {
        return this.breed.equals(breed);
    }

    public int compareTo(Dog other) {
        if (this.age < other.getAge()) {
            return -1;
        }
        else if (this.age > other.getAge()) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
