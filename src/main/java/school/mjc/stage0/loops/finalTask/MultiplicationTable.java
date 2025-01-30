package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        if (numberTableToPrint < 0 ){
            return;
        }
        for(int i = 1; i <= 10; i++){
            int multiplication = i * numberTableToPrint;
            System.out.println(numberTableToPrint +  " * " + i + " " + "= " + multiplication);
        }
    }

    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.printTable(6);
    }
}
