package test7;

public class Test2 {
    public static void main(String[] args) {
        Student[] Arr = new Student[3];

        Student s1 = new Student(1,"zhangsan",24);
        Student s2 = new Student(2,"lisi",22);
        Student s3 = new Student(3,"wangwu",24);

        Arr[0] = s1;
        Arr[1] = s2;
        Arr[2] = s3;

        Student s4 = new Student(4,"songliu",26);

        boolean flag = contains(Arr,s4);

        if (flag){
            System.out.println("数据有误");
        }else{
            int count = GetCount(Arr);
            if (count == Arr.length){
                Student[] NewArr = CreatNewArr(Arr);
                NewArr[count] = s4;
                PrintArr(NewArr);
            }else{
                Arr[count] = s4;
                PrintArr(Arr);
            }
        }
    }

    public static void PrintArr(Student[] Arr){
        for (int i = 0; i < Arr.length; i++){
            System.out.println(Arr[i].getId()+" "+Arr[i].getName()+" "+Arr[i].getAge());
        }
    }

    public static Student[] CreatNewArr(Student[] Arr){
        Student[] NewArr = new Student[Arr.length + 1];
        for (int i = 0;i < Arr.length;i++){
            NewArr[i] = Arr[i];
        }
        return NewArr;
    }

    public static int GetCount(Student[] Arr){
        int count = 0;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] != null){
                count++;
            }
        }
        return count;
    }

    public static boolean contains(Student[] Arr, Student s) {
        for (int i = 0; i < Arr.length; i++) {
            if(Arr[i] != null){
                if(Arr[i].equals(s)){
                    return true;
                }
            }
        }
        return false;
    }

}
