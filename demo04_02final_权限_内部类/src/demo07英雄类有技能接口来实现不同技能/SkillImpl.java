package demo07英雄类有技能接口来实现不同技能;

public class SkillImpl implements Skill {
    @Override
    public void use() {
        System.out.println("Biu~biu~biu~");
    }
}
