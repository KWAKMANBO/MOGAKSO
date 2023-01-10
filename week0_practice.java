import java.util.*;

public class week0_practice {
    public static void main(String[] args) throws Exception {
        //2-2 주민등록번호를 입력할자료형
        long regNo = 12345612345678l;
        
        //리터럴이므로 접미사 l붙이는것을 명심

        //2-5
       /* 
        System.out.println("1" + "2"); //  12
        System.out.println(true + ""); // true
        System.out.println('A' + 'B'); // ASCII 코드 값 합 
        System.out.println('1' + 2); // ASCII 코드 값의 합
        System.out.println('1' + '2'); // ASCII코드 값의 합
        System.out.println('J' + "ava"); //Java
        System.out.println(true + null); // 1
        */


       // 3-1
       /*  
        int x =2;
        int y =5;
        char c = 'A';
        
        System.out.println(1+x << 33); // int형은 32비트 << 33 은 <<1과 동일 
        System.out.println(y >=5 || x < 0 && x>2); // y >= 5 -> true,  x< 0 ->false , x>2 -> false   &&먼저 || 나중에 false && false --> false, true | false -> true 
        // 결과 true
        System.out.println(y+=10 - x++); // 5 + 10 - 2 = 13 후 2+1
        System.out.println(x+=2); // 3+2 =5
        System.out.println(!('A' <= c || c<= 'Z')); // !(true || false) ==> !true == false
        System.out.println('C' - c); // ASCII 값으로 생각 67 -65
        System.out.println('5' - '0'); //  ASCII 값으로 생각 53 -48
        System.out.println(c+1); // 65 +1 =66
        System.out.println(++c); // c+1을 하고 c+1을 출력 
        System.out.println(c++); // c를 출력하고 c+1
        System.out.println(c); // c를 출력
        */
        
        /*// 3-2
        int numOfApples = 123;
        int sizeOfBucket =10;
        int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket >0 ? 1:0);// 사과의수를 바구니의 수로 나누었을때 나머지가 0이면 바구니를 추가하지않고 나머지가 0이상이면 바구니갯수 1을 추가한다.


        System.out.println("필요한 바구니의 수: " + numOfBucket);
        */

        /*// 3-3
        int num = 10;
        System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0" ));
        */

        /*// 3-4
        int num = 456;
        System.out.println(num/100 *100);
        */

        // 3-5
        /* 
        int num =333;
        System.out.println((num - num%10) +1);
        */

        // 3-6
        // 변수의 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하는 코드
        //int num = 24;
        //System.out.println(10 - num%10);

        //3-7 
        // 화씨 -> 섭씨 변환 코드
        /* 
        int fahrenheit = 100;
        float celcius = (int)(5/9f*(fahrenheit-32)*100 + 0.5)/100f;

        System.out.println("fahrenheit : " + fahrenheit);
        System.out.println("clecius: " + celcius);
        */

        // 3-9
        // ch가 소문자 또는 대문자이면 true를 출력
        /* 
        char ch = 'z';
        boolean b = ( ('a' <= ch || ch <= 'z') || ('A' <= ch && ch <= 'Z'));

        System.out.println(b);
        */
        // 3-10
        /* 
        char ch = 'A';

        char lowerCase = ('A' <= ch && ch <= 'Z')? (char)(ch+32) : ch;
        System.out.println("ch: " + ch);
        System.out.println("lowerCase: " + lowerCase);
        */

        // 4-2
        // 1~20중 2또는 3의 배수가 아닌 수의 총합
        /* 
        int sum=0;

        for(int i=0; i< 21;i++){
            if(i%2 !=0 && i%3 !=0){
                sum  +=i;
            }
        }
        System.out.println("sum:" + sum);
        */

        // 4-3
        // 1+ (1+2) + (1+2+3)+... +(1+2+3+4+5+6+7+8+9+10)의합
        /* 
        int sum=0;

        for(int i=0; i< 11; i++){
            for(int j=0; j<i+1;j++){
                sum +=j;
            }
        }
        System.out.println(sum);
        */

        // 4-4
        // 1 + (-2) + (3) +(-4) 식일때 언제 총합이 100이 넘나
        // 나의 해답
        /* 
        int sum =0;
        int i=1;
        int cnt =0;
        int tmp=0;

        while(sum <=100){ // sum이 100미만이면 실행
            if(i%2==0){ tmp = i*(-1);} // i가 짝수이면 i에 -1을 곱함
            else{tmp = i;}
            sum = sum+tmp;// sum에 i를 더함
            cnt++; // 카운트를 +1
            i++; // i를+1
            System.out.println("i: "+i);
            if(sum >= 100)break;
            
        }

        System.out.println("sum: "+sum);
        System.out.println("cnt: "+cnt);
        */
        // 정석 해답
        /*
        int sum=0;
        int s =1;
        int num =0;

        for(int i=0;true;i++,s=-s){
            num = s*i;
            sum +=num;

            if(sum>=100){
                break;
            }
        }
        System.out.println("sum: "+sum);
        System.out.println("num: "+num);
        */

        // 두개의 주사위를 던졌을 때 눈의 합이 6이되는 모든 경우의 수를 출력하는 프로그램
        /* 
        for(int i =1; i< 7;i++){ // 첫번째 주사위역할 1~6까지 실행
        for(int j=1; j<7;j++){ // 두번째 주사위 역할 1~6까지 실행
                if(i+j == 6){ // 주사위 눈의 합이 6일경우에 실행
                    System.out.printf("%d + %d = %d\n",i,j,i+j);
                }
            }
        }
        */

        // Math.random() 이용한 1~6사의 임의의 정수 생성
        // Math.random() 함수는 난수생성 함수로, double이 기본형이고 0.0이상 1.0미만의 수를 생성해줌
        // int value =(int)(Math.random()*6)+1;
        // 0.0*6<= random number < 1*6
        // 0.0 <= random number < 6
        // 0.0 + 1.0 <= random number < 7 --> 이므로 1부터 6까지의 난수를 생성 

        //4-8. 방정식 2x + 4y = 10의 모든해
        /* 
        for(int x=0; x< 11;x++){ // x=0부터 시작해서 x가 10일떄까지 실행
            for(int y=0; y< 11 -x ; y++){ //  y=0부터 시작하서 y가 10일떄까지 실행
             if( 2*x + 4*y == 10){ // 2x + 4y가 10이면
                System.out.printf("x = %d, y= %d\n",x,y);// 출력
             }   
            }
        }
        */

        // 4-9 입력받은 정수 문자열의 각자리 수의 합을 구하는 프로그램
        /* 
        String str = "12345";

        int num =0;
        int sum=0;
        int tmp=0;

        num  = Integer.parseInt(str); // 문자열을 정수로 변환해줌
        for(int i=0;i< str.length(); i++){ //i=0에서 시작해서 str.length()만큼 반복
             sum += num %10; // num의 1의자리수를 sum에 더한다.
             num /= 10; // num의 1의자리수를 없애기 위해서 10으로 나누어준다.
        }
        System.out.println("sum = " +sum);
        */

        // 4-11 피보나치 수열 10번째 수는 무엇인가 알아내는 프로그램
        /* 
        int first =1;
        int second =1;
        int sum=0;
        int next;
        for(int i=0;i<8;i++){
            next = first + second; // 1 + 1
            System.out.println("next: " + next);
            first = second; // 두번쨰 수열을 첫번 쨰 로 수열로함
            second = next; // 세번째 수열을 두번쨰 수열로함
 
        }
        */
        
        // 4-12 구구단의 일부분을 출력
        /* 
        for(int i =1; i<=9; i++){
            for(int j=1; j<=3; j++){
                int x = j+1 +(i-1)/3*3; 
                int y = i%3==0? 3: i%3;
                if(x>9)break;

                System.out.println(x+"*" +y+ "="+ x*y+"\t");
            }

            System.out.println();
            if(i%3==0) System.out.println();

        }
        */

        // 4-13 문자열 숫자 판별 프로그램
        /* 
        String value = "12o34";
        char ch = ' ';
        boolean isNumber = true;

        for(int i=0; i<5;i++){
            ch = value.charAt(i);// value에 있는 문자를 하나씩 읽어서비교

            if(!(ch >='1'&& ch <'9')){
                isNumber = false;
                break;
            }

            
        }

        if(isNumber == false){
        System.out.println("value는 숫자가 아닙니다.");
        }else{
            System.out.println("value는 숫자입니다.");
        }
        */

        // 4-14 숫자 맞추기 프로그램
        /* 
        int num = (int)(Math.random()*100)+1;
        
        Scanner scanner = new Scanner(System.in);
        int input=0;
        int cnt=0;

        while(true){
            System.out.println("1~100사이의 수를 입력해주세요.");
            input = scanner.nextInt();
            cnt++;


            if(input > num){
                System.out.println("Down");
            }else if(input < num){
                System.out.println("Up");
            }else{

                System.out.println("정답입니다. "+ cnt + "번만에 성공하셨습니다.");
                break;
            }
        }
        */

        // 4-15 회문수 구하는 프로그램
            /*
        int number =12321;
        

        int tmp = number;
        tmp  =number;
        
        int result = 0;

        while(tmp !=0){
            result = result *10 + tmp%10; // result에 10을 곱해서 1의 자리수를 0으로 만들고 tmp에1의 자리 숫자를 result에 더함
            tmp/=10;
        }
        if(number == result){
            System.out.println("회문수 입니다.");        
        }else{
            System.out.println("회문수가 아닙니다.");
        }
        */
        
    
    
    }
}
