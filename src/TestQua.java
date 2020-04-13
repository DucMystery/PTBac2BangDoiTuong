public class TestQua {

    public static void main(String[] args) {

        QuadraticEquation quadraticEquation =new QuadraticEquation(3,4,5);
        System.out.printf("PT ban Nhap vao co delta bang %f va co 2 nghiem %f va %f",quadraticEquation.getDiscriminant(),quadraticEquation.getRoot1(),quadraticEquation.getRoot2());

    }
}
