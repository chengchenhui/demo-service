package com.szewec.service.mystydy.base;


import java.util.Random;
import java.util.Scanner;

public class UnionLotto {
    //双色球：红号：1-36（不能重复）  蓝号：1-16  红号

    public static void main(String[] args) {
        int[] prize = new int[7];
        //先获取中奖号码
        int[] redNumbers = getRedNumbers();
        for (int i = 0; i < redNumbers.length; i++) {
            prize[i] = redNumbers[i];
        }
        //获取蓝球号码
        int blueNumber = getBlueNumber();
        prize[prize.length - 1] = blueNumber;
        for (int i = 0; i < prize.length; i++) {
            System.out.print(prize[i] + " ");
        }
        int redCount = getRedPrize(redNumbers);
        int blueCount = getBluePrize(blueNumber);
        System.out.println("红色中奖号码数量："+redCount);
        System.out.println("蓝色中奖号码数量："+blueCount);
    }

    /**
     * 获取红色中奖号码数量
     * @param redNumbers
     * @return
     */
    public static int getRedPrize(int[] redNumbers) {
        int count = 0;
        int[] inputs = new int[6];
        //键盘分别录入红色中奖号码
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < redNumbers.length;) {
                System.out.println("请输入红区第" + (i + 1) + "个号码：");
                int num = scanner.nextInt();
                if(num > 0 && num <= 36){
                    if(!isContains(inputs,num)){
                        inputs[i] = num;
                        i++;
                        if(isContains(redNumbers,num)){
                            count++;
                        }
                    }else{
                        System.out.println("第"+(i+1)+"红色重复");
                    }
                }else{
                    System.out.println("红色号码无效，请重新输入第"+ (i + 1) + "个红色号码：");
                }
        }
        return count;
    }


    /**
     * 获取蓝色中奖号码数
     * @param num
     * @return
     */
    public static int getBluePrize(int num) {
        int count = 0;
        //键盘分别录入中奖号码
        System.out.println("请输入蓝色号码：");
        Scanner scanner = new Scanner(System.in);
        int blueNum = scanner.nextInt();
        if(num > 0 && num <= 16){
             if(num == blueNum){
                 count++;
             }
        }else{
            System.out.println("蓝色号码无效，请重新输入");
        }
        return count;
    }

    /**
     * 获取蓝球号码
     *
     * @return
     */
    public static int getBlueNumber() {
        Random random = new Random();
        int blue = random.nextInt(16) + 1;
        return blue;
    }

    /**
     * 获取红球号码
     *
     * @return
     */
    public static int[] getRedNumbers() {
        int[] numbers = new int[6];
        Random random = new Random();
        for (int i = 0; i < numbers.length; ) {
            int number = random.nextInt(36) + 1;
            if (!isContains(numbers, number)) {
                numbers[i] = number;
                i++;
            }
        }
        return numbers;
    }

    /**
     * 判断号码是否已经存在
     *
     * @param arr
     * @param number
     */
    public static boolean isContains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                return true;
            }
        }
        return false;
    }

}
