package cn.tedu;

import javax.xml.soap.Node;

public class Main {

    public static  void main(String[] args) {
      String str = "hello1hellohehello";
      String subStr = "hello";
      int count = 0;
      int index = 0;

      while ((index = str.indexOf(subStr,index))!=-1){
          count++;
          index += subStr.length();
      }
        int index1 = str.indexOf(subStr,12);
        System.out.println("count = " + count);
        System.out.println("index = " + index);

    }

    //栈帧:每调用一个方法,会为该方法在栈中分配一块栈帧区域,用于保存该方法内部所有的局部变量,方法执行结束,属于该方法的栈帧随之销毁
//111111111

    void test(){

    }
}
