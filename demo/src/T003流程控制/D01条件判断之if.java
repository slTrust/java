package T003流程控制;

public class D01条件判断之if {
    public static void main(String[] args) {
        System.out.println("今天天气不错，正在压马路……突然发现一个快乐的地方：网吧");
        // 单 if 语句
        int age = 19;
        if (age >= 18) {
            System.out.println("进入网吧，开始high！");
            System.out.println("遇到了一群猪队友，开始骂街。");
            System.out.println("感觉不爽，结账走人。");
        }
        System.out.println("回家吃饭");


        System.out.println("---------------------华丽的分割线----------------------");

        // 标准 if-else 语句
        int num = 666;

        if (num % 2 == 0) { // 如果除以2能够余数为0，说明是偶数
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }

        System.out.println("---------------------华丽的分割线----------------------");

        // 多分支判断
        int score = 120;
        if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("好");
        } else if (score >= 70 && score < 80) {
            System.out.println("良");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else if (score >= 0 && score < 60) {
            System.out.println("不及格");
        } else { // 单独处理边界之外的不合理情况
            System.out.println("数据错误");
        }
    }


}
