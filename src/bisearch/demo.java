package bisearch;

public class demo {
    int[] a={2,2,2,4,4,4};
    int target=4;
    /**
     * 小于tar的最右侧第一个数
     */
    public int find1(){
        int left=-1,right=a.length;
        while(left+1!=right){
            int mid=left+(right-left)/2;
            if(a[mid]<target) left=mid;
            else right=mid;
        }
        return left;
    }

    /**
     * tar的最左侧第一个数
     */
    public int find2(){
        int left=-1,right=a.length;
        while(left+1!=right){
            int mid=left+(right-left)/2;
            if(a[mid]<target) left=mid;
            else right=mid;
        }
        return right;
    }

    /**
     * tar的最右侧第一个数
     */
    public int find3(){
        int left=-1,right=a.length;
        while(left+1!=right){
            int mid=left+(right-left)/2;
            if(a[mid]<=target) left=mid;
            else right=mid;
        }
        return left;
    }

    /**
     * 大于tar的最左侧第一个数
     */
    public int find4(){
        int left=-1,right=a.length;
        while(left+1!=right){
            int mid=left+(right-left)/2;
            if(a[mid]<=target) left=mid;
            else right=mid;
        }
        return right;
    }

    public static void main(String[] args) {
        demo d=new demo();
        System.out.println("小于"+ d.target+"的最右侧第一个数:"+d.find1());
        System.out.println(d.target+"的最左侧第一个数:"+d.find2());
        System.out.println(d.target+"的最右侧第一个数:"+d.find3());
        System.out.println("大于"+ d.target+"的最左侧第一个数:"+d.find4());
    }
}
