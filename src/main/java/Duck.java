public class Duck extends Pet {
    String name;

    @Override
    public String Speak(){
        return "Quack";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name;
    }
}
