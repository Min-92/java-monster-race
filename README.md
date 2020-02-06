### 3단계 요구사항
--
#### 기능 요구사항
1. 객체 지향 프로그래밍을 지향(?) 해서 인터페이스 등을 이용해 프로그램을 개선한다.

2. 각 몬스터에 이름과 종류를 부여할 수 있다. 전진하는 몬스터를 출력할 때 몬스터 이름과 종류를 같이 출력한다.

3. 몬스터의 종류는 달리기, 비행, 에스퍼 중 하나의 값을 가진다.

4. 몬스터의 이름과 종류는 쉼표(,)를 기준으로 구분한다.

5. 몬스터의 이동은 타입에 따라 달라진다. 
    - 달리기: 랜덤값이 4이상인 경우 1칸 이동 
    - 비행: 랜덤값이 6이상인 경우 3칸 이동
    - 에스퍼: 랜덤값이 9인 경우 무작위 숫자 (1 < x < 100) 만큼 전진

5. 몬스터 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.

#### 실행 결과
위 요구사항에 따라 3대의 몬스터가 5번 움직였을 경우 프로그램을 실행한 결과는 다음과 같다.
````
<신나는 몬스터 레이스>
몇 명의 몬스터가 경주하나요?
3

경주할 몬스터 이름과 종류를 입력하세요 (쉼표(,)를 기준으로 구분).
크롱, 달리기
포비, 비행
호눅스, 에스퍼

시도할 회수는 몇회인가요?
10

<경기 시작>

크롱 [달리기] : ----
포비 [비행] : ----------
호눅스 [에스퍼] : -------------------------------

축하합니다! 호눅스가 몬스터 레이스에서 우승했습니다.
````