## Статика
Статическая переменная - относится к самому классу, а не к его объектам. Не нужно создавать экземпляр.

## Абстрактные классы и интерфейсы
Абстрактные классы - классы для которых нельзя создать экземпляры.

Интерфейс - шаблон по которому описываются контракты на методы из абстрактного класса. У и интерфейса могут быть абстрактные и дефолтные методы. У интерфейсов есть поля (public, static, finally).

Абстрактный класс отличается от интерфейса тем, что в классе есть структура, а в интерфейсе только объявление контрактов.

Интерфейс для контрактов,  Класс - структура.

Задание:
Создать package – factory. Работу продолжаем в нем
Создать класс LionsFactory
Реализовать в нем статический метод для создания коллекции львов с определенным кол-вом в ней:
ArrayList<Lion> createLions (int lionCount)
В методе main создать коллекцию львов и положить её содержимое в клетку. Посмотрите состояние львов, покормите львов в клетке, проверьте изменился ли у них вес.

# Comparable<E>
Сравнивает объекты.
Использует TreeSet and Collections.sort/Array.sort()

TreeSet - использует HashCode.

# Comparator<E>

# Iterator<E>
у итератора есть 2 абстрактных метода(hasNext() and next()).
Iterator<Lion> lionsIterator = lionsList.iteratщr();
while (lionsIterator.hasNext()){
    lion lion = lionIterator.next();
    sout(...);
}

Пример
есть класс итератор, который имплементирует итератор<машины>
public class CarIterator implements Iterator<Car>
private List<Car> cars;
private int cursor;

public CarIterator(List<Car> cars){
    this.cars = cars;
}

@Override
public boolean hasNext(){
    return cursor < cars.size();
}

@Override
public Car next(){
    return cars.get(cursor++);
}

# Iterable<E>
Возвращает итератор

Предполжим есть класс гараж, в нем лист из машин
public class Garage implements Iterable<Car>
Iterator<Lion> lionsIterator = lionsList.iteratщr();
while (lionsIterator.hasNext()){
    lion lion = lionIterator.next();
    sout(...);

@Override
public Iterator<Car> iterator(){
    return new CarIterator(cars);
}

## generic

Параметризованные типы которые дают понять компилятору, что он будет работать с определенным типом.
Создаем класс с неизвестным типом, а его тип определяем потом.

## Wildcard
маска
 постановочный символ, обзначающий неизвестный тип данных. На месте этого символа можно использовать любой тип данных
 Diamond<T> оператор - испольуется при объявлении переменной.

 ClassArrays<? extends Number> byteArray = new ClassArrays<Byte>(); - ограничения по наследнику
 ClassArrays<? super Number> byteArray = new ClassArrays<Number>(); - ограничения по предку
 ClassArrays<?> byteArray = new ClassArrays<Byte>(); - без ограничения
