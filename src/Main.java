public class Main {
    public static void main(String[] args) {
                task1();
                task2();
                task3();
                task4();
                task5();
                task6();
                task7();
                task8();

            }
            public static void task1 () {
                System.out.println("Задача 1");
                var dog = 8.0;
                var cat = 3.6;
                var paper = 763789;

                System.out.println(dog);
                System.out.println(cat);
                System.out.println(paper);
            }
            public static void task2 () {
                System.out.println("Задача 2");
                var dog = 8.0;
                var cat = 3.6;
                var paper = 763789;

                dog = dog + 4;
                cat = cat + 4;
                paper = paper + 4;

                System.out.println(dog);
                System.out.println(cat);
                System.out.println(paper);

            }
            public static void task3() {
                System.out.println("Задача 3");
                var dog = 8.0 - 3.5;
                var cat = 3.6 - 1.6;
                var paper = 763789 - 7639;

                System.out.println(dog);
                System.out.println(cat);
                System.out.println(paper);
            }
            public static void task4() {
                System.out.println("Задача 4");
                var friend = 19;
                System.out.println(friend);
                friend = friend * 2;
                System.out.println(friend);
                friend = friend / 7;
                System.out.println(friend);
            }
            public static void task5() {
                System.out.println("Задача 5");
                var frog = 3.5;
                System.out.println(frog);
                frog = frog * 10;
                System.out.println(frog);
                frog = frog / 3.5;
                System.out.println(frog);
                frog = frog + 4;
                System.out.println(frog);
            }
            public static void task6() {
                System.out.println("Задача 6");
                var boxer1Weight = 78.2;
                var boxer2Weight = 82.7;
                var totalWeight = boxer1Weight + boxer2Weight;
                System.out.println("Общий вес бойцов " + totalWeight + " кг!");
                var weightDifference = boxer2Weight - boxer1Weight;
                System.out.println("Разница между весами бойцов " + weightDifference + " кг!");
            }
            public static void task7() {
                System.out.println("Задача 7");
                var boxer1Weight = 78.2;
                var boxer2Weight = 82.7;
                var weightDifference = boxer2Weight - boxer1Weight;
                System.out.println("Разница между весами бойцов " + weightDifference + " кг! (использовано вычитание)");
                var weightDifferenceType2 = boxer2Weight % boxer1Weight;
                System.out.println("Разница между весами бойцов " + weightDifferenceType2 + " кг! (использован остаток от деления)");
            }
            public static void task8() {
                System.out.println("Задача 8");
                var totalWorkHours = 640;
                var workHoursPerOneWorker = 8;
                var employees = totalWorkHours / workHoursPerOneWorker;
                System.out.println("Всего работников в компании - " + employees + " человек.");
                employees = employees + 94;
                totalWorkHours = employees * workHoursPerOneWorker;
                System.out.println("Если в компании работает " + employees + " человек, то всего " + totalWorkHours + " часов работы может быть поделено между сотрудниками.");

            }
    }

