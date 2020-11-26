package template;

public class Programmers {
    public static void main(String[] args) {
        solution("110010101001");
    }

    public static int[] solution(String s){
        int zeroDelCount = 0;
        int time = 0;
        while(s != "1"){
            int oneLength = 0;
            
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '1'){
                    oneLength++;
                }else{
                    zeroDelCount++;
                }
            }


            s = Integer.toBinaryString(oneLength);
            time++;
            System.out.println(s);

            System.out.println(s"1");
            if(s == "1"){
                break;
            }
//            System.out.println(time);
        }
        // System.out.println(time);
        // System.out.println(zeroDelCount);
        
        int[] answer = {time, zeroDelCount};
        return answer;
    }
}
