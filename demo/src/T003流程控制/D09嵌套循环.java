package T003流程控制;

public class D09嵌套循环 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+(i*j)+" ");
                if(j==i){
                    System.out.println("");
                }
            }
        }
    }
}
