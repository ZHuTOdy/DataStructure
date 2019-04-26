package tree;

public class TestBinarySortTree {
    public static void main(String[] args){
        int[] arr = new int[]{7, 3, 10, 12, 5, 1, 9};
        BinarySortTree binarySortTree = new BinarySortTree();
        //循环添加
        for (int i:arr){
            binarySortTree.add(new Node(i));
        }
        //查看树中的值
        binarySortTree.frontShow();
        System.out.println("-------------------------");
        //查找
        System.out.println(binarySortTree.search(9));
    }
}
