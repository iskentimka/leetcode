import java.util.Scanner;

public class RomaHelp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String[] stations = new String[n];
        int index = -1;
        for (int i = 0; i < n; i++) {
            stations[i] = input.nextLine();
            if (stations[i].equals("Bessarion")) {
                index = i;
            }
        }
        if (index != n-1 && index != 0 && index != -1) {
            if (stations[index - 1].equals("Leslie") && stations[index + 1].equals("Bayview"))
                System.out.println("Y");
        } else if (index == n-1 ) {
            if (stations[index - 1].equals("Leslie") || stations[index - 1].equals("Bayview"))
                System.out.println("Y");
        } else if (index == 0) {
            if (stations[index + 1].equals("Leslie") || stations[index + 1].equals("Bayview"))
                System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
    }
}
