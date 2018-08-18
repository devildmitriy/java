package hippodrome;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public Hippodrome(List<Horse>  list){
        this.horses = list;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++  ){
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move(){
        //horses.forEach(Horse::move);
        //вызываем move у каждой лошади
        for (Horse h: horses) {
            h.move();
        }
    }
    public void print(){
        //вызываем print у каждой лошади из списка
        for (Horse h: horses){
            h.print();
        }
        // 10 пустых строк
        for(int i = 0; i < 10; i ++){
            System.out.println();
        }
    }
    public Horse getWinner(){
        Horse c = horses.get(0);
        double d = c.getDistance();
        for (Horse h: horses){
            if (d < h.getDistance()){
                c = h;
                d = h.getDistance();
            }
        }
        return c;
    }
    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String args[]) throws InterruptedException {
        List<Horse> horses = new ArrayList<>();
        horses.add( new Horse("1",3,0));
        horses.add( new Horse("2",3,0));
        horses.add( new Horse("3",3,0));
        game = new Hippodrome(horses);

        game.run();
        game.printWinner();
        // System.out.println(game.getHorses());
    }
}
