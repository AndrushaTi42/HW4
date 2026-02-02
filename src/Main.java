void main() {
    System.out.println("Задание №1:");
    int age = 15;
    if (age >= 18) {
        System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
    } else {
        System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
    }
    System.out.println("Задание №2:");
    int temperature = 3;
    if (temperature > 5) {
        System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
    } else {
        System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
    }

    System.out.println("Задание №3:");
    int speed = 55;
    if (speed > 60) {
        System.out.println("Если скорость " + speed + ", то придётся заплатить штраф.");
    } else {
        System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
    }

    System.out.println("Задание №4:");

    boolean ageForKindergarten = age >= 2 && age <= 6;
    if (ageForKindergarten) {
        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
    }
    boolean ageForSchool = age >= 7 && age <= 17;
    if (ageForSchool) {
        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
    }
    boolean ageForUniversity = age >= 18 && age <= 24;
    if (ageForUniversity) {
        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
    }
    boolean ageForWork = age > 24;
    if (ageForWork) {
        System.out.println("Если возраст человека равен " + age + ", то ему пора на работу.");
    }

    System.out.println("Заданиче №5:");
    boolean toddler = age < 5;
    if (toddler) {
        System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
    }
    boolean kid = age >= 5 && age <= 14;
    if (kid) {
        System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
    }
    boolean teenager = age > 14;
    if (teenager) {
        System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослых.");
    }

    System.out.println("Задание №6:");
    int seatingCapacity = 102;
    int seatingPlace = 60;
    int passenger = 55;
    int freePlace = seatingCapacity - passenger;
    if (seatingPlace > passenger) {
        System.out.println("В вагоне есть сидячие места.");
    } else {
        if (seatingCapacity > passenger) {
            System.out.println("В вагоне есть места, но только стоячие.");
        } else {
            System.out.println("В вагоне нет мест.");
        }
    }


    System.out.println("Задание №7:");

    int one = 1;
    int two = 2;
    int three = 3;
    if (one > two && one > three) {
        System.out.println("One наибольшее");
    } else {
        if (two > one && two > three) {
            System.out.println("Two наибольшее");
        } else {
            if (three > one && three > two) {
                System.out.println("Three наибольшее");
            }
        }
    }

}




