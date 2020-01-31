### DDD 예제 프로젝트

>참고 도서 [ddd start!](https://www.aladin.co.kr/shop/wproduct.aspx?ItemId=84000742)

* Domain 설계
  * 주문(Order), 주문상세(OrderLine), 상품(Product), 재고(Stock)
  
뚜렷한 컨텍스트는 아직 작성하지 않음.

이후 컨텍스트 작성하게 되면 예제 코드로 작성 예정.


생성된 Table 확인 방법

http://localhost:9000/h2-console

로그인창에서 

JDBC URL : jdbc:h2:mem:testdb
ID : sa
Password : (빈칸)

으로 로그인.