import java.util.*;

class B04.java {
      public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int yincome, tax;
            System.out.print("연봉을 원단위로 입력하세요 : ");
            yincome = s.nextlnt();
            
            if(yincome < 10000000) {
                  tax = yincome * 9.5%
            }
            else if(10000000 <= yincome && yincome < 40000000) {
                  tax = yincome * 19%
            }
            else if(40000000 <= yincome && yincome < 80000000) {
                  tax = yincome * 28%
            }
            else if(80000000 <= yincome) {
                  tax = yincome * 37%
            }
            
            System.out.print("연봉 금액에 대한 소득세는 %d 입니다.", tax);
      }
}
