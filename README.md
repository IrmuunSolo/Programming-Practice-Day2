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

Эцэг классын хийсвэр методүүдийг өөртөө тохируулж дахин тодорхойлсон:

- getTotalWeight(): Нийт жин = ачааны багтаамж + машины жин

- getMaxSpeed(): Дээд хурд 100 км/ц

- getAge(): Одоогийн он - үйлдвэрлэсэн он

Run command:

```bash
  java -cp target/car-1.0-SNAPSHOT.jar com.example.Main
```

Main классын гаралт:

![car Screenshot](/images/car_output.png)

## Бодлого 2. LeetCode: Design Parking System

Паркын системийг зохион бүтээх. Паркын газар нь 3 төрлийн parking space-тэй:
1. Big (том)
2. Medium 
3. Small
\
Эдгээр нь тус бүр тогтмол тооны slot-уудтай.

#### ParkingSystem классыг implement хийх

```bash 
    ParkingSystem(int big, int medium, int small)
```
Constructor нь төрөл бүрийн паркын зайны тоог параметрээр авна

    bool addCar(int carType):

метод нь 

* carType (1=big, 2=medium, 3=small) машин парклав уу шалгана

* Хэрэв тухайн төрлийн зай байвал:

   * Зайны тоог 1-ээр бууруулна

   * true буцаана

* Зай дууссан бол false буцаана

    #### Оролт: 
    ["ParkingSystem", "addCar", "addCar", "addCar", "addCar"]
    [[1, 1, 0], [1], [2], [3], [1]]

    #### Гаралт: 
    [null, true, true, false, false]
#### LeetCode-ийн амжилтын screenshot
![car Screenshot](/images/LeetCode.png)

## Бодлого 3. Beecrowd: Employee

ABC компани ажилчдынхаа цалинг дараах хүснэгтэд заасны дагуу нэмэгдүүлэхээр шийдсэн:

| Цалингийн хүрээ   | Өсөлтийн хувь       | 
| :-----------      | :---------- | 
| 0 - 400.00        | 15%         |
| 400.01 - 800.00   | 12%         |
| 800.01 - 1200.00  | 10%         |
| 1200.01 - 2000.00 | 7%         |
| 2000.00-аас дээш  | 4%         |

#### Оролт: 
    Програм нь аравтын 2 оронтой нэг float тоо (цалин) авна.

#### Гаралт:

Novo salario:  means "New Salary"\
Reajuste ganho: means "Money earned"\
Em percentual: means "In percentage"\

![beecrowd output](/images/beecrowdOutput.png)

#### beecrowd-ийн амжилтын screenshot
![beecrowd output](/images/beecrowd.png)

## Хосоороо код бичих: Vehicle классыг өргөтгө (fuel атрибут, refuel функц).

#### vehicle branch үүсгээд доорч өөрчлөлтийг коммит хийв.

Vehicle абстракт классд шинээр дараах атрибутууд нэмсэн:

- fuelLevel - одоогийн түлшний түвшин
- fuelCapacity - түлшний бакын дээд багтаамж

#### refuel() функц:

- Түлш нэмэх логикыг гүйцэтгэнэ
- Хэрэв түлшний хэмжээ багтаамжаас хэтэрвэл зохих мэдэгдэл гаргана
- Түлшний түвшинг шинэчлэнэ

#### Main классын шинэчлэл

- Тээврийн хэрэгслийг үүсгэхдээ түлшний багтаамж зааж өгөх болсон
- refuel() функцийг туршиж үзсэн

    #### Үр дүн: 
![beecrowd output](/images/extendedVehicle.png)