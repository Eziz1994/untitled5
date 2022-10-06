public class Switch2 {
    public static void main(String[] args) {

        Directs direct= Directs.RIGHT;
        switch (direct) {
            case LEFT:
                System.out.printf("left"); break;
            case RIGHT:
                System.out.printf("right"); break;
            case UP:
                System.out.printf("up"); break;

            case DOWN:
                System.out.printf("down"); break;

        }


    }
}

enum Directs{LEFT, RIGHT, UP, DOWN}
