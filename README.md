## 문법 구성요소
|이름|뜻|
|------|---|
|식별자(identifiers)|사용자가 임의로 Java 프로그램의 구성요소에 붙이는 이름|
|키워드(keyword)|자바 문법상의 영단어 자바 언어 자체에서 미리 정해놓은 식별자|

## 자료형
|이름|뜻|
|------|---|
|자료형)|프로그램에서 사용되는 데이터 유형(data type)|
|기본형|이미 정해져있는 유형|
|참조형)|기본형 이외의 자료형의 종류 (= 객체의 메모리 위치 주소값)|
|null|참조형 자료형의 종류. 변수의 메모리 위치 주소값이 안들어가서 대신 넣어놓는 더미데이터.(나중에 넣으려고 비워두는것) 오라클에서는 데이터를 입력하지 않을 경우 대신 넣어주는 데이터.|

## 변수
|이름|뜻|
|------|---|
|변수|데이터가 저장되는 메모리의 기억장소에 붙인 이름. 변수 안의 데이터 값은 수시로 변경(갱신) 가능|
|속성변수(멤버변수)|기본형 데이터 또는 참조형 데이터가 저장되는 변수. 클래스의 고유 멤버로 클래스 내부에 있음.|
|지역변수|메소드 안에서 선언되어 메소드 안에서만 사용되는 변수. 보통 중괄호 안에서 사용.|
|매개변수|데이터를 전달하면서 메소드를 호출할 때 전달 데이터를 저장할 변수. (메소드,생성자 안에 있는 둥근괄호) 0개 이상 가능. 형식)메소드명/생성자명(자료형 매개변수){실행구문}|
|할당|변수에 데이터를 저장하는 행위|
|변수선언|데이터 저장을 위한 메모리 공간을 확보해달라고 가상머신에게 부탁하는 행위|
|초기화|변수 선언 이후 처음으로 데이터를 저장하는 행위|

## 제어문 : 위에서 아래로 처리되는 명령어의 처리 순서를 변경시키는 문장
### <조건문> : 조건에 따라 지정한 실행구문 수행.
|이름|뜻|
|------|---|
|if문|조건문이 true일때만 실행. else if : if가 false면 다음꺼. 다되면 거기서 멈춤. else : 모든경우의 마지막. 앞계산이 다 아니면 실행|
|switch문|변수값이 설정한 데이터가 같을때 실행|
### <반복문> : 설정한 조건식이 true면 실행구문을 반복수행함.
|이름|뜻|
|------|---|
|for문|true면 다음, false면 반복문 탈출 초기값, 조건식, 증감식 생략가능|
|while문|조건식이 true면 실행, false면 반복문 탈출|
|do while문|일단 실행구문 수행하고 조건식 true면 반복, false면 탈출|
|향상된 for문|배열객체참조변수 안에 데이터를 저장하고 실행구문 반복 변수 자료형과 배열변수 자료형이 같아야함.|
### <분기문> : 반복문 안에서 강제로 명령어의 처리 순서를 바꿈.
|이름|뜻|
|------|---|
|break|왼쪽 조건식이 false면 반복진행, true면 실행구문 실행하지 않고 반복문 탈출|
|continue|강제로 다음 반복 구문으로 건너뜀. 왼쪽 조건식이 false면 반복실행, true면 실행구문 실행하지 않고 바로 올라가서 증감식으로 이동. (continue -> 증감식 -> 조건식)|
## 클래스(Class) : 속성변수와 메소드와 생성자를 정의해놓은 일종의 틀.
|이름|뜻|
|------|---|
|멤버|속성변수와 메소드와 생성자. 각각 0개 이상 나올 수 있음.|
|속성변수|행동자. 메소드 내부의 실행구문 실행 과정 중에 필요한 데이터 저장하는 곳. 기본형 데이터 또는 참조형 데이터(객체의 메모리 위치 주소값)를 저장함.|
|생성자|패시브.클래스가 객체화가 되어야 속성변수가 메소드가 호출한 실행구문이 이루어짐.|
|리턴(return)|행동. 실행구문을 대표하는 방법 이름! 코드의 실행 방법과 실행 과정을 정의한 것. (변수의 조작, 데이터의 조작, 다른메소드의 호출, 객체 생성 등) -> 객체가 소유한 메소드를 호출하면 코드 몰라도 방법 그대로 사용할 수 있음.: 메소드가 실행 된 후에 내놓은 반환 데이터의 자료 유형 설정 목적)메소드 중단. -> 메소드 실행을 중지하고 오른쪽 데이터를 호출한 곳으로 반환하라.|
|객체|클래스를 실행하면 메모리 공간(Heap)으로 올라간다. 이때부터 클래스를 객체라고 부른다. 같은말로 인스턴스.|
|기본 자료형|꼭 내부에 return 기본자료형데이터; 가 있어야함.|
|클래스명|메소드 실행 후 1)클래스 객체화한 객체 메위주 2)클래스의 후손 클래스를 객체화한 객체메위주 3)null값 중 하나의 데이터를 리턴해야함. 꼭 return 객체메위주;이 있어야함.|
|인터페이스명|메소드 실행 후 1)인터페이스명에 해당하는 인터페이스를 구현한 클래스를 객체화한 객체의 메위주 2)null값 중 하나의 데이터를 리턴함. 꼭 return 객체메위주;이 있어야함.|
|void|메소드 실행 후에 아무런 값도 반환하지 않는다. return 데이터;가 있으면 안됨. 단, return;은 가능.(=메소드 종료의 의미)|

## 상속(Inheritance) : 클래스(부모)가 소유한 멤버(속성변수, 메소드 등)를 다른 클래스(자식)에게 그대로 물려주는 것.
|이름|뜻|
|------|---|
|super 예약어|자식 내부에서 부모의 멤버(속성변수, 메소드, 생성자)를 호출하기 위해 사용함. 반드시 자식의 생성자 첫줄에 부모 생성자를 호출하는 super(~)가 있어야함.(없으면 자바가 자동 삽입) super(~)는 무조건 생성자 안에서만 나오는 것. 메소드 안에서 나올 수는 없음.|
|this 예약어|클래스가 소유한 고유멤버(속성변수, 메소드, 생성자)를 지칭하거나 클래스가 객체화 될 때 객체 메모리 위치 주소값을 말한다. 사용목적) 1. 메소드의 매개변수명과 속성변수 명이 같을경우 구별하기 위해 this.속성변수명 형식으로 사용. 2. 부모클래스와 자식클래스의 속성변수/메소드/생성자 이름이 같을경우 구별하기 위해 사용 형식) this.(자식클래스 관련 이름)this(~)는 생성자 안에서만 나옴. 메소드 안에서 나올 수 없음.|
|생성자|패시브.클래스가 객체화가 되어야 속성변수가 메소드가 호출한 실행구문이 이루어짐.|
|추상클래스|바디가 없는 메소드를 한개 이상 소유하고 있거나 조상 클래스가 바디없는 메소드를 한개 이상 소유하고 있는 클래스. 단, 조상클래스부터 자기클래스 사이에 이 메소드를 재정의 하지 않았을 경우에만 해당. 용도) 자식이 추상클래스가 소유한 추상메소드를 재정의해서 사용하므로써, 메소드의 명세표 역할을 하고, 공통된 작업의 규격을 만듬. 특징) 1. 추상클래스 이름 앞에 final이 붙을 수 없음.(final이 붙으면 상속자체가 불가능) 2. 추상클래스의 추상메소드 앞에 private, static, final이 붙을 수 없음.(접근불가, 또는 호출불가) 3. 추상클래스는 객체화 할 수없다. 메소드 호출이 불가능하기 때문. 4. 추상클래스의 메소드를 자식이 전부 재정의하면 일반클래스가 되어 객체화 가능해짐. 5. 모두 재정의하지 않으면 자식도 추상클래스가 됨.(따라서 일반클래스가 되려면 모두 정의해야함.) <주의>일반클래스에 abstract를 붙일 수 있음. 객체화 금지 목적이거나 추후 실행구문{}이 없는 메소드를 추가하여 추상클래스를 만들 예정일 경우에 붙임.|
|종단클래스|다른 클래스에게 상속할 수 없는 클래스 형식) [public] final class 클래스명{~} 이름 앞에 abstract가 올 수 없음(=상속불가능의 의미이기 때문)|


## 인터페이스(Interface) : public,static,final 성격을 가진 속성변수와 public, abstract 성격을 가진 메소드만으로 구성된 단위프로그램 (안붙여도 자동으로 붙여짐)
|이름|뜻|
|------|---|
|인터페이스|인터페이스에 정의한 추상 메소드를 다른클래스에서 재정의해서 사용함(클래스의 메소드 제작 명세표 역할)-> 이름만 가져다가 실행구문 만들면 계획된대로 만들 수 있음. 인터페이스 속성변수 호출 형식) 인터페이스명. 속성변수 인터페이스 속성변수는 반드시 선언과 동시에 초기화 해야함.|
|오버로딩(overloading)|생성자 오버로딩) 같은 이름의 생성자를 2개 이상 정의하는 것으로, [생성자명]은 같더라도 [매개변수의 갯수]나 [매개변수의 자료형]은 달라야하는 규칙이 있다.|
|오버라이딩(overrriding)|부모의 메소드를 자식이 같은 이름으로 재정의하는 것. 인터페이스에 계획된 메소드명을 만들고 클래스가 이 메소드 이름만 그대로 가져다 실행구문을 설정하는 것으로 계획된 메소드로 구성된 클래스를 만들 수 있다. 단, 메소드 앞에 final이 있으면 불가. (인터페이스의)상속(inheritance):부모-자식관계 인터페이스가 다른 인터페이스에게 멤버를 물려주는 것. 장점) 반복되는 코드 줄일 수 있고, 클래스 간의 관계를 명확히 할 수 있다. 계층적인 구조로 효율성이 뛰어남 단, 메소드의 경우 final이 없을 때, 자식은 부모의 것을 재정의(overrriding)해서 사용해야한다.|
|구현(implement)|인터페이스가 다른 클래스에게 멤버를 물려주는 것. 단, 클래스는 인터페이스에게 받은 추상메소드를 조상까지 전부 재정의 해야 한다. 그래야 객체화 할 수 있다. 메소드를 재정의할 때에는 public을 붙여야 한다. 단, 인터페이스는 final 성격을 가지고 있어서 클래스가 인터페이스의 속성변수를 가져올수는 있는데, 갱신은 못한다.|

## 배열(Array) : 같은 유형의 자료들은 순차적으로 저장할 수 있는 구조. 일종의 객체이므로 메소드와 속성을 가지고 있음.
|이름|뜻|
|------|---|
|배열|목적) 같은 자료형의 변수를 원하는 갯수만큼 쉽게 생성할 수 있다. 반복문을 사용하여 배열 변수에 쉽게 데이터를 저장하고 호출할 수 있음. 단점) 변수의 갯수를 미리 정확하게 알고 있어야함. -> 게임 프로그램에서 캐릭터가 움직일 때에 배열을 많이 사용함 기본 자료형도 저장 가능(컬렉션과의 차이점)|
|getter/setter 메소드|클래스의 특성 중 정보 은닉을 가장 잘 보여주는 메소드. 보통 클래스의 멤버변수는 private러 접근제한자를 설정한다. 따라서getter/setter를 통해 멤버변수의 값을 변경, 호출함. 단축키)alt+shift+s|

## 컬렉션 : 같은 또는 다른 유형의 다수의 객체를 저장할 수 있는 자료구조. 꺼낼 때 몇번째 데이터가 무슨자료형인지 알수가 없어서 일반적으로 거의 하나로 통일해서 사용(다 문자로 통일) 객체의 메모리 위치 주소값 저장 기본 자료형 데이터는 저장불가(때문에 Wrapper 클래스 계열의 객체로 바꾸어 저장)
|이름|뜻|
|------|---|
|제네릭스(generics)|형변환하기 싫을 때. 객체 생성시 그 객체안에 사용할 자료형을 지정해주는 것. ex) HashMap<String,String> map = new HashMap <String, String>();, 이러면 쓸때랑 꺼낼때 전부 문자형으로 꺼내줌. 제네릭스를 안쓰면, 서로다른 객체가 마구 저장되어서 자료형을 다 기억해야함. 때문에 절대적으로 사용함.|
|DTO|data transfer object(객체) : xxx 이름의 속성변수가 있으면 꼭 set과 get라는 이름의 메소드가 있음. 세개가 한쌍. 이게 한 쌍이 되어서 n개가 들어있는 클래스를 DTO 클래스라고 함. 가끔 VO(value object)라고 부르기도 함. (예를 들면 Family DTO) 데이터를 조작하는 것이 아닌 담는 역할만 함. 오라클 한 행의 데이터를 담는 역할. 오라클의 table과 맞닿음.|
|DAO|data access object 오라클을 비롯한 데이터베이스에 접근해서 db 연동하는 클래스. 오라클에게 명령하고 삭제명령을 내리는 것. DTO는 그러한 상황에서 데이터를 저장하는 묶음 클래스 같은 것.|
|해쉬맵(HashMap)|Hashmap 클래스의 특징) <1> 다량,다종의 객체를 저장하고 꺼낼 수 있는 기능을 가지고 있다. 실무적으로는 같은 종류의 객체만 저장한다. 꺼낼때 자료형이 다르면 형변환이 불가능하기 때문. <2> 기본형 데이터는 저장불가 기본형을 굳이 저장하고 싶다면 기본형을 관리하는 객체를 생성하여 그 객체를 저장한다.[Integer 객체]를 사용하면 정수, [Double 객체]를 사용하면 실수를 저장할 수 있음.예) Integer num = new Integer(3); Double num = Double(3.3);  //여기서 더블은 자료형이 아님. 앞글자 대문자.<3> 저장시 저장 순서가 일정하지 않다. 즉, 저장 순서를 알 수 없다.<4> 저장된 데이터를 꺼낼 때 키값을 사용한다.즉 키값은 저장된 객체를 꺼내기 위해 붙인 것. -> 저장 순서가 있으면 키값 필요 없다. 키값 객체(=데이터) 중복저장시 저장객체는 덮어씀.<5> 웹 개발시 HashMap 객체는 오라클 안의 n행 n열의 데이터를 자바 영역으로 가져올 경우 한 행의 데이터를 저장할 때 많이 사용한다.웹 개발시 키값=저장객체메위주 는 아래 형태로 많이 사용된다.(키값 = 태그)"컬러명"-"오라클테이블데이터"<주의> 오라클 한 행의 HashMap 객체에 저장시 저장객체는 String 형으로 통일하여 저장하므로 오라클에 있는 자료형을 그대로 가져올 수 없다. 즉, 오라클 자료형을 살릴 수 없다.|
|어레이리스트(ArrayList)|ArrayList 클래스의 특징)<1> Hashmap 특징과 동일. 다량, 다종의 데이터 저장하고 꺼내는 기능. 하지만 대부분 같은 종류의 객체로 저장<2> 기본형 데이터 저장 불가<3> Hashmap과 차이점) 저장 시 저장순서를 유지한다. 즉, 저장순서를 알 수 있다.(=순차적 저장)<4> 저장된 데이터를 꺼낼 때 인덱스 번호(0부터 시작)를 사용한다.(키값 필요x)<5> 웹 개발시 ArrayList 객체는 오라클 안의 n행 n열의 데이터를 자바 영역으로 가져올 경우 n 행의 데이터를 저장한 다량의 Hashmap 객체들을 저장할 때 사용한다.|

## 예외(Exception):자바 가상머신이 감지할 수 있는 오류.(에러는 감지 못하는 오류) 예외가 발생하면 예외 종류에 따라 예외를 관리하는 클래스가 자동으로 객체화됨 사용 목적) 예외가 발생할 경우 멈추지 않고 내가 설정한 코딩을 실행시키기 위함
|이름|뜻|
|------|---|
|try 구문|예외가 발생할 것 같은 구문 넣기|
|catch 구문|예외발생시 실행할 코드 catch 구문 하나만 실행되어도 멈춤.|
|finally 구문|예외가 발생하던 안하던 반드시 실행할 코드.(생략가능) finally를 쓰는 이유) 꼭 실행시켜야만 하는 실행문을 finally가 안으면 리턴 후에 중단하고 바로 데이터 출력하지 않고, finally를 먼저 실행하고 리턴값 내놓음. 즉, 빼먹지 않고 해야하는 메소드를 리턴이 있던 없던 실행하기 위해(리턴을 이기기 위해)|
|Exception|모든 예외를 관리하는 객체들의 부모클래스else처럼 마지막에 두면 대부분 예외를 걸러줌|ㄴ단, 얘는 중간에 들어가면 에러. 중간에 들어가면 그 아래의 것은 계산이 안됨. 따라서 맨 아래로 가야함|
|ArithmeticException|0으로 나누는 행위가 발생되면 관리하는 객체|
|NumberFormatException|진짜 문자를 숫자로 바꾸는 예외를 관리하는 객체|

## 클래스 형식
### 1. package 패키지명;
#### 클래스의 소속 묶음명. 클래스들을 담는 폴더. 보통 3단계 이상으로 만든다.(ex. com.naver.java)

### 2. import 수입클래스패키지명.수입클래스명;
#### 무조건 다 import 할 수 있는 것은 아니다.
#### 수입클래스명 : (생략가능)타 패키지 소속 클래스를 객체화해서 사용할 경우, 그 이름들을 지정하는 것.

### 3. [public]
#### <클래스 수입 지정자>
#### 왜수입?)객체화해서 메소드 호출하려고.
#### 있으면)같은 또는 다른 패키지의 타 클래스에서 수입 가능.
#### 없으면(=default))같은 패키지의 타 글래스에서만 수입 가능.

### 4. [abstract/final]
#### <클래스 성격 지정자>
#### abstract : 상속하고 싶다! 실행구문(body)이 없기 때문에 객체화가 불가능. 빨리 자식이 와서 body 없는 메소드를 채워줬으면 좋겠다.
#### 1) 실행구문(body)이 없는(호출할 수 없는) 메소드를 하나 이상 가지고 있을 때(자유도가 높은편)
#### 2) 부모클래스가 실행구문(body)이 없는 메소드를 가지고 있는데 자신이 한번도 재정의하지 않았을 때.(즉, 재정의하면 abstract가 사라진다.)
#### final : 상속금지. 자식쪽에서 상속관계를 요청할 경우 받아들이지 않겠다.

### 5. class 클래스명
#### class 상속 이유 : 자식이 부모의 메소드를 마음껏 가져다 쓰기 위해. 자식이 부모를 고르고 자식만 부모꺼를 가져다 쓸 수 있다.

### 6. public /protected /defalt /private
#### <접근지정자(호출가능범위 설정)>
#### public : 모든 곳에서
#### protected : 타패키지에 있어도 자식클래스라면 호출가능
#### default(생략가능) : 같은 패키지 내에서만
#### private : 현재 클래스 내에서만

### 7. [static]
#### 붙으면)클래스변수, 공유변수라 부른다. 객체 생성 없이도 호출이 가능해진다. static이 붙은 변수를 객체화한 다른 객체끼리 공유한다.(이 속성변수를 소유한 모든 동일 객체가 공유하게 된다. ) 객체 간에 통신, 누적이 가능해진다. 호출할 때 형식)
#### 1. 객체참조변수.속성변수명
#### 2. 클래스명.속성변수명
#### 없으면) 객체참조변수.속성변수명 형식으로만 호출 가능 => 클래스를 객체화해서 메모리에 올라오기 전에  static을 붙이면 먼저 그 메소드가 올라가 있을 수 있다. 

### 8. final
#### 붙으면) 종단변수라 부른다.
#### 처음에 저장된 데이터는 초기화 후 갱신 금지
#### final이 속성변수 앞에 붙으면 예외적으로 자동초기화가 되지 않으니 반드시 1. 변수 선언과 동시에 수동초기화 또는 2. 생성자 안에서 수동초기화 해야한다.

### 9. 기본자료형/ 클래스명 / 인터페이스명 속성변수명
#### <기본자료형>
#### 기본형 데이터를 저장할 속성변수에 붙인다. 기본형으로 속성변수를 선언하고 수동초기화하지 않으면, 디폴트값으로 자동초기화된다.
#### <클래스명>
#### 다음 중 하나의 데이터를 저장할 속성변수에 붙인다.
##### 1. 클래스명에 해당하는 클래스를 객체화한 객체 메위주
##### 2. 클래스의 후손 클래스를 객체화한 객체 메위주
##### 3. null값
##### -> 속성변수 앞에 클래스명을 붙이고 수동초기화를 하지 않을경우.
##### **객체의 메모리 위치 주소값을 저장할 변수를 참조형 변수라고 함.

#### <인터페이스명>
#### 다음 중 하나의 데이터를 저장할 속성변수에 붙임.
##### 1. 인터페이스명에 해당하는 인터페이스를 구현한 클래스를 객체화한 객체 메위주
##### 2. null값
##### -> 속성변수 앞에 인터페이스명을 붙이고 수동초기화를 하지 않을경우.
##### 여기서 속성변수명은 클래스를 객체화했을 때 메모리 위치 주소값을 의미한다.

#### 속성변수 특징)
##### 속성변수 선언 후 수동 초기화하지 않으면 디폴트값으로 자동 초기화된다.(지역변수는 자동초기화x)
##### final이  있으면 꼭 수동초기화!!!!!!
##### 지역변수도 수동초기화 해야함!

 

### 10.  public /protected /defalt /private

#### <객체생성가능여부(=생성자 호출여부)>

### 11. 생성자명

#### 클래스를 객체화한 후 자동으로 한번만 호출되는 실행구문 영역.
#### 클래스 이름과 동일. 단, 왼쪽에 자료형 없음.
#### 생성자 오버로딩) 같은 이름의 생성자를 2개 이상 정의하는 것.
#### 생성자 오버로딩 규칙 - 생성자명은 같더라도 매개변수의 갯수나 자료형은 달라야한다.
#### 생성자가 0개일 때는 가상머신이 컴파일 시 기본 생성자 1개를 만들어준다.

#### 생성자 호출 방법
##### 1. new 생성자명(~)  //객체생성과정 2. this(~)   //동료생성자 안 3. super(~)   //자식생성자 안
##### <주의> 동료 메소드 안에서 동료 생성자르 호출할 수 없다.
##### 생성자에는 return 데이터; 가 올 수 없음 이유) 리턴형을 표시하지 않음.

### 12. ([자료형 매개변수, ~])
#### 자료형은 기본형/클래스명/인터페이스명이 있다. 0개 이상 나올 수 있음. 2개 이상은 ,로 나열.

### 13. public /protected /defalt /private

#### <호출가능여부>

### 14. [static]

#### 객체 생성없이 메소드 호출 가능, 동료속성변수도 static이 붙어있어야한다.

### 15.[synchronized]


### 16.[abstract/final]
#### final : 자식클래스가 자신의 메소드를 가져다 쓸 때, 이 메소드를 재정의(overriding) 하지 못하게 하는 것
#### abstract : body가 없음

### 17. 기본자료형/ 클래스명 / 인터페이스명 void 메소드명 
#### 이 메소드를 호출하면 ~를 받을 것이다.
#### void : 호출 시 아무것도 받을 수 없다
#### 클래스명이 메소드명 옆에 있을 때 호출받을 수 있는 데이터는 메모리 위치 주소값 뿐만 아니라 null도 있다.

### 18. ([자료형 매개변수
#### 각 메소드 안에 지역변수가 있음.
#### 메소드 안에 선언된 지역변수 자료형 앞에 final 붙으면 갱신불가 ex)final int a = 3;
#### public static void main(String[] args) { ~ } 이 포함된 클래스만 클래스명(=파일명) 앞에 public이 붙을 수 있다.

# 객체지향 언어
## 코드의 재사용성이 높다.
### 새로운 코드를 작성할 때 기존의 코드를 이용해 쉽게 작성할 수 있다.
## 코드의 관리가 용이하다.
### 코드간의 관계를 이용해 적은 노력으로 쉽게 코드를 변경할 수 있다.
## 신뢰성이 높은 프로그래밍을 가능하게 한다.
### 제어자와 메소드를 이용해 데이터를 보호하고 올바른 값을 유지하게 하며, 코드의 중복을 제거하여 코드의 불일치로 인한 오동작을 방지할 수 있다.

# 변수의 종류
## 클래스 변수 : 인스턴스 변수 앞에 static을 붙이기만 하면 된다. 인스턴스마다 독립적 저장공간을 갖는 인스턴스 변수와는 달리 클래스 변수는 모든 인스턴스가 공통된 저장공간을 공유. 한 클래스 내 모든 인스턴스들이 공통 값을 유지해야하는 속성의 경우 클래스 변수로 선언
### 클래스이름.클래스변수와 같은 형식으로 사용
## 인스턴스 변수 : 클래스 영역 내 선언. 인스턴스 생성시 만들어진다. 인스턴스 변수의 값을 읽어오거나 저장하려면 먼저 인스턴스를 생성해야함.
### 인스턴스마다 고유한 상태 유지해야하는 경우 인스턴스 변수로 선언
## 지역변수 : 메서드 내 선언돼 내에서만 사용가능하며 메서드 종료시 소멸되어 사용 불가.

### 인스턴스 변수는 인스턴스 생성때마다 생성되므로 각기 다른 값 유지 가능
### 클래스 변수는 모든 인스턴스가 하나의 저장공간을 공유하므로, 항상 공통된 값 유지

# 메서드
## 메서드가 호출되면 수행에 필요한 만큼의 메모리를 스택에 할당받는다.
## 메서드가 수행을 마치고나면 사용했던 메모리를 반환하고 스택에서 제거된다.
## 호출스택의 맨 위에 있는 메서드가 현재 실행 중인 메서드이다.
## 아래에 있는 메서드가 바로 위의 메서드를 호출한 메서드이다.

# 매개 변수
|이름|뜻|
|------|---|
|기본형 매개변수|변수의 값을 읽기만 할 수 있다.(Read only)|
|참조형 매개변수|변수의 값을 읽고 변경할 수 있다.(Read & Write)|

# Static을 언제 붙여야 하는가?
## 클래스를 설계시, 멤버변수 중 모든 인스턴스에 공통으로 사용하는 것에 static을 붙인다.
### 생성된 각 인스턴스는 독립적이므로 각 인스턴스 변수는 서로 다른 값을 유지한다. 그러나 모든 인스턴스 값이 같아야 하는 변수는 static을 붙여서 클래스변수로 정의한다.

## 클래스 변수(static 변수)는 인스턴스를 생성하지 않아도 사용할 수 있다.
### static이 붙은 변수는 클래스가 메모리에 올라갈 때 이미 자동적으로 생성되기 때문이다.

## 클래스 메서드는 인스턴스 변수를 사용할 수 없다.
### 인스턴스변수는 인스턴스가 반드시 존재해야만 사용할 수 있는데, 클래스 메서드는 인스턴스 생성 없이 호출 가능하므로 클래스 메서드가 호출되었을 때 인스턴스가 존재하지 않을 수도 있따. 그래서 클래스 메서드에서 인스턴스변수의 사용을 금지한다.
### 반면 인스턴스변수나 인스턴스 메서드에서는 static이 붙은 멤버들을 사용하는 것이 언제나 가능하다. 인스턴스 변수가 존재한다는 것은 static 변수가 이미 메모리에 존재한다는 것을 의미

## 메서드 내 인스턴스 변수를 사용하지 않는다면, static을 붙이는 것을 고려한다.
### 메서드 작업 내용 중 인스턴스변수를 필요로 한다면, static을 붙일 수 없다. 반대로 인스턴스 변수를 필요로 하지 않으면 static을 붙이자.
### 메서드 호출시간이 짧아지므로 성능이 향상된다. static을 안 붙인 메서드는 실행 시 호출돼야 할 메서드를 찾는 과정이 추가적으로 필요하므로 시간이 더 걸린다.

## 클래스의 멤버 변수 중 모든 인스턴스에 공통 값을 유지해야하는 것이 있는지 살펴보고 있으면, static을 붙여준다.
## 작성한 메서드 중 인스턴스 변수나 인스턴스 메서드를 사용하지 않는 메서드에 static을 붙일 것을 고려한다.