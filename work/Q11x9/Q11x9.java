package work.Q11x9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q11x9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 車情報
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("RX-7", "MAZDA", 5000000));
        cars.add(new Car("RX-8", "MAZDA", 8000000));
        cars.add(new Car("GT-R R34", "NISSAN", 10000000));

        // 検索キーワードの入力
        System.out.print("検索するキーワード：");
        String keyword = scanner.nextLine();
        System.out.println();

        // 検索
        List<Car> foundCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getCarName().equalsIgnoreCase(keyword) || car.getMaker().equalsIgnoreCase(keyword)) {
                // 一致した場合、車情報をリストに追加
                foundCars.add(car);
            }
        }

        // 結果の表示
        if (!foundCars.isEmpty()) {
            for (Car foundCar : foundCars) {
                System.out.println("車名：" + foundCar.getCarName());
                System.out.println("メーカー名：" + foundCar.getMaker());
                System.out.println("価格：" + foundCar.getPrice());
                if (foundCars.size() > 1) {
                    System.out.println();
                }
            }
        } else {
            System.out.println("検索結果0件");
            System.out.println("検索条件を変えてください。");
        }
    }
}
