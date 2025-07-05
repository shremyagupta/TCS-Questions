import java.util.Scanner;
public class tcs3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start days ");
        String startDay = sc.next().toLowerCase();
        System.out.println("enter no of days in the month");
        int n = sc.nextInt();
        String[] days={"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
        int startIndex = 0;
        for(int i = 0; i<7; i++){
            if(days[i].equals(startDay))
        {
                startIndex = i;
                break;
            }
        }
        int daysUntilSunday = (7- startIndex)%7;
        int remainingDays = n - daysUntilSunday;
        int sundays = 0;
        if(n>= daysUntilSunday){
            sundays = 1 + remainingDays / 7;
        }
        else if(daysUntilSunday == 0){
            sundays = 1+(n-1)/7;
        }
        System.out.println("No. of sundays" + sundays);
        }
        }

