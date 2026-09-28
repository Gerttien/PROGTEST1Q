//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
void main (String[] args){
    String[] gaming={"PSS","XBOX","SWITCH"};
    String[] cities={"cape town","port elisabeth","pretoria"};
    int[][] numbers={{1000,2000,3000},{2000,3000,4000},{1500,1100,1200}};
int total=0;
    System.out.println("------------------------------------------------");
    System.out.println("GAMING CONSOLE REPORT");
    System.out.println("-------------------------------------------");

    System.out.printf("%-18s","  ");
    for(int i=0;i< gaming.length;i++) {
        System.out.printf("%-18s",gaming[i]);
    }
    System.out.println();

    for(int p=0;p< cities.length;p++) {
        System.out.printf("%-18s", cities[p]);
        for (int e = 0; e < numbers[p].length; e++) {
            System.out.printf("%-18s", numbers[p][e]);
            total=numbers[p][0]+numbers[p][e];
            System.out.println(cities[p]+" "+total);
        }
        System.out.println();

    }
    System.out.println("---------------------------------------------------");
    System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
    System.out.println("---------------------------------------------------------");
    System.out.println("CAPE TOWN");
    System.out.println("PORT ELIZABETH");
    System.out.println("PRETORIA");
    System.out.println();
    System.out.println("CITY WITH THE MOST SALES:PORT ELIZABETH");
    System.out.println("----------------------------------------------------");
    }

}

