package webjobfair;

/*
 * 체스에서 비숍(Bishop)은 아래 그림과 같이 대각선 방향으로 몇 칸이든 한 번에 이동할 수 있습니다. 만약, 한 번에 이동 가능한 칸에 체스 말이 놓여있다면 그 체스 말을 잡을 수 있습니다.

bishop1.png

8 x 8 크기의 체스판 위에 여러 개의 비숍(Bishop)이 놓여있습니다. 이때, 비숍(Bishop)들에게 한 번에 잡히지 않도록 새로운 말을 놓을 수 있는 빈칸의 개수를 구하려고 합니다.

위 그림에서 원이 그려진 칸은 비숍에게 한 번에 잡히는 칸들이며, 따라서 체스 말을 놓을 수 있는 빈칸 개수는 50개입니다.

8 x 8 체스판에 놓인 비숍의 위치 bishops가 매개변수로 주어질 때, 비숍에게 한 번에 잡히지 않도록 새로운 체스 말을 놓을 수 있는 빈칸 개수를 return 하도록 solution 함수를 완성해주세요.

제한 조건
체스판에 놓인 비숍의 위치 bishops가 solution 함수의 매개변수로 주어집니다.

bishops는 비숍의 위치가 문자열 형태로 들어있는 배열입니다.
bishops의 길이는 1 이상 64 이하입니다.
비숍이 놓인 위치는 알파벳 대문자와 숫자로 표기합니다.
알파벳 대문자는 가로 방향, 숫자는 세로 방향 좌표를 나타냅니다.
예를 들어 위 그림에서 비숍이 있는 칸은 D5라고 표현합니다.
한 칸에 여러 비숍이 놓이거나, 잘못된 위치가 주어지는 경우는 없습니다.
 */

public class Exam02 {


    public int solution(String[] bishops) {
        
        // 비숍은 대각선으로 이동할 수 있다.
        // 비숍에 한번에 잡히지 않는 칸의 갯수를 구하면 된다
        // 체스판의 총 칸은 64개다
        // 비숍은 여러개 주어질 수 있다. 
        // 같은 자리에 있는 비숍은 없지만
        // 같은 라인에 있는 비숍은 있을 수 있다
        // 비숍이 위치한 자리는 체스칸에서 제외해야 한다
        
        // 체스판 생성
        boolean[][] chessboard = new boolean [8][8];
        
        // 비숍들 체크 
        for(int i = 0; i < bishops.length; i++){
            
            // 한글자씩 split해서 비숍 위치 확인
            String[] bishopPosition = bishops[i].split("");
            // x 좌표 받을 변수
            int x = 0;
            // y 좌표 받을 변수
            int y = 0;
            
            // X와 Y 좌표를 구한다
            for(int j=0; j<bishopPosition.length; j++){
                // 처음 값은 X 
                if(j == 0){
                    // 아스키 코드 활용해서 숫자로 변환
                    char temp = bishopPosition[j].charAt(0);
                    x = temp - 65;
                }else{
                    // 두번째 값은 Y
                    // int로 변환해서 저장
                    y = Integer.parseInt(bishopPosition[j]) - 1;
                }
                
            }
            
            // 처음 비숍 놓인 위치 체크
            chessboard[x][y] = true;
            
            // 초기화를 위해 x , y 값 저장
            int saveX = x;
            int saveY = y;
            
            // 비숍의 네가지 진행 방향들 전부 체크해주는데
            // 이미 그 부분이 true가 되어 있으면 무시하고 건너 뛴다
            
            // 좌상 == x 가 0이 될때 까지
            
             while(x > 0){
                 x--;
                 y--;
                  
                 if(x >= 0 && y >= 0 && chessboard[x][y] == false){
                      chessboard[x][y] = true;
                  }
             }    
            
             // x, y 초기화
             x = saveX;
             y = saveY;
             
            // 우상 == y 가 7이 될떄까지
             while(y < 7){

                  x--;
                  y++;
                  
                  if(x >= 0 && y <= 7 && chessboard[x][y] == false){
                      chessboard[x][y] = true;
                  }
              }
            
             // x, y 초기화
             x = saveX;
             y = saveY;
            
            // 좌하 == x 가 7이 될때까지
            while(x < 7){

                  x++;
                  y--;
                  
                  if(x <= 7 && y >= 0 && chessboard[x][y] == false){
                      chessboard[x][y] = true;
                  }
              }
            
             // x, y 초기화
             x = saveX;
             y = saveY;
            
            // 우하 == y 가 7이 되면
            
            while(y < 7){

                  x++;
                  y++;
                  
                  if(x <= 7 && y <= 7 && chessboard[x][y] == false){
                      chessboard[x][y] = true;
                  }
              }
            
        }
        
        // 정답 담을 변수
        int answer = 0;
        
        // 이차원 배열 전부 체크해서
        // false일때만 asnwer 증가
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(chessboard[i][j] == false){
                    answer ++;   
                }
            }
        }
        
        return answer;
    }
	
}
