# spring-study


> _스프링 핵심 원리 강의 코드 학습 프로젝트_

### 스프링 핵심 원리 이해1
  - 주문 도메인을 프레임워크 없이 설계/개발하기 
### 스프링 핵심 원리 이해2
  - 새로운 할인 정책을 개발하며 OCP,DIP 위반 사례 확인 ([새로운 할인 정책 개발](), [새로운 할인 정책 적용과 문제점]())
  - OCP, DIP 원칙을 위반한 사례를 확인하고 위반하지 않도록 코드 수정 ([관심사의 분리]())
  - AppConfig 에서 상황에 필요한 객체의 생성과 연결을 담당하여 관심사 분리함으로써 OrderService, MemberService 등의 
레이어에서는 service 레이어에서 담당해야할 비즈니스 로직에만 집중하도록 수정 ([관심사의 분리]())
  - 각 객체가 스스로 담당하는 기능만 책임지도록 수정 -> SRP ([관심사의 분리]())
  - AppConfig 리팩토링 -> 메서드 중복을 제거하고 각 메소드의 역할을 분명히함 ([AppConfig 리팩터링]())
  - 새로운 할인 정책을 적용해도 AppConfig 이외의 다른 클라이언트 코드의 변경은 없다 - OCP 만족 ([새로운 구조와 할인 정책 적용]())