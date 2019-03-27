package demo06英雄类的成员属性武器是个类;

public class Weapon {

    private String code; // 武器的代号

    public Weapon() {
    }

    public Weapon(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
