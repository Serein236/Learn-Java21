package test7;

public class Test {
    public static void main(String[] args) {
        //能存储三个的数组
        Student[] arr = new Student[3];
        //初始数据
        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "zhangwu", 26);
        Student stu3 = new Student(3,"zhangmazi",24);
        //往数组里赋值
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        int index = GetIndex(arr,2);
        if(index == -1){
            System.out.println("id不存在");
        }else{
            arr[index] = null;
        }
        PrintArr(arr);
    }
    //返回索引
    public static int GetIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                if(arr[i].getId() == id){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void PrintArr(Student[] Arr){
        for (int i = 0; i < Arr.length; i++){
            System.out.println(Arr[i].getId()+" "+Arr[i].getName()+" "+Arr[i].getAge());
        }
    }
}