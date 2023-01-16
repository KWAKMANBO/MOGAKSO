import java.util.*;

public class week1_practice {
    public static void main(String[] args) throws Exception {
        // 5-3 1차원 배열에 담긴 모든 값을 더하는 프로그램
        /* 
        int[] arr = {10,20,30,40,50};
        int sum=0;
        
        for(int i=0; i< arr.length; i++){
            sum+=arr[i];
        }

        System.out.println("sum: "+ sum);
        */

        // 5-4 2차원 배열에 담긴 모든 값의 총합과 평균을 구하는 프로그램
        /* 
        int[][] arr = {
            {5,5,5,5,5}
           ,{10,10,10,10,10}
           ,{20,20,20,20,20}
           ,{30,30,30,30,30}
        };

        int total =0;
        float avg =0;

        for(int i=0; i <  arr.length; i++){
            for(int j=0; j < arr[i].length;j++){
                total += arr[i][j];
            }
        }
            avg = total/(float)(arr.length*arr[0].length);
            System.out.println("sum: " + total);
            System.out.println("avg: " + avg);
        */

        // 5-5 1~9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자
        /* 
            int[] ballArr = {1,2,3,4,5,6,7,8,9};
            int[] ball3 = new int[3];

            for(int i=0; i < ballArr.length; i++){
                int j = (int)(Math.random()*ballArr.length);
                int tmp =0;

                // 서로의 위치를 바꿈 --> 서로 다른 숫자를 생성하기 위한 과정
                tmp = ballArr[i];
                ballArr[i] = ballArr[j];
                ballArr[j] =  tmp;

            }

            System.arraycopy(ballArr, 0, ball3, 0, 3);

            for(int i=0; i<ball3.length;i++){
                System.out.print(ball3[i]);
            }
            System.out.println();
            */

            // 5-6 거스름돈으로 각 동전이 몇개 나오느지 확인하는 프로그램
            /* 
            int[] coinUnit = {500,100,50,10};

            int money = 2680;

            System.out.println("money = " + money);

            for(int i =0; i< coinUnit.length; i++){
                System.out.println(coinUnit[i] + "원 : " + money/coinUnit[i]);
                money %=coinUnit[i];
            }
            */

            // 5-7 커맨드라인으로 입력받아서 거스름돈 주기
            /* 
            if(args.length!=1){
                System.out.println("USAGE: java Exercise5_7 3120");
                System.exit(0);
            }

            // 입력받은 문자열을 숫자로 변환
            int money = Integer.parseInt(args[0]);

            System.out.println("money: " + money);

            int[] coinUnit = {500,100,50,10}; // 동전 종류
            int[] coin = {5,5,5,5}; // 동전 갯수

            for(int i=0; i< coinUnit.length;i++){
                int coinNum =0;

                coinNum = money/coinUnit[i]; // 필요한 동전갯수 파악

                if(coin[i] >= coinNum){ // coin[i]의 개수가 coinNum보다 크다면 coin[i] - coinNum
                    coin[i] -=coinNum;
                }else{ // coin[i]의 개수가 coinNum보다 작다면 coinNum 을 coin[i]개수로 하고 coin[i]=0
                    coinNum = coin[i];
                    coin[i] =0;
                }


                money -=coinNum*coinUnit[i];// money에서 coinNum*coinUnit[i] 을 뺸값을 저장
                System.out.println(coinUnit[i] + "원: "+ coinNum);
            }

            if(money > 0){ // 거슬러 주고도 돈이 남았다면 거스름돈이 부족
                System.out.println("거스름돈이 부족합니다.");
                System.exit(0);
            }

            System.out.println("남은 동전의 개수 = ");

            for(int i=0; i < coinUnit.length; i++){
                System.out.println(coinUnit[i] + "원: " + coin[i]);
            }
            */

            // 예제 5-8 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 *을 찍어내기 
            /* 
            int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
            int[] cnt =  new int[4];

            for(int i=0; i < answer.length; i++){
                cnt[answer[i]-1]++;
            }

            for(int i=0; i< cnt.length;i++){
                System.out.print(cnt[i]);

                for(int j=0; j<cnt[i];j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            */

            //5-9 주어진 배열을 시계방향으로 90도 회전 시켜서 출력하는 프로그램
            /* 
            char[][] star = {
                     {'*','*',' ',' ',' '}
                    ,{'*','*',' ',' ',' '}
                    ,{'*','*','*','*','*'}
                    ,{'*','*','*','*','*'}
            };
            char[][] result = new char[star[0].length][star.length];

            for(int i=0; i< star.length; i++){
                for(int j=0; j < star[i].length; j++){
                System.out.print(star[i][j]);
                }
                System.out.println();
            }
            

            for(int i=0; i< star.length;i++){
                for(int j=0; j<star[i].length;j++){
                    int x =j;
                    int y = star.length -1 -i;

                    result[x][i] =  star[i][j];
                }
            }
            System.out.println();
            for(int i =0;  i< result.length;i++){
                for(int j=0; j< result[i].length; j++){
                    System.out.print(result[i][j]);
                }
                System.out.println();
            }
            */

            // 5-10 알파벳을 암호화하는 프로그램
            /* 
            char[] abcCode = {  '`','~','!','@','#','$','%','^','&','*',
                                '(',')','-','_','+','=','|','[',']','{', '}',';',':',',','.','/'};

            char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

            String src = "abc123";
            String result = "";

            for(int i=0; i < src.length(); i++){
                char ch = src.charAt(i);

                if('a' <= ch &&  ch<='z'){
                    result += abcCode[ch - 'a'];
                }else if('0' <= ch && ch <= '9'){ 
                    result += numCode[ch - '0'];
                }
            }

            System.out.println("src : " + src);
            System.out.println("result:" + result);
            */


            // 5-11 주어진 2차원 배열의 데이터보다 가로, 세로 +1이 더큰 배열 생성해서 행과 열 마지막에 각 총합 저장하고 출력
            /* 
            int[][] score = {
                    {100,100,100}
                   ,{20,20,20}
                   ,{30,30,30}
                   ,{40,40,40}
                   ,{50,50,50}    
                };

                int[][] result = new int[score.length+1][score[0].length+1];

                for(int i=0; i< score.length; i++){
                    for(int j=0; j<score[i].length; j++){
                        result[i][j] = score[i][j]; // result에 score를 저장
                        result[i][score[0].length] += score[i][j]; // 가로의 합
                        result[score.length][j] += result[i][j];
                        result[score.length][score[0].length] += result[i][j];
                    }
                }

                for(int i=0; i< result.length; i++){
                    for(int j=0; j< result[0].length; j++){
                        System.out.printf("%4d", result[i][j]);
                    }
                    System.out.println();
                }
                */

                // 5-13 애니그마 문제

                String[] words = {"television","computer","mouse","phone"};

                Scanner scanner = new Scanner(System.in);

                for(int i=0;  i < words.length;i++){
                    char[] question = words[i].toCharArray(); // String을 char로 변환

                    for(int j=0; j < question.length;j++){
                        int idx = (int)(Math.random()*question.length);

                        char tmp = question[i];
                        question[i] = question[idx];
                        question[idx] = tmp;
                    }

                    System.out.printf("Q:%d. %s의 정답을 입력하세요.>",i+1, new String(question));

                    String answer = scanner.nextLine();

                    if(words[i].equals(answer.trim()))
                        System.out.println("정답입니다.");
                    else
                        System.out.println("틀렸습니다.");

                }



                                
        }

    }

