/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuylinh.util;

/**
 *
 * @author Thuy Linh
 */
public class MathUtility {
    //làm hàng fake giống như hàng thật
    //JDK có class java.util.Math, có 1 loại hàm static 
    //                                  .abs() .sin() .sqrt() .pow(a,b)
    //                                  .PI=3.1415......
       
    public static final double PI=3.1415;
    
    //hàm tính n!=1.2.3.4.5.6.7....n!
    // n! tăng nhanh, nên mình chỉ tính 20! tối đa, 21! tràn long
    // 0!=1!=1, quy ước
    // không có âm giai thừa, nếu tham số n âm , mình chửi,ném về Exeception
    public static long getFactorial(int n){
      if(n<0 || n>20){
          throw  new IllegalArgumentException("n must be between 1...20");
      }
      if(n==0 || n==1){
          return 1;
          //sống sốt đến lệnh này thì n=2...20;, thằng nào xài else 
          // biết tay ông
      }               
          long result=1;
          for(int i=2;i<=n;i++){
              result *= i;
          }
          return result;
    }
}
