package neu.shravya.javaf;

public class Roomba implements iRobot{

    int[][] room;
    int current_x;
    int current_y;
    final int rowSize;
    final int colSize;
    Main.Direction dir;

    public Roomba(int[][] room){
        this.room = room;
        dir = Main.Direction.DOWN;
        current_x = 0;
        current_y = 0;
        rowSize = room.length;
        colSize = room[0].length;
    }

    @Override
    public boolean move() {
        int x = current_x;
        int y = current_y;
        switch (dir)
        {
            case UP:
                --y;
                break;

            case DOWN:
                ++y;
                break;

            case LEFT:
                --x;
                break;

            case RIGHT:
                ++x;
                break;

        }

        if (x < 0 || x == rowSize || y < 0 || y == colSize || this.room[x][y] == -1)
        {

            return false;
        }

        current_x = x;
        current_y = y;
        return true;
    }

    @Override
    public void turnLeft() {
        switch (dir)
        {
            case UP:
                dir = Main.Direction.LEFT;
                break;

            case DOWN:
                dir = Main.Direction.RIGHT;
                break;

            case LEFT:
                dir = Main.Direction.DOWN;
                break;

            case RIGHT:
                dir = Main.Direction.UP;
                break;

        }
    }

    @Override
    public void turnRight() {
        switch (dir)
        {
            case UP:
                dir = Main.Direction.RIGHT;
                break;

            case DOWN:
                dir = Main.Direction.LEFT;
                break;

            case LEFT:
                dir = Main.Direction.UP;
                break;

            case RIGHT:
                dir = Main.Direction.DOWN;
                break;
        }
    }

    @Override
    public void clean() {
        this.room[current_x][current_y] = 1;
    }
}
