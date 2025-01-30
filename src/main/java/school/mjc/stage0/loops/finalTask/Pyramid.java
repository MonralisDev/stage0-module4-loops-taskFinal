package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Друкуємо пробіли перед числами
            for (int j = 0; j < cathetusLength - i; j++) {
                System.out.print("  ");
            }
            // Друкуємо першу половину чисел
            for (int j = i; j > 1; j--) {
                System.out.print(j + " ");
            }
            // Друкуємо другу половину чисел
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Перехід на новий рядок
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
