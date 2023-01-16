import java.util.*;


public class week1 {
    public static void main(String[] args) throws Exception {
        //chapter5 배열
        // 배열이란 같은 타입의 여러 변수를 하나에 묶은것으로
        // 선언방식 : 타입 [] 변수이름 or 타입 변수이름[] 형식
        // 배열을 선언한 후 배열을 생성해야지 배열을 사용할 수 있음
        // 생성 방식: 타입[] 변수이름 or 타입 변수이름[]
        //          변수이름 = new 타입[길이]

        //배열의 생성
        
        // 정석적인 배열 선언 방법
        /* 
        int score[];
        score = new int[5];

        // 한번에 배열을 생성하는 방법
        int[] score1 = new int[5];
        */

        //예제 5-1 인덱스 사용법
        /* 
        int[] score = new int[5];
        int k=1;
        
        //정석적인 배열 초기화 방법
        score[0] =50;
        score[1]=60;
        score[2]=70;
        score[3]=80;
        score[4]=90;
        
        // 배열의 선언과 초기화를 한번에 하는방법
        int[] score1 = new int[]{10,20,30,40,50};


        int tmp = score[k+2] + score[4];// 80 + 90  = 170

        for(int i=0;i < 5; i++){
            System.out.printf("score[%d]: %d\n",i,score[i]);
        }
        System.out.printf("tmp:%d\n ",tmp);
        System.out.printf("score[%d]:%d\n",7,score[7]); // 배열의 인덱스를 넘어가는 번호를 참조하면 컴파일시 문제는 없지만 실행 시 에러 발생
        

        // 배열이름.length
        // 배열의 길이를 저장하고 있음. 배열은 한번 선언하면 길이를 변경 x 상수로 봐도 무방
        // for문에서 자주 사용함
        int[] arr = new int[5];
        int tmp = arr.length;

        System.out.println("arr의 배열 길이: " + tmp);
        */


        // 배열의 출력
        /* 
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        //int[] iArr3 = new int[]{100, 95, 85, 70, 60};
        int[] iArr3 = {100, 95, 85, 70,60};
        char[] chArr={'a','b','c','d'};
       
        for(int i=0; i <iArr1.length; i++){
            iArr1[i] = i+1; // iArr1[0~9]에 1~10으로초기화
        }

        for(int i=0; i < iArr2.length;i++){
            iArr2[i]= (int)(Math.random()*10) +1; // iArr2에 1~10무작위 변수로 초기화
        }

        for(int i=0; i< iArr1.length;i++){
            System.out.print(iArr1[i] +","); // iArr1을 출력
                }

        System.out.println();
        System.out.println(Arrays.toString(iArr1));
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);
        System.out.println(chArr);
        */

        // 예졔 5-3 배열의 복사
        /*     
        int[] arr = new int[5];

            for(int i=0; i<5; i++){
                arr[i]=i+1;
            }

            System.out.println("변경전 -  arr.length: " +arr.length);
            for(int i=0; i<arr.length;i++){
                System.out.printf("arr[%d]: %d\n",i, arr[i]);
            }

            int[] tmp = new int[arr.length*2];

            for(int i=0; i< arr.length;i++){
                tmp[i] = arr[i];
            }

            arr =tmp;

            System.out.println("변경 후 - arr.length: " + arr.length);
            for(int i=0; i< arr.length;i++){
                System.out.printf("arr[%d]: %d\n", i, arr[i]);
            }
        */
        
        // 예 5-4 System.arraycopy() 사용
        // System.arraycopy() 의 형식
        // System.arraycopy(num, 0, newnum, 0 , num.length);
        //  num[0]에서 newnum[0]으로 num.length만큼 복사

        /* 
        char[] abc = {'A','B','C','D'};
        char[] num = {'0','1','2','3','4','5','6','7','8','9'};
        System.out.println(abc);
        System.out.println(num);
        
        // 배열 abc와 num을 붙여서 하나의 배열 result로 만듬
        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc,0,result,0,abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);

        // 배열 abc을 배열 num의 첫 번째 위치부터 배열 abc길이만큼 복사함
        System.arraycopy(abc,0,num,0,abc.length);
        System.out.println(num);

        // number의 인덱스6 위치에 3개를 복사
        System.arraycopy(abc,0,num,6,3);
        System.out.println(num);
        */

        //예제 5-7 배열의 요소의 순서를 반복해서 바꾼다. 
        // 배열의 모든 요소를 더해서 총합과 평균을 구함
        /* 
            int[] numArr = new int[10];

            for(int i=0;i<10; i++){
                numArr[i] = i;
                System.out.println(numArr[i]);
            }
            System.out.println();

            for(int i=0; i<100;i++){
                int n =(int)(Math.random()*10);
                int tmp;
                tmp  = numArr[0];
                numArr[0] = numArr[n];
                numArr[n] = tmp;

            }

            for(int i=0;i<10;i++){
                System.out.println(numArr[i]);
            }
            */

            // 예제5-8 배열 요소 순서 바꾸기
            /* 
            int[] ball = new int[45];

            for(int i=0;i<45;i++){
                ball[i] = i+1;
            }

            int temp =0;
            int j =0;

            // 배열의 i번쨰 요소인 임의의 요소에 저장된 값을 서로 바꾼다.
            // 0번쨰 부터 5번쨰까지만 바꿈
            for(int i=0; i<6;i++){
                j = (int)(Math.random()*45);
                temp = ball[i];
                ball[i] = ball[j];
                ball[j] = temp;
            }

            for(int i=0; i<6;i++){
                System.out.printf("ball[%d]: %d\n", i ,ball[i]);
            }
            */

            // 예제 5-10 정렬하기
            // Bubblesort 
            /*
            int[] numArr =  new int[10];

            System.out.println("생성된 배열");
            for(int i=0; i<numArr.length; i++){
                System.out.print(numArr[i] = (int)(Math.random()*10));
            }
            System.out.println();

            for(int i = 0; i < numArr.length-1; i++){ // 
                boolean changed = false; // 자리바꿈 발생여부 체크

                for(int j=0; j < numArr.length-1 -i ; j++){
                    if(numArr[j] > numArr[j+1]){
                        int tmp;
                        tmp = numArr[j];
                        numArr[j] = numArr[j+1];
                        numArr[j+1] = tmp;
                        changed = true;
                    }

                     // false라면 
                }   
                  if(!changed)break;
                for(int k =0; k< numArr.length; k++){
                    System.out.print(numArr[k]);
                }
                System.out.println();
                     }
                */

                //예제 5-11
                // 빈도수 구하기
                /* 
                int[] numArr = new int[10];
                int[] counter = new int[10];

                for(int i=0; i < numArr.length ; i++){
                    numArr[i] =(int)(Math.random() * 10);
                    System.out.print(numArr[i]);
                }
                System.out.println();

                for(int i=0; i < numArr.length ; i++){
                    counter[numArr[i]]++;
                }

                for(int i=0; i < numArr.length; i++){
                    System.out.println( i + "의 갯수 : " + counter[i] );
                }
                */
                

                //String배열
                // 문자열을 담을 때 사용
                // 생성방법: String name  = new String[크기] --> 크기만큼의 문자열을 담을 수있는 string배열을 생성

                // String배열의 초기화
                // 정석
                /*  
                String[] name = new String[3];

                 name[0] = "Kim";
                 name[1] = "Park";
                 name[2] = "Yi";
                // 간단하게 선언
                 String[] name2 = new String[]{"Kim","Park","Yi"};
                // new는 생략가능
                String[] name3 ={"Kim","Park","Yi"};
                */


                // 예제 5-12: String 배열의 초기화 
                /* 
                String[] names = {"Kim", "Park", "Yi"};

                for(int i=0; i<names.length ; i++){
                    System.out.println("names[" + i+"] : " + names[i]);
                }
                String tmp = names[2];

                System.out.println(tmp);

                names[0] = "Yu";

                for(String str: names)
                    System.out.println(str);
                */

                // 예제 5-13 : String 배열의 초기화
                /* 
                char[] hex = {'C','A','F','E'};

                String[] binary = {"0000", "0001","0010","0011",
                                    "0100", "0101","0110","0111",
                                    "1000","1001","1010","1011",
                                    "1100","1101","1110","1111"};

                String result ="";

                for(int i =0; i< hex.length; i++){
                    if(hex[i] >= '0' && hex[i] <= '9'){
                        result += binary[hex[i]-'0'];
                    }else{ // A~F일때 
                        //  ex 'C' -'A' + 10 = 2 + 10 = 12
                        result += binary[hex[i] - 'A'+ 10];
                    }
                }

                System.out.println("hex: " + new String(hex));
                System.out.println("binary: " + result);
                */

                // 예제 5-15
                // 모스부호 해석하기 코드
                /* 
                String source = "SOSHELP";
                String[] mores = {"-.-", "-...","-.-.","-..",".",
                                  "..-.","--.","....","..",".---",
                                  "-.-",".-..","--","-.","---",
                                  ".--.","--.-",".-.","...","-",
                                  "..-","...-",".--","-..-","-.--",
                                  "--.."};

                String result = "";

                for(int i = 0; i< source.length(); i++){
                    result += mores[source.charAt(i) - 'A'];
                } 

                System.out.println("sourece: " + source);
                System.out.println("morse: " + result);

                } 
                */

                //예제 5-17 : 커맨드로 입력받기
                
                if(args.length !=3){
                    System.out.println("usage: java ArrayEx17 NUM1 OP  NUM2");
                    System.exit(0);
                }

                int num1 = Integer.parseInt(args[0]);
                char op = args[1].charAt(0);
                int num2 = Integer.parseInt(args[2]);

                int result =0;

                switch(op){
                    case '+':
                    result = num1 + num2;
                    break;
                    case '-':
                    result = num1 - num2;
                    break;
                    case 'x':
                    result = num1*num2;
                    break;
                    case '/':
                    result = num1/num2;
                    break;
                    default:
                    System.out.println("지원되지 않는 연산입니다.");
                }
                System.out.println("결과: "  + result);
                

                // 2차원 배열 생성과 초기화 예제
                /* 
                int[][] score = {
                                {100,100,100}
                               ,{20,20,20}
                               ,{30,30,30}
                               ,{40,40,40}
                };

                int sum =0;

                for(int i=0; i<score.length; i++){
                    for(int j=0; j<score[i].length;j++){
                        System.out.printf("score[%d][%d]: %d\n", i,j,score[i][j]);
                    }   
                             }

                             for(int[] tmp:score){
                                for(int i:tmp){
                                    sum+=i;
                                }
                             }
                System.out.println("sum: " + sum);
                */

                // 2차원 배열의 초기화와 선언
                // 평균구하기
                /* 
                int[][] score = {
                    {100,100,100}
                   ,{20,20,20}
                   ,{30,30,30}
                   ,{40,40,40}
                    };
                
                int korTotal =0;
                int engTotal =0;
                int mathTotal =0;

                System.out.println("번호 국어 영어 수학 총점 평균 ");
                System.out.println("=======================");

                for(int i=0; i<score.length; i++){
                    int sum=0;
                    float avg =0.0f;

                    korTotal +=score[i][0];
                    engTotal +=score[i][1];
                    mathTotal += score[i][2];
                    System.out.printf("%3d",i+1);

                    for(int j=0; j< score[i].length; j++){
                        sum +=score[i][j];
                        System.out.printf("%5d",score[i][j]);
                    }

                    avg = sum/score[i].length;
                    System.out.printf("%5d %5.1f\n",sum,avg);
                }

                System.out.println("======================");
                System.out.printf("총점: %3d %4d %4d \n", korTotal, engTotal,mathTotal);
            }
            */

            /* 
            final int SIZE = 10;
            int x=0, y=0;

            char[][] board = new char[SIZE][SIZE];

            byte[][] shipBoard = {
                {0,0,0,0,0,0,1,0,0}
               ,{1,1,1,1,0,0,1,0,0}
               ,{0,0,0,0,0,0,1,0,0}
               ,{0,0,0,0,0,0,1,0,0}
               ,{0,0,0,0,0,0,0,0,0}
               ,{1,1,0,1,0,0,0,0,0}
               ,{0,0,0,1,0,0,0,0,0}
               ,{0,0,0,1,0,0,0,0,0}
               ,{0,0,0,0,0,1,1,1,0}
            };

            for(int i=0; i<SIZE;i++){
                board[0][i] = board[i][0] = (char)(i + '0');
            }

            Scanner scanner = new Scanner(System.in);

            while(true){
                System.out.printf("좌표를 입력하세요:(종료는00)>");
                String input = scanner.nextLine();

                if(input.length() == 2){
                    x = input.charAt(0) - '0';
                    y = input.charAt(1) - '0';
                }

                if(x==0&&y==0){
                    break;
                }

                if(input.length() !=2 || x<=0 || x>=SIZE || y<=0 || y>= SIZE){
                    System.out.println("다시 입력해주세요");
                    continue;
                }

                board[x][y] = shipBoard[x-1][y-1]==1? 'O':'X';

                for(int i=0; i<SIZE;i++){
                    System.out.println(board[i]);
                }
                System.out.println();
            }
            */

            // 예제 5-21
            /*
            final int SIZE =5;
            int x =0, y=0;
            int num =0;

            int[][] bingo = new int[SIZE][SIZE];
            Scanner scanner = new Scanner(System.in);

            for(int i =0; i<SIZE; i++){
                for(int j =0; j<SIZE; j++){
                    bingo[i][j] = i*SIZE + j+1;
                }
            }

            for(int i=0; i<SIZE;i++){
                for(int j=0; j<SIZE;j++){
                    x = (int)(Math.random()*SIZE);
                    y = (int)(Math.random()*SIZE);

                    int tmp;
                    tmp = bingo[i][j];
                    bingo[i][j] = bingo[x][y];
                    bingo[x][y] =tmp; 
                }
            }

            do{
                for(int i=0; i < SIZE; i++){
                    for(int j =0; j<SIZE; j++){
                    System.out.printf("%2d ", bingo[i][j]);
                    }System.out.println();

                }
                
                System.out.printf("1~%d의 숫자를 입력하세요. (종료:0)>", SIZE*SIZE);
                String tmp = scanner.nextLine();
                num = Integer.parseInt(tmp);

                outer:
                for(int i=0; i<SIZE;i++){
                    for(int j=0; j<SIZE; j++){
                        if(bingo[i][j]==num){
                            bingo[i][j]=0;
                            break outer;
                        }
                    }
                }
            }while(num !=0);
            */

            //예제 5-22 : 행렬의 곱셈
            /* 
            int[][] m1 = {
                {1,2,3}
               ,{4,5,6}
            };
            int[][] m2 = {
                {1,2}
               ,{3,4}
               ,{5,6}
            };

            final int ROW  = m1.length;
            final int COL  = m2[0].length;
            final int M2_ROW = m2.length;

            int[][]  m3 = new int[ROW][COL];

            for(int i=0;  i<ROW;i++){
                for(int j =0; j < COL;j++)
                    for(int k =0; k < M2_ROW; k++){
                    m3[i][j] += m1[i][k]*m2[k][j];
                    }
                
            }

            for(int i=0; i<ROW;i++){
                for(int j=0; j<COL; j++){
                    System.out.printf("%3d ", m3[i][j]);
                }
                System.out.println();
            }
            */

            //예제 5-23 단어 맞추기 게임

            String[][] words = {
                {"chair","의자"}
               ,{"computer", "컴퓨터"}
               ,{"integer", "정수"}
            };

            Scanner scanner = new Scanner(System.in);

            for(int i=0; i < words.length; i++){
                System.out.printf("Q%d. %s의 뜻은?", i, words[i][0]);

                String tmp = scanner.nextLine();

                if(tmp.equals(words[i][1])){
                    System.out.printf("정답입니다.\n\n");
                }else{
                    System.out.printf("틀렸습니다. 정답은 %s입니다.\n",words[i][1]);
                }
            }
            

}
}