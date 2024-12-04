//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        int [][] numberGrid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {0}
        };
        System.out.println(numberGrid[0][1]);
        for (int i = 0; i< numberGrid.length;i++){
            for(int j = 0; j < numberGrid[i].length; j++){
                System.out.print( numberGrid[i][j]);
            }
            System.out.println();
        }
        
    }
}