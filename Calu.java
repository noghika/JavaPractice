import java.util.Scanner;

class Calu {
    public static void main(String[] args){

        // int[] array = new int[100];

        Scanner scanner = new Scanner(System.in);

        System.out.print("数字を入力するぶえ！");
        
        int i;
        // int inputNumber = scanner.nextInt();
        String inputString = scanner.next();

        // for(i = 0; i <= 99; i++) {
        for(i = 10; 0 < i; i-- ) {
            // System.out.println("ぶえが" + i + "頭いるぶえ！");
            // sayBueBue();
            // getResult("さとさと");
            System.out.println(getResult(inputString) + "が" + i + "頭いるぶえ！");
            
        }

        // Int inputNumber = scanner.nextInt();

        // System.out.println(result);

        // String hikapon = scanner.next();

        scanner.close();

        // System.out.println(satosato + buebue + "" + hikapon + buebue);
    }

    public static String getResult(String inputString) {
        String result = "";

        switch(inputString){
            case "さとさと":
                result = "さとンゴ！";
                break;
            case "ひかひか":
                result = "ひかンゴ！"; 
                break;
            default:
                result = "ぶえンゴ！";

        }

        return result;
    }

    public static void sayBueBue() {
        System.out.println("ぶえぶえぶえーーー！");
    }

}