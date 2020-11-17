/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1421.math.util;

import thuylinh.util.MathUtility;

/**
 *
 * @author Thuy Linh
 */
public class Se1421MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("5! = "+MathUtility.getFactorial(5));
        // tui gọi hàm tính 5! hy vọng hàm trả về 120
        // lát hồi hàm chạy,coi thực tế là mấy //actual
        // tui so sánh với cái tui hy vọng trước khi tính, Expected 120
        // actual == expected , hàm chạy đúng cho tình huống này, test case này 
        System.out.println("0! = "+MathUtility.getFactorial(0));
                        //expected : 1, actual :? chạy mới biết 
                        // chạy xong mới biết hàm đúng sai 
        System.out.println("-5! = "+MathUtility.getFactorial(-5));
                        //expected : ĐẬP VÔ MẶT ILLEGALARGUMENTEXCEPTION
        // cách test kiểu này gọi là :Manual
        //          vì ta phải nhìn bằng mắt để luận kết quả 
        
        // cách xịn sò, ta dùng màu xanh đỏ để luận kết quả đúng sai của hàm 
        // cách này gọi là TEST AUTOMATION
    }
    
}
