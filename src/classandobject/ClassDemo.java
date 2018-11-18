package classandobject;

public class ClassDemo {
    /*
    * 面向对象
    * Alt +Insert 构造器快捷键 getter和setter
    * 显示方法参数 CTRL P
    *成员变量 堆， 局部变量在内存中不同
    * fp 函数式编程 参数 匿名内部类 一块语句//参数行为化
    * shift 上下左右键 选中
    * this 参数不同的构造函数之间 相互传递，调用
    * 权限 public 整个项目里访问
    * 默认default 包访问权限
    * protected   同一个包访问， 不同包：子类可以访问父类的
    * private 类私有
    * import 包名 用其他包名里面的 变量，类
    * */
    String name;
    int age;

    ClassDemo(String name,int age) {
        this.name = name;
        this.age = age;
        show();
    }
        void show () {
            System.out.println("姓名"+ name + "年龄" + age);
        }

    public static void main(String[] args) {
       ClassDemo person = new ClassDemo("linghu",20);
    }
}
