package CreationTypeDPDemos.BuilderPattern;

/**
 * 建造者模式,核心是先把所有的属性都扔给builder类,然后在build的时候,再将这些属性复制为实际生产的对象
 * 1.可以使用lombok插件,使用@builder注解即可
 * 2.使用链式调用,所有的setter方法返回return this即可.
 *
 */
public class User {
    private String name;
    private String password;
    private String Email;
    private String gender;

    //构造方法私有化,防止客户端直接new
    private User(String name, String password, String Email, String gender) {
        this.name = name;
        this.password = password;
        this.Email = Email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", Email='" + Email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private String name;
        private String password;
        private String Email;
        private String gender;

        private UserBuilder() {
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder Email(String Email) {
            this.Email = Email;
            return this;
        }

        public UserBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public  User build(){
            if(name == null || password == null||Email == null ||gender == null){
                throw  new RuntimeException("用户名密码邮箱性别都必填");
            }
            return  new User(name,password,Email,gender);
        }

    }

    public static void main(String[] args) {
        User testUser =User.builder().name("hello").Email("xxx@1332.com").password("ddd").gender("nan").build();
        System.out.println(testUser.toString());
    }


}
