# 2-р өдөр. Удамшил ба полиморфизм

Зорилго: Удамшил, полиморфизмын дадлага хийх.


## Бодлого 1. W3Resource: Vehicle Class

Vehicle классыг Car, Truck дэд классуудтай бичсэн ба Vehicle abstract класс нь тээврийн хэрэгслийн үндсэн мэдээллийг хадгалж,  дараах abstract функц, хувьсагчийг агуулна.

```java 
    private String creator;
    private String model;
    private int year;
    private float ownWeight;
```

- public abstract float getTotalWeight();
- public abstract int getMaxSpeed();
- public abstract int getAge();

#### Car класс  
- seatNum (Суудлын тоо)

Эцэн классын хийсвэр методүүдийг өөртөө тохируулж дахин тодорхойлсон:

- getTotalWeight(): Нийт жин = (суудлын тоо * 70кг) + машины жин
- getMaxSpeed(): Дээд хурд 150 км/ц
- getAge(): Одоогийн он - үйлдвэрлэсэн он


#### Truck класс

- cargoCapacity (Ачааны багтаамж)

Эцэн классын хийсвэр методүүдийг өөртөө тохируулж дахин тодорхойлсон:

- getTotalWeight(): Нийт жин = ачааны багтаамж + машины жин

- getMaxSpeed(): Дээд хурд 100 км/ц

- getAge(): Одоогийн он - үйлдвэрлэсэн он

Run command:

```bash
  java -cp target/car-1.0-SNAPSHOT.jar com.example.Main
```

Main классын гаралт:

![car Screenshot](/images/car_output.png)
