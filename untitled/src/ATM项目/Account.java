package ATM项目;

public class Account {
    private  String cardid; //卡号
    private  String username;//用户名
    private  String password;//密码
    private  double money;//金额
    private double quotamoney;//每次限取金额

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQuotamoney() {
        return quotamoney;
    }

    public void setQuotamoney(double quotamoney) {
        this.quotamoney = quotamoney;
    }
}
