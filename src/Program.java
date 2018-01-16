import java.util.Scanner;

class Point {

    public int X;
    public int Y;

    public Point(int x, int y) {
        this.X = x;
        this.Y = y;
    }
}

class ChessHorse {

    public void CheckMove() {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();
        Point horse = new Point(x, y);

        x = s.nextInt();
        y = s.nextInt();
        Point input = new Point(x, y);

        Point[] moves = GetMoves(horse);
        for (int i = 0; i < moves.length; i++) {
            if (moves[i].X == input.X && moves[i].Y == input.Y) {
                System.out.println("Допустимый ход");
                return;
            }
        }

        System.out.println("не допустимый ход");
    }

    private Point[] GetMoves(Point p) {
        Point[] res = new Point[8];
        int count = 0;

        //1
        int x = p.X + 1;
        int y = p.Y - 2;
        if (x < 8 && y >= 0) {
            res[count] = new Point(x, y);
            count++;
        }

        //2
        x = p.X + 2;
        y = p.Y - 1;
        if (x < 8 && y >= 0) {
            res[count] = new Point(x, y);
            count++;
        }

        //3
        x = p.X + 2;
        y = p.Y + 1;
        if (x < 8 && y < 8) {
            res[count] = new Point(x, y);
            count++;
        }

        //4
        x = p.X + 1;
        y = p.Y + 2;
        if (x < 8 && y < 8) {
            res[count] = new Point(x, y);
            count++;
        }

        //5
        x = p.X - 1;
        y = p.Y + 2;
        if (x < 8 && y >= 0) {
            res[count] = new Point(x, y);
            count++;
        }

        //6
        x = p.X - 2;
        y = p.Y + 1;
        if (x < 8 && y >= 0) {
            res[count] = new Point(x, y);
            count++;
        }

        //7
        x = p.X - 2;
        y = p.Y - 1;
        if (x < 8 && y >= 0) {
            res[count] = new Point(x, y);
            count++;
        }

        //7
        x = p.X - 1;
        y = p.Y - 2;
        if (x < 8 && y >= 0) {
            res[count] = new Point(x, y);
            count++;
        }

        return res;
    }
}

public class Program{
    public static void main(String[] args){
        ChessHorse c = new ChessHorse();
        c.CheckMove();
    }
}

