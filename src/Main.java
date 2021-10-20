public class Main {

    public static void main(String [] args) {

        //Наполним одну коробку яблоками, другую коробку апельсинами
        Box<Apple> boxWithApple;
        boxWithApple = new Box<>(new Apple(), new Apple(), new Apple(), new Apple());
        Box<Orange> boxWithOrange = new Box<>(new Orange(), new Orange(), new Orange(), new Orange());

                System.out.println("Коробка яблок №1 весит " + boxWithApple.getWeightBox()); // измеряем вес коробки с яблоками
                System.out.println("Коробка апельсинов №1 весит " + boxWithOrange.getWeightBox());  // измеряем вес коробки с апельсинми

        // Сравниваем массу коробок: true – если их массы равны, false в противоположном случае
      boolean compareBox = boxWithApple.compare(boxWithOrange);
                System.out.println("Сравним массу коробок: true – если их массы равны, false в противоположном случае.");
                System.out.println("Результат: " + compareBox);


        // Создадим вторую коробку с яблоками в которой будет 5 яблок
        Box<Apple> boxWithApple2 = new Box<>(new Apple(), new Apple(), new Apple(), new Apple(), new Apple());
        // Создадим вторую коробку с апельсинами, в которой будет два апельсина
        Box<Orange> boxWithOrange2 = new Box<>(new Orange(), new Orange());
                     System.out.println("А теперь пересыпим яблоки и апельсины из других коробок!");
        //Добавим к первой коробке апельсинов вторую коробку апельсинов
        boxWithOrange.addingBoxOrange(boxWithOrange2);
        boxWithApple.addingBoxApple(boxWithApple2);
        // Проверим сколько весит первая коробка апельсинов, после того как мы пересыпали вторую коробку апельсинов
                    System.out.println("Теперь коробка яблок весит " + boxWithApple.getWeightBox());
                    System.out.println("Теперь коробка апельсинов весит " + boxWithOrange.getWeightBox());

        boolean compareBox2 = boxWithApple.compare(boxWithOrange);
        System.out.println("Сравним массу коробок: true – если их массы равны, false в противоположном случае.");
        System.out.println("Результат: " + compareBox2);



    }






}
