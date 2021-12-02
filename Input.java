import java.util.Scanner;
public class Input {
    
    public Input(){}

    public void printReminder(){
        System.out.println("");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("Reminder:");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("Format -> [x, y]");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("Where -> x = row index & y = col index");
        System.out.println("");
    }

    public int checkNIntInput(int len){
        printReminder();
        System.out.print("\t\t\t\t\t\t");
        System.out.println("Please select initial coordinates.");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("Where does the knight start?");
        Scanner sc = new Scanner(System.in);
        int n = -1;
        while(n >= len || n < 0){
          System.out.println("");
            System.out.print("\t\t\t\t\t\t[*] Please enter Row Index: ");
          try{ 
            String line = sc.nextLine();
            n = Integer.parseInt(line);
          } catch(NumberFormatException e){
            System.out.println("");
            System.out.println("\t\t\t\t\t\t[Error] Incorrect input, please input a number beetween 0 and 7.");
          }
        }
        return n;
    }

    public int checkMIntInput(int len){
        Scanner sc = new Scanner(System.in);
        int n = -1;
        while(n >= len || n < 0){
          System.out.println("");
            System.out.print("\t\t\t\t\t\t[*] Please enter Col Index: ");
          try{ 
            String line = sc.nextLine();
            n = Integer.parseInt(line);
          } catch(NumberFormatException e){
            System.out.println("");
            System.out.println("\t\t\t\t\t\t[Error] Incorrect input, please input a number beetween 0 and 7.");
          }
        }
        return n;
    }

    public int checkN2IntInput(int len){
        printReminder();
        System.out.print("\t\t\t\t\t\t");
        System.out.println("Please select the final coordinates.");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("Where should the knight go?");
        Scanner sc = new Scanner(System.in);
        int n = -1;
        while(n >= len || n < 0){
          System.out.println("");
            System.out.print("\t\t\t\t\t\t[*] Please enter Row Index: ");
          try{ 
            String line = sc.nextLine();
            n = Integer.parseInt(line);
          } catch(NumberFormatException e){
            System.out.println("");
            System.out.println("\t\t\t\t\t\t[Error] Incorrect input, please input a number beetween 0 and 7.");
          }
        }
        return n;
    }

    public int checkM2IntInput(int len){
        Scanner sc = new Scanner(System.in);
        int n = -1;
        while(n >= len || n < 0){
          System.out.println("");
            System.out.print("\t\t\t\t\t\t[*] Please enter Col Index: ");
          try{ 
            String line = sc.nextLine();
            n = Integer.parseInt(line);
          } catch(NumberFormatException e){
            System.out.println("");
            System.out.println("\t\t\t\t\t\t[Error] Incorrect input, please input a number beetween 0 and 7.");
          }
        }
        return n;
    }

}
