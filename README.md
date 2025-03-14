<h1>키오스크 프로젝트</h2>

<h3>1️⃣프로젝트 소개</h3>
자바를 학습하고 적극 사용해보기 위한 키오스크 콘솔 프로젝트입니다. <br>
클래스 설계, 캡슐화, 상속, 다형성 등 객체 지향 프로그래밍의 핵심 개념을 실습하기 위해 진행했습니다.

<h3>2️⃣기술 스택</h3>
- 언어 : Java 17 <br>
- IDE : IntelliJ IDEA

<h3>3️⃣프로그램 구조</h3>

<img src="https://github.com/user-attachments/assets/8dc61e09-c70a-4e85-bc7a-48f0c4b87f56" width="30%">

<h3>4️⃣주요 기능</h3>

1. **메뉴 선택 기능**
   - 카테고리별 메뉴(햄버거, 음료, 사이드)를 콘솔에 출력하고 사용자의 선택을 받아 다른 로직을 수행합니다.

2. **장바구니 기능**
   - 선택한 메뉴를 장바구니에 추가할 수 있습니다.
   - 장바구니 내 항목 조회 및 총 금액 출력이 가능합니다.

3. **주문 기능**
   - 장바구니 목록을 확인하고 할인 등 부가 기능을 처리한 뒤 주문처리 합니다
   - 주문 후 장바구니는 초기화됩니다. 이외에 주문취소 선택시에도 장바구니가 초기ㅘ됩니다.

4. **입력값 검사 예외 처리 기능**
   - 메뉴 목록 범위를 벗어난 입력값은 예외처리문을 출력하고 재입력을 유도합니다.
     
4. **할인 기능**
   - 사용자가 선택한 할인에 따라 주문 총금액을 할인처리 합니다.

<h3>5️⃣실행 방법</h3>

1. 실행자의 JDK가 17인지 확인합니다.

2. 인텔리제이로 프로젝트를 열고 `Main.java`를 실행합니다.

3. 키오스크가 실행되면서 콘솔에 메인메뉴 출력문이 표시됩니다.
4. 실행자는 앞서 설명한 주요 기능 모두를 실행할 수 있습니다.

<h3>브랜치 소개</h3>

1. mandatory/lv1

<img src="https://github.com/user-attachments/assets/0640b112-6f95-40fd-8989-eca4ccad0716" width="30%">

- 메인 메뉴 출력


2. mandatory/lv2

<img src="https://github.com/user-attachments/assets/d3a418cd-d31f-434b-9ca2-61b5d394b86b" width="30%">

- 입력값 받기
- 입력값에 따라 다른 결과 출력


3. mandatory/lv3

<img src="https://github.com/user-attachments/assets/e0e7ab4f-d856-4129-bc09-878ea836075e" width="30%">

- Kiosk, MenuItem 클래스 추가
  - Main : MenuItem 객체 생성 및 초기화, Kiosk 실행
  - Kiosk : 키오스크 로직 실행
  - MenuItem : 햄버거 메뉴 관리 (ex) 싸이버거, 불싸이버거


 4. mandatory/lv4 && mandatory/lv5

<img src="https://github.com/user-attachments/assets/633152a8-b0c5-424d-9edb-c13bae46047c" width="30%">

- Menu 클래스 추가
  - Menu : MenuItem을 관리함, (ex) 햄버거, 음료, 사이드
- getter/setter 추가로 캡슐화

1. challenge/lv1

<img src="https://github.com/user-attachments/assets/b8b3a31a-3486-4464-aad1-79bcffbdcfe6" width="30%">

- 패키지 분리 (cart, menu)
- Cart 클래스 추가
  - 장바구니 기능 구현

2. challenge/lv2

<img src="https://github.com/user-attachments/assets/b8b3a31a-3486-4464-aad1-79bcffbdcfe6" width="30%">

- Discount 클래스 추가
  - 할인 기능 구현

<br>

❌람다, 스트림 기능 구현 못함
  - 시간이 부족해서 구현 못함

---

### 느낀점

기능 구현에서도 어려움을 느끼긴 했지만 
가장 큰 어려움을 느낀 건 중간에 진행한 코드 리팩토링이었다.
기존 코드가 너무 방대하고 복잡하고 더러워서 구조화 작업과 메서드 추출에 많은 시간을 할애했다.
앞으론 프로젝트를 들어가기 전에 구조화 작업을 꼭 해봐야겠다고 생각했다.

그리고 요구사항 분석도 꼼꼼히 해야겠다는 생각이 들었다.
중간에 주문 수량 기능을 안한 걸 발견해서 수정하는 일이 있었다.
처음부터 어떤 기능을 수행해야하는지 알고있는 상태와 아닌 상태에서 구현하는 기능의 완성도는 매우 다를 것이다.
이 작은 자바 프로젝트의 코드 리팩토링과 요구사항 재분석과 추가도 이렇게 시간을 많이 할애해야하는데
앞으로 해야할 프로젝트들의 크기들을 고려하면 다음 프로젝트는 시작부터 잘 설계해야겠다는 다짐을 했다.

