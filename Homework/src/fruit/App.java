package jiyoo.fruit;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] fruitInfos = {"사과=2000", "딸기=1500", "참외=6700", "키위=2500"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("뭐사누?  ");
        int selectFruit = scanner.nextInt();

        System.out.print("몇개누?  ");
        int selectCount = scanner.nextInt();

        // 과일정보를 어떤 클래스에 넣는다.
        FruitStore fruitStore = new FruitStore(fruitInfos);

        // 그 클래스에서 가격 계산하는 메소드를 불러서 값을 받아온다.
        int receipt = fruitStore.calculate(selectFruit, selectCount);

        // 값을 출력한다.
        System.out.println(receipt + "원 주라겐");
    }
}
