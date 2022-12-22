interface shranya{
    public void display();
}
class Bot{
    void Man(){
        System.out.println("Hi shranya here");
        System.out.println("I am new Method here");
    }
}
class override extends Bot implements shranya{
    public void display(){
        System.out.println("Dodiya here");
        System.out.println("I am override Method here");
    }
    public static void main(String[] args){
        override b = new override();
        b.display();
        b.Man();
    }
}