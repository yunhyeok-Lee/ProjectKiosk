<!--Heading-->
# 💡 Kiosk 과제
## 프로젝트 구성
🔎 Lv 1 ~ Lv 5 의 단계로 구성되어있다. 각 조건에 맞는 기능을 추가해 보았습니다.
##  개발 기간
⏰ 2025.03.07(금) ~ 2025.03.14(금)

### 🎈 Lv 1 Kiosk
<!--Quote-->
> 1. 햄버거 메뉴 출력 및 선택하기
> 2. 실행 시 햄버거 메뉴가 표시되고, Scanner로 숫자를 입력받아 메뉴 선택
> 3. 제시된 메뉴 중 입력받은 숫자에 따라 다른 로직을 실행하는 코드를 작성
> 4. 반복문을 이용해서 특정 번호가 입력되면 프로그램 종료

햄버거 메뉴를 적어 출력해보았습니다.
```java
System.out.println("[ SHAKESHACK MENU ] ");
            System.out.println("1. ShackBuger   | W 6.9 |  토마토, 양상추, 쉑소스가 토핑된 치즈버거" );
            System.out.println("2. SmokeShack   | W 8.9 |  베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheesebuger  | W 6.9 |  포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger    | W 5.4 |  비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료    | 종료");
```
Scanner로 숫자를 입력 받게 만들었습니다.
```java
Scanner scanner = new Scanner(System.in);
```
입력 받은 숫자로 메뉴를 선택하기 위해서 switch 문을 사용했습니다.
```java
 switch (number){
                case 1:
                    System.out.println("1. ShackBuger   | W 6.9 |  토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                    break;
                case 2:
                    System.out.println("2. SmokeShack   | W 8.9 |  베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                    break;
                case 3:
                    System.out.println("3. Cheesebuger  | W 6.9 |  포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                    break;
                case 4:
                    System.out.println("4. Hamburger    | W 5.4 |  비프패티를 기반으로 야채가 들어간 기본버거 ");
                    break;

            }
```
끝부분에 숫자 '0' 을 입력하면 반복문이 종료하기 위해 if 문으로 조건을 주고 break를 활용해서 반복문을 종료했습니다.
```java
if (number == 0){
                System.out.println("주문을 종료합니다.");
                break;
            }
```
### 🎈 Lv 2 Kiosk
<!--Quote-->
> 1. MenuItem 클래스 생성하기
  1) 개별음식 항목을 관리하는 클래스
  2) 클래스는 이름, 가격, 설명 필드를 가진다.
> 2. main 함수에서 MenuItem 클래스를 활용하여 햄버거 메뉴 출력
> 3. List를 선언하여 여러 MenuItem 추가
> 4. 반복문을 활용해 menuItem 을 탐색하면서 하나씩 접근

 MenuItem 클래스를 생성해서 속성 부분에 이름, 가격, 설명 필드를 생성하였습니다.

```java
public class MenuItem {
    // 속성
    public String name;
    public double price;
    public String description;
```
Main 클래스에 활용하기 위해 생성자를 생성
```java
// 생성자
    MenuItem(String name, double price, String description){
        this.name = name;
        this.price = price;
        this.description = description;
    }
```
MenuItem 클래스를 활용해서 햄버거 메뉴를 List 선언하여 추가했습니다.
```java
List<MenuItem> menuItems = new ArrayList<>();
menuItems.add(new MenuItem("ShackBuger",6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
menuItems.add(new MenuItem("SmokeShack",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
menuItems.add(new MenuItem("Cheesebuger",6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
menuItems.add(new MenuItem("Hamburger", 5.4,"비프패티를 기반으로 야채가 들어간 기본버거"));
```
반복문과 조건문을 활용해 menuItems 에 접근했습니다.
```java
while(true){
            System.out.println("[ SHAKESHACK MENU ] ");
            System.out.println("1. ShackBuger   | W 6.9 |  토마토, 양상추, 쉑소스가 토핑된 치즈버거" );
            System.out.println("2. SmokeShack   | W 8.9 |  베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheesebuger  | W 6.9 |  포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger    | W 5.4 |  비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료    | 종료");

            int number = scanner.nextInt();
            scanner.nextLine();

            switch (number){
                case 1:
                    System.out.println("선택한 메뉴 : " + menuItems.get(0).getName() + "   | W " + menuItems.get(0).getPrice() + " |   " + menuItems.get(0).getDescription());
                    // menuItem.get(0); 으로만 해서 soutv 했을땐, kiosk_lv2.lv2.MenuItem@52cc8049 와 같이 나왔음. >>  @~~~ 주소를 나타낸다.
                    break;
                case 2:
                    System.out.println("선택한 메뉴 : " + menuItems.get(1).getName() + "   | W " + menuItems.get(1).getPrice() + " |   " + menuItems.get(1).getDescription());
                    break;
                case 3:
                    System.out.println("선택한 메뉴 : " + menuItems.get(2).getName() + "   | W " + menuItems.get(2).getPrice() + " |   " + menuItems.get(2).getDescription());
                    break;
                case 4:
                    System.out.println("선택한 메뉴 : " + menuItems.get(3).getName() + "   | W " + menuItems.get(3).getPrice() + " |   " + menuItems.get(3).getDescription());
                    break;

            }

            if (number == 0){
                System.out.println("주문을 종료합니다.");
                break;
            }
```

### 🎈 Lv 3 Kiosk
<!--Quote-->
> 1. Kiosk 클래스 생성하기 : 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스
> 2. MenuItem을 관리하는 리스트가 필드로 존재
> 3. main 함수에서 관리하던 입력과 반복문 로직은 이제 start 함수를 만들어 관리
> 4. List<MenuItem> menuItem 은 Kiosk 클래스 생성자를 통해 값을 할당
> 5. Kiosk 객체를 생성하고 사용하는 main 함수에서 객체를 생성할 때 값을 넘겨준다.

MenuItem 을 관리하는 리스트를 만들어줍니다.
```java
List<MenuItem> menuItems = new ArrayList<>();
```
메서드 부분에 start 함수를 만들어주고 반복문을 활용
start 함수 반복문 while 안에 main 매서드에 있던메뉴의 내용을 가져와서 반복
```java
void start(){
           while(true){
               System.out.println("[ SHAKESHACK MENU ] ");
               System.out.println("1. ShackBuger   | W 6.9 |  토마토, 양상추, 쉑소스가 토핑된 치즈버거" );
               System.out.println("2. SmokeShack   | W 8.9 |  베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
               System.out.println("3. Cheesebuger  | W 6.9 |  포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
               System.out.println("4. Hamburger    | W 5.4 |  비프패티를 기반으로 야채가 들어간 기본버거");
               System.out.println("0. 종료    | 종료");
```
number = scanner.nextInt(); 로 지정해서 다음에 오는 switch 값에서 number 값을 입력해 출력
```java
int number = scanner.nextInt();
scanner.nextLine();
```

switch 문을 활용해서 번호를 입력 했을 때, 선택한 메뉴의 내용이 나오도록 설정
```java
switch (number){
    case 1:
    case 2:
    case 3:
    case 4:
    }
```
MenuItem 클래스 메서드 부분을 게터로 불러와서 사용
```java
System.out.println("선택한 메뉴 : " + menuItems.get(0).getName() + "   | W " + menuItems.get(0).getPrice() + " |   " + menuItems.get(0).getDescription());
System.out.println("선택한 메뉴 : " + menuItems.get(1).getName() + "   | W " + menuItems.get(1).getPrice() + " |   " + menuItems.get(1).getDescription());
System.out.println("선택한 메뉴 : " + menuItems.get(2).getName() + "   | W " + menuItems.get(2).getPrice() + " |   " + menuItems.get(2).getDescription());
System.out.println("선택한 메뉴 : " + menuItems.get(3).getName() + "   | W " + menuItems.get(3).getPrice() + " |   " + menuItems.get(3).getDescription());
```
그리고 break 를 활용해 switch문을 빠져나오게 설정

마지막 부분에 숫자 "0" 을 넣으면 주문을 종료하게 설정
```java
if (number == 0){
    System.out.println("주문을 종료합니다.");
    break;
}
```
Main 클래스에서 start를 실행
```java
package kiosklv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<MenuItem> menuItems = new ArrayList<>();
        Kiosk kiosk = new Kiosk();
        kiosk.start();

   }
}
```
### 🎈 Lv 4 Kiosk
<!--Quote-->
> 1. Menu 클래스 생성
> 2. MenumItem 클래스를 관리하는 클래스
> 3. List<MenuItem> 은 Kiosk 클래스가 관리하기에 적절하지 않으므로 Menu 클래스가 관리하도록 변경
> 4. 여러 버거들을 포함하는 상위 개념 '버거' 같은 카테고리 이름 필드 생성
> 5. 메뉴 카테고리 이름을 반환하는 메서드를 구현

Menu 클래스 생성
Kiosk 클래스가 관리하던 List<MenuItem>을 Menu 클래스로 변경
```java
public class Menu {
    List<MenuItem> menuItems;}

Menu() {
    menuItems = new ArrayList<>(); // menuItem 리스트를 초기화 시킨다.  (초기화 하지않고 실행 했더니 오류가 발생)
    menuItems.add(new MenuItem("ShackBuger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
    menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
    menuItems.add(new MenuItem("Cheesebuger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
    menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
```

상위 카테고리인 MenuCategory 생성
```java
List<String> menuCategory;
menuCategory = new ArrayList<>(); 
menuCategory.add("Burgers");
menuCategory.add("Drinks");
menuCategory.add("Desserts");
```
메뉴 카테고리 이름을 메서드로 구현해 return 값으로 구현
```java
List<MenuItem> getMenuItems(){
    return this.menuItems;
}
List<String> getMenuCategory(){
    return this.menuCategory;
}
```
Kiosk 클래스로 넘어가 새로만든 상위 카테고리를 실행시키기 위해 start 함수 매서드에 구현을 해줍니다.
while 문 안쪽 상단에 구현을 해주었습니다.
for 문을 사용해서 List를 활용해 작성을 해주었습니다.
```java
System.out.println(" ");
System.out.println("[ MAIN MENU ]");
List<String> category = menu.getMenuCategory();
for (int i = 0; i < category.size(); i++) {
    System.out.println((i + 1) + ". " + category.get(i));
}
```
버거 메뉴도 새롭게 작성
```java
if (number1 == 1) {
    System.out.println(" ");
    System.out.println("[ BURGERS MENU ]");
    List<MenuItem> burgers = menu.getMenuItems();
    for (int i = 0; i < burgers.size(); i++) {
        System.out.println((i + 1) + ". " + burgers.get(i).getName() + "   | W " + burgers.get(i).getPrice() + " |   " + burgers.get(i).getDescription());
    }
    System.out.println("0. 종료    | 종료");
```
버거 메뉴 선택을 switch 문으로 사용했고, number2를 입력해 구현
```java
switch (number2) {
    case 1:
        System.out.println("선택한 메뉴 : " + burgers.get(0).getName() + "   | W " + burgers.get(0).getPrice() + " |   " + burgers.get(0).getDescription());
        // menuItem.get(0); 으로만 해서 soutv 했을땐, kiosk_lv2.lv2.MenuItem@52cc8049 와 같이 나왔음. >>  @~~~ 주소를 나타낸다.
        break;
    case 2:
        System.out.println("선택한 메뉴 : " + burgers.get(1).getName() + "   | W " + burgers.get(1).getPrice() + " |   " + burgers.get(1).getDescription());
        break;
    case 3:
        System.out.println("선택한 메뉴 : " + burgers.get(2).getName() + "   | W " + burgers.get(2).getPrice() + " |   " + burgers.get(2).getDescription());
        break;
    case 4:
        System.out.println("선택한 메뉴 : " + burgers.get(3).getName() + "   | W " + burgers.get(3).getPrice() + " |   " + burgers.get(3).getDescription());
        break;

}
if (number2 == 0) {
    System.out.println("주문을 종료합니다.");
    break;
```

### 🎈 Lv 5 Kiosk
<!--Quote-->
> 1. MenuItem, Menu 그리고 Kiosk 클래스의 필드에 직접 접근하지 못하도록 설정
> 2. Getter, Setter 메서드를 사용해 데이터를 관리

Menu 클래스에 public 으로 지정되어있던 내용을 private로 변경하여 캡슐화 진행
 ```java
public class Menu {
    private List<MenuItem> menuItems;
    private List<String> menuCategory;
    private List<MenuItem> drinkMenu = new ArrayList<>();
    private List<MenuItem> dessertsMenu = new ArrayList<>();
```
게터 사용
```java
List<MenuItem> getMenuItems(){
    return this.menuItems;
}
List<String> getMenuCategory(){
    return this.menuCategory;
}
List<MenuItem> getDessertsMenu(){
    return this.dessertsMenu;
}
List<MenuItem> getDrinkMenu(){
    return this.drinkMenu;
}
```
캡슐화를 진행하며, 상위 카테고리에 공백으로 존재하던 Drink 와 Dessert부분에 메뉴 생성
```java
drinkMenu = new ArrayList<>();
drinkMenu.add(new MenuItem("Coke", 1.5,"콜라"));
drinkMenu.add(new MenuItem("Sprite", 1.5, "스프라이트"));
drinkMenu.add(new MenuItem("Fanta",1.5,"환타"));
drinkMenu.add(new MenuItem("MountainDew",1.5,"마운틴듀"));

dessertsMenu = new ArrayList<>();
dessertsMenu.add(new MenuItem("IceCream",2.0,"소프트콘"));
dessertsMenu.add(new MenuItem("OnionRing",3.0,"달달한 어니언링(5개입)"));
dessertsMenu.add(new MenuItem("Cookie",3.0,"촉촉한 쿠키(5개입)"));
dessertsMenu.add(new MenuItem("ChickenNugget",4.0,"바삭한 치킨너겟(6개입)"));
```
MenuItem 클래스 또한 같은 작업 진행
```java
private String name;
private double price;
private String description;

String getName(){
        return this.name;   // 이전에 getName으로 구현하고 오류가남! main 클래스에서 무한 반복이 발생 >> getName , name 부분을 반복
    }
    double getPrice(){
        return this.price;
    }
    String getDescription(){
        return this.description;
    }
}
```

Kiosk 클래스에 새롭게 추가한 Drink 와 Dessert 메뉴에 대한 내용 구현
```java
List<MenuItem> drinks = menu.getDrinkMenu();
List<MenuItem> desserts = menu.getDessertsMenu();

if (number == 1) {
    System.out.println(" ");
    System.out.println("[ BURGERS MENU ]");
    for (int i = 0; i < burgers.size(); i++) {
        System.out.println((i + 1) + ". " + burgers.get(i).getName() + "   | W " + burgers.get(i).getPrice() + " |   " + burgers.get(i).getDescription());
    }
    System.out.println("0. 뒤로가기");

    int menuNumber = scanner.nextInt();
    scanner.nextLine();

    if (menuNumber >= 1 && menuNumber <= burgers.size()) {
        System.out.println("선택한 메뉴 : " + burgers.get(menuNumber - 1).getName() + "   | W " + burgers.get(menuNumber - 1).getPrice() + " |   " + burgers.get(menuNumber - 1).getDescription());
    }
 else if (number == 2) {
    System.out.println(" ");
    System.out.println("[ DRINK MENU ]");
    for (int i = 0; i < drinks.size(); i++) {
        System.out.println((i + 1) + ". " + drinks.get(i).getName() + "   | W " + drinks.get(i).getPrice() + " |   " + drinks.get(i).getDescription());
    }
    System.out.println("0. 뒤로가기");

    int menuNumber = scanner.nextInt();
    scanner.nextLine();

    if (menuNumber >= 1 && menuNumber <= drinks.size()) {
        System.out.println("선택한 메뉴 : " + drinks.get(menuNumber - 1).getName() + "   | W " + drinks.get(menuNumber - 1).getPrice() + " |   " + drinks.get(menuNumber - 1).getDescription());
    }
 else if (number == 3) {
    System.out.println(" ");
    System.out.println("[ DESSERT MENU ]");
    for (int i = 0; i < desserts.size(); i++) {
        System.out.println((i + 1) + ". " + desserts.get(i).getName() + "   | W " + desserts.get(i).getPrice() + " |   " + desserts.get(i).getDescription());
    }
    System.out.println("0. 뒤로가기");

    int menuNumber = scanner.nextInt();
    scanner.nextLine();

    if (menuNumber >= 1 && menuNumber <= desserts.size()) {
        System.out.println("선택한 메뉴 : " + desserts.get(menuNumber - 1).getName() + "   | W " + desserts.get(menuNumber - 1).getPrice() + " |   " + desserts.get(menuNumber - 1).getDescription());
    }
```
switch 문을 사용해 메뉴를 선택하고 있었지만, else-if 문으로 변경하여 구현
Main 클래스에서 실행
```java
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        List<MenuItem> menuItems = new ArrayList<>();
        Kiosk kiosk = new Kiosk();
        kiosk.start();
   }
}
```

## 마무리
- 메서드 return 값이 getName이면 생성자 부분 this.name=name; 받고 다시 getName을 받고 하면서 무한 반복이 진행되는 것을 알게 되었습니다.
- Lv 4를 구현 하던 중, Menu 클래스에 menuItem = new ArrayList<>(); 를 작성하지않고 실행을 시켰었습니다.
   그러니, 값이 표현되지않는 오류가 발생했습니다. 
   그래서 여러가지 방법을 시도해보고 찾아본 결과, menuItem = new ArrayList<>(); 문장을 작성하지 않아 발생한다는 것을 알게 되었습니다. menuItem 리스트를 초기화 시키고 실행시켜야 오류가 발생 하지 않는 사실을 알게되어
   초기화를 시키고 다시 구현해 보았더니, 정상적으로 실행되는 것을 확인할 수 있었습니다.


- Lv3 에서 Lv4 로 넘어오면서 작업을 할 때, 새로운 카테고리를 생성하고 Kiosk 클래스가 가지고있던 MenuItem 클래스의 내용을 Menu클래스로 넘겨오는 과정에서 어려움을 느꼈습니다. 
 코드가 정리가 되지 않고 복잡했지만, 코드를 처음부터 천천히 작성해서 해결할 수 있었습니다.

 
- Kiosk 클래스를 구현할 때, 조건 중 
1. Menu가 가진 List<MenuItem>을 반복문을 활용하여 햄버거 메뉴 출력
2. [입력 받은 숫자가 올바르다면 인덱스로 활용해서 Menu가 가지고 있는 List<MenuItem>에 접근하기
 // menu.getMenuItems().get(i); 같은 형식으로 하나씩 들어가서 얻어와야 합니다.]
라는 조건에 맞춰 작성을 하였는데, 어떠한 형식으로 작성을 해야 하는지에 대한 어려움이 있었습니다. 
그래서 이전 강의 내용 자료를 찾아보며 복습을 진행했고, 질의응답을 통해 해결할 수 있었습니다.


- Lv 5 구현 중 dirnks 와 desserts 를 새롭게 구현할 때, switch문을 여러개 사용해서 작성하는 것은 불필요한 작업이라 생각을 했습니다. 지금은 내용이 적어 작성은 할 수있지만, 만약 메뉴 카테고리가 더 많아진다면 switch 문을 활용하는 것이 효율적이지 않다라고 생각하여 if 문을 활용했습니다.
 처음에는 하단에 새롭게 if 문 작성해서 했습니다.
그렇게 진행했더니 scanner 값인 menuNumber 이 정상 작동하지 않는 오류 ( drink 카테고리에 들어가서 coke 를 선택해도 burger에 대한 값이 출력되는 오류가 발생) 와 else if 문으로 작동했을 때는 2번을 선택하면 2번을 포함한 3 , 4 번의 메뉴도 출력되는 오류가 발생했습니다.
그래서 menuNumber 1 , menuNumber 2 를 지정해서 하면 해결되지않을까? 라는 생각을 가지고 진행을 해봤지만 해결이 되지않았습니다. 그리고 여러개의 menuNumber를 지정할 필요가 없다라고 판단을 했습니다.
다음으로는 if 문이 아닌 else-if를 사용해야하는 건 아닐까? 라고 생각해 작성해보았지만 해결되지 않았습니다.
여러가지 방법을 시도해보고 무엇이 문제인지 생각했을 때, 코드의 순서에 문제가 있는건 아닐까라는 생각을 했고, 순서를 변경하여 코드를 작성해 오류를 해결했습니다.
