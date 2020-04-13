package top.leafii.testonline.common.utils;

public class RandomDistribution {
    public static int[] randomDistribution(int[] quesId, int num){
        int [] a = new int[num];
        int [] b = new int[num];
        int i,count = 1;
        a[0] = (int)(Math.random()*(quesId.length+1));//生成第一个
        while (count<num){//如果生成的随机数不到num个继续循环
            int temp = (int)(Math.random()*(quesId.length+1));
            boolean flag = true;//用于判断是否与已生成的整数重复
            for (i = 0; i < count; i++) {
                if(temp == a[i]){
                    flag = false;//有重复就设置标志位false
                    break;
                }
            }
            if(flag==true){//如果与数组中的数据不重复
                a[count]=temp;//把数据付给数组
                count++;
            }
        }
        for (i = 0; i < a.length; i++) {
//            System.out.println(a[i]+" ");//输出结果
            b[i] = a[i];
        }

        return b;
    }


}
