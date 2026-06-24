// Интерфейс "Фигура"
interface Фигура {
    double площадь();
}


// Класс "Круг"
class Круг implements Фигура {

    private double радиус;

    public Круг(double радиус) {
        this.радиус = радиус;
    }

    @Override
    public double площадь() {
        return Math.PI * радиус * радиус;
    }
}


// Класс "Квадрат"
class Квадрат implements Фигура {

    private double сторона;

    public Квадрат(double сторона) {
        this.сторона = сторона;
    }

    @Override
    public double площадь() {
        return сторона * сторона;
    }
}


// Главный класс (запуск программы)
public class Main {

    public static void main(String[] args) {

        // создаём объекты фигур
        Фигура круг = new Круг(5);
        Фигура квадрат = new Квадрат(4);

        // вывод площадей
        System.out.println("Площадь круга: " + круг.площадь());
        System.out.println("Площадь квадрата: " + квадрат.площадь());
    }
}

// используется интерфейс → общий контракт
// разные классы реализуют один метод по-разному
// это пример полиморфизма
// запуск идёт через main