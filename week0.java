import java.util.*;

public class week0 {
    public static void main(String[] args) throws Exception {
        // chapter 2: 변수
       // 1. 두 변수의 값 교환하기
       /*    int x  = 10;
        int y = 20;
        int temp;
    
        System.out.println("x:" + x + " y: " + y);
        

        temp = x; // temp에 10을 저장
        x = y; // x = y를 즉 20을 저장
        y = temp; //  y에 temp값 즉 원래 x가 가지고 있던 값을 저장
        
        System.out.println("x:" + x + " y: " + y); // 덧셈 연산자'+'는 두 값을 더하기도 하지만 문자열과 숫자를 하나로 결합하기도 함
        
        */
        //2. 실수형의 리터럴
         /*// 실수형에서는 기본이 double형이므로 float형을 선언할 때에는 접미사로 f를 붙여줘야함, double 타입은 접미사 d는 생략가능
        float pi_f = 3.14f;
        double pi_d= 3.14;
        
        System.out.println("pi_f: "+ pi_f);
        System.out.println("pi_d: "+  pi_d);
        */
       
        //3. 문자열의 저장
        /*
        char ch = 'a'; // ch는 문자열 하나만 저장
        String abc = "abcdefg"; // String는 문자열 여러개를 저장
        String abcd = new String("Java"); // 정석적인 문자열의 선언 방법 

        System.out.println(ch);
        System.out.println(abc);
        System.out.println(abcd);
        */

        //실습 예제 2-3 : 문자열의 결합
        /* 
        String name = "Ja" + "va"; // java
        String str = name + 8.0; // java 8.0  실수 8.0을 문자형으로 변경해서 합침

        System.out.println(name); 
        System.out.println(str);
        System.out.println(7 + " "); // 7
        System.out.println(" " + 7); //  7
        System.out.println("" + 7); // 7
        System.out.println( 7 + ""); // 7 
        System.out.println("" + "");
        System.out.println(7 + 7 + "");// 정수끼리의 합
        System.out.println("" +7 + 7 ); // 문자열들의 합
        */
        
        // 예제 2-6 : 입력받기 
        /*Scanner scanner =  new Scanner(System.in);

        String input = scanner.nextLine();
        int num = Integer.parseInt(input); // 문자열로 입력받은 정수를 숫자로 변환해줌

        System.out.println("입력 내용: " + num);
        System.out.printf("num:%d%n", num);

        scanner.close();
        */

        // 예제 2-13 정수 형변환   
        /*int i =10;
        byte b = (byte)i;
        System.out.printf("[int -> byte] i = %d -> b = %d%n",i,b);

        i = 300;
        b = (byte)i;
        System.out.printf("[int -> byte] i = %d -> b = %d%n",i,b);

        b = 10;
        i = (int)b;
        System.out.printf("[ byte -> int] b =%d -> i = %d%n",b,i);

        b = -2;
        i = (int)b;
        System.out.printf("[int -> byte] i = %d -> b = %d%n",b,i);
        
        System.out.println("i=" + Integer.toBinaryString(i)); //-2가 2진수로 표현됨
        */
        
        //예제 2-13 실수 형변환
        /*float f = 9.1234567f;
        double d = 9.1234567;
        double d2 = (double)f;

        System.out.printf("f = %20.18f\n",f); // 20개의 소수 자리중 18개만 표현
        System.out.printf("d = %20.18f\n",d);
        System.out.printf("d2 = %20.18f\n",d2);
        */

        // 예제 2-15 정수와 실수간의 형변환
        /*int i = 91234567;
        float f = (float)i;
        int i2 = (int)f;

        double d = (double)i;
        int i3 = (int)d;

        float f2  = 1.666f;
        int i4 = (int)f2;
        
        System.out.printf("i=%d\n", i);
        System.out.printf("f= %f i2 = %d\n", f,i2); // 정밀도 차이에 의한 오차가 발생 91234567이 91234568이됨
        System.out.printf("d=%f, i3=%d\n", d,i3);
        System.out.printf("(int)%f=%d\n",f2, i4);
        */

        //chapter3 :연산자

        //예제 3-2 증감연산자
        /*
        int i =5;
        int j=0;

        j = i++; //i를 j에 저장하고 i를 1증가시킴
        System.out.println("j = i++; 실행 후, i = " + i + ", j =" +j);

        i =5;

        j = ++i; // i를 증가시키고 증가시킨 i값을 j에저장
        System.out.println("j = ++i; 실행 후, i = " + i + ", j =" +j);
        */

        // 예제 3-23문자열의 비교
        /* 
        String str1 ="abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc" == "abc");
        System.out.printf("str1 == \"abc\"  ? %b%n", str1 == "abc");
        System.out.printf("str2 == \"abc\"  ? %b%n", str2 == "abc"); // 내용은 같아도 서로 다른 객체라 false가 출력됨
        // equals는 객체가 달라도 내용만 같으면 true가 출력됨
        System.out.printf("str1.equals(\"abc\")%b%n", str1.equals("abc"));
        System.out.printf("str2.equals(\"abc\")%b%n", str2.equals("abc"));
        System.out.printf("str2.equals(\"ABC\")%b%n", str2.equals("ABC"));
        // equalseIgnoreCase는 대문자 소문자 구별하지않고 내용이 같은지 확인할때 사용
        System.out.printf("str2.equalsIgnoreCase(\"ABC\")%b%n", str2.equalsIgnoreCase("ABC"));
        */

        //예제 3-25 논리연산자를 이용한 숫자, 문자 판별
        /* 
        Scanner scanner = new Scanner(System.in);

        char ch = ' ';

        String input = scanner.nextLine();
        ch = input.charAt(0);

        if('0' <= ch && ch <= '9'){ // ch가 아스키코드 값 0~9 사이라면
            System.out.printf("입력하신 문자는 숫자입니다.\n");
        }

        if(('a' <= ch  && ch < 'z') || ('A' <= ch && ch<='Z')){ // ch의 아스키 코드 값이 a~z 사이 또는 A~Z사이라면
            System.out.printf("입력하신 문자는 영문자입니다.\n");
        }
        */

        // chapter 4. 조건문과 반복문
        
        //예제 4-8 swtich문
        /* 
        char gender;
        String regNo = "";

        System.out.print("당신의 주민번호를 입력해주세요: (011231-1111222)>");

        Scanner scanner = new Scanner(System.in);
        regNo = scanner.nextLine();

        gender = regNo.charAt(7); // regNo에 저장된 문자열에서 8번쨰 문자열을 gender에 저장, 0부터 시작하기 때문에 8번쨰 문자열은 7이다.

        switch(gender){
            case '1':
            case '3':
                System.out.println("당신은 남자입니다.");
                break;
            case '2':
            case '4':
                System.out.println("당신은 여자 입니다.");
                break;
            default:
                System.out.println("유효하지 않은 주민등록번호입니다.");
        }
        */

        // for문 인덱싱 변수를 두개 사용
        /*   
        for(int  i =1, j= 10; i<=10; i++,j--){
                System.out.printf("%d \t %d\n", i,j);
            }
        */

        // 예제 4-25 입력한 숫자의 합을 구하기
        int num = 0;
        int sum = 0;

        System.out.print("숫자를 입력하세요.(예 : 12345) >");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);
        
        while(num!=0){
            // num을 10으로 나눈 나머지를 sum에 더하는 부분
            sum += num%10;
            System.out.printf("sum = %3d num = %d%n",sum,num);

            num /= 10; // 10의 자리수 하나 줄이기
        }
        
        System.out.println("각 자리수의 합: " + sum);
         
    }
}
