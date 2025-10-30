## 수정중

### lv1
기본 키오스크
- Scanner 입력 처리 및 반복문·조건문 복습
- 메뉴 출력 및 번호 선택 기능 구현
- 0 입력 시 프로그램 종료


출력 결과
```
[ SHAKESHACK MENU ]
1. ShackBurger     | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
2. SmokeShack      | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
3. Cheeseburger    | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
4. Hamburger       | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
0. 종료      | 종료
1
ShackBurger을 선택하셨습니다.


[ SHAKESHACK MENU ]
1. ShackBurger     | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
2. SmokeShack      | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
3. Cheeseburger    | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
4. Hamburger       | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
0. 종료      | 종료
2
SmokeShack을 선택하셨습니다.


[ SHAKESHACK MENU ]
1. ShackBurger     | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
2. SmokeShack      | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
3. Cheeseburger    | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
4. Hamburger       | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
0. 종료      | 종료
0
프로그램을 종료합니다.
```
---
<br>
<br>
<br>
<br>

### lv2
MenuItem 클래스 생성
메뉴의 이름, 가격, 설명을 저장하고 관리한다.

출력 결과는 lv1과 같다.


---

<br>
<br>
<br>
<br>

### lv3

(1) MenuItem 클래스
- 개별 메뉴 관리
- 필드 : name, price, description(이름, 가격, 설명)

(2) Kiosk 클래스
키오스크의 흐름 제어
- 필드 : List<MenuItem> menuItems

(3) Main 클래스
- MenuItem 객체 생성(메뉴 추가)
- 키오스크를 생성하고 메뉴 리스트 전달
- kiosk.start로 키오스크 시작

---
<br>
<br>
<br>
<br>

### lv4
- Menu 클래스 추가
- MenuItem을 카테고리 별로 묶어서 관리한다.

출력 결과
```
[ MAIN MENU ]
1:Burgers
2:Drinks
3:Desserts
0. 종료           | 종료
1
[ BURGERS MENU ]
1. ShackBurger     | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
2. SmokeShack      | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
3. Cheeseburger    | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
4. Hamburger       | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
0. 뒤로가기
3
선택한 메뉴 : Cheeseburger    | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거

[ BURGERS MENU ]
1. ShackBurger     | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
2. SmokeShack      | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
3. Cheeseburger    | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
4. Hamburger       | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
0. 뒤로가기
0

[ MAIN MENU ]
1:Burgers
2:Drinks
3:Desserts
0. 종료           | 종료
2
[ DRINKS MENU ]
0. 뒤로가기
0

[ MAIN MENU ]
1:Burgers
2:Drinks
3:Desserts
0. 종료           | 종료
0
종료합니다.
```
