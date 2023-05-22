public class HanoiTower {
    public static void move(char a, char b, char c, int rings) {
// откуда, куда, через, сколько колец
        if (rings==1)
            System.out.println(a + " -> " + b);
        else {
            move(a, c, b,rings - 1);
            System.out.println(a + " -> " + b);
            move(c, b, a,rings - 1);
        }
    }
    public static void main(String[] args) {
        move('A', 'C', 'B', 4);
    }
}