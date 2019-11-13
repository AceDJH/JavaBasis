package classT.inherit;

/**
 * @Author AceDJH
 * @Date 2019/11/13 21:28
 */
public class User {
    private String username;
    private double leftmoney;

    public User(){}
    public User(String username, double leftmoney) {
        this.username = username;
        this.leftmoney = leftmoney;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getLeftmoney() {
        return leftmoney;
    }

    public void setLeftmoney(double leftmoney) {
        this.leftmoney = leftmoney;
    }

    public String toString(){
        System.out.println("User{" +
                "username='" + username + '\'' +
                ", leftmoney=" + leftmoney +
                '}');
        return null;
    }
}
