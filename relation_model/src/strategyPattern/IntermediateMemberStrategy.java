package strategyPattern;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-20-22:33
 */
// 中级会员优惠10%
public class IntermediateMemberStrategy implements MemberStrategy { // 实现策略
    //重写策略方法具体实现功能
    @Override
    public double calcPrice(double price, int n) {
        double money =price * n - price * n * 0.1;
        return money;
    }
}
